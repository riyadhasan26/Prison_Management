package com.example.prision_management;

import javafx.scene.Scene;

public class PrisonInformationViewController {
    @javafx.fxml.FXML
    private TextField securityTF;
    @javafx.fxml.FXML
    private TextField inmateCountTF;
    @javafx.fxml.FXML
    private TextField prisonCapacityTF;

    @javafx.fxml.FXML
    public void initialize() {
    }
    @javafx.fxml.FXML
    public void nextPageButtonOA(ActionEvent actionEvent) throws IOException {
        Helper.newWindow(path:"hello-view.fxml",title:"Helloooo!");


}
    @javafx.fxml.FXML
    public void switchscene(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
    }
}