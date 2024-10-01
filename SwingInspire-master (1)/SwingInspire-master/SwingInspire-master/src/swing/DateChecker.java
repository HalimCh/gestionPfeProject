/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author Lenovo
 */
public class DateChecker {
    public static boolean isValidDate(String inputDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        // don't accept anormal dates like 32/02/2021
        try {
            // Attempt to parse the input date

            Date date = dateFormat.parse(inputDate);

            // Extract day, month, and year components
            SimpleDateFormat dayFormat = new SimpleDateFormat("dd");
            SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
            SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

            int day = Integer.valueOf(dayFormat.format(date));
            int month = Integer.valueOf(monthFormat.format(date));
            int year = Integer.valueOf(yearFormat.format(date));

            return isValidDayForMonth(day, month, year);

            // Parsing successful, date is valid
        } catch (ParseException e) {
            // Parsing failed, try another format
            dateFormat.applyPattern("dd-MM-yyyy");
            try {
                Date date = dateFormat.parse(inputDate);

                SimpleDateFormat dayFormat = new SimpleDateFormat("dd");
                SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
                SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

                int day = Integer.valueOf(dayFormat.format(date));
                int month = Integer.valueOf(monthFormat.format(date));
                int year = Integer.valueOf(yearFormat.format(date));

                return isValidDayForMonth(day, month, year);

                // Parsing successful, date is valid
            } catch (ParseException ex) {
                // Both parsing attempts failed, date is not valid
                return false;
            }
        }
    }

    private static boolean isValidDayForMonth(int day, int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return day >= 1 && day <= 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return day >= 1 && day <= 30;
            case 2:
                boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                if (isLeapYear) {
                    return day >= 1 && day <= 29;
                } else {
                    return day >= 1 && day <= 28;
                }
            default:
                return false;
        }
    }

    public static Date getDateFromString(String inputDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);

        try {

            Date date = dateFormat.parse(inputDate);
            if (isValidDate(inputDate))
                return date;
            else {
                System.out.println("Date unvalid");
                return null;
            }

        } catch (ParseException e) {
            dateFormat.applyPattern("dd-MM-yyyy");
            try {
                Date date = dateFormat.parse(inputDate);

                if (isValidDate(inputDate))
                    return date;
                else {
                    System.out.println("Date unvalid");
                    return null;
                }

            } catch (ParseException ex) {
                // Both parsing attempts failed, date is not valid
                System.out.println(" vous avez fait une error dans la saisie du date ");
                return null;
            }
        }
    }

    public static String getStringFromDate(Date date) {

        try {

            // Extract day, month, and year components
            SimpleDateFormat dayFormat = new SimpleDateFormat("dd");
            dayFormat.setLenient(false);
            SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
            monthFormat.setLenient(false);
            SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
            yearFormat.setLenient(false);

            int day = Integer.valueOf(dayFormat.format(date));
            int month = Integer.valueOf(monthFormat.format(date));
            int year = Integer.valueOf(yearFormat.format(date));

            return day + "/" + month + "/" + year;

            // Parsing successful, date is valid
        } catch (Exception e) {
            // Parsing failed, try another format
            return null;

        }

    }

    public static boolean checkDateBefore(String date1, String date2) {
        Date d1 = getDateFromString(date1);
        Date d2 = getDateFromString(date2);

        if (d1 != null && d2 != null) {
            if (date1.equals(date2))
                return true;
            else
                return d1.before(d2);
        } else {

            return false;
        }
    }

    public static boolean checkDateBefore(Date date1, Date date2) {

        if (date1 != null && date2 != null) {
            if (date1.equals(date2))
                return true;
            else
                return date1.before(date2);
        } else {

            return false;
        }

    }

    public static boolean checkDateAfter(String date1, String date2) {
        Date d1 = getDateFromString(date1);
        Date d2 = getDateFromString(date2);

        if (d1 != null && d2 != null) {
            if (date1.equals(date2))
                return true;
            else
                return d1.after(d2);
        } else {

            return false;
        }
    }

    public static boolean checkDateAfter(Date date1, Date date2) {

        if (date1 != null && date2 != null) {
            if (date1.equals(date2))
                return true;
            else
                return date1.after(date2);
        } else {

            return false;
        }
    }

    public static boolean checkDateInbetween(Date date1, Date date2, Date date3) {
        return DateChecker.checkDateBefore(date2, date3) && DateChecker.checkDateAfter(date2, date1);
    }

    public static boolean checkDateInbetween(String date1, String date2, String date3) {
        return DateChecker.checkDateBefore(date2, date3) && DateChecker.checkDateAfter(date2, date1);
    }

    public static long calculateDays(Date date1, Date date2) {
        // Calculate the difference in milliseconds
        long diffMillis = Math.abs(date2.getTime() - date1.getTime());

        // Convert milliseconds to days
        long days = TimeUnit.DAYS.convert(diffMillis, TimeUnit.MILLISECONDS);

        return days + 1;
    }

}
