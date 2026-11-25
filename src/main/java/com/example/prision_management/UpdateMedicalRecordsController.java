package com.example.prision_management;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class UpdateMedicalRecordsController
{
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
    }

    @javafx.fxml.FXML
    public void updateButton(ActionEvent actionEvent) {

        if (inmateIDTextField.getText().equals("") || newDiagnosisTextField.getText().equals("")
                || newTreatmentTextField.getText().equals("") || treatmentDateDatePicker.getValue() == null) {
            showAlert("Please fill in all fields");
            return;
        }

        ArrayList<TreatmentRecord> treatmentList = new ArrayList<TreatmentRecord>();
        boolean found = false;

        try {
            File f = new File("TreatmentRecord.bin");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while(true) {
                try {
                    TreatmentRecord t = (TreatmentRecord) ois.readObject();
                    treatmentList.add(t);
                }
                catch (EOFException eof){
                    break;
                }
            }
            ois.close();

            for (TreatmentRecord t : treatmentList) {
                if (t.getPrisonerId().equals(inmateIDTextField.getText())
                        && t.getTreatmentDate().equals(treatmentDateDatePicker.getValue())) {
                    t.setDiagnosis(newDiagnosisTextField.getText());
                    t.setTreatmentProvided(newTreatmentTextField.getText());
                    found = true;
                    break;
                }
            }

            if (found) {
                // rewrite the whole file with the updated list
                FileOutputStream fos = new FileOutputStream(f);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                for (TreatmentRecord t : treatmentList) {
                    oos.writeObject(t);
                }
                oos.close();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        if (found) {
            showMessage("Record updated");
        } else {
            showAlert("No record found for that inmate ID and date");
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
