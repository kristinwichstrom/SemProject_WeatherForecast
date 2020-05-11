package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class frontPage extends Application { //The core functionality of JavaFX is in this class

    @Override
    public void start(Stage primaryStage) throws Exception { // Calls the primary stage

        /*
         * The page loading is now the front page, just change it if you want to test something :)
         */
        Parent root = FXMLLoader.load(getClass().getResource("../sample/frontPage.fxml"));
        // primaryStage.setFullScreen(true);
        primaryStage.setTitle("My Weather Forecast");
        primaryStage.setMinHeight(800); // Controls that the user doesn't decrease the screen size to a problematic size
        primaryStage.setMinWidth(1280);
        primaryStage.setMaxHeight(800);
        primaryStage.setMaxWidth(1280);
        primaryStage.setScene(new Scene(root, 1280, 800));
        primaryStage.show();
        primaryStage.setOnCloseRequest(windowEvent -> primaryStage.close()); //handles the closing process properly
        System.out.println("Program closed");
    }
}