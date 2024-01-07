package oop.project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import oop.project.*;

public class LoginView {
    private JFrame frame;
    private JTextField fullnameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginView(){
        new Components();
        initializeLoginGUI();
    }

    //BRENT KUMINT.
    //code needs to be re-written. okay na ang kaning initialize, ang other methods below needs to be re-routed to controller.

    private void initializeLoginGUI() {
        frame = new JFrame("Login");
        frame.setSize(1600, 1600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        //Create blue panel
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(0, 0, 600, 800);
        bluePanel.setLayout(null);
        frame.add(bluePanel);

        //Create white panel
        JPanel whitePanel = new JPanel();
        whitePanel.setBackground(Color.WHITE);
        whitePanel.setBounds(601, 0, 700, 800);
        whitePanel.setLayout(null);
        frame.add(whitePanel);
        
        JLabel citec = new JLabel("CITE CLINIC.INC");
        citec.setFont(new Font("Arial", Font.PLAIN, 40));
        citec.setBounds(90, 10, 300, 200);
        citec.setSize(700, 100);
        bluePanel.add(citec);

        JLabel signup = new JLabel("Sign up");
        signup.setBounds(300, 60, 50, 25);
        signup.setForeground(Color.GRAY);
        whitePanel.add(signup);

        JLabel signin = new JLabel("Sign in");
        signin.setBounds(380, 60, 50, 25);
        signin.setForeground(Color.GRAY);
        whitePanel.add(signin);

        JLabel fullnameLabel = new JLabel("Full Name:");
        fullnameLabel.setBounds(290, 120, 80, 25);
        fullnameLabel.setForeground(Color.BLUE);
        whitePanel.add(fullnameLabel);

        fullnameField = new JTextField();
        fullnameField.setBounds(890, 150, 300, 30);
        frame.add(fullnameField);

        JLabel emaillabel = new JLabel("Email Address:");
        emaillabel.setBounds(290, 220, 100, 30);
        emaillabel.setForeground(Color.BLUE);
        whitePanel.add(emaillabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(890, 250, 300, 30);
        frame.add(emailField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(290, 320, 80, 25);
        passwordLabel.setForeground(Color.BLUE);
        whitePanel.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(890, 350, 300, 30);
        frame.add(passwordField);

        loginButton = new JButton("Login");
        loginButton.setBounds(360, 405, 120, 25);
        loginButton.setSize(150, 30);
        loginButton.setForeground(Color.WHITE);
        loginButton.setBackground(Color.BLUE);
        whitePanel.add(loginButton);

        JLabel createlabel = new JLabel("Create and Account");
        createlabel.setBounds(375, 440, 150, 30);
        createlabel.setForeground(Color.RED);
        whitePanel.add(createlabel);

        JLabel number = new JLabel("09123456789");
        number.setBounds(270, 600, 80, 25);
        whitePanel.add(number);

        JLabel gmail = new JLabel("cite.clinic.inc.ph@gmail.com");
        gmail.setBounds(400, 600, 200, 25);
        whitePanel.add(gmail);

    

        frame.setVisible(true);
    }

    // BRENT KUMINT
    // naunsa man ni pre? we have controller methods naa sa pikas.

    // public void setLoginListener(ActionListener listener) {
    //     loginButton.addActionListener(listener);
    // }

    // public String getFullname() {
    //     return fullnameField.getText();
    // }

    // public String getPassword() {
    //     return new String(passwordField.getPassword());
    // }

    // public void showMessage(String message) {
    //     JOptionPane.showMessageDialog(frame, message);
    // }

    public void actionPerformed (ActionEvent e){

    }
}
