package controllers;

import javafx.event.ActionEvent;

import java.io.IOException;

public class LearnMore_windController {
    ButtonActions buttonActions = new ButtonActions();

    public void button_learnMoreWind(ActionEvent actionEvent) throws IOException {
        buttonActions.learnWind(actionEvent);
    }

    public void button_back(ActionEvent actionEvent) throws IOException {
        buttonActions.learnFrontpage(actionEvent);
    }

}
