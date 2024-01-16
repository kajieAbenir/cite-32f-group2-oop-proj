package oop.project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import oop.project.*;

public class LoginView {
    private static Components Components = new Components();

    public LoginView(){
        new Components();
        initializeLoginGUI();
    }

    //BRENT KUMINT.
    //code needs to be re-written to component-based ;-;

    private static void initializeLoginGUI() {

        //initialize image panel. placeholder for welcome image sa left (see documentation folder).
        final JPanel imagePanel = new JPanel();
        Components.addPanel(imagePanel, 0, 0, 600, 800, "FFFFFF");

        final JPanel loginPanel = new JPanel();
        Components.addPanel(loginPanel, 601, 0, 700, 800, "FFFFFF");

        //for the rest of the stuff, naa sa method parameter included what panel isulod ang component.
        
        final JLabel citeClinicLabel = new JLabel("CITE INC. CLINIC");
        Components.addLabel(loginPanel, citeClinicLabel, 90, 10, 200, 100, "ARIAL", 1, 40);

        //correction: initial submissions found na jlabel siya, where it supposed to be a button with same background.

        final JLabel loginLabel = new JLabel("Login");
        Components.addLabel(loginPanel,loginLabel,300,60,50,25, Color.GRAY);

        final JLabel fullnameLabel = new JLabel("Full Name");
        Components.addLabel(loginPanel, fullnameLabel, 290, 120, 80, 25, Color.BLUE.brighter());

        final JTextField fullnameField = new JTextField(100);
        Components.addLineTextField(loginPanel, 890, 150, 300, 30, fullnameField);

        final JLabel emailLabel = new JLabel("Email Address");
        Components.addLabel(loginPanel, emailLabel, 290, 220, 100, 30, Color.BLUE.brighter());

        final JTextField emailField = new JTextField();
        Components.addLineTextField(loginPanel, 890, 250, 300, 30, emailField);

        final JLabel passwordLabel = new JLabel("Password:");
        Components.addLabel(loginPanel, passwordLabel, 290, 320, 80, 25, Color.BLUE.brighter());

        final JPasswordField passwordField = new JPasswordField();
        Components.addPasswordField(passwordField, loginPanel, 890, 350, 300, 30);

        final JButton loginButton = new JButton("Log in");
        Components.addButton(loginPanel, loginButton, 375, 400, 150, 30, Color.WHITE, Color.BLUE.brighter());

        final JButton registerButton = new JButton("Create an Account");
        Components.addButton(loginPanel, registerButton, 375, 440, 150, 30, Color.RED, Color.WHITE);

        final JLabel contactNumberLabel = new JLabel("09123456789");
        Components.addLabel(loginPanel, contactNumberLabel, 270, 600, 80, 25,Color.GRAY);

        final JLabel emailAddressLabel = new JLabel("cite.clinic.inc.ph@gmail.com");
        Components.addLabel(loginPanel, emailAddressLabel, 400, 600, 200, 25,Color.GRAY);
    }

    public void actionPerformed (ActionEvent e){

    }
}
