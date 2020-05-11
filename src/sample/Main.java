/*
 * The Main class is the starting point for the program,
 * holding a Start method calling the Stage and setting the first Scene. First Scene is set to be
 * the front page of the program.
 */
package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main {

    public static void main(String[] args) {
       Application.launch(frontPage.class, args);
    }
}
