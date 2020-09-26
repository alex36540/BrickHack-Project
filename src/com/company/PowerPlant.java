package com.company;

public class PowerPlant {
    private double[] location; // x,y coordinate of the power plant
    private String type; // type of power plant. Either coal, natural gas, nuclear, wind, solar, or hydroelectric
    private double maxOutput; // maximum amount of kV that power plant can output
    private double output; // current output of the plant
    private int flexibility; // how quickly plant can change output amount

    public PowerPlant(double[] location, String type, double maxOutput) {
        this.location = location;
        this.maxOutput = maxOutput;
        output = 0;

        switch (type) {
            case "coal" -> flexibility = 2; // arbitrary numbers
            case "natural gas" -> flexibility = 6;
            case "nuclear" -> flexibility = 1;
            case "wind", "solar", "hydroelectric" -> flexibility = 8;
        }
    }

    /*
    Get the current output
     */
    public double getOutput()
    {
        return output;
    }

    /*
    Set the current output
     */
    public void setOutput(int amount)
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

    /*
    Get the location of the plant
     */
    public double[] getLocation()
    {
        return location;
    }
}
