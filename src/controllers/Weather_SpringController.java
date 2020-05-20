package controllers;

import javafx.event.ActionEvent;

import java.io.IOException;

public class Weather_SpringController {

    ButtonActions buttonActions = new ButtonActions();

    public void homeButton(ActionEvent actionEvent) throws IOException {
        buttonActions.weatherFrontpage(actionEvent);

    }
}
