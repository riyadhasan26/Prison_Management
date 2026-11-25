package com.example.prision_management;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ReportMedicalEmergencyController
{
    @javafx.fxml.FXML
    private ComboBox<String> emergencyTypeComboBox;
    @javafx.fxml.FXML
    private TextField inmateIdTextField;
    @javafx.fxml.FXML
    private ComboBox<String> urgencyLevelComboBox;
    @javafx.fxml.FXML
    private TextField symptomsTextField;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    private void showAlert(String s){
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setContentText(s);
        a.showAndWait();
    }

    private void showMessage(String s){
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText(s);
        a.showAndWait();
    }

    @javafx.fxml.FXML
    public void initialize() {
        emergencyTypeComboBox.getItems().addAll("Injury", "Illness", "Overdose", "Other");
        urgencyLevelComboBox.getItems().addAll("Low", "Medium", "High");
    }

    @javafx.fxml.FXML
    public void submitEmergencyButton(ActionEvent actionEvent) {

        if (inmateIdTextField.getText().equals("") || symptomsTextField.getText().equals("")
                || emergencyTypeComboBox.getValue() == null || urgencyLevelComboBox.getValue() == null) {
            showAlert("Please fill in all fields");
            return;
        }

        EmergencyReport e = new EmergencyReport(
                inmateIdTextField.getText(),
                symptomsTextField.getText(),
                emergencyTypeComboBox.getValue(),
                urgencyLevelComboBox.getValue()
        );

        try {
            File f = new File("EmergencyReport.bin");
            FileOutputStream fos;
            ObjectOutputStream oos;

            if (f.exists()){
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            }
            else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(e);
            oos.close();
            showMessage("Emergency reported");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {

        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MedicalStaffDashboard.fxml"));
            Node node = loader.load();
            mainPane.getChildren().setAll(node);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
