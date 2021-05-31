package FiguraGeometrica;

public abstract class FiguraGeometrica {
    
    public abstract double area();

    //Si tiene sentido sobreescribir toString,
    //ya que podemos utilizarlo para mostrar la superficie
    //+ el radio de cada figura geometrica que extienda de esta clase abstracta
    @Override
    public String toString() {
        return "El area de esta figura geometrica es "+ area();
    }
}
