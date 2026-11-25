package com.example.prision_management;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.time.LocalDate;

public class ViewMedicalHistoryController
{
    @javafx.fxml.FXML
    private TableView<TreatmentRecord> tableviewId;
    @javafx.fxml.FXML
    private TableColumn<TreatmentRecord, String> treatmentTableColumn;
    @javafx.fxml.FXML
    private TextField inmateIdTextField;
    @javafx.fxml.FXML
    private TableColumn<TreatmentRecord, LocalDate> dateTableColumn;
    @javafx.fxml.FXML
    private TableColumn<TreatmentRecord, String> diagnosisTableColumn;
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
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<>("treatmentDate"));
        diagnosisTableColumn.setCellValueFactory(new PropertyValueFactory<>("diagnosis"));
        treatmentTableColumn.setCellValueFactory(new PropertyValueFactory<>("treatmentProvided"));
    }

    @javafx.fxml.FXML
    public void searchButton(ActionEvent actionEvent) {

        if (inmateIdTextField.getText().equals("")) {
            showAlert("Please enter an inmate ID");
            return;
        }

        tableviewId.getItems().clear();

        try {
            File f = new File("TreatmentRecord.bin");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while(true) {
                try {
                    TreatmentRecord t = (TreatmentRecord) ois.readObject();
                    if (t.getPrisonerId().equals(inmateIdTextField.getText())) {
                        tableviewId.getItems().add(t);
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

        if (tableviewId.getItems().isEmpty()) {
            showMessage("No records found");
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
