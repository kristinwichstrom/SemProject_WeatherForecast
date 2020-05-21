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

    public void Stage(ActionEvent actionEvent) {
        this.stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        this.getScene();
    }

    public void getScene() {
        Scene scene = new Scene(this.root);
        this.stage.setScene(scene);
        this.stage.show();
    }


    public ActionEvent homeButton(ActionEvent actionEvent) throws IOException {
        this.root = (Parent)FXMLLoader.load(this.getClass().getResource("../sample/HomePage.fxml"));
        this.Stage(actionEvent);
        return actionEvent;
    }

    public ActionEvent weatherFrontpage(ActionEvent actionEvent) throws IOException {
        this.root = (Parent)FXMLLoader.load(this.getClass().getResource("../fxml_weatherForecast/Weather_Frontpage.fxml"));
        this.Stage(actionEvent);
        return actionEvent;
    }

    public ActionEvent weatherFirst(ActionEvent actionEvent) throws IOException {
        Front_frontpageController.today = (ArrayList)Front_frontpageController.weatherForecastFromDb.get(0);
        Front_frontpageController.season = "SUMMER";
        this.root = (Parent)FXMLLoader.load(this.getClass().getResource("../fxml_weatherForecast/Weather.fxml"));
        this.Stage(actionEvent);
        return actionEvent;
    }

    public ActionEvent weatherSecond(ActionEvent actionEvent) throws IOException {
        Front_frontpageController.today = (ArrayList)Front_frontpageController.weatherForecastFromDb.get(1);
        Front_frontpageController.season = "AUTUMN";
        this.root = (Parent)FXMLLoader.load(this.getClass().getResource("../fxml_weatherForecast/Weather.fxml"));
        this.Stage(actionEvent);
        return actionEvent;
    }

    public ActionEvent weatherThird(ActionEvent actionEvent) throws IOException {
        Front_frontpageController.today = (ArrayList)Front_frontpageController.weatherForecastFromDb.get(2);
        Front_frontpageController.season = "WINTER";
        this.root = (Parent)FXMLLoader.load(this.getClass().getResource("../fxml_weatherForecast/Weather.fxml"));
        this.Stage(actionEvent);
        return actionEvent;
    }

    public ActionEvent weatherFourth(ActionEvent actionEvent) throws IOException {
        Front_frontpageController.today = (ArrayList)Front_frontpageController.weatherForecastFromDb.get(3);
        Front_frontpageController.season = "SPRING";
        this.root = (Parent)FXMLLoader.load(this.getClass().getResource("../fxml_weatherForecast/Weather.fxml"));
        this.Stage(actionEvent);
        return actionEvent;
    }

    public ActionEvent learnClouds(ActionEvent actionEvent) throws IOException {
        this.root = (Parent)FXMLLoader.load(this.getClass().getResource("../fxml_learningPage/Learn_clouds.fxml"));
        this.Stage(actionEvent);
        return actionEvent;
    }

    public ActionEvent learnWind(ActionEvent actionEvent) throws IOException {
        this.root = (Parent)FXMLLoader.load(this.getClass().getResource("../fxml_learningPage/Learn_wind.fxml"));
        this.Stage(actionEvent);
        return actionEvent;
    }

    public ActionEvent learnTemp(ActionEvent actionEvent) throws IOException {
        this.root = (Parent)FXMLLoader.load(this.getClass().getResource("../fxml_learningPage/Learn_temperature.fxml"));
        this.Stage(actionEvent);
        return actionEvent;
    }

    public ActionEvent learnRain(ActionEvent actionEvent) throws IOException {
        this.root = (Parent)FXMLLoader.load(this.getClass().getResource("../fxml_learningPage/Learn_rain.fxml"));
        this.Stage(actionEvent);
        return actionEvent;
    }

    public ActionEvent learnFrontpage(ActionEvent actionEvent) throws IOException {
        this.root = (Parent)FXMLLoader.load(this.getClass().getResource("../fxml_learningPage/Learn_front.fxml"));
        this.Stage(actionEvent);
        return actionEvent;
    }

    public ActionEvent learnMoreClouds(ActionEvent actionEvent) throws IOException {
        this.root = (Parent)FXMLLoader.load(this.getClass().getResource("../fxml_learnMore/LearnMore_clouds.fxml"));
        this.Stage(actionEvent);
        return actionEvent;
    }

    public ActionEvent learnMoreRain(ActionEvent actionEvent) throws IOException {
        this.root = (Parent)FXMLLoader.load(this.getClass().getResource("../fxml_learnMore/LearnMore_rain.fxml"));
        this.Stage(actionEvent);
        return actionEvent;
    }

    public ActionEvent learnMoreWind(ActionEvent actionEvent) throws IOException {
        this.root = (Parent)FXMLLoader.load(this.getClass().getResource("../fxml_learnMore/LearnMore_wind.fxml"));
        this.Stage(actionEvent);
        return actionEvent;
    }

    public ActionEvent learnMoreTemp(ActionEvent actionEvent) throws IOException {
        this.root = (Parent)FXMLLoader.load(this.getClass().getResource("../fxml_learnMore/LearnMore_temp.fxml"));
        this.Stage(actionEvent);
        return actionEvent;
    }
}
