package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Learn_cloudsController {
    Parent root;
    Stage stage;

    public void Stage(ActionEvent actionEvent){
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        getScene();
    }

    public void getScene () {
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    public void button_wind_learnMore(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../fxml_learnMore/LearnMore_clouds.fxml"));
        Stage(actionEvent);
    }

    public void button_back(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../fxml_learningPage/Learn_front.fxml"));
        Stage(actionEvent);
    }
}
