/*
** Class for today's weather forecast.
 */
package controllers;

import WeatherForecast.ForcastHandler.TariffTableTypes;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class Weather_firstController {

    @FXML
    private Label weatherTodayLabel;

    @FXML
    private Label tempMorning;
    @FXML
    private Label tempAfternoon;
    @FXML
    private Label tempEvening;

    @FXML
    private Label windMorning;
    @FXML
    private Label windAfternoon;
    @FXML
    private Label windEvening;

    @FXML
    private Label rainMorning;
    @FXML
    private Label rainAfternoon;
    @FXML
    private Label rainEvening;

    @FXML
    private Label cloudMorning;
    @FXML
    private Label cloudAfternoon;
    @FXML
    private Label cloudEvening;

    @FXML
    private Label snowMorning;
    @FXML
    private Label snowAfternoon;
    @FXML
    private Label snowEvening;

    @FXML
    private Label gameSuggestion;
    @FXML
    private Label clothSuggestion;

    public void initialize(){
        /**
         * Gets the values on index 0 - which is the first day.
         */
        today = Front_frontpageController.weatherForecastFromDb.get(0);

        Map<TariffTableTypes, Map<String, String>> morning = today.get(0);
        Map<TariffTableTypes,Map<String, String>> afternoon = today.get(1);
        Map<TariffTableTypes,Map<String, String>> evening = today.get(2);


        //System.out.println("today:                     "+today);
        //System.out.println("today morning:             "+morning);
        //System.out.println("today morning temp:        "+morning.get(TariffTableTypes.TEMP_TARIFF));
        //System.out.println("today morning temp degree: "+morning.get(TariffTableTypes.TEMP_TARIFF).get("TEMP")+" °");


        /**
         * Setting temp for morning, afternoon and evening
         */
        String morningTemp = morning.get(TariffTableTypes.TEMP_TARIFF).get("TEMP")+" °";
        tempMorning.setText(morningTemp);
        String afternoonTemp = afternoon.get(TariffTableTypes.TEMP_TARIFF).get("TEMP")+" °";
        tempAfternoon.setText(afternoonTemp);
        String eveningTemp = evening.get(TariffTableTypes.TEMP_TARIFF).get("TEMP")+" °";
        tempEvening.setText(eveningTemp);

        String morningWind = morning.get(TariffTableTypes.WIND_TARIFF).get("WIND")+ " m/s";
        windMorning.setText(morningWind);
        String afternoonWind = afternoon.get(TariffTableTypes.WIND_TARIFF).get("WIND")+ " m/s";
        windAfternoon.setText(afternoonWind);
        String eveningWind = evening.get(TariffTableTypes.WIND_TARIFF).get("WIND")+ " m/s";
        windEvening.setText(eveningWind);

        String morningRain = morning.get(TariffTableTypes.RAIN_TARIFF).get("RAIN")+" mm";
        rainMorning.setText(morningRain);
        String afternoonRain = afternoon.get(TariffTableTypes.RAIN_TARIFF).get("RAIN")+" mm";
        rainAfternoon.setText(afternoonRain);
        String eveningRain = evening.get(TariffTableTypes.RAIN_TARIFF).get("RAIN")+" mm";
        rainEvening.setText(eveningRain);

        String morningCloud = morning.get(TariffTableTypes.CLOUDINESS_TARIFF).get("CLOUDINESS_TEXT");
        cloudMorning.setText(morningCloud);
        String afternoonCloud = afternoon.get(TariffTableTypes.CLOUDINESS_TARIFF).get("CLOUDINESS_TEXT");
        cloudAfternoon.setText(afternoonCloud);
        String eveningCloud = evening.get(TariffTableTypes.CLOUDINESS_TARIFF).get("CLOUDINESS_TEXT");
        cloudEvening.setText(eveningCloud);

        String morningSnow = morning.get(TariffTableTypes.SNOW_TARIFF).get("SNOW")+" cm";
        snowMorning.setText(morningSnow);
        String afternoonSnow = afternoon.get(TariffTableTypes.SNOW_TARIFF).get("SNOW")+" cm";
        snowAfternoon.setText(afternoonSnow);
        String eveningSnow = evening.get(TariffTableTypes.SNOW_TARIFF).get("SNOW")+" cm";
        snowEvening.setText(eveningSnow);

        String game = afternoon.get(TariffTableTypes.GAME_TARIFF).get("GAME_NAME");
        gameSuggestion.setText(game);

        String cloth = afternoon.get(TariffTableTypes.CLOTH_TARIFF).get("CLOTH_DESCRIPTION");
        clothSuggestion.setText(cloth);

    }

    /**
     * Creating an ArrayList<Map<TariffTableTypes,Map<String, String>>> that can hold the weather for today
     */
    private ArrayList<Map<TariffTableTypes, Map<String, String>>> today;

    TimeDateHandler timeDateHandler = new TimeDateHandler();
    ButtonActions buttonActions = new ButtonActions();

    /**
     * Calls method for getting current time
     */
    public void clickButton(javafx.event.ActionEvent actionEvent) {
        weatherTodayLabel.setText(timeDateHandler.getCurrentTime());
        System.out.println();
    }

    public void homeButton(ActionEvent actionEvent) throws IOException {
        buttonActions.weatherFrontpage(actionEvent);

    }
}

