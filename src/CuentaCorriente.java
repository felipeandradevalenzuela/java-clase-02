public class CuentaCorriente {

    private double saldo;
    private int accId;
    private String titular,dni,numeroCuenta;


    public CuentaCorriente()
    {
        this.saldo = 0.0;
        this.accId = 0;
        this.titular = "";
        this.dni = "";
        this.numeroCuenta = "";
    }

    public CuentaCorriente(double saldo,int accId,String titular,String dni, String numeroCuenta)
    {
        this.saldo = saldo;
        this.accId = accId;
        this.titular = titular;
        this.dni = dni;
        this.numeroCuenta = numeroCuenta;
    }

    public CuentaCorriente(CuentaCorriente acc)
    {
        this.saldo = acc.saldo;
        this.accId = acc.accId;
        this.titular = acc.titular;
        this.dni = acc.dni;
        this.numeroCuenta = acc.numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAccId() {
        return accId;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }


    public static void main(String[] args) throws Exception {

    }

    public void Ingreso(double monto)
    {
        this.saldo += monto;
    }

    public void Egreso(double aRetirar)
    {
        this.saldo -= aRetirar;
    }

    public void Reintegro(double aReintegrar, String numeroCuenta)
    {
        this.saldo += aReintegrar;
        //from numeroCuenta...
    }

    public void Transferencia(double montoTransferir,String numeroCuenta)
    {
        this.saldo -= montoTransferir;
        //to numeroCuenta...
    }

}
