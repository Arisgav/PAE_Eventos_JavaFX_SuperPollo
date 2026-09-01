package ni.edu.uam.pae_eventos_javafx_equipo_2.controllers;

import ni.edu.uam.pae_eventos_javafx_equipo_2.models.LoteCafe;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import java.util.Optional;

public class Reto2Controller {
    @FXML private TableView<LoteCafe> tablaLotes;
    @FXML private TableColumn<LoteCafe, String> colLote;
    @FXML private TableColumn<LoteCafe, String> colProductor;

    @FXML
    public void initialize() {
        colLote.setCellValueFactory(new PropertyValueFactory<>("idLote"));
        colProductor.setCellValueFactory(new PropertyValueFactory<>("productor"));

        tablaLotes.getItems().addAll(
                new LoteCafe("L-001", "Finca El Paraíso"),
                new LoteCafe("L-002", "Hacienda La Gloria")
        );

        ContextMenu contextMenu = new ContextMenu();
        MenuItem editItem = new MenuItem("Editar");
        MenuItem deleteItem = new MenuItem("Eliminar");

        deleteItem.setOnAction(e -> eliminarLote());
        contextMenu.getItems().addAll(editItem, deleteItem);
        tablaLotes.setContextMenu(contextMenu);
    }

    @FXML
    void mostrarDetalles(MouseEvent event) {
        if (event.getClickCount() == 2 && tablaLotes.getSelectionModel().getSelectedItem() != null) {
            LoteCafe lote = tablaLotes.getSelectionModel().getSelectedItem();
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Productor seleccionado: " + lote.getProductor());
            alert.setHeaderText("Detalles del Lote");
            alert.showAndWait();
        }
    }

    private void eliminarLote() {
        LoteCafe seleccionado = tablaLotes.getSelectionModel().getSelectedItem();
        if (seleccionado != null) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "¿Seguro que deseas eliminar el lote " + seleccionado.getIdLote() + "?");
            alert.setTitle("Confirmar Eliminación");
            alert.setHeaderText(null);

            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK) {
                tablaLotes.getItems().remove(seleccionado);
            }
        }
    }
}