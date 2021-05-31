package FiguraGeometrica;

//Figura Geometrica Util
public class fgUtil {

    
    public static double areaPromedio(FiguraGeometrica arr[])
    {
        double areaTotal = 0;
        for (FiguraGeometrica figuraGeometrica : arr) {
            areaTotal += figuraGeometrica.area();
        }

        return areaTotal/arr.length;

    }
}
