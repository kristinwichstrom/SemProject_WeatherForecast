/*
 * Following class handles the current time and date
 */

package controllers;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TimeDateHandler {

    String logTime;

    public TimeDateHandler() {

    }
    public String getCurrentTime() {
        String pattern = "EEEEE dd MMMMM yyyy HH:mm:ss";
        SimpleDateFormat formatter = new SimpleDateFormat(pattern,new Locale("en","US"));
        Date currentTime = new Date();
        logTime = formatter.format(currentTime);
        System.out.println(logTime);

        return logTime;
    }
    public String getTimeTomorrow() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date currentTime = new Date();
        logTime = formatter.format(currentTime);
        System.out.println(logTime);

        return logTime;
    }
}