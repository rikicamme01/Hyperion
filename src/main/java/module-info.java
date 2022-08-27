module com.example.hyperion {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hyperion to javafx.fxml;
    exports com.example.hyperion;
}