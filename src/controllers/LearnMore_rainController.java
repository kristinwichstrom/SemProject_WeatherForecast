package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LearnMore_rainController {
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

    public void button_back(ActionEvent actionEvent)throws IOException {
        root = FXMLLoader.load(getClass().getResource("../fxml_learningPage/Learn_front.fxml"));
        Stage(actionEvent);
    }

    public void button_learnMore(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../fxml_learningMore/LearnMore_wind.fxml"));
        Stage(actionEvent);
    }



}
