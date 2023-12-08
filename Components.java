package oop.project;

import javax.swing.*;
import java.awt.*;

public class Components{

    static JFrame mainFrame = new JFrame();
    
     Components(){
        addFrame();
      }

    static void addFrame(){
      mainFrame.setSize(800, 1200);
      mainFrame.setLocationRelativeTo(null);
      mainFrame.setDefaultCloseOperation(mainFrame_EXIT_ON_CLOSE);
      mainFrame.setLayout(null);
      mainFrame.setVisible(true);
    }

    static void addPanel(JFrame frame, JPanel panel, int xAxis, int yAxis, int width, int height){
        panel.setBounds(xAxis, yAxis, width, height);
    }

    static void addLabel(JPanel panel, JLabel label, int xAxis, int yAxis, int width, int height){
        label.setBounds(xAxis, yAxis, width, height);
    }

    static void addTextField(JPanel panel, JTextField textField, int xAxis, int yAxis, int width, int height){
        textField.setBounds(xAxis, yAxis, width, height);
    }

    static void addButton(JPanel panel, JButton button, int xAxis, int yAxis, int width, int height){
        button.setBounds(xAxis, yAxis, width, height);
    }
    
    static void clearFrame(){
        mainFrame.getContentPane().removeAll();
        mainFrame.validate();
        mainFrame.repaint();
    }
}
