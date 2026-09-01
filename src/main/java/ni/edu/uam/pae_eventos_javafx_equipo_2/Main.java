package ni.edu.uam.pae_eventos_javafx_equipo_2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Carga la estructura base (el BorderPane con el menú lateral)
        Parent root = FXMLLoader.load(getClass().getResource("/views/Main.fxml"));

        primaryStage.setTitle("Ejercicios en Pareja - JavaFX");
        primaryStage.setScene(new Scene(root, 900, 600));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}