package oop.project;

import javax.swing.*;
import java.awt.*;

class Components {
    public static JFrame mainFrame = new JFrame();

    Components() {
        addFrame();
        mainFrame.setVisible(true);
    }

    void addFrame() {
        mainFrame.setSize(1200, 800);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(null);
        mainFrame.setResizable(false);
    }

    void addPanel(JPanel panel, int xAxis, int yAxis, int width, int height, String hexColor) {
        panel.setBackground(Color.decode(hexColor));
        panel.setBounds(xAxis, yAxis, width, height);
        panel.setOpaque(false);
    }

    //add label with default settings (font, sizing, etc.)
    void addLabel(JPanel panel, JLabel label, int xAxis, int yAxis, int width, int height) {
        label.setBounds(xAxis, yAxis, width, height);
        panel.add(label);
    }

    //add label with default settings (font, sizing, etc.)
    void addLabel(JPanel panel, JLabel label, int xAxis, int yAxis, int width, int height, Color foregroundColor) {
        label.setBounds(xAxis, yAxis, width, height);
        label.setForeground(foregroundColor);
        panel.add(label);
    }

    //with custom setting
    void addLabel(JPanel panel, JLabel label, int xAxis, int yAxis, int labelWidth, int labelHeight, String font, int fontSetting, int fontSize) {
        label.setBounds(xAxis, yAxis, labelWidth, labelHeight);
        
        switch(fontSetting){
            case 1: //PLAIN
                label.setFont(new Font(null, Font.PLAIN, fontSize));
            case 2: //BOLD
                label.setFont(new Font(null, Font.BOLD, fontSize));
            case 3: //ITALIC
                label.setFont(new Font(null, Font.ITALIC, fontSize));
        }
        
        panel.add(label);
    }

    void addLineTextField(JPanel panel, int xAxis, int yAxis, int width, int height, JTextField textField) {
        textField.setBounds(xAxis, yAxis + height - 30, width, 25);
        textField.setFont(new Font("Arial", Font.PLAIN, 25));
        textField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        textField.setOpaque(false);
        panel.add(textField);
    }

    void addPasswordField(JPasswordField passField, JPanel panel, int xAxis, int yAxis, int width, int height) {
        passField.setBounds(xAxis, yAxis + height - 30, width, 25);
        passField.setFont(new Font("Arial", Font.PLAIN, 25));
        passField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        passField.setOpaque(false);
        panel.add(passField);
    }

    //default add button method
    void addButton(JPanel panel, JButton button, int xAxis, int yAxis, int width, int height) {
        button.setBounds(xAxis, yAxis, width, height);
        button.setFocusable(false);
        panel.add(button);
    }

    //with foreground & background colors.
    void addButton(JPanel panel, JButton button, int xAxis, int yAxis, int width, int height, Color foregroundColor, Color backgroundColor) {
        button.setBounds(xAxis, yAxis, width, height);
        button.setFocusable(false);
        button.setForeground(foregroundColor);
        button.setBackground(backgroundColor);
        panel.add(button);
    }

    void clearFrame() {
        mainFrame.getContentPane().removeAll();
        mainFrame.validate();
        mainFrame.repaint();
    }
}
