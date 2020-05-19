package controllers;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Learn_windController {

    ButtonActions buttonActions = new ButtonActions();

    public void button_wind_learnMore(ActionEvent actionEvent) throws IOException {
        buttonActions.learnMoreWind(actionEvent);
    }


    public void button_back(ActionEvent actionEvent) throws IOException {
        buttonActions.learnFrontpage(actionEvent);

    }
}