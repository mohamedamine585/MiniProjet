
import java.rmi.Naming;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RMIClient {
    public static void main(String[] args) {
        try {
            TaskList taskList = (TaskList) Naming.lookup("//localhost/TaskListService"); // Recherche l'objet distant
            Scanner scanner = new Scanner(System.in);
            Integer input;
            
            while (true) {
                System.out.println("Entrez votre commande (ajouter 1 /supprimer 2 /liste 3 /exit 4) : ");

                input = Integer.parseInt(scanner.nextLine().toLowerCase()) ; // Lit l'entrée de l'utilisateur en minuscules
                
                switch (input) {
                    case 1:
                        System.out.println("Entrez la tâche à ajouter : ");
                        String taskToAdd = scanner.nextLine();
                        taskList.addTask(taskToAdd);
                        System.out.println("Tâche ajoutée avec succès.");
                        break;
                    case 2:
                        System.out.println("Entrez la tâche à supprimer : ");
                        Integer taskId = Integer.parseInt(scanner.nextLine());
                        taskList.removeTask(taskId);
                        System.out.println("Tâche supprimée avec succès.");
                        break;
                    case 3:
                    System.out.println("Liste des tâches : ");
                        ArrayList<Task> tasks = taskList.getTaskList();
                        for(Task task : tasks){
                            System.out.println("Tâche  id : " + task.id + " || " + task.content);
                        }
                       
                        break;
                    case 4:
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
