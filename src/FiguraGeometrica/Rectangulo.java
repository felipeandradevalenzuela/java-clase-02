package FiguraGeometrica;

public class Rectangulo extends FiguraGeometrica {

    private int base,altura;
    
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "Soy un Rectangulo, " + super.toString() + ", dado que mi base y altura son:" + base + ", " + altura + " respectivamente.";
    }

}