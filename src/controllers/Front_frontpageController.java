package controllers;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;


public class Front_frontpageController {
    Parent root;
    Stage stage;


    public void buttonWeatherForecast(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../fxml_weatherForecast/weather_frontpage.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        getScene();

    }
    public void buttonLearnAbout(ActionEvent actionEvent) throws IOException {

        root = FXMLLoader.load(getClass().getResource("../fxml_learningPage/Learn_front.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        getScene();

    }
    public void getScene () {
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
