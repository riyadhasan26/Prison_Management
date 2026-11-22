package com.example.prision_management;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ViewMedicalHistoryController {
    @javafx.fxml.FXML
    private TableView tableviewId;
    @javafx.fxml.FXML
    private TableColumn treatmentTableColumn;
    @javafx.fxml.FXML
    private TextField inmateIdTextField;
    @javafx.fxml.FXML
    private TableColumn dateTableColumn;
    @javafx.fxml.FXML
    private TableColumn diagnosisTableColumn;

    @javafx.fxml.FXML
    public void searchButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
    }
}
