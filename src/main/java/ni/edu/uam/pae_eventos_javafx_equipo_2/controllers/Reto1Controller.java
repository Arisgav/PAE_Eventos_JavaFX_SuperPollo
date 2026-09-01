package ni.edu.uam.pae_eventos_javafx_equipo_2.controllers;


import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Reto1Controller {
    @FXML private TextField txtCodigo;
    @FXML private TextField txtNombre;
    @FXML private TextField txtPrecio;
    @FXML private TextField txtCantidad;
    @FXML private TextField txtBuscar;

    @FXML
    void guardarProducto() {
        if(txtCodigo.getText().isEmpty() || txtNombre.getText().isEmpty()) {
            mostrarAlerta(Alert.AlertType.ERROR, "Error", "Código y nombre son obligatorios.");
            return;
        }
        try {
            Double.parseDouble(txtPrecio.getText());
            Integer.parseInt(txtCantidad.getText());
            mostrarAlerta(Alert.AlertType.INFORMATION, "Éxito", "Producto guardado.");
            txtCodigo.clear(); txtNombre.clear(); txtPrecio.clear(); txtCantidad.clear();
        } catch (NumberFormatException ex) {
            mostrarAlerta(Alert.AlertType.ERROR, "Error", "Valores numéricos inválidos.");
        }
    }

    @FXML
    void buscarProducto(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            mostrarAlerta(Alert.AlertType.INFORMATION, "Búsqueda", "Buscando: " + txtBuscar.getText());
        }
    }

    private void mostrarAlerta(Alert.AlertType tipo, String titulo, String mensaje) {
        Alert alerta = new Alert(tipo);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }
}