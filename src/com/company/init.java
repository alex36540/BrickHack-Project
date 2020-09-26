package com.company;

import java.util.ArrayList;

public class init {
    public ArrayList<Company> comps;
    public ArrayList<Customer> customers;
    public init()
    {
        comps = new ArrayList<>();
        customers = new ArrayList<>();
    }
    public void addCompany(Company c)
    {
        comps.add(c);
    }
    public void addCustomer(Customer c)
    {
        customers.add(c);
    }
    public void nextMonth(Company company)
    {
        company.bill();
        company.update();
        // wait for customers to pay here
        company.lateness();
    }
    public Company getComp(String company_name)
    {
        for(Company company : comps)
        {
            if(company.getName().equals(company_name))
                return company;
        }
        return null;
    }

    public Company getCompUsername(String company_username)
    {
        for(Company company : comps)
        {
            if(company.getUserName().equals(company_username))
                return company;
        }
        return null;
    }

    public Customer getUserUsername(String customer_username)
    {
        for(Customer customer : customers)
        {
            if(customer.getUserName().equals(customer_username))
                return customer;
        }
        return null;
    }
}