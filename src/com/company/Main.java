package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Main_Menu start_menu = new Main_Menu();
        init mainframe = new init();
        mainframe.nextMonth(jqfwjioppjiowqfpojiweqfjio);


    }
}
class init {
    public init()
    {

    }
    public void nextMonth(ArrayList<Company> companies)
    {
        for(Company company : companies)
        {
            company.bill();
            company.update();
            // wait for customers to pay here
            company.lateness();
        }
    }
}