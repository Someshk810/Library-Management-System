package library.management.system;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.sql.*;
public class Window2 {
	private static JTextField textField;
	private static JPasswordField passwordField;

		public static void main(String[] args) {
		showWindow();

	}
	
	public static void showWindow() {
		JFrame frame = new JFrame ("WINDOW 2");
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(180,10,1080,750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.CYAN);
		btnNewButton.setFont(new Font("Kartika", Font.BOLD, 18));
		btnNewButton.setBounds(704, 569, 132, 35);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("USERNAME");
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setFont(new Font("Kartika", Font.BOLD, 22));
		lblNewLabel.setBounds(224, 234, 180, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setForeground(Color.CYAN);
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Kartika", Font.BOLD, 22));
		lblNewLabel_1.setBounds(224, 332, 180, 35);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Kartika", Font.BOLD, 18));
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setForeground(Color.BLACK);
		textField.setBounds(482, 238, 190, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Kartika", Font.BOLD, 18));
		passwordField.setBackground(Color.LIGHT_GRAY);
		passwordField.setForeground(Color.BLACK);
		passwordField.setEchoChar('*');
		passwordField.setBounds(482, 336, 190, 28);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("ADMIN LOGIN");
		lblNewLabel_2.setBackground(Color.BLACK);
		lblNewLabel_2.setForeground(Color.CYAN);
		lblNewLabel_2.setFont(new Font("Kartika", Font.BOLD, 52));
		lblNewLabel_2.setBounds(307, 65, 413, 67);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton Login_Btn = new JButton("LOGIN !");
		Login_Btn.setBackground(Color.WHITE);
		Login_Btn.setFont(new Font("Kartika", Font.BOLD, 18));
		Login_Btn.setBounds(359, 430, 180, 41);
		frame.getContentPane().add(Login_Btn);
		
      Login_Btn.addActionListener(new ActionListener() {
			
    	  @Override
    	    public void actionPerformed(ActionEvent ae) {
    		  
    		  
    	        String userName = textField.getText();
   	        String password = passwordField.getText();
    	        if (userName.trim().equals("admin") && password.trim().equals("12345")) {
    	        	frame.setVisible(false);
    				AdminModule admin= new AdminModule();
    				new AdminModule().setVisible(true);
    	        	JOptionPane.showMessageDialog(frame," Login Succesful!!" );
    	        } 
    	        else {
    	        	JOptionPane.showMessageDialog(frame," Invalid Admin.. ");
    	        }

    	    }
		});

		
      
		
		
		
		
		
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				Window1 w1= new Window1();
				w1.showWindow();
			}
		});
		
		
		frame.setVisible(true);
		
		

	}
}
