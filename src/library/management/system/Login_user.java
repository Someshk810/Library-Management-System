package library.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login_user extends JFrame implements ActionListener{

	private JPanel panel;
	private JTextField textField;
	private JPasswordField passwordField;
        private JButton b1,b2,b3;


	public Login_user() {
            
	setBackground(new Color(169, 169, 169));	
	setBounds(180,10,1050,750);
	
		
        panel = new JPanel();
	panel.setBackground(Color.BLACK);
	setContentPane(panel);
	panel.setLayout(null);

	JLabel l1 = new JLabel("USERNAME");
	l1.setFont(new Font("Tahoma", Font.BOLD, 20));
	l1.setForeground(Color.CYAN);
	l1.setBounds(201, 183, 157, 24);
	panel.add(l1);

	JLabel l2 = new JLabel("PASSWORD");
	l2.setForeground(Color.CYAN);
	l2.setFont(new Font("Tahoma", Font.BOLD, 20));
	l2.setBounds(201, 282, 137, 24);
	panel.add(l2);

	textField = new JTextField();
	textField.setBounds(458, 183, 207, 34);
	panel.add(textField);
	
	passwordField = new JPasswordField();
	passwordField.setBounds(458, 282, 207, 34);
	panel.add(passwordField);

	JLabel l3 = new JLabel("");
	l3.setBounds(377, 79, 46, 34);
	panel.add(l3);

	JLabel l4 = new JLabel("");
	l4.setBounds(377, 124, 46, 34);
	panel.add(l3);

	b1 = new JButton("LOGIN ");
	b1.setFont(new Font("Tahoma", Font.BOLD, 16));
	b1.addActionListener(this);
                
	b1.setForeground(Color.BLACK);
	b1.setBackground(Color.WHITE);
	b1.setBounds(278, 380, 125, 31);
	panel.add(b1);
		
        b2 = new JButton("SIGNUP ");
        b2.setFont(new Font("Tahoma", Font.BOLD, 16));
	b2.addActionListener(this);
	
	b2.setForeground(Color.BLACK);
	b2.setBackground(Color.WHITE);
	b2.setBounds(514, 376, 113, 39);
	panel.add(b2);

	b3 = new JButton("Forgot Password");
	b3.setFont(new Font("Tahoma", Font.BOLD, 16));
	b3.addActionListener(this);
	
        b3.setForeground(new Color(205, 92, 92));
	b3.setBackground(new Color(253, 245, 230));
	b3.setBounds(386, 538, 179, 39);
	panel.add(b3);

	JLabel l5 = new JLabel("Trouble in Login?");
	l5.setFont(new Font("Tahoma", Font.PLAIN, 18));
	l5.setForeground(new Color(255, 0, 0));
	l5.setBounds(401, 482, 179, 20);
	panel.add(l5);
	
	JLabel lblNewLabel = new JLabel("USER LOGIN");
	lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
	lblNewLabel.setForeground(Color.CYAN);
	lblNewLabel.setBackground(Color.BLACK);
	lblNewLabel.setBounds(386, 46, 278, 44);
	panel.add(lblNewLabel);
	
	JButton btnNewButton = new JButton("BACK");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			panel.setVisible(false);
				Window1 w1= new Window1();
				w1.showWindow();
		}
	});
	btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
	btnNewButton.setBackground(Color.WHITE);
	btnNewButton.setBounds(834, 626, 125, 39);
	panel.add(btnNewButton);
	}
        
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == b1){
                Boolean status = false;
		try {
                    conn con = new conn();
                    String sql = "select * from account where username=? and password=?";
                    PreparedStatement st = con.c.prepareStatement(sql);

                    st.setString(1, textField.getText());
                    st.setString(2, passwordField.getText());

                    ResultSet rs = st.executeQuery();
                    if (rs.next()) {
                        this.setVisible(false);
                        new Loading().setVisible(true);
                    } else
			JOptionPane.showMessageDialog(null, "Invalid Login...!.");
                       
		} catch (Exception e2) {
                    e2.printStackTrace();
		}
            }
            if(ae.getSource() == b2){
                setVisible(false);
		Signup su = new Signup();
		su.setVisible(true);
            }   
            if(ae.getSource() == b3){
                setVisible(false);
		Forgot forgot = new Forgot();
		forgot.setVisible(true);
            }
        }
        
  	public static void main(String[] args) {
                new Login_user().setVisible(true);
	}
}





