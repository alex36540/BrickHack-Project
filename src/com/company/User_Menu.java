package com.company;
import javax.swing.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Dimension;
import java.awt.*;
import java.awt.event.*;

public class User_Menu {
    String company_name = "Chungus Corp";
    double bill_owed = 0;
    double interest_rate = 0.05;
    double late_months = 0;
    String bill_entry_amount = "";
    public User_Menu()
    {
        constructUM();
        System.out.println("init");
    }
    public void constructUM()
    {
        GridBagLayout GBCLayout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        JFrame window = new JFrame();
        window.setSize(new Dimension(960,720));
        window.setLayout(GBCLayout);

        JLabel companyLabel;
        companyLabel = new JLabel("<html><font size='12' color=blue> Company: " + company_name,SwingConstants.CENTER);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 1;
        gbc.weighty = 1;
        window.add(companyLabel, gbc);

        JLabel interestLabel;
        companyLabel = new JLabel("<html><font size='12' color=blue> Interest Rate: " + (interest_rate * 100) + "%",SwingConstants.CENTER);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weightx = 1;
        gbc.weighty = 1;
        window.add(companyLabel, gbc);


        JLabel billLabel;
        if (bill_owed <= 0)
        {
            billLabel = new JLabel("<html><font size='12' color=green> Bill Owed: " + bill_owed,SwingConstants.CENTER);
        }
        else
        {
            billLabel = new JLabel("<html><font size='12' color=red> Bill Owed: " + bill_owed,SwingConstants.CENTER);
        }
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.weightx = 1;
        gbc.weighty = 1;
        window.add(billLabel, gbc);

        JLabel statusLabel;
        if (late_months == 0)
        {
            statusLabel = new JLabel("<html><font size='12' color=green> Bill Status: On Time",SwingConstants.CENTER);
        }
        else
        {
            statusLabel = new JLabel("<html><font size='12' color=red> Bill Status: Late by " + late_months + " months",SwingConstants.CENTER);
        }
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.weightx = 1;
        gbc.weighty = 1;
        window.add(statusLabel, gbc);

        window.setVisible(true);


        JLabel bl = new JLabel("Pay your bill here",SwingConstants.CENTER);;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.weightx = 1;
        gbc.weighty = 1;
        window.add(bl, gbc);

        JTextField billInput = new JTextField("Enter Payment");
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.weightx = 1;
        gbc.weighty = 0.2;
        billInput.addKeyListener(new KeyAdapter(){
            public void keyReleased(KeyEvent e) {
                bill_entry_amount = billInput.getText();
            }

            public void keyTyped(KeyEvent e) {
            }

            public void keyPressed(KeyEvent e) {
            }
        });
        window.add(billInput, gbc);

        JButton billPayer = new JButton("Pay amount");
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.weightx = 1;
        gbc.weighty = 1;
        billPayer.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("PAAAAY UP");
            }
        });
        window.add(billPayer, gbc);
    }
}
