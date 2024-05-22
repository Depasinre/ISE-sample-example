package com.numerology;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParser {
    public static int[] parseDate(String dateString) throws ParseException {
        SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatter2 = new SimpleDateFormat("dd MMMM yyyy");
        Date date;
        try {
            date = formatter1.parse(dateString);
        } catch (ParseException e) {
            date = formatter2.parse(dateString);
        }
        String[] dateParts = new SimpleDateFormat("yyyy-MM-dd").format(date).split("-");
        return new int[]{Integer.parseInt(dateParts[0]), Integer.parseInt(dateParts[1]), Integer.parseInt(dateParts[2])};
    }
}

