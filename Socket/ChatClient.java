import java.io.*;
import java.net.*;

public class ChatClient {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 12345;

    public static void main(String[] args) {
        try (Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter writer = new PrintWriter(socket.getOutputStream());
             BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Connecté au serveur de chat. Tapez 'exit' pour quitter.");

            Thread receiveThread = new Thread(() -> {
                try {
                    String message;
                    while ((message = reader.readLine()) != null) {
                        System.out.println(message); 
                    }
                } catch (IOException e) {
                    System.err.println("Erreur de lecture depuis le serveur : " + e.getMessage());
                }
            });
            receiveThread.start();
            String userInputMessage;
            while ((userInputMessage = userInput.readLine()) != null) {
                writer.println(userInputMessage); 

                writer.flush(); 

                if (userInputMessage.equalsIgnoreCase("exit")) {
                    break; 
                }
            }

            receiveThread.join(); // Attend la fin du thread de réception avant de fermer la connexion
        } catch (IOException | InterruptedException e) {
            System.err.println("Erreur de communication avec le serveur : " + e.getMessage());
        }
    }
}
