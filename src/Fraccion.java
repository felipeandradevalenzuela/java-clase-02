public class Fraccion {
    
    private int numerador,denominador;

    public Fraccion() {
        this.numerador = 1;
        this.denominador = 1;
    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public Fraccion Sumar(Fraccion fraccion)
    {
        this.numerador = this.numerador * fraccion.denominador + fraccion.numerador * this.denominador;
        this.denominador *= fraccion.denominador;

        return this;
    }

    public Fraccion Restar(Fraccion fraccion)
    {
        this.numerador = this.numerador * fraccion.denominador - fraccion.numerador * this.denominador;
        this.denominador *= fraccion.numerador;

        return this;
    }

    public Fraccion Multiplicar(Fraccion fraccion)
    {
        this.numerador *= fraccion.numerador;
        this.denominador *= fraccion.denominador;

        return this;
    }

    public Fraccion Dividir(Fraccion fraccion)
    {
        this.numerador *= fraccion.denominador;
        this.denominador *= fraccion.numerador;

        return this;
    }

    //-----------------------------------------
    public Fraccion Sumar(int numerador)
    {
        this.numerador = this.denominador * numerador + this.numerador;

        return this;
    }

    public Fraccion Restar(int numerador)
    {
        this.numerador = this.denominador * numerador - this.numerador;

        return this;
    }

    public Fraccion Multiplicar(int numerador)
    {
        this.numerador *= numerador;

        return this;
    }

    public Fraccion Dividir(int numerador)
    {
        this.denominador *= numerador;

        return this;
    }
}
