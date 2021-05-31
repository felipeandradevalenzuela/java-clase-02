package FiguraGeometrica;

public class Triangulo extends FiguraGeometrica {

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

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return (base * altura)/2;
    }

    @Override
    public String toString() {
        return "Soy un Triangulo, " + super.toString() + ", dado que mi base y altura son:" + base + ", " + altura + " respectivamente.";
    }

    
}