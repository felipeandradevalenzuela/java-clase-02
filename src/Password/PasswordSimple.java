package Password;
public class PasswordSimple extends Password{

    public PasswordSimple() {
        super("(?=.*[0-9]).{8,}$");
    }
    
}
