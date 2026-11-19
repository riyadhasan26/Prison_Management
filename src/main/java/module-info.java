module com.example.prision_management {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.prision_management to javafx.fxml;
    exports com.example.prision_management;
}