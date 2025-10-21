package com.pluralsight;

public class Reservation {
    private String roomType;
    private double roomPrice;
    private double weekendRoomPrice;
    private int numberOfNights;



    public Reservation(String roomType, double roomPrice, double weekendRoomPrice, int numberOfNights) {
        this.roomPrice = roomPrice;
        this.roomType = roomType;
        this.weekendRoomPrice = weekendRoomPrice;
        this.numberOfNights = numberOfNights;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public double getWeekendRoomPrice() {
        return weekendRoomPrice;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }
}

