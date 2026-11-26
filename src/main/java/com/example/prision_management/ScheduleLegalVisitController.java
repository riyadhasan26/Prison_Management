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

public class ScheduleLegalVisitController
{
    @javafx.fxml.FXML
    private ComboBox<String> approvedVisitComboBox;
    @javafx.fxml.FXML
    private DatePicker visitDateDatePicker;
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
        try {
            File f = new File("VisitRequest.bin");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while(true) {
                try {
                    VisitRequest v = (VisitRequest) ois.readObject();
                    if (v.getStatus().equals("Approved")) {
                        approvedVisitComboBox.getItems().add(v.getRequestId());
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
    }

    @javafx.fxml.FXML
    public void scheduleVisitButton(ActionEvent actionEvent) {

        if (approvedVisitComboBox.getValue() == null || visitDateDatePicker.getValue() == null) {
            showAlert("Please select an approved visit and a date");
            return;
        }

        // saving the date needs the visit schedule class from the Visitor section
        showMessage("Visit " + approvedVisitComboBox.getValue() + " scheduled for " + visitDateDatePicker.getValue());
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
