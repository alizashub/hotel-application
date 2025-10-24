package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double roomPrice;
    private boolean isDirty;
    private boolean isOccupied;


    public Room(int numberOfBeds, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.roomPrice = roomPrice;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    public Room() {
        this.isDirty = false; // default clean room
        this.isOccupied = false; // default unoccupied room
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

    public boolean isAvailable() {
        if (!this.isOccupied && !this.isDirty) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkIn() {
        if (this.isAvailable()) {
            this.isOccupied = true;
            this.isDirty = true;
            return true;
        } else {
            return false;
        }
    }

    public boolean checkOut() {
        if (this.isOccupied) {
            this.isDirty = true;
            this.isOccupied = false;
            return true;
        } else {
            return false;
        }
    }

}


