import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class TaskListImpl extends UnicastRemoteObject implements TaskList {
    private List<String> tasks;

    public TaskListImpl() throws RemoteException {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) throws RemoteException {
        tasks.add(task);
    }

    public void removeTask(String task) throws RemoteException {
        tasks.remove(task);
    }

    public List<String> getTaskList() throws RemoteException {
        return tasks;
    }
}
