package controllers;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.text.DateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.ResourceBundle;

public class Weather_todayController {


    @FXML
    private Label weatherTodayLabel;

    CurrentTimeDateCalendar currentTimeDateCalendar = new CurrentTimeDateCalendar();

    public void clickButton(javafx.event.ActionEvent actionEvent) {

        weatherTodayLabel.setText(currentTimeDateCalendar.getCurrentTimeUsingCalendar());

        System.out.println();

    }
}

