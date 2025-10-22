package com.pluralsight;

public class Main {
    public static void main(String[] args) {


        System.out.println("Welcome To Hotel Mangrove");
        Room room1 = new Room(2, false, 196, true);

        System.out.println("Room 1 has: " + room1.getNumberOfBeds() + " beds.");
        System.out.println("Room 1 has price : $" + room1.getRoomPrice());
        if (room1.isAvalible()) {
            System.out.println("You Room Is Available.");
        } else {
            System.out.println("Room Is Not Available Right Now. ");
        }


        System.out.println("\nLet's Make A Reservation");
        Reservation reservation1 = new Reservation("King", 4, false);
        System.out.println("\nYour Reservation Details : ");
        System.out.println("Room Type : " + reservation1.getRoomType());
        System.out.println("Price per night: $" + reservation1.getRoomPrice());
        System.out.println("Number of nights: " + reservation1.getNumberOfNights());
        System.out.println("Total Cost : $"+ reservation1.getReservationPriceTotal());


        Employee employee1 = new Employee("A521", "Aliza","HR", 25.0, 45 );
        System.out.println("\nYour Name : " + employee1.getEmployeeName());
        System.out.println("Hours You Worked :" +employee1.getEmployeeHoursWorked());


    }

}