package ni.edu.uam.pae_eventos_javafx_equipo_2.controllers;


import ni.edu.uam.pae_eventos_javafx_equipo_2.models.Artesania;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class Reto3Controller {
    @FXML private TableView<Artesania> tablaArtesanias;
    @FXML private TableColumn<Artesania, String> colImagen;
    @FXML private TableColumn<Artesania, String> colNombre;

    @FXML
    public void initialize() {
        colImagen.setCellValueFactory(new PropertyValueFactory<>("imagen"));
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));

        tablaArtesanias.getItems().addAll(
                new Artesania("[ \uD83C\uDFA8 ]", "Hamaca Tradicional"),
                new Artesania("[ \uD83C\uDFFA ]", "Jarrón de Cerámica")
        );
    }

    @FXML void accionNuevo() { mostrarMensaje("Acción: Nuevo producto"); }
    @FXML void accionGuardar() { mostrarMensaje("Acción: Guardando..."); }
    @FXML void accionBuscar() { mostrarMensaje("Acción: Buscando..."); }

    private void mostrarMensaje(String msg) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION, msg);
        alert.setHeaderText(null);
        alert.showAndWait();
    }
}