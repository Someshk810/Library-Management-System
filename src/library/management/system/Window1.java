package library.management.system;


import javax.swing.JFrame;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JToolBar;
import javax.swing.JInternalFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import java.sql.*;

public class Window1 {
	public static void main(String[]args) {
		showWindow();

}
	public static void showWindow() {
		JFrame frame = new JFrame ("WINDOW 1");
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(180,10,1050,750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
        
		//BUTTON 1//
		JButton btnNewButton_1 = new JButton("ADMIN LOGIN");
  		btnNewButton_1.setForeground(Color.BLACK);
  		btnNewButton_1.setFont(new Font("Kartika", Font.BOLD, 32));
  		btnNewButton_1.setBackground(Color.WHITE);
  		btnNewButton_1.setBounds(317, 256, 295, 39);
  		frame.getContentPane().add(btnNewButton_1);
  		
  		 btnNewButton_1.addActionListener(new ActionListener() {
 			
 			@Override
 			public void actionPerformed(ActionEvent arg0) {
 				frame.setVisible(false);
 				Window2 w2= new Window2();
 				w2.showWindow();
 			}
 		});
        
      //BUTTON 2//
      		JButton btnNewButton = new JButton("USER LOGIN");
      		btnNewButton.setForeground(Color.BLACK);
      		btnNewButton.setFont(new Font("Kartika", Font.BOLD, 32));
      		btnNewButton.setBackground(Color.WHITE);
      		btnNewButton.setBounds(317, 399, 295, 39);
      		frame.getContentPane().add(btnNewButton);
      		
            btnNewButton.addActionListener(new ActionListener() {
      			
      			@Override
      			public void actionPerformed(ActionEvent arg0) {
      				frame.setVisible(false);
      				new Login_user().setVisible(true);
      				
      			}
      		});
      		
      		JLabel lblNewLabel = new JLabel("LIBRARY MANAGEMENT SYSTEM");
      		lblNewLabel.setForeground(Color.CYAN);
      		lblNewLabel.setBackground(Color.BLACK);
      		lblNewLabel.setFont(new Font("Kartika", Font.BOLD, 42));
      		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
      		lblNewLabel.setBounds(115, 82, 722, 87);
      		frame.getContentPane().add(lblNewLabel);
      		
      		
      		
      		
      		
      		
      		
      		
		
		
		
		
		
		
		
		frame.setVisible(true);
	}
}