package oop.project;

import javax.swing.*;
import java.awt.*;

class Components {
    public static JFrame mainFrame = new JFrame();

    Components() {
        addFrame();
        mainFrame.setVisible(true);
    }

    static void addFrame() {
        mainFrame.setSize(1200, 800);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(null);
        mainFrame.setResizable(false);
    }

    static void addPanel(JPanel panel, int xAxis, int yAxis, int width, int height, String hexColor) {
        panel.setBackground(Color.decode(hexColor));
        panel.setBounds(xAxis, yAxis, width, height);
        panel.setOpaque(false);
    }

    static void addLabel(JPanel panel, JLabel label, int xAxis, int yAxis, int width, int height) {
        label.setBounds(xAxis, yAxis, width, height);
        panel.add(label);
    }

    static void addLineTextField(JPanel panel, int xAxis, int yAxis, int width, int height, JTextField textField) {
        textField.setBounds(xAxis, yAxis + height - 30, width, 25);
        textField.setFont(new Font("Arial", Font.PLAIN, 25));
        textField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        textField.setOpaque(false);
        panel.add(textField);
    }

    static void addButton(JPanel panel, JButton button, int xAxis, int yAxis, int width, int height) {
        button.setBounds(xAxis, yAxis, width, height);
        panel.add(button);
    }

    static void clearFrame() {
        mainFrame.getContentPane().removeAll();
        mainFrame.validate();
        mainFrame.repaint();
    }
}
