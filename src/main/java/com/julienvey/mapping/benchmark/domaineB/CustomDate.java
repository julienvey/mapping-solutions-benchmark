package com.julienvey.mapping.benchmark.domaineB;

import java.io.Serializable;
import java.util.Date;

public class CustomDate implements Serializable, Comparable<CustomDate>{

    public int day;

    public int month;

    public int year;

    public int hour;

    public int minute;

    public CustomDate(int day, int month, int year, int hour, int minute, int second) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int second;

    public CustomDate() {
    }

    @SuppressWarnings("deprecation")
    public static CustomDate fromDate(Date date) {
        if (date != null) {
            int day = date.getDate();
            int month = date.getMonth() + 1;
            int year = date.getYear() + 1900;
            int hours = date.getHours();
            int minutes = date.getMinutes();
            int seconds = date.getSeconds();

            return new CustomDate(day, month, year, hours, minutes, seconds);

        }
        return null;
    }

    public static CustomDate now() {
        return CustomDate.fromDate(new Date());
    }

    @SuppressWarnings("deprecation")
    public static Date toDate(CustomDate gwtDate) {
        if (gwtDate != null) {
            int day = gwtDate.getDay();
            int month = gwtDate.getMonth() - 1;
            int year = gwtDate.getYear() - 1900;
            int hours = gwtDate.getHour();
            int minutes = gwtDate.getMinute();
            int seconds = gwtDate.getSecond();

            return new Date(year, month, day, hours, minutes, seconds);
        }
        return null;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        CustomDate gwtDate = (CustomDate ) o;

        if (day != gwtDate.day)
            return false;
        if (hour != gwtDate.hour)
            return false;
        if (minute != gwtDate.minute)
            return false;
        if (month != gwtDate.month)
            return false;
        if (second != gwtDate.second)
            return false;
        return year == gwtDate.year;

    }

    @Override
    public int hashCode() {
        int result = day;
        result = 31 * result + month;
        result = 31 * result + year;
        result = 31 * result + hour;
        result = 31 * result + minute;
        result = 31 * result + second;
        return result;
    }

    @Override
    public int compareTo(CustomDate compare) {
        return toDate(this).compareTo(toDate(compare));
    }
}
