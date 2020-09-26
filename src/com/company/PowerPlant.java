package com.company;

public class PowerPlant {
    private double[] location; // x,y coordinate of the power plant
    private Company company; // company that the PowerPlant works for
    private String type; // type of power plant. Either coal, natural gas, nuclear, wind, solar, or hydroelectric
    private double maxOutput; // maximum amount of kWh that power plant can output
    private double output = 0; // current output of the plant in kWh
    private double totalOutput = 0; // total amount of power the plant has produced, in kWh
    private int flexibility; // how quickly plant can change output amount
    private double cost; // cost of the power plant per kWh

    protected PowerPlant(double[] location, String type, double maxOutput, double cost) {
        this.location = location;
        this.maxOutput = maxOutput;
        this.cost = cost;

        switch (type) {
            case "coal" -> flexibility = 2; // arbitrary numbers
            case "natural gas" -> flexibility = 6;
            case "nuclear" -> flexibility = 1;
            case "wind", "solar", "hydroelectric" -> flexibility = 8;
        }
    }

    //Get the current output
    protected double getOutput() {
        return output;
    }

    //Set the current output
    protected void setOutput(int amount) {
        if (amount > maxOutput) {
            output = maxOutput;
        } else if (amount < 0) {
            output = 0;
        } else {
            output = amount;
        }
    }

    //Add to total output
    protected void addOutput(double amount) {
        totalOutput += amount;
    }

    // Get total output
    protected double getTotalOutput()
    {
        return totalOutput;
    }

    //Get the location of the plant
    protected double[] getLocation()
    {
        return location;
    }

    // Calculates and subtracts the total cost from the company's profit
    protected double calcCost()
    {
        return cost * output;
    }
}

