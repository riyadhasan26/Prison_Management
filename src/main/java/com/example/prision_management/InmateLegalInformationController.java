package com.example.prision_management;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class InmateLegalInformationController
{
    @javafx.fxml.FXML
    private ComboBox<String> inmateComboBox;
    @javafx.fxml.FXML
    private Label caseInformationLabel;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    private void showAlert(String s){
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setContentText(s);
        a.showAndWait();
    }

    @javafx.fxml.FXML
    public void initialize() {
        // sample inmates, replace with the Prisoner data from the Record Officer section
        inmateComboBox.getItems().addAll("P1001", "P1002", "P1003");
    }

    @javafx.fxml.FXML
    public void viewButton(ActionEvent actionEvent) {

        if (inmateComboBox.getValue() == null) {
            showAlert("Please select an inmate");
            return;
        }

        // the case details come from the Record Officer section, so this is sample text for now
        caseInformationLabel.setText("Case information for inmate " + inmateComboBox.getValue());
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
