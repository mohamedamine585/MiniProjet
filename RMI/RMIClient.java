import java.rmi.Naming;
import java.util.List;
import java.util.Scanner;

public class RMIClient {
    public static void main(String[] args) {
        try {
            TaskList taskList = (TaskList) Naming.lookup("//localhost/TaskListService"); // Recherche l'objet distant
            Scanner scanner = new Scanner(System.in);
            String input;
            
            while (true) {
                System.out.println("Entrez votre commande (ajouter/supprimer/liste/exit) : ");
                input = scanner.nextLine().toLowerCase(); // Lit l'entrée de l'utilisateur en minuscules
                
                switch (input) {
                    case "ajouter":
                        System.out.println("Entrez la tâche à ajouter : ");
                        String taskToAdd = scanner.nextLine();
                        taskList.addTask(taskToAdd);
                        System.out.println("Tâche ajoutée avec succès.");
                        break;
                    case "supprimer":
                        System.out.println("Entrez la tâche à supprimer : ");
                        String taskToRemove = scanner.nextLine();
                        taskList.removeTask(taskToRemove);
                        System.out.println("Tâche supprimée avec succès.");
                        break;
                    case "liste":
                        List<String> tasks = taskList.getTaskList();
                        System.out.println("Liste des tâches : " + tasks);
                        break;
                    case "exit":
                        System.out.println("Fin du programme.");
                        System.exit(0);
                    default:
                        System.out.println("Commande invalide. Veuillez réessayer.");
                }
            }
        } catch (Exception e) {
            System.err.println("Erreur : " + e.getMessage());
        }
    }
}
