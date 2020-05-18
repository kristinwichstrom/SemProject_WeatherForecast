package controllers;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Learn_frontpageController {
    ButtonActions buttonActions = new ButtonActions();

    public void homeButton(ActionEvent actionEvent) throws IOException {
        buttonActions.homeButton(actionEvent);
    }
    public void learnCloudsButton(ActionEvent actionEvent) throws IOException {
        buttonActions.learnClouds(actionEvent);
    }

    public void learnWindButton(ActionEvent actionEvent) throws IOException {
        buttonActions.learnWind(actionEvent);
    }

    public void learnTempButton(ActionEvent actionEvent) throws IOException {
        buttonActions.learnTemp(actionEvent);
    }

    public void learnRainButton(ActionEvent actionEvent) throws IOException {
        buttonActions.learnRain(actionEvent);
    }

    }

