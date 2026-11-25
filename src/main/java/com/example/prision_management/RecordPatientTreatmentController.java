package com.example.prision_management;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class RecordPatientTreatmentController
{
    @javafx.fxml.FXML
    private TextField diagnosisTextField;
    @javafx.fxml.FXML
    private TextField treatmentProvidedTextField;
    @javafx.fxml.FXML
    private AnchorPane mainPane;
    @javafx.fxml.FXML
    private DatePicker treatmentDateDatePicker;
    @javafx.fxml.FXML
    private TextField inmateIdTextFIeld;

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
    }

    @javafx.fxml.FXML
    public void validateAndSaveTreatment(ActionEvent actionEvent) {

        if (inmateIDTextField.getText().equals("") || diagnosisTextField.getText().equals("")
                || treatmentProvidedTextField.getText().equals("") || treatmentDateDatePicker.getValue() == null) {
            showAlert("Please fill in all fields");
            return;
        }

        TreatmentRecord t = new TreatmentRecord(
                inmateIDTextField.getText(),
                diagnosisTextField.getText(),
                treatmentProvidedTextField.getText(),
                treatmentDateDatePicker.getValue()
        );

        try {
            File f = new File("TreatmentRecord.bin");
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

            oos.writeObject(t);
            oos.close();
            showMessage("Treatment recorded");
        }
        catch (Exception e){
            e.printStackTrace();
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

    @Deprecated
    public void treatmentDateDatePicker(ActionEvent actionEvent) {
    }
}
