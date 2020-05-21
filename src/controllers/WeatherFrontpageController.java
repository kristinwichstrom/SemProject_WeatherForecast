package controllers;

import javafx.event.ActionEvent;

import java.io.IOException;

public class WeatherFrontpageController {


    ButtonActions buttonActions = new ButtonActions();


    public void homeButton(ActionEvent actionEvent) throws IOException {
        buttonActions.homeButton(actionEvent);
    }


    public void summerButton(ActionEvent actionEvent) throws IOException {
        buttonActions.weatherSummer(actionEvent);

    }

    public void autumnButton(ActionEvent actionEvent) throws IOException {
        buttonActions.weatherAutumn(actionEvent);
    }

    public void winterButton(ActionEvent actionEvent) throws IOException {
        buttonActions.weatherWinter(actionEvent);
    }

    public void springButton(ActionEvent actionEvent) throws IOException {
        buttonActions.weatherSpring(actionEvent);
    }

}
