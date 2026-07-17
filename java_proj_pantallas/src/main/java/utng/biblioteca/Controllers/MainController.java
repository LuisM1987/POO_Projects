package utng.biblioteca.Controllers;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;

public class MainController {

    @FXML
    private StackPane contentContainer;

    @FXML
    private void initialize() {
        loadView("/utng/biblioteca/views/Dashboard.fxml");
    }

    public void loadView(String fxml) {

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml));

            Node view = loader.load();

            contentContainer.getChildren().clear();

            contentContainer.getChildren().add(view);

        } catch (IOException ex) {

            System.err.println("=========================================");
            System.err.println("Error al cargar la vista:");
            System.err.println(fxml);
            System.err.println(ex.getMessage());
            System.err.println("=========================================");

            ex.printStackTrace();

        }

    }

    public void showBooks(){
        loadView("/utng/biblioteca/views/Books.fxml");
    }

    public void showUsers(){
        loadView("/utng/biblioteca/views/Users.fxml");
    }

    public void showLoans(){
        loadView("/utng/biblioteca/views/Loans.fxml");
    }

    public void showReports(){
        loadView("/utng/biblioteca/views/Reports.fxml");
    }
}