package oop.project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class RegisterController implements ActionListener {

  private JTextField fullNameTextField;
  private JTextField emailAddressTextField;
  private JTextField passwordTextField;
  private JTextArea outputTextArea;

  public RegisterController(JTextField fullNameTextField, JTextField emailAddressTextField,
  JTextField passwordTextField, JTextArea outputTextArea) {
    this.fullNameTextField = fullNameTextField;
    this.emailAddressTextField = emailAddressTextField;
    this.passwordTextField = passwordTextField;
    this.outputTextArea = outputTextArea;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getActionCommand().equals("REGISTER")) {
      String fullName = fullNameTextField.getText();
      String emailAddress = emailAddressTextField.getText();
      String password = new String(((JPasswordField) passwordTextField).getPassword());

      RegisterModel registerModel = new RegisterModel(outputTextArea);

      boolean registrationSuccessful = registerModel.registerUser(fullName, emailAddress, password);

      if (registrationSuccessful) {
        fullNameTextField.setText("");
        emailAddressTextField.setText("");
        passwordTextField.setText("");

        JOptionPane.showMessageDialog(Components.mainFrame, "Registration Successful!");
      } else {
        JOptionPane.showMessageDialog(Components.mainFrame, "Registration Failed! Please check your input.");
      }
    } else if (e.getActionCommand().equals("CANCEL")) {
    
    }
  }
}
