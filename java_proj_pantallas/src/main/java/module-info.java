module utng.biblioteca {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens utng.biblioteca to javafx.fxml;
    exports utng.biblioteca;
    opens utng.biblioteca.Controllers to javafx.fxml;
    exports utng.biblioteca.Controllers;
}
