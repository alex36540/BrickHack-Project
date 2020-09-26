package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class User_Register_Menu {
    private String name;
    private String username;
    private String password;
    private String location_x;
    private String location_y;
    private String company_name;
    private init pointer;
    public User_Register_Menu(init p)
    {
        pointer = p;
        name = "";
        username = "";
        password = "";
        location_x = "";
        location_y = "";
        company_name = "";
        constructURM();
    }

    public void constructURM()
    {
        GridBagLayout GBCLayout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        JFrame window = new JFrame();
        window.setSize(new Dimension(960,720));
        window.setLayout(GBCLayout);

        // ADD INPUTS
        JTextField titleInput = new JTextField("Thanos");
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.weightx = 1;
        gbc.weighty = 0.2;
        titleInput.addKeyListener(new KeyAdapter(){
            public void keyReleased(KeyEvent e) {
                name = titleInput.getText();
            }

            public void keyTyped(KeyEvent e) {
            }

            public void keyPressed(KeyEvent e) {
            }
        });
        window.add(titleInput, gbc);

        JTextField usernameInput = new JTextField("enter a username");
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.weightx = 1;
        gbc.weighty = 0.2;
        usernameInput.addKeyListener(new KeyAdapter(){
            public void keyReleased(KeyEvent e) {
                username = usernameInput.getText();
            }

            public void keyTyped(KeyEvent e) {
            }

            public void keyPressed(KeyEvent e) {
            }
        });
        window.add(usernameInput, gbc);

        JTextField passwordInput = new JTextField("12345");
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 2;
        gbc.gridy = 5;
        gbc.weightx = 1;
        gbc.weighty = 0.2;
        passwordInput.addKeyListener(new KeyAdapter(){
            public void keyReleased(KeyEvent e) {
                password = passwordInput.getText();
            }

            public void keyTyped(KeyEvent e) {
            }

            public void keyPressed(KeyEvent e) {
            }
        });
        window.add(passwordInput, gbc);

        JTextField xInput = new JTextField("x coordinate as decimal value");
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 2;
        gbc.gridy = 6;
        gbc.weightx = 1;
        gbc.weighty = 0.2;
        xInput.addKeyListener(new KeyAdapter(){
            public void keyReleased(KeyEvent e) {
                location_x = xInput.getText();
            }

            public void keyTyped(KeyEvent e) {
            }

            public void keyPressed(KeyEvent e) {
            }
        });
        window.add(xInput, gbc);

        JTextField yInput = new JTextField("y coordinate as decimal value");
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 2;
        gbc.gridy = 7;
        gbc.weightx = 1;
        gbc.weighty = 0.2;
        yInput.addKeyListener(new KeyAdapter(){
            public void keyReleased(KeyEvent e) {
                location_y = yInput.getText();
            }

            public void keyTyped(KeyEvent e) {
            }

            public void keyPressed(KeyEvent e) {
            }
        });
        window.add(yInput, gbc);

        JTextField companyInput = new JTextField("enter the name of the company to connect to");
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 2;
        gbc.gridy = 8;
        gbc.weightx = 1;
        gbc.weighty = 0.2;
        companyInput.addKeyListener(new KeyAdapter(){
            public void keyReleased(KeyEvent e) {
                company_name = companyInput.getText();
            }

            public void keyTyped(KeyEvent e) {
            }

            public void keyPressed(KeyEvent e) {
            }
        });
        window.add(companyInput, gbc);

        // ADD LABELS
        JLabel titleLabel = new JLabel("Real Name",SwingConstants.CENTER);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.weightx = 1;
        gbc.weighty = 1;
        window.add(titleLabel, gbc);

        JLabel usernameLabel = new JLabel("Username",SwingConstants.CENTER);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.weightx = 1;
        gbc.weighty = 1;
        window.add(usernameLabel, gbc);

        JLabel passwordLabel = new JLabel("Password",SwingConstants.CENTER);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.weightx = 1;
        gbc.weighty = 1;
        window.add(passwordLabel, gbc);

        JLabel xLabel = new JLabel("X Coordinate",SwingConstants.CENTER);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.weightx = 1;
        gbc.weighty = 1;
        window.add(xLabel, gbc);

        JLabel yLabel = new JLabel("Y Coordinate",SwingConstants.CENTER);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 1;
        gbc.gridy = 7;
        gbc.weightx = 1;
        gbc.weighty = 1;
        window.add(yLabel, gbc);

        JLabel companyLabel = new JLabel("Company Name (exact)",SwingConstants.CENTER);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 1;
        gbc.gridy = 8;
        gbc.weightx = 1;
        gbc.weighty = 1;
        window.add(companyLabel, gbc);


        // CREATE USER BUTTON
        JButton createButton = new JButton("Register User");
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 1;
        gbc.gridy = 9;
        gbc.weightx = 1;
        gbc.weighty = 1;
        createButton.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                double[] coords = new double[2];
                System.out.println(location_x);
                System.out.println(location_y);
                coords[0] = Double.parseDouble(location_x);
                coords[1] = Double.parseDouble(location_y);
                if(pointer.getComp(company_name) != null)
                {
                    Customer c = new Customer(name, coords, username, password, pointer.getComp(company_name));
                    System.out.println("creation successful");
                }
            }
        });
        window.add(createButton, gbc);

        window.setVisible(true);
    }
}
