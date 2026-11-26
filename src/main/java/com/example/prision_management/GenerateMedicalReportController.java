package com.example.prision_management;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class GenerateMedicalReportController
{
    @javafx.fxml.FXML
    private DatePicker endDateDatePicker;
    @javafx.fxml.FXML
    private ComboBox<String> inmateComboBox;
    @javafx.fxml.FXML
    private DatePicker startDateDatePicker;
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

        inmateComboBox.getItems().addAll("P1001", "P1002", "P1003");
    }

    @javafx.fxml.FXML
    public void generateReportButton(ActionEvent actionEvent) {

        if (inmateComboBox.getValue() == null || startDateDatePicker.getValue() == null
                || endDateDatePicker.getValue() == null) {
            showAlert("Please fill in all fields");
            return;
        }

        if (startDateDatePicker.getValue().isAfter(endDateDatePicker.getValue())) {
            showAlert("Start date cannot be after end date");
            return;
        }

        int count = 0;

        try {
            File f = new File("TreatmentRecord.bin");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while(true) {
                try {
                    TreatmentRecord t = (TreatmentRecord) ois.readObject();
                    if (t.getPrisonerId().equals(inmateComboBox.getValue())
                            && !t.getTreatmentDate().isBefore(startDateDatePicker.getValue())
                            && !t.getTreatmentDate().isAfter(endDateDatePicker.getValue())) {
                        count++;
                    }
                }
                catch (EOFException eof){
                    break;
                }
            }
            ois.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        showMessage("Inmate " + inmateComboBox.getValue() + " has " + count + " treatment(s) from "
                + startDateDatePicker.getValue() + " to " + endDateDatePicker.getValue());
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