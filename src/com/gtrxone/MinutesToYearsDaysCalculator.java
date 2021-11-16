package com.gtrxone;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes >= 0) {

            long year = minutes / (60 * 24 * 365);
            long remainingDays = (minutes / (60 * 24)) % 365;
            System.out.println(minutes + " min = " + year + " y and " + remainingDays + " d");
        } else
            System.out.println("Invalid Value");
    }
}
