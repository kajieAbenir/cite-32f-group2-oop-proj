package oop.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegisterView implements ActionListener {

    private JTextField fullNameTextField;
    private JTextField emailAddressTextField;
    private JTextField passwordTextField;
    private JTextArea outputTextArea;

    private RegisterController registerController;

    public RegisterView() {
        new Components();
        initializeGUI();
    }

    private void initializeGUI() {
        JPanel registerPanel = new JPanel();
        Components.addPanel(registerPanel, 0, 0, 600, 800);
        Components.mainFrame.add(registerPanel);

        JLabel firstTimeLabel = new JLabel("FIRST TIME?");
        Components.addLabel(registerPanel, firstTimeLabel, 185, 50, 150, 60);
        Components.setHeaderFont(firstTimeLabel,"ARIAL");

        JLabel fullNameLabel = new JLabel("FULL NAME");
        Components.addLabel(registerPanel, fullNameLabel, 40, 130, 100, 30);
        Components.setRegularFont(fullNameLabel,"ARIAL");

        fullNameTextField = new JTextField();
        Components.addTextField(registerPanel, fullNameTextField, 40, 180, 300, 40);

        JLabel emailAddressLabel = new JLabel("E-MAIL ADDRESS");
        Components.addLabel(registerPanel, emailAddressLabel, 40, 250, 200, 30);
        Components.setRegularFont(emailAddressLabel,"ARIAL");

        emailAddressTextField = new JTextField();
        Components.addTextField(registerPanel, emailAddressTextField, 40, 300, 300, 40);

        JLabel passwordLabel = new JLabel("PASSWORD");
        Components.addLabel(registerPanel, passwordLabel, 40, 370, 200, 30);
        Components.setRegularFont(passwordLabel,"ARIAL");

        passwordTextField = new JTextField();
        Components.addTextField(registerPanel, passwordTextField, 40, 420, 300, 40);

        JButton registerButton = new JButton("REGISTER");
        Components.addButton(registerPanel, registerButton, 40, 490, 300, 40);
        registerButton.addActionListener(this);  // Register the ActionListener

        JButton cancelButton = new JButton("CANCEL");
        Components.addButton(registerPanel, cancelButton, 40, 540, 300, 40);
        cancelButton.addActionListener(this);  // Register the ActionListener

        outputTextArea = new JTextArea();
        outputTextArea.setEditable(false);  // Make it non-editable
        Components.addTextArea(registerPanel, outputTextArea, 400, 130, 150, 250);

        //Components.mainFrame.setVisible(true);  // Set visibility here
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("REGISTER")) {
            String fullName = fullNameTextField.getText();
            String emailAddress = emailAddressTextField.getText();
            String password = passwordTextField.getText();

            registerController = new RegisterController(fullNameTextField, emailAddressTextField, passwordTextField, outputTextArea);

            passwordTextField.setText("");
            registerController.actionPerformed(e);

        } else if (e.getActionCommand().equals("CANCEL")) {
            // go back to login screen
        }
    }

    
}
