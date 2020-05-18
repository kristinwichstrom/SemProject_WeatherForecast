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
        root = FXMLLoader.load(getClass().getResource("../sample/homePage.fxml"));
        Stage(actionEvent);
        return actionEvent;

    }

    /*
     ** Learn More about Pages: Scene shifts
     */
    public ActionEvent learnMoreFrontButton(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../fxml_learningPage/Learn_front.fxml"));
        Stage(actionEvent);
        return actionEvent;
    }

}
