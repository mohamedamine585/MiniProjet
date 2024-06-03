import java.io.Serializable;
public class Task implements Serializable{
    Integer id;
    String text;
    Task(Integer id, String text){
        this.id = id;
        this.text = text;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setText(String text) {
        this.text = text;
    }
    public Integer getId() {
        return id;
    }
    public String getText() {
        return text;
    }
}
