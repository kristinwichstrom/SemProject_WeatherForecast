package controllers;

import javafx.event.ActionEvent;

import java.io.IOException;

public class LearnMoreController {

    ButtonActions buttonActions = new ButtonActions();

    public void windButton(ActionEvent actionEvent) throws IOException {
        buttonActions.learnWind(actionEvent);
    }
    public void cloudsButton(ActionEvent actionEvent) throws IOException {
        buttonActions.learnClouds(actionEvent);
    }
    public void tempButton(ActionEvent actionEvent) throws IOException {
        buttonActions.learnTemp(actionEvent);
    }
    public void rainButton(ActionEvent actionEvent) throws IOException {
        buttonActions.learnRain(actionEvent);
    }
    public void learningPageButton(ActionEvent actionEvent) throws IOException {
        buttonActions.learnFrontpage(actionEvent);
    }

}
