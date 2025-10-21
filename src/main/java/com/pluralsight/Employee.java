package com.pluralsight;

public class Employee {
    private double employeeId;
    private String employeeName;
    private String department;
    private double employeePayRate;
    private double employeeHoursWorked;


    public Employee(double employeeId, String employeeName, String department, double employeePayRate, double employeeHoursWorked) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.employeePayRate = employeePayRate;
        this.employeeHoursWorked = employeeHoursWorked;
    }

    public double getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }







}
