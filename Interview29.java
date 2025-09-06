package com.Interview;

public class Interview29 {

    static int[] daysInMonth = {31, 28, 31, 30, 31, 30, 
                                31, 31, 30, 31, 30, 31};

    static boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        return (year % 4 == 0);
    }

    static int countDays(int d, int m, int y) {
        int days = y * 365;

        days += y / 4 - y / 100 + y / 400;

        for (int i = 0; i < m - 1; i++) {
            days += daysInMonth[i];
        }

        if (m > 2 && isLeapYear(y)) {
            days += 1;
        }

        days += d;

        return days;
    }

    static int daysBetween(int d1, int m1, int y1, int d2, int m2, int y2) {
        return Math.abs(countDays(d1, m1, y1) - countDays(d2, m2, y2));
    }

    public static void main(String[] args) {
        int d1 = 10, m1 = 2, y1 = 2014;
        int d2 = 10, m2 = 3, y2 = 2015;

        System.out.println(daysBetween(d1, m1, y1, d2, m2, y2)); 
        // Output: 393
    }
}
