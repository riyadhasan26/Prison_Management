package com.example.prision_management;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TrackMedicalSuppliesController
{
    @javafx.fxml.FXML
    private ComboBox<String> medicalSupplyComboBox;
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
        // sample supplies
        medicalSupplyComboBox.getItems().addAll("Bandages", "Painkillers", "Gloves");
    }

    @javafx.fxml.FXML
    public void updateSupplyButton(ActionEvent actionEvent) {

        if (medicalSupplyComboBox.getValue() == null || quantityTextField.getText().equals("")) {
            showAlert("Please fill in all fields");
            return;
        }

        try {
            if (Integer.parseInt(quantityTextField.getText()) < 0) {
                showAlert("Quantity cannot be negative");
                return;
            }

            MedicalSupply s = new MedicalSupply(
                    Integer.parseInt(quantityTextField.getText()),
                    medicalSupplyComboBox.getValue()
            );

            File f = new File("MedicalSupply.bin");
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

            oos.writeObject(s);
            oos.close();
            showMessage("Supply recorded");
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
