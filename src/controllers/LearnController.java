package controllers;
import javafx.event.ActionEvent;
import java.io.IOException;

public class LearnController {

    ButtonActions buttonActions = new ButtonActions();

    public void learnMoreWindButton(ActionEvent actionEvent) throws IOException {
        buttonActions.learnMoreWind(actionEvent);
    }

    public void learnMoreTempButton(ActionEvent actionEvent) throws IOException { //rename method
        buttonActions.learnMoreTemp(actionEvent);
    }
    public void learnMoreRainButton(ActionEvent actionEvent) throws IOException {
        buttonActions.learnMoreRain(actionEvent);
    }

    public void learnMoreCloudsButton(ActionEvent actionEvent) throws IOException {
        buttonActions.learnMoreClouds(actionEvent);
    }

    public void learningPageButton(ActionEvent actionEvent) throws IOException {
        buttonActions.learnFrontpage(actionEvent);

    }
}
