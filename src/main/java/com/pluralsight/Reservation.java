package com.pluralsight;

public class Reservation {
    private String roomType;
    private double roomPrice;
    private boolean isWeekend;
    private int numberOfNights;


    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.isWeekend = isWeekend;
        this.numberOfNights = numberOfNights;
        // using a method inside to limit repeated if else code
        updatePriceBasedOnRoomTypeAndWeekend();
    }

    public void updatePriceBasedOnRoomTypeAndWeekend() {
        switch (roomType.toUpperCase()) {
            case"KING":
                roomPrice = 139.00;
                break;
            case "DOUBLE":
                roomPrice = 124.00;
                break;
            default:
                roomPrice = 0.0;
        }

        if (isWeekend) {
            roomPrice = roomPrice * 1.10;
        }
    }
    public int getNumberOfNights() {
        return numberOfNights;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
        updatePriceBasedOnRoomTypeAndWeekend();
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
        updatePriceBasedOnRoomTypeAndWeekend();
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public double getReservationPriceTotal(){
        return roomPrice * numberOfNights;
    }
}


