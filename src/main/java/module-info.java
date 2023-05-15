module com.example.projet_fx1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.projet_fx1 to javafx.fxml;
    exports com.example.projet_fx1;
    exports com.example.exercice2;
    exports com.example.exercice4;

}