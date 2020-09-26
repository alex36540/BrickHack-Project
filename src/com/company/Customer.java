package com.company;

public class Customer {
    private String name; // name of the customer
    private double[] location; // x,y coordinates of the customer's home
    private String userName; // username for the customer
    private String password; // password for the customer
    private Company company; // company that proves the electricity for the customer
    private double totalConsumption = 0; // total amount of electricity that has been consumed, in kWh
    private double consumption; // current electricity consumption in kWh

    public Customer(String name, double[] location, String userName, String password, Company company)
    {
        this.name = name;
        this.location = location;
        this.userName = userName;
        this.password = password;
        this.company = company;
    }

    // Change the current electricity consumption
    protected void changeConsumption(double amount)
    {
        consumption = amount;
    }

    // Add a value to total consumption of customer
    protected void addTotalConsumption(double amount)
    {
        totalConsumption += amount;
    }

    // get customer's name
    protected String getName()
    {
        return name;
    }

    // get total consumption
    protected double getTotalConsumption()
    {
        return totalConsumption;
    }
}
