package controllers;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CurrentTimeDateCalendar { String logTime;

    public CurrentTimeDateCalendar() {

    }
    public String getCurrentTimeUsingCalendar() {

        Calendar cal = Calendar.getInstance();
        Date date=cal.getTime();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        String formattedDate=dateFormat.format(date);
        System.out.println(formattedDate);

        return formattedDate;
    }
}