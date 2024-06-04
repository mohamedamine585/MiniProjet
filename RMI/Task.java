import java.io.Serializable;
public class Task implements Serializable{
    Integer id;
    String content;
    Task(Integer id, String content){
        this.id = id;
        this.content = content;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setcontent(String content) {
        this.content = content;
    }
    public Integer getId() {
        return id;
    }
    public String getcontent() {
        return content;
    }
}
