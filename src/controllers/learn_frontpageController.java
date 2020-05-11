package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;


public class learn_frontpageController {
    Parent root;
    Stage stage;

    public void homeButton(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../sample/frontpage.fxml"));
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        getScene();
    }

    public void learnCloudsButton(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../fxml_learningPage/learn_clouds.fxml"));
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        getScene();
    }

    public void learnWindButton(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../fxml_learningPage/learn_wind.fxml"));
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        getScene();
    }

    public void learnTempButton(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource(""));
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        getScene();
    }

    public void learnRainButton(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../fxml_learningPage/learn_rain.fxml"));
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        getScene();
    }

    public void getScene() {
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
