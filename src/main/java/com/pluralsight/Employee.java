package com.pluralsight;

import java.time.LocalTime;

public class Employee {
    private String employeeId;
    private String employeeName;
    private String department;
    private double employeePayRate;
    private double employeeHoursWorked;
    private boolean atWork;


    public Employee(String employeeId, String employeeName, String department, double employeePayRate, double employeeHoursWorked) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.employeePayRate = employeePayRate;
        this.employeeHoursWorked = employeeHoursWorked;
        this.atWork = false;
    }

    // getters

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

    public boolean isAtWork() {
        return atWork;
    }

    public double getRegularHours(){
        return Math.min(employeeHoursWorked,40);
    }

    public  double getOvertime(){
        return Math.max(employeeHoursWorked - 40, 0);
    }

    public double getTotalPay(){
        double regularPay = getRegularHours() * employeePayRate;
        double overtimePay = getOvertime() * (employeePayRate * 1.5);
        return regularPay + overtimePay;
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
