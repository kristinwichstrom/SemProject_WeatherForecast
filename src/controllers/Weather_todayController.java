package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class Weather_todayController {
    Parent root;
    Stage stage;
    @FXML
    private Label weatherTodayLabel;

    TimeDateHandler timeDateHandler = new TimeDateHandler();

    public void getScene () {
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void Stage(ActionEvent actionEvent){
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        getScene();
    }

    public void clickButton(javafx.event.ActionEvent actionEvent) {
        weatherTodayLabel.setText(timeDateHandler.getCurrentTime());
        System.out.println();
    }

    public void homeButton(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../fxml_weatherForecast/weather_frontpage.fxml"));
        Stage(actionEvent);

    }
}

