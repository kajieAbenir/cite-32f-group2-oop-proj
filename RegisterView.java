package oop.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class RegisterView implements ActionListener {

    private JTextField fullNameTextField;
    private JTextField emailAddressTextField;
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

        JLabel fullNameLabel = new JLabel("FULL NAME");
        Components.addLabel(registerPanel, fullNameLabel, 640, 130, 100, 30);
        fullNameLabel.setFont(new Font("Arial", Font.PLAIN, 15));

        fullNameTextField = new JTextField();
        Components.addTextField(registerPanel, fullNameTextField, 640, 180, 450, 40);

        JLabel emailAddressLabel = new JLabel("E-MAIL ADDRESS");
        Components.addLabel(registerPanel, emailAddressLabel, 640, 250, 200, 30);
        emailAddressLabel.setFont(new Font("Arial", Font.PLAIN, 15));

        emailAddressTextField = new JTextField();
        Components.addTextField(registerPanel, emailAddressTextField, 640, 300, 450, 40);

        JLabel passwordLabel = new JLabel("PASSWORD");
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

        // Update the instantiation of RegisterController
        registerController = new RegisterController(fullNameTextField, emailAddressTextField, passwordField);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("REGISTER")) {
            String fullName = fullNameTextField.getText();
            String emailAddress = emailAddressTextField.getText();
            char[] passwordChars = passwordField.getPassword();
            String password = new String(passwordChars);

            RegisterModel registerModel = new RegisterModel();

            boolean registrationSuccessful = registerModel.registerUser(fullName, emailAddress, password);

            if (registrationSuccessful) {
                fullNameTextField.setText("");
                emailAddressTextField.setText("");
                passwordField.setText("");

                // Display a dialog with the message "REGISTERED SUCCESSFULLY"
                JOptionPane.showMessageDialog(Components.mainFrame, "REGISTERED SUCCESSFULLY");
            } else {
                JOptionPane.showMessageDialog(Components.mainFrame, "Registration Failed! Please check your input.");
            }
        } else if (e.getActionCommand().equals("CANCEL")) {
            // Handle cancel action if needed
        }
    }
}


// dili pa ni final since naa may nausab sa components, i will use it. ill finish this tomorrow.
