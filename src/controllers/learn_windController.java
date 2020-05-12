package controllers;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class learn_windController {
    Parent root;
    Stage stage;

    public void button_wind_learnMore(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../fxml_learningPage/learn_more_wind.fxml"));
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        getScene();
    }


    public void button_back(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../fxml_learningPage/learn_front.fxml"));
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        getScene();

    }

    public void getScene () {
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}