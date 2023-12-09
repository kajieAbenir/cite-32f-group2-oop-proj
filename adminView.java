package oop.project;

import java.awt.*;
import javax.swing.*;
import oop.project.components.*;




public class adminView implements ActionListener{

	public static void addButton(JFrame frame, JButton button, int x, int y, int width, int height, String fontStyle, int fontSize){
		button.setBounds(x,y,width,height);
		button.setFont(new Font(fontStyle, Font.BOLD, fontSize));
		button.addActionListener(this);
		frame.addButton(button);

	}

	public static void addLabel(JLabel label, JFrame frame, int x, int y, int width, int height, String fontStyle, int fontSize){
		label.setBounds(x,y,width,height);
		label.setFont(new Font(fontStyle, Font.BOLD, fontSize));
		frame.add(label);
	}

	public static void addTextField(JTextField textField, JFrame frame, int x, int y, int width, int height, String fontStyle, int fontSize){
		textField.setBounds(x,y,width,height);
		textField.setFont(new Font(fontStyle, Font.BOLD, fontSize));
		frame.add(textField);
	}

	public static void addPasswordField(JPasswordField passwordField, JFrame frame, int x, int y, int width, int height, String fontStyle, int fontSize){
		passwordField.setBounds(x,y,width,height);
		passwordField.setFont(new Font(fontStyle, Font.BOLD, fontSize));
		frame.add(passwordField);

	}
	public static void clearFrame(JFrame frame){
		 frame.getContentPane().removeAll();
		 frame.repaint();
		 frame.revalidate();


	}
}

