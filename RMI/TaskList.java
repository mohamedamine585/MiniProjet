import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public interface TaskList extends Remote {
    void addTask(String task) throws RemoteException;
    void removeTask(Integer id) throws RemoteException;
    ArrayList<Task> getTaskList() throws RemoteException;
}
