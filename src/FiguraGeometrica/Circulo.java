package FiguraGeometrica;

public class Circulo extends FiguraGeometrica {

    private double radio;
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return radio * radio * Math.PI;
    }

    @Override
    public String toString() {
        return "Soy un Circulo, " + super.toString()+ ", y mi radio es:" + radio;
    }

}
