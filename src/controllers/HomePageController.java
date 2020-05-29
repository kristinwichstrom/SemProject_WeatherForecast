package controllers;

import WeatherForecast.ForcastHandler.ForecastHandler;
import WeatherForecast.ForcastHandler.TariffTableTypes;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;


public class HomePageController {

    /**
     * Create an Arraylist<Arraylist> that can hold the fourDaysWeatherForecast from our DB-jar file
     */
    public static ArrayList<ArrayList> weatherForecastFromDb;

    /**
     * Creating an ArrayList<Map<TariffTableTypes,Map<String, String>>> that can hold the weather for the the different time
     * of day (morning, afternoon, evening).
     */
    public static ArrayList<Map<TariffTableTypes, Map<String, String>>> timeOfDay;

    public static String season;

    ButtonActions buttonActions = new ButtonActions();

    public void buttonWeatherForecast(ActionEvent actionEvent) throws IOException {
        /**
         * Putting the forDaysWeatherForecast inside the Arraylist<Arraylist> weatherForecastFromDb
         */
        weatherForecastFromDb = ForecastHandler.fourDaysWeatherForecast();

        buttonActions.weatherFrontpage(actionEvent);

    }

    public void buttonLearnAbout(ActionEvent actionEvent) throws IOException {
        buttonActions.learnFrontpage(actionEvent);
    }
}
