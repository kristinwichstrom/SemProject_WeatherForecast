package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Weather_frontpageController {




    public void homeButton(ActionEvent actionEvent) throws IOException {

        Parent frontPage = FXMLLoader.load(getClass().getResource("../sample/frontpage.fxml"));
        Scene frontPageScene = new Scene(frontPage);

        //Gets Stage information
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(frontPageScene);
        window.show();
    }
}
