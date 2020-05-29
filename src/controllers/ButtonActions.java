//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package controllers;

import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ButtonActions {
    Parent root;
    Stage stage;

    public ButtonActions() {
    }

    /*
     ** Gets Stage information
     */
    public void Stage(ActionEvent actionEvent) {
        this.stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        this.Scene();
    }

    /*
     ** Sets a new Scene
     */
    public void Scene() {
        Scene scene = new Scene(this.root);
        this.stage.setScene(scene);
        this.stage.show();
    }


    public ActionEvent homeButton(ActionEvent actionEvent) throws IOException {
        this.root = (Parent) FXMLLoader.load(this.getClass().getResource("../homepage/HomePage.fxml"));
        this.Stage(actionEvent);
        return actionEvent;
    }

    public ActionEvent weatherFrontpage(ActionEvent actionEvent) throws IOException {
        this.root = (Parent) FXMLLoader.load(this.getClass().getResource("../fxml_weatherForecast/WeatherFrontpage.fxml"));
        this.Stage(actionEvent);
        return actionEvent;
    }


    public ActionEvent weatherSummer(ActionEvent actionEvent) throws IOException {
        HomePageController.timeOfDay = (ArrayList) HomePageController.weatherForecastFromDb.get(0);
        HomePageController.season = "SUMMER";
        this.root = (Parent) FXMLLoader.load(this.getClass().getResource("../fxml_weatherForecast/Weather.fxml"));
        this.Stage(actionEvent);
        return actionEvent;
    }

    public ActionEvent weatherAutumn(ActionEvent actionEvent) throws IOException {
        HomePageController.timeOfDay = (ArrayList) HomePageController.weatherForecastFromDb.get(1);
        HomePageController.season = "AUTUMN";
        this.root = (Parent) FXMLLoader.load(this.getClass().getResource("../fxml_weatherForecast/Weather.fxml"));
        this.Stage(actionEvent);
        return actionEvent;
    }

    public ActionEvent weatherWinter(ActionEvent actionEvent) throws IOException {
        HomePageController.timeOfDay = (ArrayList) HomePageController.weatherForecastFromDb.get(2);
        HomePageController.season = "WINTER";
        this.root = (Parent) FXMLLoader.load(this.getClass().getResource("../fxml_weatherForecast/Weather.fxml"));
        this.Stage(actionEvent);
        return actionEvent;
    }

    public ActionEvent weatherSpring(ActionEvent actionEvent) throws IOException {
        HomePageController.timeOfDay  = (ArrayList) HomePageController.weatherForecastFromDb.get(3);
        HomePageController.season = "SPRING";
        this.root = (Parent) FXMLLoader.load(this.getClass().getResource("../fxml_weatherForecast/Weather.fxml"));
        this.Stage(actionEvent);
        return actionEvent;
    }

    public ActionEvent learnClouds(ActionEvent actionEvent) throws IOException {
        this.root = (Parent) FXMLLoader.load(this.getClass().getResource("../fxml_LearningPage/LearnClouds.fxml"));
        this.Stage(actionEvent);
        return actionEvent;
    }

    public ActionEvent learnWind(ActionEvent actionEvent) throws IOException {
        this.root = (Parent) FXMLLoader.load(this.getClass().getResource("../fxml_LearningPage/LearnWind.fxml"));
        this.Stage(actionEvent);
        return actionEvent;
    }

    public ActionEvent learnTemp(ActionEvent actionEvent) throws IOException {
        this.root = (Parent) FXMLLoader.load(this.getClass().getResource("../fxml_LearningPage/LearnTemperature.fxml"));
        this.Stage(actionEvent);
        return actionEvent;
    }

    public ActionEvent learnRain(ActionEvent actionEvent) throws IOException {
        this.root = (Parent) FXMLLoader.load(this.getClass().getResource("../fxml_LearningPage/LearnRain.fxml"));
        this.Stage(actionEvent);
        return actionEvent;
    }

    public ActionEvent learnFrontpage(ActionEvent actionEvent) throws IOException {
        this.root = (Parent) FXMLLoader.load(this.getClass().getResource("../fxml_LearningPage/LearnFrontPage.fxml"));
        this.Stage(actionEvent);
        return actionEvent;
    }

    public ActionEvent learnMoreClouds(ActionEvent actionEvent) throws IOException {
        this.root = (Parent) FXMLLoader.load(this.getClass().getResource("../fxml_learnMore/LearnMoreClouds.fxml"));
        this.Stage(actionEvent);
        return actionEvent;
    }

    public ActionEvent learnMoreRain(ActionEvent actionEvent) throws IOException {
        this.root = (Parent) FXMLLoader.load(this.getClass().getResource("../fxml_learnMore/LearnMoreRain.fxml"));
        this.Stage(actionEvent);
        return actionEvent;
    }

    public ActionEvent learnMoreWind(ActionEvent actionEvent) throws IOException {
        this.root = (Parent) FXMLLoader.load(this.getClass().getResource("../fxml_learnMore/LearnMoreWind.fxml"));
        this.Stage(actionEvent);
        return actionEvent;
    }

    public ActionEvent learnMoreTemp(ActionEvent actionEvent) throws IOException {
        this.root = (Parent) FXMLLoader.load(this.getClass().getResource("../fxml_learnMore/LearnMoreTemp.fxml"));
        this.Stage(actionEvent);
        return actionEvent;
    }
}
