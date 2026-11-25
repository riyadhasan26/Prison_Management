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

public class VisitNotificationsController
{
    @javafx.fxml.FXML
    private TableColumn<VisitRequest, LocalDate> dateTableColumn;
    @javafx.fxml.FXML
    private TableColumn<VisitRequest, String> visitTableColumn;
    @javafx.fxml.FXML
    private TableColumn<VisitRequest, String> updateTableColumn;
    @javafx.fxml.FXML
    private TableView<VisitRequest> tableViewID;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    private void showMessage(String s){
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText(s);
        a.showAndWait();
    }

    @javafx.fxml.FXML
    public void initialize() {
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<>("requestDate"));
        visitTableColumn.setCellValueFactory(new PropertyValueFactory<>("requestId"));
        updateTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    @javafx.fxml.FXML
    public void loadButton(ActionEvent actionEvent) {

        tableViewID.getItems().clear();

        try {
            File f = new File("VisitRequest.bin");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while(true) {
                try {
                    VisitRequest v = (VisitRequest) ois.readObject();
                    if (v.getStatus().equals("Approved") || v.getStatus().equals("Rejected")) {
                        tableViewID.getItems().add(v);
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

        if (tableViewID.getItems().isEmpty()) {
            showMessage("No updates yet");
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