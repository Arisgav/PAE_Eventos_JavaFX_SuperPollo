package ni.edu.uam.pae_eventos_javafx_equipo_2.models;

public class LoteCafe {
    private String idLote;
    private String productor;

    public LoteCafe(String idLote, String productor) {
        this.idLote = idLote;
        this.productor = productor;
    }

    public String getIdLote() { return idLote; }
    public String getProductor() { return productor; }
}