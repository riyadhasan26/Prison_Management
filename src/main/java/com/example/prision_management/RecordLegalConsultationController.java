package com.example.prision_management;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class RecordLegalConsultationController
{
    @javafx.fxml.FXML
    private DatePicker consultationDateDatePicker;
    @javafx.fxml.FXML
    private Label outputLabel;
    @javafx.fxml.FXML
    private ComboBox<String> inmateComboBox;
    @javafx.fxml.FXML
    private AnchorPane mainPane;
    @javafx.fxml.FXML
    private TextField detailsTextField;

    private void showAlert(String s){
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setContentText(s);
        a.showAndWait();
    }

    @javafx.fxml.FXML
    public void initialize() {

        inmateComboBox.getItems().addAll("P1001", "P1002", "P1003");
    }

    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) {

        if (inmateComboBox.getValue() == null || detailsTextField.getText().equals("")
                || consultationDateDatePicker.getValue() == null) {
            showAlert("Please fill in all fields");
            return;
        }

        Consultation c = new Consultation(
                inmateComboBox.getValue(),
                consultationDateDatePicker.getValue(),
                detailsTextField.getText()
        );

        try {
            File f = new File("Consultation.bin");
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

            oos.writeObject(c);
            oos.close();
            outputLabel.setText("Consultation recorded");
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
