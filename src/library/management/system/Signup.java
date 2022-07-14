/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.border.*;

public class Signup extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JButton b1;
    private JComboBox comboBox;


    public static void main(String[] args) {
        new Signup().setVisible(true);
    }

    public Signup() {
        setBounds(180,10,1050,750);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
	contentPane.setLayout(null);

	JLabel lblUsername = new JLabel("Username :");
	lblUsername.setForeground(Color.DARK_GRAY);
	lblUsername.setFont(new Font("Tahoma", Font.BOLD, 16));
	lblUsername.setBounds(220, 163, 180, 26);
	contentPane.add(lblUsername);

	JLabel lblName = new JLabel("Name :");
	lblName.setForeground(Color.DARK_GRAY);
	lblName.setFont(new Font("Tahoma", Font.BOLD, 16));
	lblName.setBounds(220, 215, 180, 26);
	contentPane.add(lblName);

	JLabel lblPassword = new JLabel("Password :");
	lblPassword.setForeground(Color.DARK_GRAY);
	lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
	lblPassword.setBounds(220, 281, 92, 26);
	contentPane.add(lblPassword);

	JLabel lblAnswer = new JLabel("Answer :");
	lblAnswer.setForeground(Color.DARK_GRAY);
	lblAnswer.setFont(new Font("Tahoma", Font.BOLD, 16));
	lblAnswer.setBounds(220, 394, 92, 26);
	contentPane.add(lblAnswer);

	comboBox = new JComboBox();
	comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
	comboBox.setModel(new DefaultComboBoxModel(new String[] { "Your NickName?", "Your Lucky Number?",
			"Your child SuperHero?", "Your childhood Name ?" }));
	comboBox.setBounds(548, 344, 200, 26);
	contentPane.add(comboBox);

	JLabel lblSecurityQuestion = new JLabel("Security Question :");
	lblSecurityQuestion.setForeground(Color.DARK_GRAY);
	lblSecurityQuestion.setFont(new Font("Tahoma", Font.BOLD, 16));
	lblSecurityQuestion.setBounds(221, 344, 154, 26);
	contentPane.add(lblSecurityQuestion);

        textField = new JTextField();
	textField.setBounds(548, 163, 200, 26);
	contentPane.add(textField);
	textField.setColumns(10);

	textField_1 = new JTextField();
	textField_1.setColumns(10);
	textField_1.setBounds(548, 218, 200, 26);
	contentPane.add(textField_1);
	
	textField_1.addKeyListener(new KeyAdapter() {
		@Override
		public void keyPressed(KeyEvent e) {
			char c = e.getKeyChar();
			if(Character.isLetter(c)||Character.isSpace(c)||Character.isISOControl(c)) {
				
				
				textField_1.setEditable(true);
			}
				
				else {
					textField_1.setEditable(false);
					
				}
		}
	});
	
	

        textField_2 = new JTextField();
	textField_2.setColumns(10);
	textField_2.setBounds(548, 281, 200, 26);
	contentPane.add(textField_2);

	textField_3 = new JTextField();
	textField_3.setColumns(10);
	textField_3.setBounds(548, 397, 200, 26);
	contentPane.add(textField_3);

	b1 = new JButton("Create");
	b1.addActionListener(this);
	b1.setFont(new Font("Tahoma", Font.BOLD, 16));
	b1.setBounds(299, 481, 100, 30);
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
	contentPane.add(b1);
	
	JLabel lblNewLabel = new JLabel("SIGN UP..!!");
	lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 34));
	lblNewLabel.setBounds(429, 63, 267, 30);
	contentPane.add(lblNewLabel);
	
	JButton b2 = new JButton("Back");
	b2.setBackground(Color.WHITE);
	b2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			contentPane.setVisible(false);
				new Login_user().setVisible(true);
		}
	});
	b2.setFont(new Font("Tahoma", Font.BOLD, 16));
	b2.setBounds(586, 481, 100, 30);
	contentPane.add(b2);
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            conn con = new conn();
if (textField.getText().equals("") ||textField_1.getText().equals("") ||textField_2.getText().equals("")||textField_3.getText().equals("")  ) {
	        	
	        	JOptionPane.showMessageDialog(null," Please Enter Complete Details.!!" );
	        } 
else  if(ae.getSource() == b1){
                String sql = "insert into account(username, name, password, sec_q, sec_ans) values(?, ?, ?, ?, ?)";
		PreparedStatement st = con.c.prepareStatement(sql);

		st.setString(1, textField.getText());
                st.setString(2, textField_1.getText());
		st.setString(3, textField_2.getText());
		st.setString(4, (String) comboBox.getSelectedItem());
		st.setString(5, textField_3.getText());
//		if(ae.getSource() == b2){
//            this.setVisible(false);
//	new Login_user().setVisible(true);
//		
//        }

		int i = st.executeUpdate();
		if (i > 0){
                    JOptionPane.showMessageDialog(null, "successfully Created");
                }

                textField.setText("");
                textField_1.setText("");
		textField_2.setText("");
		textField_3.setText("");
            }
//            if(ae.getSource() == b2){
//                this.setVisible(false);
//		new Login_user().setVisible(true);
//			
//            }
        }catch(Exception e){
            
        }
    }
}