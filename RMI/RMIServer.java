import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RMIServer {
    public static void main(String[] args) {
        try {
            // Crée un registre RMI sur le port 1099
            LocateRegistry.createRegistry(1099); 
            TaskList taskList = new TaskListImpl();
            // Lie l'objet distant au registre
            Naming.rebind("//localhost/TaskListService", taskList); 
            System.out.println("RMI server is listening.");
        } catch (Exception e) {
            System.err.println("Erreur : " + e.getMessage());
        }
    }
}
