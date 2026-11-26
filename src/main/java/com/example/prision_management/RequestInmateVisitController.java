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

public class RequestInmateVisitController
{
    @javafx.fxml.FXML
    private ComboBox<String> inmateComboBox;
    @javafx.fxml.FXML
    private TextField purposeOfVisitTextField;
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

        inmateComboBox.getItems().addAll("P1001", "P1002", "P1003");
    }

    @javafx.fxml.FXML
    public void submitRequestButton(ActionEvent actionEvent) {

        if (inmateComboBox.getValue() == null || purposeOfVisitTextField.getText().equals("")
                || visitDateDatePicker.getValue() == null) {
            showAlert("Please fill in all fields");
            return;
        }


        int count = 0;

        try {
            File f = new File("VisitRequest.bin");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while(true) {
                try {
                    VisitRequest old = (VisitRequest) ois.readObject();
                    count++;
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

        VisitRequest v = new VisitRequest(
                "V" + (count + 1),
                inmateComboBox.getValue(),
                purposeOfVisitTextField.getText(),
                visitDateDatePicker.getValue(),
                "Pending"
        );

        try {
            File f = new File("VisitRequest.bin");
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

            oos.writeObject(v);
            oos.close();
            showMessage("Request submitted. Request ID: " + v.getRequestId());
        }
        catch (Exception e){
            e.printStackTrace();
        }
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
