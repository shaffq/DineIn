package com.example.dine;

public class BookingHelperClass {

    String place, location, time, person;


    public BookingHelperClass(String place, String location, String time, String person) {
    }

    public BookingHelperClass(String time, String person) {
        this.time = time;
        this.person = person;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }
}
