package com.example.prision_management;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ScheduleMedicalAppointmentController
{
    @javafx.fxml.FXML
    private ComboBox<String> medicalStaffComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> inmateComboBox;
    @javafx.fxml.FXML
    private DatePicker appointmentDateDatePicker;
    @javafx.fxml.FXML
    private TextField scheduleTimeTextField;
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

        medicalStaffComboBox.getItems().addAll("S1", "S2");
    }

    @javafx.fxml.FXML
    public void scheduleAppointmentButton(ActionEvent actionEvent) {

        if (inmateComboBox.getValue() == null || medicalStaffComboBox.getValue() == null
                || appointmentDateDatePicker.getValue() == null || scheduleTimeTextField.getText().equals("")) {
            showAlert("Please fill in all fields");
            return;
        }

        Appointment a = new Appointment(
                inmateComboBox.getValue(),
                appointmentDateDatePicker.getValue(),
                scheduleTimeTextField.getText(),
                medicalStaffComboBox.getValue()
        );

        try {
            File f = new File("Appointment.bin");
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

            oos.writeObject(a);
            oos.close();
            showMessage("Appointment scheduled");
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
    public void scheduleApppintmentButton(ActionEvent actionEvent) {
    }
}
