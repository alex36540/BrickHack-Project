package com.company;

import java.util.ArrayList;

public class Company {
    private final String name; // name of the company
    private double totalCost; // the total cost of the company's operations
    private ArrayList<Customer> customers; // List of all the customers of the company
    private ArrayList<PowerPlant> plants; // List of all the power plants the company owns
    private String userName; // username to access company information
    private String password; // password to access company information

    public Company(String name, String userName, String password)
    {
        this.name = name;
        totalCost = 0;
        this.userName = userName;
        this.password = password;
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
}
