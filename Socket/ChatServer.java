import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {
    private static final int PORT = 12345;
    private static ArrayList<User> clients = new ArrayList<User>(100);
    private static ArrayList<Message> messages = new ArrayList<Message>(100);

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Serveur de chat démarré sur le port " + PORT);

            while (true) {
                if(clients.size() < 100){
                Socket clientSocket = serverSocket.accept(); // Attend la connexion d'un client
                System.out.println("Nouvelle connexion : " + clientSocket);

                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
                
                User user = new User(writer, clients.size());
            
                clients.add(user);
                
                SendAllMessagesTo(user);

                new ClientHandler(clientSocket, user).start();}
            }

        } catch (IOException e) {
            System.err.println("Erreur lors du démarrage du serveur : " + e.getMessage());
        }
    }

    private static class ClientHandler extends Thread {
        private Socket clientSocket;
        private User user;

        public ClientHandler(Socket socket, User user) {
            this.clientSocket = socket;
            this.user = user;
        }

        public void run() {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
                String receivedmessage;
                while ((receivedmessage = reader.readLine()) != null) {
                    System.out.println("User " + user.Id +" : Message received: " + receivedmessage);
                    
                    Message message = new Message(user.Id, receivedmessage);
                    messages.add(message);
                    
                    broadcast(message);
                }
            } catch (IOException e) {
                System.err.println("Erreur de communication avec le client : " + e.getMessage());
            } finally {
                if (user.writer != null) {
                    clients.remove(user);
                }
            }
        }

        private void broadcast(Message message) {
            for (User client : clients) {
                client.writer.println("User " + message.userId + ":" + message.text);
            }
        }
    }

    // Envoie tous les anciens messages stockés à un nouvel utilisateur
    private static void SendAllMessagesTo(User user) {
        for (Message message : messages) {
            user.writer.println("User " + message.userId + " : " + message.text);
        }
    }
}
