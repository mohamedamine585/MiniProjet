import java.io.PrintWriter;

public class User {
    PrintWriter writer;
    Integer Id ;
    User(
        PrintWriter writer ,
        Integer Id
    ){
        this.Id = Id;
        this.writer = writer;
    };
 
}
