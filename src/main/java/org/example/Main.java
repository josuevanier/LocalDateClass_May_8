package org.example;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Locale deLocale = new Locale("de", "De");
        Locale usLocale = new Locale("en", "Us");
        long number = 12345989898L;
        NumberFormat denf = NumberFormat.getInstance(deLocale);
        NumberFormat unsf = NumberFormat.getInstance(usLocale);

        System.out.println(denf.format(number));
        System.out.println(unsf.format(number));

        Date now = new Date();
        DateFormat usdf = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, deLocale);
        System.out.println(usdf.format(now));
        System.out.println(denf.format(now));
    }
}