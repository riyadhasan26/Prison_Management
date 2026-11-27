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

public class LoginScreenController
{
    @javafx.fxml.FXML
    private TextField passwordTextField;
    @javafx.fxml.FXML
    private TextField useridTextField;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    private void showAlert(String s){
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setContentText(s);
        a.showAndWait();
    }

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void loginButton(ActionEvent actionEvent) {

        if (useridTextField.getText().isEmpty() || passwordTextField.getText().isEmpty()) {
            showAlert("Please enter your ID and password");
            return;
        }

        boolean loggedInMedical = false;
        boolean loggedInLegal = false;

        try {
            File f = new File("MedicalStaff.bin");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while(true) {
                try {
                    MedicalStaff m = (MedicalStaff) ois.readObject();
                    if (m.login(useridTextField.getText(), passwordTextField.getText())) {
                        loggedInMedical = true;
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

        try {
            File f = new File("LegalRepresentitive.bin");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while(true) {
                try {
                    LegalRepresentitive l = (LegalRepresentitive) ois.readObject();
                    if (l.login(useridTextField.getText(), passwordTextField.getText())) {
                        loggedInLegal = true;
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

        if (loggedInMedical) {
            try{
                FXMLLoader loader = new FXMLLoader(getClass().getResource("MedicalStaffDashboard.fxml"));
                Node node = loader.load();
                mainPane.getChildren().setAll(node);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        else if (loggedInLegal) {
            try{
                FXMLLoader loader = new FXMLLoader(getClass().getResource("LegalRepresentitiveDashboard.fxml"));
                Node node = loader.load();
                mainPane.getChildren().setAll(node);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        else {
            showAlert("Incorrect ID or Password");
        }
    }
}
