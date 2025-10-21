package com.pluralsight;

public class Reservation {
    private String roomType;
    private double roomPrice;
    private boolean isWeekend;
    private int numberOfNights;


    public Reservation(String roomType, double roomPrice, boolean isWeekend, int numberOfNights) {
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.isWeekend = isWeekend;
        this.numberOfNights = numberOfNights;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public boolean getIsWeekend() {
        return isWeekend;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    }


