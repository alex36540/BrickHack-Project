package com.company;

public class Customer {
    private final String name; // name of the customer
    private double[] location; // x,y coordinates of the customer's home
    private String userName; // username for the customer
    private String password; // password for the customer
    private Company company; // company that proves the electricity for the customer
    private double totalConsumption = 0; // total amount of electricity that has been consumed, in kWh
    private double consumption; // current electricity consumption in kWh
    private double totalDue; // amount that the customer owes to the company
    private int timeSincePayment; // tracks the amount of time since they have not payed

    public Customer(String name, double[] location, String userName, String password, Company company)
    {
        this.name = name;
        this.location = location;
        this.userName = userName;
        this.password = password;
        this.company = company;
    }

    public String getUserName()
    {
        return userName;
    }

    public String getPassword()
    {
        return password;
    }

    public String getCompanyName()
    {
        return company.getName();
    }


    public Company getCompany()
    {
        return company;
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

    // get total consumption
    protected double getTotalConsumption()
    {
        return totalConsumption;
    }

    // get customer's name
    protected String getName()
    {
        return name;
    }

    // gets the total amount due
    protected double getTotalDue()
    {
        return totalDue;
    }

    // adds or subtracts amount due
    protected void addTotalDue(double amount)
    {
        totalDue += amount;
    }

    // sets total amount due
    protected void setTotalDue(double amount)
    {
        totalDue = amount;
    }

    // pays off the bill, subtracts from totalDue
    protected void pay(double amount)
    {
        totalDue -= amount;
        company.changeRevenue(amount);
        if(totalDue <= 0)
        {
            timeSincePayment = 0;
        }
    }

    //gets time since the customer last payed
    protected int getTimeSincePayment()
    {
        return timeSincePayment;
    }

    // adds 1 to time since payment
    protected void addTime()
    {
        timeSincePayment++;
    }
}
