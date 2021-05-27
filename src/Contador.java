public class Contador {

    private int valor;
    private int aumento;

    public Contador()
    {
        this.valor = 0;
        this.aumento = 1;
    }

    public Contador(int valor, int aumento)
    {
        this.valor = valor;
        this.aumento = aumento;
    }

    public Contador(Contador cont)
    {
        this.valor = cont.valor;
        this.aumento = cont.aumento;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getAumento() {
        return aumento;
    }

    public void setAumento(int aumento) {
        this.aumento = aumento;
    }

    public void Aumento()
    {
        this.valor += this.aumento;
    }

    public void Decremento()
    {
        this.valor -= this.aumento;
    }
}
