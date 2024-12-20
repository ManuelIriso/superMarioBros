package deirisobarcia.manuel.supermariobros;


// definimos los valores que va a tener el personaje
public class Personaje {

    private String nombre;
    private String descripcion;
    private int imagenId;
    private int id;

    // Constructor
    public Personaje(int id, String nombre, String descripcion, int imagenId) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagenId = imagenId;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getImagenId() {
        return imagenId;
    }
}
