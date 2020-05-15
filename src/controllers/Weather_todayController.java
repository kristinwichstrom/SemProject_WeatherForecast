package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Weather_todayController {


    @FXML
    private Label weatherTodayLabel;

    TimeDateHandler timeDateHandler = new TimeDateHandler();

    public void clickButton(javafx.event.ActionEvent actionEvent) {

        weatherTodayLabel.setText(timeDateHandler.getCurrentTime());

        System.out.println();

    }
}

