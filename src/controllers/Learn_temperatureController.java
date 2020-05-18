package controllers;

import javafx.event.ActionEvent;

import java.io.IOException;

public class Learn_temperatureController {
    ButtonActions buttonActions = new ButtonActions();


    public void learnMoreTempButton(ActionEvent actionEvent) throws IOException { //rename method
        buttonActions.learnMoreTemp(actionEvent);
    }

    public void button_back(ActionEvent actionEvent) throws IOException {
        buttonActions.learnFrontpage(actionEvent);
    }
}
