package com.example.prision_management;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class MedicalStaffDashboardController
{
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void trackMedicalSuppliesButton(ActionEvent actionEvent) {

        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("TrackMedicalSupplies.fxml"));
            Node node = loader.load();
            mainPane.getChildren().setAll(node);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void scheduleAppointmentButton(ActionEvent actionEvent) {

        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ScheduleMedicalAppointment.fxml"));
            Node node = loader.load();
            mainPane.getChildren().setAll(node);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }



    @javafx.fxml.FXML
    public void viewMedicalHistoryButton(ActionEvent actionEvent) {

        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ViewMedicalHistory.fxml"));
            Node node = loader.load();
            mainPane.getChildren().setAll(node);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void recordTreatmentButton(ActionEvent actionEvent) {

        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("RecordPatientTreatment.fxml"));
            Node node = loader.load();
            mainPane.getChildren().setAll(node);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void generateReportButton(ActionEvent actionEvent) {

        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("GenerateMedicalReport.fxml"));
            Node node = loader.load();
            mainPane.getChildren().setAll(node);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void recordMedicationButton(ActionEvent actionEvent) {

        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("RecordMedication.fxml"));
            Node node = loader.load();
            mainPane.getChildren().setAll(node);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void reportEmergencyButton(ActionEvent actionEvent) {

        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ReportMedicalEmergency.fxml"));
            Node node = loader.load();
            mainPane.getChildren().setAll(node);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void signOutButton(ActionEvent actionEvent) {

        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginScreen.fxml"));
            Node node = loader.load();
            mainPane.getChildren().setAll(node);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
