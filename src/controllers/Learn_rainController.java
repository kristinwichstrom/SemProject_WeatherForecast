package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Learn_rainController {
    ButtonActions buttonActions = new ButtonActions();

    public void button_rain_learnMore(ActionEvent actionEvent) throws IOException {
        buttonActions.learnMoreRain(actionEvent);
    }

    public void button_back(ActionEvent actionEvent) throws IOException {
        buttonActions.learnFrontpage(actionEvent);
    }
}
