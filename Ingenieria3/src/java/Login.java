import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "helloWorld", eager = true)
public class Login {
   public Login() {
      System.out.println("HelloWorld started!");
   }
   
   private String message;
   
   public String getMessage() {
      return message;
   }
   
   public void setMessage(String value){
        this.message = value;
   }
}
