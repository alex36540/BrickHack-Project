package com.company;

import java.util.ArrayList;

public class Company {
    private final String name; // name of the company
    private double totalCost; // the total cost of the company's operations
    private ArrayList<Customer> customers; // List of all the customers of the company
    private ArrayList<PowerPlant> plants; // List of all the power plants the company owns
    private String userName; // username to access company information
    private String password; // password to access company information
    private double price; // company's price per KWH
    private double interest; // the company's interest rate

    public Company(String name, String userName, String password, double price, double interest)
    {
        this.name = name;
        totalCost = 0;
        this.userName = userName;
        this.password = password;
        this.price = price;
        this.interest = interest;
    }

    //changes the company's total cost
    public void changeCost(double cost)
    {
        totalCost += cost;
    }

    //Add a customer to the company's list of customers
    public void addCustomer(Customer customer)
    {
        customers.add(customer);
    }

    //Add power plant to the company's power plants
    public void addCompany(PowerPlant plant)
    {
         plants.add(plant);
    }
    // Get the price of the company
    public double getPrice()
    {
        return price;
    }

    // Determines total power production of all factories
    public double allProduction()
    {
        double total = 0;

        for(PowerPlant p : plants)
        {
            total += p.getTotalOutput();
        }

        return total;
    }

    // Adds to each customer's total amount due
    public void bill()
    {
        for(Customer c : customers)
        {
            c.addTotalDue(price);
            double total = c.getTotalDue();
            if(total > 0)
            {
                c.setTotalDue(total * (1 + interest));
            }
        }
    }
}
