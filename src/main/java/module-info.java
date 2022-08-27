module com.example.hyperion {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.datatransfer;
    requires java.desktop;


    opens com.example.hyperion to javafx.fxml;
    exports com.example.hyperion;
}