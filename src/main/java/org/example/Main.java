package org.example;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Locale deLocale = Locale.forLanguageTag("en-US");
        Locale usLocale = Locale.forLanguageTag("de-Germany");
        long number = 12345989898L;
        NumberFormat denf = NumberFormat.getInstance(deLocale);
        NumberFormat unsf = NumberFormat.getInstance(usLocale);

        NumberFormat denfs = NumberFormat.getInstance(deLocale);
        NumberFormat usnfs = NumberFormat.getInstance(usLocale);
        System.out.println(denfs.format(number));
        System.out.println(usnfs.format(number));

    }
}