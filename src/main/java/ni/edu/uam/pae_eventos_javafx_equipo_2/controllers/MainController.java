package ni.edu.uam.pae_eventos_javafx_equipo_2.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import java.io.IOException;

public class MainController {

    @FXML private BorderPane mainLayout;

    @FXML void cargarReto1() { cargarVista("/views/Reto1.fxml"); }
    @FXML void cargarReto2() { cargarVista("/views/Reto2.fxml"); }
    @FXML void cargarReto3() { cargarVista("/views/Reto3.fxml"); }

    private void cargarVista(String fxml) {
        try {
            Node vista = FXMLLoader.load(getClass().getResource(fxml));
            mainLayout.setCenter(vista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}