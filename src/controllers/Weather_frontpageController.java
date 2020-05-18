package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Weather_frontpageController {


    ButtonActions buttonActions = new ButtonActions();


    public void homeButton(ActionEvent actionEvent) throws IOException {
        buttonActions.homeButton(actionEvent);
    }


    public void firstDayButton(ActionEvent actionEvent) throws IOException {
        buttonActions.weatherFirst(actionEvent);

    }

    public void secondDayButton(ActionEvent actionEvent) throws IOException {
        buttonActions.weatherSecond(actionEvent);
    }

    public void thirdDayButton(ActionEvent actionEvent) throws IOException {
        buttonActions.weatherThird(actionEvent);
    }

    public void fourthDayButton(ActionEvent actionEvent) throws IOException {
        buttonActions.weatherFourth(actionEvent);
    }

}
