package com.company;
import javax.swing.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Dimension;





public class Main_Menu {
    public Main_Menu()
    {
        constructMM();
    }
    
    public void constructMM()
    {
        GridBagLayout GBCLayout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        JFrame window = new JFrame();
        window.setSize(new Dimension(1024,576));
        window.setLayout(GBCLayout);

        JLabel windowLabel = new JLabel("Login Page",SwingConstants.CENTER);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.weightx = 1;
        gbc.weighty = 1;
        window.add(windowLabel, gbc);

        // Part builder
        JButton managerLogin = new JButton("Login as manager");
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.weightx = 1;
        gbc.weighty = 1;
        window.add(managerLogin, gbc);

        JButton userLogin = new JButton("Login as user");
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 4;
        gbc.gridy = 2;
        gbc.weightx = 1;
        gbc.weighty = 1;
        window.add(userLogin, gbc);

        // Login Input Section
        JTextField managerUsernameInput = new JTextField("Enter Username");
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.weightx = 1;
        gbc.weighty = 0.2;
        window.add(managerUsernameInput, gbc);

        JTextField managerPasswordInput = new JTextField("managerPasswordInput");
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.weightx = 1;
        gbc.weighty = 0.2;
        window.add(managerPasswordInput, gbc);

        JTextField userUsernameInput = new JTextField("Enter Username");
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 4;
        gbc.gridy = 3;
        gbc.weightx = 1;
        gbc.weighty = 0.2;
        window.add(userUsernameInput, gbc);

        JTextField userPasswordInput = new JTextField("managerPasswordInput");
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 4;
        gbc.gridy = 4;
        gbc.weightx = 1;
        gbc.weighty = 0.2;
        window.add(userPasswordInput, gbc);


        window.setVisible(true);
    }
}
