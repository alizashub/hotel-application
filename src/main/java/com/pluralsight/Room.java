package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double roomPrice;
    private boolean isRoomAvalible;
    private boolean isOccupied;


    public Room(int numberOfBeds, double roomPrice, boolean isRoomAvalible, boolean isRoomOccupied) {
        this.numberOfBeds = numberOfBeds;
        this.roomPrice = roomPrice;
        this.isRoomAvalible = isRoomAvalible;
        this.isOccupied = isOccupied;

    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public boolean isDirty() {
        return isDirty();
    }

    public boolean isRoomAvalible() {
        if (!isDirty()) {
            return isRoomAvalible
        }
    }

}


