package ni.edu.uam.pae_eventos_javafx_equipo_2.models;

public class Artesania {
    private String imagen;
    private String nombre;

    public Artesania(String imagen, String nombre) {
        this.imagen = imagen;
        this.nombre = nombre;
    }

    public String getImagen() { return imagen; }
    public String getNombre() { return nombre; }
}