package Password;

public class Password {
    private String pwd,lvlPwd;

    public Password(String lvlPwd) {
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

    public void setValue(String pwd)
    {

        //a mi parecer es necesario utilizar una excepción
        //declarativa para saber, que no fue posible setear la clave
        //dado que no cumple con el regex indicado en el constructor
        try {
            if(pwd.matches(this.getLvlPwd()))
            {
                this.pwd = pwd;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Problema al setear la contraseña (No cumple con el regex)");
        } finally {
            System.out.println("Se termina el try/catch");
        }
    }
    
}
