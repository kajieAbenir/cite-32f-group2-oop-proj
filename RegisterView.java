package oop.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import oop.project.*;

class RegisterView implements ActionListener {

    private JLabel fullNameLabel;
    private JTextField fullNameTextField;

    private JLabel emailAddressLabel;
    private JTextField emailAddressTextField;

    private JLabel passwordLabel;
    private JPasswordField passwordField;

    private RegisterController registerController;

    public RegisterView() {
        new Components();

        initializeGUI();
    }

    private void initializeGUI() {
        JPanel registerPanel = new JPanel();
        Components.addPanel(registerPanel, 0, 0, 1200, 800, "#E95793");
        registerPanel.setLayout(null);
        Components.mainFrame.add(registerPanel);

        JLabel firstTimeLabel = new JLabel("FIRST TIME?");
        Components.addLabel(registerPanel, firstTimeLabel, 850, 50, 150, 60);
        firstTimeLabel.setFont(new Font("Arial", Font.BOLD, 19));

        fullNameLabel = new JLabel("FULL NAME");
        Components.addLabel(registerPanel, fullNameLabel, 640, 130, 100, 30);
        fullNameLabel.setFont(new Font("Arial", Font.PLAIN, 15));

        fullNameTextField = new JTextField();
        Components.addTextField(registerPanel, fullNameTextField, 640, 180, 450, 40);

        emailAddressLabel = new JLabel("E-MAIL ADDRESS");
        Components.addLabel(registerPanel, emailAddressLabel, 640, 250, 200, 30);
        emailAddressLabel.setFont(new Font("Arial", Font.PLAIN, 15));

        emailAddressTextField = new JTextField();
        Components.addTextField(registerPanel, emailAddressTextField, 640, 300, 450, 40);

        passwordLabel = new JLabel("PASSWORD");
        Components.addLabel(registerPanel, passwordLabel, 640, 370, 200, 30);
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 15));

        passwordField = new JPasswordField();
        Components.addTextField(registerPanel, passwordField, 640, 420, 450, 40);

        JButton registerButton = new JButton("REGISTER");
        Components.addButton(registerPanel, registerButton, 640, 520, 450, 40);
        registerButton.addActionListener(this);

        JButton cancelButton = new JButton("CANCEL");
        Components.addButton(registerPanel, cancelButton, 640, 590, 450, 40);
        cancelButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == registerButton) {
            String fullName = fullNameTextField.getText();
            String email = emailAddressTextField.getText();
            char[] passChar = passwordField.getPassword();
            String passString = new String(passChar);

            //send to controller constructor to save info
            registerController = new RegisterController(fullName, email, passString);
        }

        else if (e.getSource() == cancelButton){
            //go back to login button.
        }
    }

//BADAYOS KUMINT.
// dili pa ni final since naa may nausab sa components, i will use it. ill finish this tomorrow.

//ABENIR KUMINT.
// IHHHHHHHHHHHHHHHHHHHH ANG OA ANG OA ANG OA ANG OA GUARD ANG OA NG TEAM LEAD NAMIN
