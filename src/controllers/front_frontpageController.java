package controllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class front_frontpageController {

    public void buttonWeatherForecast(ActionEvent actionEvent) throws IOException {
        System.out.println("Clicked the weather forecast button");
        Parent forecastFront = FXMLLoader.load(getClass().getResource("../weatherForecast/frontpageWeatherForecast.fxml"));
        Scene forecastFrontScene = new Scene(forecastFront);

        //Gets Stage information
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(forecastFrontScene);
        window.show();

    }

    public void buttonLearnAbout(ActionEvent actionEvent) throws IOException {

        System.out.println("Clicked the learning page button");
        Parent learningPageFront = FXMLLoader.load(getClass().getResource("../learningPageFXML/learn_front.fxml"));
        Scene learningPageFrontScene = new Scene(learningPageFront);

        //Gets Stage information
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(learningPageFrontScene);
        window.show();

    }
}
