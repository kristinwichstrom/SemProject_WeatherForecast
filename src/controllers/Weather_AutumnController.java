package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class Weather_AutumnController {
    ButtonActions buttonActions = new ButtonActions();
    TimeDateHandler timeDateHandler = new TimeDateHandler();
    @FXML
    private Label weatherTomorrowLabel;


    public void homeButton(ActionEvent actionEvent) throws IOException {
        buttonActions.weatherFrontpage(actionEvent);

        weatherTomorrowLabel.setText(timeDateHandler.getCurrentTime());


    }
}

