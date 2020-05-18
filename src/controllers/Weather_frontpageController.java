package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Weather_frontpageController {

    Parent root;
    Stage stage;


    public void homeButton(ActionEvent actionEvent) throws IOException {

        root = FXMLLoader.load(getClass().getResource("../sample/frontpage.fxml"));
        Stage(actionEvent);
    }


    public void firstDayButton(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../fxml_weatherForecast/Weather_first.fxml"));
        Stage(actionEvent);

    }

    public void secondDayButton(ActionEvent actionEvent) {
    }

    public void thirdDayButton(ActionEvent actionEvent) {
    }

    public void fourthDayButton(ActionEvent actionEvent) {
    }
    public void getScene () {
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void Stage(ActionEvent actionEvent){
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        getScene();
    }
}
