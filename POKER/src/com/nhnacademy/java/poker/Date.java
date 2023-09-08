package com.nhnacademy.java.poker;

public class Date {
    private int year;
    private int month;
    private int day;
    private DaysInWeek daysInWeek;

    public Date(){
        this.year = 1998;
        this.month = 03;
        this.day = 19;
        this.daysInWeek = DaysInWeek.THU;
    }
    public Date(int year, int month, int day, DaysInWeek daysInWeek) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.daysInWeek = daysInWeek;
    }
    @Override
    public String toString() {
        return year + "-" + month + "-" + day + "-" + daysInWeek;
    }

}
