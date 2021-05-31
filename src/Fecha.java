import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {

    GregorianCalendar calendario;

    public Fecha() {
        this.calendario = (GregorianCalendar) GregorianCalendar.getInstance();
    }
    
    public Fecha(GregorianCalendar calendario) {
        this.calendario = calendario;
    }

    public GregorianCalendar getCalendario() {
        return calendario;
    }

    public void setCalendario(GregorianCalendar calendario) {
        this.calendario = calendario;
    }

    @Override
    public String toString() {
        return "Fecha [calendario=" + calendario + "]";
    }
    
    public boolean comprobarFecha(GregorianCalendar fecha)
    {
        return this.calendario.equals(fecha);
    }

    public void sumDay()
    {
        this.calendario.add(Calendar.DATE, 1);
    }

}
