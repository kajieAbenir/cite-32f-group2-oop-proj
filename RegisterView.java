package oop.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import oop.project.*;

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
        JPanel leftRegisterPanel = new JPanel();
        Components.addPanel(leftRegisterPanel, 0, 0, 1200, 800, "#E95793");
        leftRegisterPanel.setLayout(null);
        Components.mainFrame.add(leftRegisterPanel);

        JLabel firstTimeLabel = new JLabel("FIRST TIME?");
        Components.addLabel(leftRegisterPanel, firstTimeLabel, 850, 50, 150, 60);
        firstTimeLabel.setFont(new Font("Arial", Font.BOLD, 19));

        JLabel fullNameLabel = new JLabel("FULL NAME");
        Components.addLabel(leftRegisterPanel, fullNameLabel, 640, 130, 100, 30);
        fullNameLabel.setFont(new Font("Arial", Font.PLAIN, 15));

        fullNameTextField = new JTextField();
        Components.addLineTextField(leftRegisterPanel, 640, 180, 450, 40, fullNameTextField);

        JLabel emailAddressLabel = new JLabel("E-MAIL ADDRESS");
        Components.addLabel(leftRegisterPanel, emailAddressLabel, 640, 250, 200, 30);
        emailAddressLabel.setFont(new Font("Arial", Font.PLAIN, 15));

        emailAddressTextField = new JTextField();
        Components.addLineTextField(leftRegisterPanel, 640, 300, 450, 40, emailAddressTextField);

        JLabel passwordLabel = new JLabel("PASSWORD");
        Components.addLabel(leftRegisterPanel, passwordLabel, 640, 370, 200, 30);
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 15));

        passwordField = new JPasswordField();
        Components.addLineTextField(leftRegisterPanel, 640, 420, 450, 40, passwordField);

        JButton registerButton = new JButton("REGISTER");
        Components.addButton(leftRegisterPanel, registerButton, 640, 520, 450, 40);
        registerButton.addActionListener(this);

        JButton cancelButton = new JButton("CANCEL");
        Components.addButton(leftRegisterPanel, cancelButton, 640, 590, 450, 40);
        cancelButton.addActionListener(this);

        // BRENT KUMINT
        //wait lang kuya badz nganong iupdate ang instantiation? unsay purpose?

        // Update the instantiation of RegisterController
        //registerController = new RegisterController(fullNameTextField, emailAddressTextField, passwordField);
    }

    // UNDER CONSTRUCTION. 
    //PLEASE REFRAIN FROM BUILDING CODE, PWEDE RA COMMENTS.
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("REGISTER")) {
            String fullName = fullNameTextField.getText();
            String emailAddress = emailAddressTextField.getText();
            char[] passwordChars = passwordField.getPassword();
            String password = new String(passwordChars);

            RegisterController registerController = new RegisterController();

            //SECURITY UPDATE: THERE ARE CASES OF DUPLICATION KUNG I-DERECHO UG SAVE.
            //updated it to direct to controller.

            if(registerController.registerCheckThenSave(fullName,emailAddress,password)){

                fullNameTextField.setText("");
                emailAddressTextField.setText("");
                passwordField.setText("");

                // Display a dialog with the message "REGISTERED SUCCESSFULLY"
                JOptionPane.showMessageDialog(Components.mainFrame, "REGISTERED SUCCESSFULLY");
            } else {
                JOptionPane.showMessageDialog(Components.mainFrame, "Registration Failed! Please check your input.");
            }
        } else if (e.getActionCommand().equals("CANCEL")) {
            // balik sa loginView
        }
    }
}
