module ni.edu.uam.pae_eventos_javafx_equipo_2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens ni.edu.uam.pae_eventos_javafx_equipo_2.controllers to javafx.fxml;


    opens ni.edu.uam.pae_eventos_javafx_equipo_2.models to javafx.base;


    exports ni.edu.uam.pae_eventos_javafx_equipo_2;
}