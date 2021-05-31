package Password;
public class PasswordFuerte extends Password{

    public PasswordFuerte() {
        super("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$");
    }
    
}
