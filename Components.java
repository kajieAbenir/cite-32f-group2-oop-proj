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
    Components.addPanel(registerPanel, 0, 0, 1200, 800, "#F3F3F3");
    registerPanel.setLayout(null);
    Components.mainFrame.add(registerPanel);

    JButton signupBtn = new JButton("SIGN UP");
    Components.addButton(registerPanel, signupBtn, 700, 110, 100, 20);
    signupBtn.setFont(new Font("Arial", Font.BOLD, 10));

    JButton signinBtn = new JButton("SIGN IN");
    Components.addButton(registerPanel, signinBtn, 850, 110, 100, 20);
    signinBtn.setFont(new Font("Arial", Font.BOLD, 10));

    JLabel fullNameLabel = new JLabel("FULL NAME");
    Components.addLabel(registerPanel, fullNameLabel, 640, 130, 100, 30);
    fullNameLabel.setFont(new Font("Arial", Font.PLAIN, 15));

    fullNameTextField = new JTextField();
    Components.addLineTextField(registerPanel, 640, 180, 450, 40, fullNameTextField);

    JLabel emailAddressLabel = new JLabel("E-MAIL ADDRESS");
    Components.addLabel(registerPanel, emailAddressLabel, 640, 250, 200, 30);
    emailAddressLabel.setFont(new Font("Arial", Font.PLAIN, 15));

    emailAddressTextField = new JTextField();
    Components.addLineTextField(registerPanel, 640, 300, 450, 40, emailAddressTextField);

    JLabel passwordLabel = new JLabel("PASSWORD");
    Components.addLabel(registerPanel, passwordLabel, 640, 370, 200, 30);
    passwordLabel.setFont(new Font("Arial", Font.PLAIN, 15));

    passwordField = new JPasswordField();
    Components.addLineTextField(registerPanel, 640, 420, 450, 40, passwordField);

    JButton signUpButton = new JButton("SIGN UP");
    Components.addButton(registerPanel, signUpButton, 640, 520, 450, 40);
    signUpButton.addActionListener(this);

    JButton hasAnAccountButton = new JButton("I ALREADY HAVE AN ACCOUNT");
    Components.addButton(registerPanel, hasAnAccountButton, 640, 590, 450, 40);
    hasAnAccountButton.addActionListener(this);

    signUpButton.setBackground(Color.BLUE);
    signUpButton.setForeground(Color.WHITE);
    signUpButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true)); 

    hasAnAccountButton.setBackground(null);
    hasAnAccountButton.setForeground(Color.RED);
    hasAnAccountButton.setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));

    ImageIcon imageIcon = new ImageIcon("Badz.png"); 
    JLabel imageLabel = new JLabel(imageIcon);
        
    int imageWidth = imageIcon.getIconWidth();
    int imageHeight = imageIcon.getIconHeight();
    imageLabel.setBounds(0, 0, imageWidth, imageHeight);

    registerPanel.add(imageLabel);
}


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("SIGN UP")) {
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

                JOptionPane.showMessageDialog(Components.mainFrame, "REGISTERED SUCCESSFULLY");
            } else {
                JOptionPane.showMessageDialog(Components.mainFrame, "Registration Failed! Please check your input.");
            }
        } else if (e.getActionCommand().equals("CANCEL")) {
            //balik sa loginPanel. work by boytapang
        }
    }
}
