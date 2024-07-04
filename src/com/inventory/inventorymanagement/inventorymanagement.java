package com.inventory.inventorymanagement;

import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.inventory.ui.LoginDialog;
import com.jtattoo.plaf.hifi.HiFiLookAndFeel;

public class inventorymanagement {
    public inventorymanagement(int a) {
    }

    public static void main(String[] args) {

        try {
            Properties p = new Properties();
            p.put("logoString", "IMS");
            HiFiLookAndFeel.setCurrentTheme(p);
            UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        LoginDialog ld = new LoginDialog();
        ld.setLocationRelativeTo(null);
        ld.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ld.setVisible(true);

    }

}