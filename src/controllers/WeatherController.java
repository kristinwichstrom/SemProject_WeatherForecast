/*
 ** Class for today's weather forecast.
 */
package controllers;

import WeatherForecast.ForcastHandler.TariffTableTypes;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;


import java.io.IOException;
import java.util.Map;

public class WeatherController {

    @FXML
    private Label weatherTodayLabel;

    @FXML
    private Label season;

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
    private Text windDescMorning;
    @FXML
    private Text windDescAfternoon;
    @FXML
    private Text windDescEvening;
    @FXML
    private Label windTxtMorning;
    @FXML
    private Label windTxtAfternoon;
    @FXML
    private Label windTxtEvening;


    @FXML
    private Label rainMorning;
    @FXML
    private Label rainAfternoon;
    @FXML
    private Label rainEvening;
    @FXML
    private Text rainDescMorning;
    @FXML
    private Text rainDescAfternoon;
    @FXML
    private Text rainDescEvening;
    @FXML
    private Label rainTxtMorning;
    @FXML
    private Label rainTxtAfternoon;
    @FXML
    private Label rainTxtEvening;


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
    private Text snowDescMorning;
    @FXML
    private Text snowDescEvening;
    @FXML
    private Text snowDescAfternoon;

    @FXML
    private Text gameSuggestion;
    @FXML
    private Text gameDescription;

    @FXML
    private Text clothSuggestion;
    @FXML
    private Text clothDescription;



