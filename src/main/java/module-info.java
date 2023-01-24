module com.example.projekt_60134 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;


    opens com.example.projekt_60134 to javafx.fxml;
    exports com.example.projekt_60134;
}