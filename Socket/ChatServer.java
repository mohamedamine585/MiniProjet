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

                // Crée un PrintWriter pour écrire des messages au client
                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
                
                // Crée un nouvel utilisateur et l'ajoute à la liste des clients
                User user = new User(writer, clients.size());
            
                clients.add(user);
                
                // Envoie tous les anciens messages stockés à ce nouvel utilisateur
                SendAllMessagesTo(user);

                // Crée un thread ClientHandler pour gérer les communications avec ce client
                new ClientHandler(clientSocket, user).start();}
            }
        } catch (IOException e) {
            System.err.println("Erreur lors du démarrage du serveur : " + e.getMessage());
        }
    }

    // Classe interne pour gérer les communications avec un client spécifique
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
                    // Affiche le message reçu du client
                    System.out.println("User " + user.Id +" : Message received: " + receivedmessage);
                    
                    // Crée un objet Message et l'ajoute à la liste des messages
                    Message message = new Message(user.Id, receivedmessage);
                    messages.add(message);
                    
                    // Diffuse le message à tous les clients connectés
                    broadcast(message);
                }
            } catch (IOException e) {
                System.err.println("Erreur de communication avec le client : " + e.getMessage());
            } finally {
                // Retire l'utilisateur de la liste des clients lorsque la connexion est fermée
                if (user.writer != null) {
                    clients.remove(user);
                }
            }
        }

        // Diffuse un message à tous les clients connectés
        private void broadcast(Message message) {
            for (User client : clients) {
                client.writer.println("User " + message.userId + ":" + message.text);
                client.writer.flush(); // Vide le tampon pour envoyer immédiatement le message
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
