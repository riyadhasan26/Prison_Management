package com.example.prision_management;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class VisitingRequirementsController
{
    @javafx.fxml.FXML
    private Label documentsLabel;
    @javafx.fxml.FXML
    private Label procedureLabel;
    @javafx.fxml.FXML
    private Label identificationLabel;
    @javafx.fxml.FXML
    private Label hoursLabel;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {
        identificationLabel.setText("National ID or passport");
        documentsLabel.setText("Letter of authorisation");
        hoursLabel.setText("10:00 to 16:00");
        procedureLabel.setText("Security check at the main gate");
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {

        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("LegalRepresentitiveDashboard.fxml"));
            Node node = loader.load();
            mainPane.getChildren().setAll(node);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}