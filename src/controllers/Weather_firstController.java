/*
** Class for today's weather forecast.
 */
package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


import java.io.IOException;

public class Weather_firstController {
    @FXML
    private Label weatherTodayLabel;

    TimeDateHandler timeDateHandler = new TimeDateHandler();
    ButtonActions buttonActions = new ButtonActions();

    /*
    ** Calls method for getting current time
     */
    public void clickButton(javafx.event.ActionEvent actionEvent) {
        weatherTodayLabel.setText(timeDateHandler.getCurrentTime());
        System.out.println();
    }

    public void homeButton(ActionEvent actionEvent) throws IOException {
        buttonActions.weatherFrontpage(actionEvent);

    }
}

