package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application { //The core functionality of JavaFX is in this class

    @Override
    public void start(Stage primaryStage) throws Exception{ // Calls the primary stage
        Parent root = FXMLLoader.load(getClass().getResource("../learningPage/learn_wind.fxml"));
        primaryStage.setFullScreen(true);
        primaryStage.setTitle("My Weather Forecast");
        primaryStage.setScene(new Scene(root, 1920, 1080));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args); //Calls the args method inside the Application class, sets up the program as a JavaFX app
    }
}
