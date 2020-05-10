package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application { //The core functionality of JavaFX is in this class

    @Override
    public void start(Stage primaryStage) throws Exception{ // Calls the primary stage

        /*
         * The page loading is now the front page, just change it if you want to test something :)
         */

        Parent root = FXMLLoader.load(getClass().getResource("../sample/frontpage.fxml"));
       primaryStage.setFullScreen(true);
        primaryStage.setTitle("My Weather Forecast");
        primaryStage.setMinHeight(250); // Controls that the user doesn't decrease the screen size to a problematic size
        primaryStage.setMinWidth(500);
        primaryStage.setMaxHeight(800);
        primaryStage.setMaxWidth(1280);
        primaryStage.setScene(new Scene(root, 1280, 800));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); //Calls the args method inside the Application class, sets up the program as a JavaFX app
    }
}
