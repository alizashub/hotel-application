package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_shouldBeOccupied() {

        Room room28 = new Room();

        room28.checkIn();

        assertTrue(room28.isOccupied());

    }

    @Test
    public void checkIn_shouldBeDirty(){

        Room room28 = new Room();

        room28.checkIn();

        assertTrue(room28.isDirty());

    }





}