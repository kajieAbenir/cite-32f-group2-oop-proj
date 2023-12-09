package oop.project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class RegisterController implements ActionListener {

    private JTextField fullNameTextField;
    private JTextField emailAddressTextField;
    private JPasswordField passwordField;  

    public RegisterController(JTextField fullNameTextField, JTextField emailAddressTextField,
                              JPasswordField passwordField) {
        this.fullNameTextField = fullNameTextField;
        this.emailAddressTextField = emailAddressTextField;
        this.passwordField = passwordField;
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
            // BACK TO LOGIN PANEL
        }
    }
}
