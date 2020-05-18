package controllers;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;


public class Front_frontpageController {

    ButtonActions buttonActions = new ButtonActions();

    public void buttonWeatherForecast(ActionEvent actionEvent) throws IOException {
        buttonActions.weatherFrontpage(actionEvent);

    }
    public void buttonLearnAbout(ActionEvent actionEvent) throws IOException {
        buttonActions.learnFrontpage(actionEvent);
    }
}