//import java.awt.Color;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPasswordField;
//import javax.swing.JTextField;
//
//public class Login_user {
//
//	private static JTextField textField;
//	private static JPasswordField passwordField;
//	public static void main(String[] args) {
//		showWindow();
//		// TODO Auto-generated method stub
//
//	}
//
//	public static void showWindow() {
//		JFrame frame = new JFrame ("WINDOW 3");
//		frame.getContentPane().setBackground(Color.BLACK);
//		frame.setBounds(180,10,1021,700);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().setLayout(null);
//		
//		
//		JButton btnNewButton = new JButton("BACK");
//		btnNewButton.setFont(new Font("Kartika", Font.BOLD, 18));
//		btnNewButton.setForeground(Color.CYAN);
//		btnNewButton.setBackground(Color.BLACK);
//		btnNewButton.setBounds(674, 591, 132, 35);
//		frame.getContentPane().add(btnNewButton);
//		
//		
//		JLabel lblNewLabel = new JLabel("USERNAME");
//		lblNewLabel.setForeground(Color.CYAN);
//		lblNewLabel.setBackground(Color.BLACK);
//		lblNewLabel.setFont(new Font("Kartika", Font.BOLD, 22));
//		lblNewLabel.setBounds(246, 202, 180, 35);
//		frame.getContentPane().add(lblNewLabel);
//		
//		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
//		lblNewLabel_1.setForeground(Color.CYAN);
//		lblNewLabel_1.setBackground(Color.BLACK);
//		lblNewLabel_1.setFont(new Font("Kartika", Font.BOLD, 22));
//		lblNewLabel_1.setBounds(246, 291, 180, 35);
//		frame.getContentPane().add(lblNewLabel_1);
//		
//		textField = new JTextField();
//		textField.setBackground(Color.LIGHT_GRAY);
//		textField.setForeground(Color.CYAN);
//		textField.setBounds(529, 207, 190, 28);
//		frame.getContentPane().add(textField);
//		textField.setColumns(10);
//		
//		passwordField = new JPasswordField();
//		passwordField.setBackground(Color.LIGHT_GRAY);
//		passwordField.setForeground(Color.CYAN);
//		passwordField.setEchoChar('*');
//		passwordField.setBounds(529, 296, 190, 28);
//		frame.getContentPane().add(passwordField);
//		
//		JLabel lblNewLabel_2 = new JLabel("USER LOGIN");
//		lblNewLabel_2.setBackground(Color.BLACK);
//		lblNewLabel_2.setForeground(Color.CYAN);
//		lblNewLabel_2.setFont(new Font("Kartika", Font.BOLD, 52));
//		lblNewLabel_2.setBounds(326, 52, 413, 67);
//		frame.getContentPane().add(lblNewLabel_2);
//		
//		JLabel lblNewLabel_3 = new JLabel("Don't have account ?");
//		lblNewLabel_3.setForeground(Color.WHITE);
//		lblNewLabel_3.setBackground(Color.BLACK);
//		lblNewLabel_3.setFont(new Font("Kartika", Font.BOLD, 20));
//		lblNewLabel_3.setBounds(347, 441, 210, 24);
//		frame.getContentPane().add(lblNewLabel_3);
//		
//		JButton btnNewButton_1 = new JButton("Create New !");
//		btnNewButton_1.setForeground(Color.BLACK);
//		btnNewButton_1.setBackground(Color.WHITE);
//		
//		btnNewButton_1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				frame.setVisible(false);
//				NewUser createNew= new NewUser();
//				createNew.showWindow();
//			}
//		});
//		btnNewButton_1.setFont(new Font("Kartika", Font.BOLD, 16));
//		btnNewButton_1.setBounds(387, 476, 140, 31);
//		frame.getContentPane().add(btnNewButton_1);
//		
//		JButton btnNewButton_1_1 = new JButton("LOGIN");
//		
//		btnNewButton_1_1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent ae){
//				if(ae.getSource() == b1){
//			}
//
//				Boolean status = false;
//			try {
//                    conn con = new conn();
//                    String sql = "select * from account where username=? and password=?";
//	                    PreparedStatement st = con.c.prepareStatement(sql);
//                    st.setString(1, textField.getText());
//	                    st.setString(2, passwordField.getText());
//	
//	                    ResultSet rs = st.executeQuery();
//	                    if (rs.next()) {
//                        this.setVisible(false);
//	                        new Loading().setVisible(true);
//	                    } else
//				JOptionPane.showMessageDialog(null, "Invalid Login...!.");
//	                       
//			} catch (Exception e2) {
//	                    e2.printStackTrace();
//			}
//			  }
//			
//		 
//      if(ae.getSource() == b2){
//          setVisible(false);
//	Signup su = new Signup();
//su.setVisible(true);
//      }         if(ae.getSource() == b3){
//          setVisible(false);
//	Forgot forgot = new Forgot();
//	forgot.setVisible(true);
//      }
//		
// 
//      
//      
//		btnNewButton_1_1.setForeground(Color.BLACK);
//		btnNewButton_1_1.setFont(new Font("Kartika", Font.BOLD, 16));
//		btnNewButton_1_1.setBackground(Color.WHITE);
//		btnNewButton_1_1.setBounds(402, 356, 125, 31);
//		frame.getContentPane().add(btnNewButton_1_1);
//		
//		btnNewButton.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				frame.setVisible(false);
//				Window1 w1= new Window1();
//				w1.showWindow();
//			}
//		});
//		
//		
//		frame.setVisible(true);
//		
//		
//
//	}
//}
