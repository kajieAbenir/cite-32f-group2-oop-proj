package oop.project;

import javax.swing.*;
import java.awt.*;

public class Components {

    public static JFrame mainFrame = new JFrame();

    Components() {
        addFrame();
        mainFrame.setVisible(true);
    }

    static void addFrame() {
        mainFrame.setSize(1200, 800);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    static void addPanel(JPanel panel, int xAxis, int yAxis, int width, int height) {
        panel.setBounds(xAxis, yAxis, width, height);
        panel.setLayout(null);
    }

    /* gi remove nako ang mga method nga gi add ni chairman, so if ever mag add mo ug label, kamo nalang set sa FONT. and make sure
        nga nakauyon na sa atoang gi sabotan nga mga sizes sa font. 
    */
    static void addLabel(JPanel panel, JLabel label, int xAxis, int yAxis, int width, int height) {
        label.setBounds(xAxis, yAxis, width, height);
        panel.add(label);
    }

    static void addTextField(JPanel panel, JTextField textField, int xAxis, int yAxis, int width, int height) {
        textField.setBounds(xAxis, yAxis, width, height);
        panel.add(textField);
    }

    static void addButton(JPanel panel, JButton button, int xAxis, int yAxis, int width, int height) {
        button.setBounds(xAxis, yAxis, width, height);
        panel.add(button);
    }

    static void addTextArea(JPanel panel, JTextArea textArea, int xAxis, int yAxis, int width, int height) {
        textArea.setBounds(xAxis, yAxis, width, height);
        panel.add(textArea);
    }
    //make sure to use tis method sa actionListener
    static void clearFrame() {
        mainFrame.getContentPane().removeAll();
        mainFrame.validate();
        mainFrame.repaint();
    }
}
