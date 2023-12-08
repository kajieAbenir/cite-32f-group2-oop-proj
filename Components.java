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
        mainFrame.setLayout(null);
    }

    static void addPanel(JPanel panel, int xAxis, int yAxis, int width, int height) {
        panel.setBounds(xAxis, yAxis, width, height);
    }

    static void addLabel(JPanel panel, JLabel label, int xAxis, int yAxis, int width, int height, int fontSize, int fontStyle) {
        label.setBounds(xAxis, yAxis, width, height);
        label.setFont(new Font(label.getFont().getName(), fontStyle, fontSize));
    }

    static void addTextField(JPanel panel, JTextField textField, int xAxis, int yAxis, int width, int height, int fontSize, int fontStyle) {
        textField.setBounds(xAxis, yAxis, width, height);
        textField.setFont(new Font(textField.getFont().getName(), fontStyle, fontSize));
    }

    static void addButton(JPanel panel, JButton button, int xAxis, int yAxis, int width, int height, int fontSize, int fontStyle) {
        button.setBounds(xAxis, yAxis, width, height);
        button.setFont(new Font(button.getFont().getName(), fontStyle, fontSize));
    }

    static void addTextArea(JPanel panel, JTextArea textArea, int xAxis, int yAxis, int width, int height, int fontSize, int fontStyle) {
        textArea.setBounds(xAxis, yAxis, width, height);
        textArea.setFont(new Font(textArea.getFont().getName(), fontStyle, fontSize));
        panel.add(textArea);
    }

    static void clearFrame() {
        mainFrame.getContentPane().removeAll();
        mainFrame.validate();
        mainFrame.repaint();
    }
}
