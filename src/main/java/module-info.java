module com.example.prision_management {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.prision_management to javafx.fxml;
    exports com.example.prision_management;
    exports com.example.prision_management.Visitor;
    opens com.example.prision_management.Visitor to javafx.fxml;
    exports com.example.prision_management.User;
    opens com.example.prision_management.User to javafx.fxml;
    exports com.example.prision_management.Non_User;
    opens com.example.prision_management.Non_User to javafx.fxml;
    exports com.example.prision_management.Rehabilitation_Officer;
    opens com.example.prision_management.Rehabilitation_Officer to javafx.fxml;
}