package controllers;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Learn_frontpageController {
    Parent root;
    Stage stage;
    ButtonActions buttonActions = new ButtonActions();

    public void homeButton(ActionEvent actionEvent) throws IOException {
        buttonActions.homeButton(actionEvent);

    }

    public void learnCloudsButton(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../fxml_learningPage/Learn_clouds.fxml"));
        Stage(actionEvent);
    }

    public void learnWindButton(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../fxml_learningPage/Learn_wind.fxml"));
        Stage(actionEvent);
    }

    public void learnTempButton(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../fxml_learningPage/Learn_temperature.fxml"));
        Stage(actionEvent);
    }

    public void learnRainButton(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../fxml_learningPage/Learn_rain.fxml"));
        Stage(actionEvent);
    }
    public void getScene() {
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void Stage(ActionEvent actionEvent){
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        getScene();
        //screenController.getScene();
    }

}
