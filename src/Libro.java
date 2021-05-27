import java.util.Date;

public class Libro {
    
    private String autor,descripcion,isbn,titulo;
    private Date fechaSolicitud,fechaRetorno;
    private int cantidad;
    private boolean estado;

    public Libro() {
        this.autor = "";
        this.descripcion = "";
        this.isbn = "";
        this.titulo = "";
        this.fechaSolicitud = new Date();
        this.fechaRetorno = new Date();
        this.cantidad = 0;
        this.estado = true;

    }

    public Libro(String autor, String descripcion, String isbn, String titulo, Date fechaSolicitud, Date FechaRetorno, int cantidad, boolean estado) {
        this.autor = autor;
        this.descripcion = descripcion;
        this.isbn = isbn;
        this.titulo = titulo;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaRetorno = FechaRetorno;
        this.cantidad = cantidad;
        this.estado = estado;
    }
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public Date getFechaRetorno() {
        return fechaRetorno;
    }

    public void setFechaRetorno(Date fechaRetorno) {
        this.fechaRetorno = fechaRetorno;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void Prestamo(Date solicitud)
    {
        if(cantidad > 0 && estado == true)
        {
            this.fechaSolicitud = solicitud;
            this.cantidad--;

        }

    }

    public void Devolucion(Date devolucion)
    {
        this.fechaRetorno = devolucion;
        this.cantidad++;
    }

    @Override
    public String toString()
    {
        return String.format(" {0}, {1}, {2}, {3}", this.titulo, this.isbn, this.descripcion, this.autor);
    }

}
