package com.example.prision_management;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class RecordMedicationController
{
    @javafx.fxml.FXML
    private TextField medicationNameTextField;
    @javafx.fxml.FXML
    private TextField inmateIDTextField;
    @javafx.fxml.FXML
    private TextField dosageTextField;
    @javafx.fxml.FXML
    private TextField quantityTextField;
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
    public void saveMedicationButton(ActionEvent actionEvent) {

        if (medicationNameTextField.getText().equals("") || dosageTextField.getText().equals("")
                || quantityTextField.getText().equals("") || inmateIDTextField.getText().equals("")) {
            showAlert("Please fill in all fields");
            return;
        }

        try {
            if (Integer.parseInt(quantityTextField.getText()) <= 0) {
                showAlert("Quantity must be more than 0");
                return;
            }

            Medication m = new Medication(
                    medicationNameTextField.getText(),
                    dosageTextField.getText(),
                    Integer.parseInt(quantityTextField.getText()),
                    inmateIDTextField.getText()
            );

            File f = new File("Medication.bin");
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

            oos.writeObject(m);
            oos.close();
            showMessage("Medication recorded");
        }
        catch (Exception e){
            showAlert("Quantity must be a number");
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
}
