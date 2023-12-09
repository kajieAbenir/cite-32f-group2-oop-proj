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
        // ang panel ang i-null ug set layout kay diri man ka gabutang ug components.
        // by default: naa nay pre-defined na layout kung malimtan ug set.
    }

    //chairman notes:

    /*
    
    - add the component in the panel sulod sa method. that's the purpose nganong nagpasa ka ug panel as an argument
    - separate the font sizing. I added one for headers, one for mini, and one for regular sizes. para inig set ug font, ang kulang nalang is the font name. in this way, uniform ang pag-set sa fonts. this is what i meant gyud sa gc. sensya if i lack details sa explanation (you even texted in capital lmaoooo)
    - notice these three below accepts components as arguments? in order to set texts UNIFORMLY, one must pass the object to the method. ang problema is specific ang gipangayo, so we'll create another one just with that another specific argument. why not set component as a parameter nalang diba?
    
    */

    static void setHeaderFont(Component component, String fontName){
        component.setFont(new Font(fontName, Font.BOLD, 40));
    }

    static void setRegularFont(Component component, String fontName){
        component.setFont(new Font(fontName, Font.PLAIN, 20));
    }

    static void setMiniFont(Component component, String fontName){
        component.setFont(new Font(fontName, Font.PLAIN, 10));
    }

    //--------------

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

    static void clearFrame() {
        mainFrame.getContentPane().removeAll();
        mainFrame.validate();
        mainFrame.repaint();
    }
}




// package oop.project;

// import javax.swing.*;
// import java.awt.*;

// class Components {
//     public static JFrame mainFrame = new JFrame();

//     Components() {
//         addFrame();
//         mainFrame.setVisible(true);
//     }

//     static void addFrame() {
//         mainFrame.setSize(1200, 800);
//         mainFrame.setLocationRelativeTo(null);
//         mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         mainFrame.setLayout(null);
//         mainFrame.setResizable(false);
//     }

//     static void addPanel(JPanel panel, int xAxis, int yAxis, int width, int height, String hexColor) {
//         panel.setBackground(Color.decode(hexColor));
//         panel.setBounds(xAxis, yAxis, width, height);
//     }

//     static void addLabel(JPanel panel, JLabel label, int xAxis, int yAxis, int width, int height) {
//         label.setBounds(xAxis, yAxis, width, height);
//         panel.add(label);
//     }

//     static void addTextField(JPanel panel, JTextField textField, int xAxis, int yAxis, int width, int height) {
//         textField.setBounds(xAxis, yAxis, width, height);
//         panel.add(textField);
//     }

//     static void addButton(JPanel panel, JButton button, int xAxis, int yAxis, int width, int height) {
//         button.setBounds(xAxis, yAxis, width, height);
//         panel.add(button);
//     }

//     static void addTextArea(JPanel panel, JTextArea textArea, int xAxis, int yAxis, int width, int height) {
//         textArea.setBounds(xAxis, yAxis, width, height);
//         panel.add(textArea);
//     }

//     static void clearFrame() {
//         mainFrame.getContentPane().removeAll();
//         mainFrame.validate();
//         mainFrame.repaint();
//     }
// }
