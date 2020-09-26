package com.company;
import javax.swing.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Dimension;
import java.awt.*;
import java.awt.event.*;




public class Main_Menu {

    public Login_Database LD = new Login_Database();
    private String userUsernameEntry;
    private String userPasswordEntry;
    private String managerUsernameEntry;
    private String managerPasswordEntry;
    public init pointer;
    public Main_Menu(init p)
    {
        constructMM();
        pointer = p;
        userUsernameEntry = "";
        userPasswordEntry = "";
        managerUsernameEntry = "";
        managerPasswordEntry = "";
    }
    
    public void constructMM()
    {
        GridBagLayout GBCLayout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        JFrame window = new JFrame();
        window.setSize(new Dimension(1024,576));
        window.setLayout(GBCLayout);

        JLabel windowLabel = new JLabel("<html><font size='12' color=green> Login Page",SwingConstants.CENTER);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.weightx = 1;
        gbc.weighty = 1;
        window.add(windowLabel, gbc);

        JLabel loginStatus = new JLabel("<html><font size='5' color=blue> Login Status: Unknown",SwingConstants.CENTER);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 3;
        gbc.gridy = 4;
        gbc.weightx = 1;
        gbc.weighty = 0.2;
        window.add(loginStatus, gbc);

        // Login Input Section
        JTextField managerUsernameInput = new JTextField("Enter Username");
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.weightx = 1;
        gbc.weighty = 0.2;
        managerUsernameInput.addKeyListener(new KeyAdapter(){
            public void keyReleased(KeyEvent e) {
                managerUsernameEntry = managerUsernameInput.getText();
            }

            public void keyTyped(KeyEvent e) {
            }

            public void keyPressed(KeyEvent e) {
            }
        });
        window.add(managerUsernameInput, gbc);

        JTextField managerPasswordInput = new JTextField("Enter Password");
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.weightx = 1;
        gbc.weighty = 0.2;
        managerPasswordInput.addKeyListener(new KeyAdapter(){
            public void keyReleased(KeyEvent e) {
                managerPasswordEntry = managerPasswordInput.getText();
            }

            public void keyTyped(KeyEvent e) {
            }

            public void keyPressed(KeyEvent e) {
            }
        });
        window.add(managerPasswordInput, gbc);

        JTextField userUsernameInput = new JTextField("Enter Username");
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 4;
        gbc.gridy = 3;
        gbc.weightx = 1;
        gbc.weighty = 0.2;
        userUsernameInput.addKeyListener(new KeyAdapter(){
            public void keyReleased(KeyEvent e) {
                userUsernameEntry = userUsernameInput.getText();
            }

            public void keyTyped(KeyEvent e) {
            }

            public void keyPressed(KeyEvent e) {
            }
        });
        window.add(userUsernameInput, gbc);

        JTextField userPasswordInput = new JTextField("Enter Password");
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 4;
        gbc.gridy = 4;
        gbc.weightx = 1;
        gbc.weighty = 0.2;
        userPasswordInput.addKeyListener(new KeyAdapter(){
            public void keyReleased(KeyEvent e) {
                userPasswordEntry = userPasswordInput.getText();
            }

            public void keyTyped(KeyEvent e) {
            }

            public void keyPressed(KeyEvent e) {
            }
        });
        window.add(userPasswordInput, gbc);

        // Part builder
        JButton managerLogin = new JButton("Login as manager");
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.weightx = 1;
        gbc.weighty = 1;
        managerLogin.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                boolean valid = LD.managerLoginCheck(managerUsernameEntry, managerPasswordEntry);
                if(!valid)
                {
                    loginStatus.setText("<html><font size='5' color=Red> Login Status: Failed");
                }
                else
                {
                    loginStatus.setText("<html><font size='5' color=Green> Login Status: Successful");
                    Company comp = pointer.getCompUsername(managerUsernameEntry);
                    Manager_Menu mm = new Manager_Menu(pointer, comp, comp.getName(),  comp.getInterest(), comp.getProfit(), comp.getMonthlyProfit());
                }
            }
        });
        window.add(managerLogin, gbc);

        JButton userLogin = new JButton("Login as user");
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 4;
        gbc.gridy = 2;
        gbc.weightx = 1;
        gbc.weighty = 1;
        userLogin.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                boolean valid = LD.userLoginCheck(userUsernameEntry, userPasswordEntry);
                if(!valid)
                {
                    loginStatus.setText("<html><font size='5' color=Red> Login Status: Failed");
                }
                else
                {
                    loginStatus.setText("<html><font size='5' color=Green> Login Status: Successful");
                    Customer user = pointer.getUserUsername(userUsernameEntry);
                    User_Menu um = new User_Menu(user.getCompanyName(), user.getTotalDue(), user.getCompany().getInterest(), user.getTimeSincePayment());
                }
            }
        });
        window.add(userLogin, gbc);

        JButton managerRegister = new JButton("Register as Manager");
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.weightx = 1;
        gbc.weighty = 0.4;
        managerRegister.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Manager_Register_Menu mrm = new Manager_Register_Menu(pointer, LD);
            }
        });
        window.add(managerRegister, gbc);

        JButton userRegister = new JButton("Register as User");
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 4;
        gbc.gridy = 1;
        gbc.weightx = 1;
        gbc.weighty = 0.4;
        userRegister.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                User_Register_Menu urm = new User_Register_Menu(pointer, LD);
            }
        });
        window.add(userRegister, gbc);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
