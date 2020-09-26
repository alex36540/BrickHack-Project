package com.company;

import javax.swing.*;
import java.awt.*;

public class User_Register_Menu {
    public User_Register_Menu()
    {
        constructURM();
    }

    public void constructURM()
    {
        GridBagLayout GBCLayout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        JFrame window = new JFrame();
        window.setSize(new Dimension(960,720));
        window.setLayout(GBCLayout);
        window.setVisible(true);
    }
}
