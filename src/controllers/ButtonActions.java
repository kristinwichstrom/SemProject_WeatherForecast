package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ButtonActions {
    Parent root;
    Stage stage;

    public ButtonActions() {
    }

    public void Stage(ActionEvent actionEvent) {
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        getScene();
    }

    public void getScene() {
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    /*
     ** Home page Scene shift
     */

    public ActionEvent homeButton(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../sample/HomePage.fxml"));
        Stage(actionEvent);
        return actionEvent;

    }

    /*
     ** Weather Forecast pages: Scene shifts
     */
    public ActionEvent weatherFrontpage(ActionEvent actionEvent) throws IOException {

        root = FXMLLoader.load(getClass().getResource("../fxml_weatherForecast/Weather_Frontpage.fxml"));
        Stage(actionEvent);
        return actionEvent;
    }

    public ActionEvent weatherFirst(ActionEvent actionEvent) throws IOException {

        root = FXMLLoader.load(getClass().getResource("../fxml_weatherForecast/Weather_Summer.fxml"));
        Stage(actionEvent);
        return actionEvent;
    }

    public ActionEvent weatherSecond(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../fxml_weatherForecast/Weather_Autumn.fxml"));
        Stage(actionEvent);
        return actionEvent;
    }

    public ActionEvent weatherThird(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../fxml_weatherForecast/Weather_Winter.fxml"));
        Stage(actionEvent);
        return actionEvent;
    }

    public ActionEvent weatherFourth(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../fxml_weatherForecast/Weather_Spring.fxml"));
        Stage(actionEvent);
        return actionEvent;
    }
    /*
     ** Learn About Pages: Scene shifts
     */

    public ActionEvent learnClouds(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../fxml_learningPage/Learn_clouds.fxml"));
        Stage(actionEvent);
        return actionEvent;
    }

    public ActionEvent learnWind(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../fxml_learningPage/Learn_wind.fxml"));
        Stage(actionEvent);
        return actionEvent;
    }

    public ActionEvent learnTemp(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../fxml_learningPage/Learn_temperature.fxml"));
        Stage(actionEvent);
        return actionEvent;
    }

    public ActionEvent learnRain(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../fxml_learningPage/Learn_rain.fxml"));
        Stage(actionEvent);
        return actionEvent;
    }

    /*
     ** Learn More about Pages: Scene shifts
     */
    public ActionEvent learnFrontpage(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../fxml_learningPage/Learn_front.fxml"));
        Stage(actionEvent);
        return actionEvent;
    }

    public ActionEvent learnMoreClouds(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../fxml_learnMore/LearnMore_clouds.fxml"));
        Stage(actionEvent);
        return actionEvent;
    }

    public ActionEvent learnMoreRain(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../fxml_learnMore/LearnMore_rain.fxml"));
        Stage(actionEvent);
        return actionEvent;
    }

    public ActionEvent learnMoreWind(ActionEvent actionEvent) throws IOException { //rename method
        root = FXMLLoader.load(getClass().getResource("../fxml_learnMore/LearnMore_wind.fxml"));
        Stage(actionEvent);
        return actionEvent;
    }

    public ActionEvent learnMoreTemp(ActionEvent actionEvent) throws IOException { //rename method
        root = FXMLLoader.load(getClass().getResource("../fxml_learnMore/LearnMore_temp.fxml"));
        Stage(actionEvent);
        return actionEvent;
    }


}
