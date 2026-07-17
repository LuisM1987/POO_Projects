package utng.biblioteca;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/utng/biblioteca/Main.fxml"));
                
        Scene scene = new Scene(loader.load());

        scene.getStylesheets().add(
                getClass().getResource("/utng/biblioteca/css/styles.css").toExternalForm());

        stage.setTitle("Biblioteca UTNG");
        stage.setScene(scene);
        stage.show();
    }
    

    public static void main(String[] args) {
        launch(args);
    }

}