    public void initialize() {


        Map<TariffTableTypes, Map<String, String>> morning = HomePageController.timeOfDay.get(0);
        Map<TariffTableTypes, Map<String, String>> afternoon = HomePageController.timeOfDay.get(1);
        Map<TariffTableTypes, Map<String, String>> evening = HomePageController.timeOfDay.get(2);

        season.setText(HomePageController.season);

        //System.out.println("today:                     "+today);
        //System.out.println("today morning:             "+morning);
        //System.out.println("today morning temp:        "+morning.get(TariffTableTypes.TEMP_TARIFF));
        //System.out.println("today morning temp degree: "+morning.get(TariffTableTypes.TEMP_TARIFF).get("TEMP")+" °");


        /**
         * Setting temp for morning, afternoon and evening
         */
        String morningTemp = morning.get(TariffTableTypes.TEMP_TARIFF).get("TEMP") + " °";
        tempMorning.setText(morningTemp);
        String afternoonTemp = afternoon.get(TariffTableTypes.TEMP_TARIFF).get("TEMP") + " °";
        tempAfternoon.setText(afternoonTemp);
        String eveningTemp = evening.get(TariffTableTypes.TEMP_TARIFF).get("TEMP") + " °";
        tempEvening.setText(eveningTemp);

        /**
         * Setting wind for morning, afternoon and evening
         */
        String morningWind = morning.get(TariffTableTypes.WIND_TARIFF).get("WIND") + " m/s";
        windMorning.setText(morningWind);
        //String morningWindTxt = morning.get(TariffTableTypes.WIND_TARIFF).get("WIND_TEXT");
        //windTxtMorning.setText(morningWindTxt);
        String morningWindDesc = morning.get(TariffTableTypes.WIND_TARIFF).get("WIND_DESCRIPTION");
        windDescMorning.setText(morningWindDesc);

        String afternoonWind = afternoon.get(TariffTableTypes.WIND_TARIFF).get("WIND") + " m/s";
        windAfternoon.setText(afternoonWind);
        //String afternoonWindTxt = afternoon.get(TariffTableTypes.WIND_TARIFF).get("WIND_TEXT");
        //windTxtAfternoon.setText(afternoonWindTxt);
        String afternoonWindDesc = afternoon.get(TariffTableTypes.WIND_TARIFF).get("WIND_DESCRIPTION");
        windDescAfternoon.setText(afternoonWindDesc);

        String eveningWind = evening.get(TariffTableTypes.WIND_TARIFF).get("WIND") + " m/s";
        windEvening.setText(eveningWind);
        //String eveningWindTxt = evening.get(TariffTableTypes.WIND_TARIFF).get("WIND_TEXT");
        //windTxtEvening.setText(eveningWindTxt);
        String eveningWindDesc = evening.get(TariffTableTypes.WIND_TARIFF).get("WIND_DESCRIPTION");
        windDescEvening.setText(eveningWindDesc);

        /**
         * Setting rain for morning, afternoon and evening
         */
        String morningRain = morning.get(TariffTableTypes.RAIN_TARIFF).get("RAIN") + " mm";
        rainMorning.setText(morningRain);
        //String morningRainTxt = morning.get(TariffTableTypes.RAIN_TARIFF).get("RAIN_TEXT");
        //rainTxtMorning.setText(morningRainTxt);
        String morningRainDesc = morning.get(TariffTableTypes.RAIN_TARIFF).get("RAIN_DESCRIPTION");
        rainDescMorning .setText(morningRainDesc);

        String afternoonRain = afternoon.get(TariffTableTypes.RAIN_TARIFF).get("RAIN") + " mm";
        rainAfternoon.setText(afternoonRain);
        //String afternoonRainTxt = afternoon.get(TariffTableTypes.RAIN_TARIFF).get("RAIN_TEXT");
        //rainTxtAfternoon.setText(afternoonRainTxt);
        String afternoonRainDesc = afternoon.get(TariffTableTypes.RAIN_TARIFF).get("RAIN_DESCRIPTION");
        rainDescAfternoon.setText(afternoonRainDesc);


        String eveningRain = evening.get(TariffTableTypes.RAIN_TARIFF).get("RAIN") + " mm";
        rainEvening.setText(eveningRain);
        //String eveningRainTxt = evening.get(TariffTableTypes.RAIN_TARIFF).get("RAIN_TEXT");
        //rainTxtEvening.setText(eveningRainTxt);
        String eveningRainDesc = evening.get(TariffTableTypes.RAIN_TARIFF).get("RAIN_DESCRIPTION");
        rainDescEvening.setText(eveningRainDesc);

        /**
         * Setting cloud for morning, afternoon and evening
         */
        String morningCloud = morning.get(TariffTableTypes.CLOUDINESS_TARIFF).get("CLOUDINESS_TEXT");
        cloudMorning.setText(morningCloud);
        String afternoonCloud = afternoon.get(TariffTableTypes.CLOUDINESS_TARIFF).get("CLOUDINESS_TEXT");
        cloudAfternoon.setText(afternoonCloud);
        String eveningCloud = evening.get(TariffTableTypes.CLOUDINESS_TARIFF).get("CLOUDINESS_TEXT");
        cloudEvening.setText(eveningCloud);

        /**
         * Setting snow for morning, afternoon and evening
         */
        String morningSnow = morning.get(TariffTableTypes.SNOW_TARIFF).get("SNOW") + " cm";
        snowMorning.setText(morningSnow);
        String morningSnowDesc = evening.get(TariffTableTypes.SNOW_TARIFF).get("SNOW_DESCRIPTION");
        snowDescMorning.setText(morningSnowDesc);
        String afternoonSnow = afternoon.get(TariffTableTypes.SNOW_TARIFF).get("SNOW") + " cm";
        snowAfternoon.setText(afternoonSnow);
        String afternoonSnowDesc = evening.get(TariffTableTypes.SNOW_TARIFF).get("SNOW_DESCRIPTION");
        snowDescAfternoon.setText(afternoonSnowDesc);
        String eveningSnow = evening.get(TariffTableTypes.SNOW_TARIFF).get("SNOW") + " cm";
        snowEvening.setText(eveningSnow);
        String eveningSnowDesc = evening.get(TariffTableTypes.SNOW_TARIFF).get("SNOW_DESCRIPTION");
        snowDescEvening.setText(eveningSnowDesc);

        /**
         * Game suggestion
         */
        String gameName = afternoon.get(TariffTableTypes.GAME_TARIFF).get("GAME_NAME");
        gameSuggestion.setText(gameName);
        String gameDesc = afternoon.get(TariffTableTypes.GAME_TARIFF).get("GAME_DESCRIPTION");
        gameDescription.setText(gameDesc);

        /**
         * Cloth suggestion
         */
        String clothName = afternoon.get(TariffTableTypes.CLOTH_TARIFF).get("CLOTH_NAME");
        clothSuggestion.setText(clothName);
        String clothDesc = afternoon.get(TariffTableTypes.CLOTH_TARIFF).get("CLOTH_DESCRIPTION");
        clothDescription.setText(clothDesc);

    }

    ButtonActions buttonActions = new ButtonActions();

    public void homeButton(ActionEvent actionEvent) throws IOException {
        buttonActions.weatherFrontpage(actionEvent);

    }
}

