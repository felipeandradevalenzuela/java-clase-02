package Password;
public class PasswordIntermedia extends Password{

    public PasswordIntermedia(String lvlPwd) {
        super("(?=.*[0-9])(?=.*[A-Z]).{8,}$");
    }
    
}
