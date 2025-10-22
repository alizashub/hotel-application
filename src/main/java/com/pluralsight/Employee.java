package com.pluralsight;

import java.time.LocalTime;

public class Employee {
    private String employeeId;
    private String employeeName;
    private String department;
    private double employeePayRate;
    private double employeeHoursWorked;


    public Employee(String employeeId, String employeeName, String department, double employeePayRate, double employeeHoursWorked) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.employeePayRate = employeePayRate;
        this.employeeHoursWorked = employeeHoursWorked;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public double getEmployeeHoursWorked() {
        return employeeHoursWorked;
    }

    public double getEmployeePayRate() {
        return employeePayRate;
    }

    public double getTotalPay() {
        return employeePayRate * employeeHoursWorked;
    }

    public boolean punchIn(){
        if (this.atWork) {
            System.out.println("Already at work, can't punch in.");
            return false;
        } else {
            System.out.println("Punching in at:" + LocalTime.now());
            this.atWork = true;
            return true;

        }
    }

    public boolean punchOut(){
        if(!this.atWork) {
            System.out.println("Not at work, can not punch out.");
            return false;
        } else {
            System.out.println("Punching out at:" + LocalTime.now());
            this.atWork = false;
            return true;
        }
    }


}
