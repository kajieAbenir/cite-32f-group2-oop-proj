package oop.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import oop.project.*;

class LoginView implements ActionListener {

    private JLabel fullNameLabel;
    private JTextField fullNameTextField;

    private JLabel emailAddressLabel;
    private JTextField emailAddressTextField;

    private JLabel passwordLabel;
    private JPasswordField passwordField;

    private LoginController loginController;

    public LoginView() {
        new Components();

        initializeGUI();
    }
