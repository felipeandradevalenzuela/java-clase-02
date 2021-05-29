
public class Password {
    private String pwd,lvlPwd;

    public Password(String pwd, String lvlPwd) {
        this.pwd = pwd;
        this.lvlPwd = lvlPwd;
    }

    public String getPwd() {
        return pwd;
    }

    public String getLvlPwd() {
        return lvlPwd;
    }

    public void setLvlPwd(String lvlPwd) {
        this.lvlPwd = lvlPwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    
}
