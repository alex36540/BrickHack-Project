package com.company;

import java.util.ArrayList;

public class Company {
    private final String name; // name of the company
    private ArrayList<Customer> customers; // List of all the customers of the company
    private ArrayList<PowerPlant> plants; // List of all the power plants the company owns
    private String userName; // username to access company information
    private String password; // password to access company information
    private double price; // company's price per KWH
    private double interest; // the company's interest rate
    private double totalProfit; // net profit of the company
    private double monthlyCost; // self explanatory
    private double monthlyRevenue; // monthly revenue
    private double monthlyProfit; // self explanatory

    public Company(String name, String userName, String password, double price, double interest) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.price = price;
        this.interest = interest;
        this.customers = new ArrayList<>();
        this.plants = new ArrayList<>();
    }

    // Get the company's name
    public String getName()
    {
        return name;
    }
    //Add a customer to the company's list of customers
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    //Add power plant to the company's power plants
    public void addPlant(PowerPlant plant) {
        plants.add(plant);
    }

    public double getProfit() {
        return totalProfit;
    }

    // Get the price of the company
    public double getPrice() {
        return price;
    }

    public double getInterest()
    {
        return interest;
    }

    public String getUserName()
    {
        return userName;
    }

    // Determines total power production of all factories
    public double allProduction() {
        double total = 0;

        for (PowerPlant p : plants) {
            total += p.getTotalOutput();
        }

        return total;
    }

    // Changes monthly cost
    public void changeMonthlyCost()
    {
        for (PowerPlant p : plants)
        {
            monthlyProfit -= p.calcCost();
        }
    }

    // Adds to each customer's total amount due
    public void bill() {
        for (Customer c : customers)
        {
            c.addTotalDue(price);
            double total = c.getTotalDue();
            if (total > 0) {
                c.setTotalDue(total * (1 + interest));
            }
        }
    }

    // Updates company information
    public void update() {
        monthlyCost = 0;
        changeMonthlyCost();

        monthlyProfit -= monthlyCost;
        totalProfit += monthlyProfit;

        monthlyRevenue = 0;
    }

    // returns monthly profit
    public double getMonthlyProfit()
    {
        return monthlyProfit;
    }
    // Determines if each customer is late on payment
    public void lateness() {
        for (Customer c : customers) {
            if (c.getTotalDue() > 0) {
                c.addTime();
            }
        }
    }

    // Adds or subtracts an amount to the profit
    public void changeRevenue(double amount)
    {
        monthlyProfit = 0;
        monthlyProfit += amount;
        totalProfit += amount;
    }
}
