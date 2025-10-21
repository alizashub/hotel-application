package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double roomPrice;
    private boolean isDirty;
    private boolean isOccupied;
    private boolean isAvalible;


    public Room(int numberOfBeds, double roomPrice, boolean isAvalible, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.roomPrice = roomPrice;
        this.isDirty = isDirty;
        this.isOccupied = isOccupied;
        this.isAvalible = isAvalible;

    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isAvalible() {
        if (!isOccupied && !isDirty) {
            return true;
        } else {
            return false;
        }
    }
}


