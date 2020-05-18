package controllers;

import javafx.event.ActionEvent;

import java.io.IOException;

public class LearnMore_cloudsController {
    ButtonActions buttonActions = new ButtonActions();

    public void button_learnMoreClouds(ActionEvent actionEvent) throws IOException {
        buttonActions.learnClouds(actionEvent);
    }
    public void button_back(ActionEvent actionEvent) throws IOException {
        buttonActions.learnFrontpage(actionEvent);
    }
}
