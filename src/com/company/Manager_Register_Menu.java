package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Manager_Register_Menu {
    private String name;
    private String username;
    private String password;
    private String price;
    private String interest_rate;
    private init pointer;
    private Login_Database ld_pointer;
    public Manager_Register_Menu(init p, Login_Database ldp)
    {
        pointer = p;
        ld_pointer = ldp;
        name = "";
        username = "";
        password = "";
        price = "";
        interest_rate = "";
        constructMRM();
    }

    public void constructMRM()
    {
        GridBagLayout GBCLayout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        JFrame window = new JFrame();
        window.setSize(new Dimension(960,720));
        window.setLayout(GBCLayout);

        // ADD INPUTS
        JTextField titleInput = new JTextField("Thanos Corp");
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

        JTextField usernameInput = new JTextField("???");
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

        JTextField passwordInput = new JTextField("???");
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

        JTextField priceInput = new JTextField("Price charged per Kilowatt Hour used");
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 2;
        gbc.gridy = 6;
        gbc.weightx = 1;
        gbc.weighty = 0.2;
        priceInput.addKeyListener(new KeyAdapter(){
            public void keyReleased(KeyEvent e) {
                price = priceInput.getText();
            }

            public void keyTyped(KeyEvent e) {
            }

            public void keyPressed(KeyEvent e) {
            }
        });
        window.add(priceInput, gbc);

        JTextField interestInput = new JTextField("(decimal format)");
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 2;
        gbc.gridy = 7;
        gbc.weightx = 1;
        gbc.weighty = 0.2;
        interestInput.addKeyListener(new KeyAdapter(){
            public void keyReleased(KeyEvent e) {
                interest_rate = interestInput.getText();
            }

            public void keyTyped(KeyEvent e) {
            }

            public void keyPressed(KeyEvent e) {
            }
        });
        window.add(interestInput, gbc);

        // ADD LABELS
        JLabel titleLabel = new JLabel("<html><font size='12' color=blue> Company Name",SwingConstants.CENTER);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.weightx = 1;
        gbc.weighty = 1;
        window.add(titleLabel, gbc);

        JLabel usernameLabel = new JLabel("<html><font size='12' color=blue> Company Username",SwingConstants.CENTER);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.weightx = 1;
        gbc.weighty = 1;
        window.add(usernameLabel, gbc);

        JLabel passwordLabel = new JLabel("<html><font size='12' color=blue> Company Password",SwingConstants.CENTER);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.weightx = 1;
        gbc.weighty = 1;
        window.add(passwordLabel, gbc);

        JLabel priceLabel = new JLabel("<html><font size='12' color=blue> Money Charged per Kilowatt Hour",SwingConstants.CENTER);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.weightx = 1;
        gbc.weighty = 1;
        window.add(priceLabel, gbc);

        JLabel interestLabel = new JLabel("<html><font size='12' color=blue> Interest Rate",SwingConstants.CENTER);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 1;
        gbc.gridy = 7;
        gbc.weightx = 1;
        gbc.weighty = 1;
        window.add(interestLabel, gbc);

        // CREATE COMPANY BUTTON
        JButton createButton = new JButton("Create Company");
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 1;
        gbc.gridy = 8;
        gbc.weightx = 1;
        gbc.weighty = 1;
        createButton.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Company c = new Company(name, username, password, Double.parseDouble(price), Double.parseDouble(interest_rate));
                pointer.addCompany(c);
                ld_pointer.updateManagerLogins(username,password);
                System.out.println("creation successful");
            }
        });
        window.add(createButton, gbc);

        window.setVisible(true);
    }
}
