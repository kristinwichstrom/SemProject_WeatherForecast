/*
 * Following class handles the current time and date
 */

package controllers;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TimeDateHandler {

    String logTime;

    public TimeDateHandler() {

    }
    public String getCurrentTime() {
        String pattern = "EEEEE dd MMMMM yyyy";
        SimpleDateFormat formatter = new SimpleDateFormat(pattern,new Locale("en","US"));
        Date currentTime = new Date();
        logTime = formatter.format(currentTime);
        System.out.println(logTime);

        return logTime;
    }
    public String getTimeTomorrow() {

        String pattern = "EEEEE dd MMMMM yyyy HH:mm:ss";
        Date today = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(today);
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        Date tomorrow = calendar.getTime();

        return null;

    }
}