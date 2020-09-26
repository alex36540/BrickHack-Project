package com.company;

public class PowerPlant {
    private double[] location; // x,y coordinate of the power plant
    private String type; // type of power plant. Either coal, natural gas, nuclear, wind, solar, or hydroelectric
    private double maxOutput; // maximum amount of kWh that power plant can output
    private double output = 0; // current output of the plant in kWh
    private double totalOutput = 0; // total amount of power the plant has produced, in kWh
    private int flexibility; // how quickly plant can change output amount

    protected PowerPlant(double[] location, String type, double maxOutput) {
        this.location = location;
        this.maxOutput = maxOutput;

        switch (type) {
            case "coal" -> flexibility = 2; // arbitrary numbers
            case "natural gas" -> flexibility = 6;
            case "nuclear" -> flexibility = 1;
            case "wind", "solar", "hydroelectric" -> flexibility = 8;
        }
    }

    //Get the current output
    public double getOutput()
    {
        return output;
    }

    //Set the current output
    protected void setOutput(int amount)
    {
        if(amount > maxOutput)
        {
            output = maxOutput;
        }
        else if(amount < 0)
        {
            output = 0;
        }
        else
        {
            output = amount;
        }
    }

    //Get the location of the plant
    public double[] getLocation()
    {
        return location;
    }
}
