import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;

public class TaskListImpl extends UnicastRemoteObject implements TaskList {
    private ArrayList<Task> tasks;

    public TaskListImpl() throws RemoteException {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) throws RemoteException {
        Integer lastId = 0;
        if(tasks.size() != 0 ){
          lastId = tasks.getLast().id + 1;
        }
        tasks.add(new Task(lastId, task));
    }

    public void removeTask(Integer id) throws RemoteException {
      for(Task task : tasks){
        if(task.id.equals(id)){

            tasks.remove(task);
            break;
        }
      }
    }

    public ArrayList<Task> getTaskList() throws RemoteException {
        ArrayList<Task> taskNames = new ArrayList<>();
        for (Task task : tasks) {
            taskNames.add(task);
        }
        return taskNames;
    }
}
