package library.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class AddStudent extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField t1,t2,t3;
    private JComboBox comboBox, comboBox_1, comboBox_2, comboBox_3;
    JButton b1;
    private JTextField t4;

    public static void main(String[] args) {
        new AddStudent().setVisible(true);
    }

    public void random() {
        Random rd = new Random();
	t1.setText("" + rd.nextInt(10000 + 1));
    }

    public AddStudent() {
        super("Add Student");
	setBounds(180,10,1050,750);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);

	JLabel l1 = new JLabel("Student_id");
	l1.setForeground(Color.BLACK);
	l1.setFont(new Font("Tahoma", Font.BOLD, 16));
	l1.setBounds(133, 229, 102, 22);
	contentPane.add(l1);

//	JLabel l2 = new JLabel("Name");
//	l2.setForeground(new Color(25, 25, 112));
//	l2.setFont(new Font("Tahoma", Font.BOLD, 14));
//	l2.setBounds(64, 97, 102, 22);
//	contentPane.add(l2);
	JLabel lblNewLabel = new JLabel("Name");
	lblNewLabel.setForeground(Color.BLACK);
	lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
	lblNewLabel.setBounds(133, 285, 102, 22);
	contentPane.add(lblNewLabel);
	
	JLabel lblNewLabel_1 = new JLabel("Mobile");
	lblNewLabel_1.setForeground(Color.BLACK);
	lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
	lblNewLabel_1.setBounds(133, 394, 102, 22);
	contentPane.add(lblNewLabel_1);

	JLabel l3 = new JLabel("Surname");
	l3.setForeground(new Color(25, 25, 112));
	l3.setFont(new Font("Tahoma", Font.BOLD, 16));
	l3.setBounds(133, 337, 102, 22);
	contentPane.add(l3);

	JLabel l4 = new JLabel("Branch");
	l4.setForeground(Color.BLACK);
	l4.setFont(new Font("Tahoma", Font.BOLD, 16));
	l4.setBounds(133, 501, 102, 22);
	contentPane.add(l4);

        JLabel l5 = new JLabel("Year");
	l5.setForeground(Color.BLACK);
	l5.setFont(new Font("Tahoma", Font.BOLD, 16));
	l5.setBounds(133, 550, 102, 22);
	contentPane.add(l5);

	JLabel l6 = new JLabel("Semester");
	l6.setForeground(Color.BLACK);
	l6.setFont(new Font("Tahoma", Font.BOLD, 16));
	l6.setBounds(133, 601, 102, 22);
	contentPane.add(l6);

	t1 = new JTextField();
	t1.setBackground(Color.WHITE);
	t1.setEditable(false);
	t1.setForeground(Color.BLACK);
	t1.setFont(new Font("Tahoma", Font.BOLD, 16));
	t1.setBounds(340, 230, 178, 20);
	contentPane.add(t1);
	t1.setColumns(10);

	t2 = new JTextField();
	t2.setForeground(Color.BLACK);
	t2.setFont(new Font("Tahoma", Font.BOLD, 16));
	t2.setColumns(10);
	t2.setBounds(340, 286, 178, 20);

	t2.setBackground(Color.WHITE);
	contentPane.add(t2);

	
	t2.addKeyListener(new KeyAdapter() {
		@Override
		public void keyPressed(KeyEvent e) {
			char c = e.getKeyChar();
			if(Character.isLetter(c)||Character.isSpace(c)||Character.isISOControl(c)) {
				
				
					t2.setEditable(true);
			}
				
				else {
					t2.setEditable(false);
					
				}
		}
	});
	
	
	
	t3 = new JTextField();
	t3.setBackground(Color.WHITE);
	t3.setForeground(Color.BLACK);
	t3.setFont(new Font("Tahoma", Font.BOLD, 16));
	t3.setColumns(10);
	t3.setBounds(340, 338, 178, 20);
	contentPane.add(t3);
	t3.addKeyListener(new KeyAdapter() {
		@Override
		public void keyPressed(KeyEvent e) {
			char c = e.getKeyChar();
			if(Character.isLetter(c)||Character.isSpace(c)||Character.isISOControl(c)) {
				
				
					t3.setEditable(true);
			}
				
				else {
					t3.setEditable(false);
					
				}
		}
	});
	

	
	

	 t4 = new JTextField();
	 t4.setForeground(Color.BLACK);
     t4.setBounds(342, 395, 176, 20);
     t4.setFont(new Font("Tahoma", Font.BOLD, 16));
  	t4.setBackground(Color.WHITE);
  	
     contentPane.add(t4);
     
     t4.setColumns(10);
	t4.addKeyListener(new KeyAdapter() {
 		@Override
 		public void keyPressed(KeyEvent e) {
 			String pNum = t4.getText();
 			int length = pNum.length();
 			
 			
 			char c = e.getKeyChar();
 		if(e.getKeyChar()>='0' && e.getKeyChar()<='9') {
 			
 			if(length<10) {
 				t4.setEditable(true);
 			}
 			else {
 				t4.setEditable(false);
 				
 			}
 		}
 			else {
 				if( e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE ||  e.getExtendedKeyCode()==KeyEvent.VK_DELETE) {
 					t4.setEditable(true);
 					
 				}
 				else {
 					t4.setEditable(false);
 				}
 				
 				
 			}
 		}
 	});
 	
 	
	comboBox = new JComboBox();
	comboBox.setBackground(Color.WHITE);
	comboBox.setModel(new DefaultComboBoxModel(new String[] { "Mechanical", "CSE", "IT", "Civil", "Automobile", "EEE", "Other" }));
	comboBox.setForeground(Color.BLACK);
	comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
	comboBox.setBounds(342, 502, 176, 20);
	contentPane.add(comboBox);

	comboBox_1 = new JComboBox();
	comboBox_1.setBackground(Color.WHITE);
	comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "First", "Second", "Third", "Four" }));
	comboBox_1.setForeground(Color.BLACK);
	comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 16));
	comboBox_1.setBounds(342, 551, 176, 20);
	contentPane.add(comboBox_1);

	comboBox_2 = new JComboBox();
	comboBox_2.setBackground(Color.WHITE);
	comboBox_2.setModel(
			new DefaultComboBoxModel(new String[] { "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th" }));
	comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 16));
	comboBox_2.setForeground(Color.BLACK);
	comboBox_2.setBounds(342, 602, 170, 20);
	contentPane.add(comboBox_2);

	b1 = new JButton("ADD");
	b1.addActionListener(this);
	b1.setFont(new Font("Tahoma", Font.BOLD, 18));
	b1.setBounds(640, 464, 127, 38);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
	contentPane.add(b1);

	JLabel l7 = new JLabel("Course");
	l7.setForeground(Color.BLACK);
	l7.setFont(new Font("Tahoma", Font.BOLD, 16));
	l7.setBounds(133, 449, 102, 22);
	contentPane.add(l7);

	comboBox_3 = new JComboBox();
	comboBox_3.setBackground(Color.WHITE);
	comboBox_3.setModel(new DefaultComboBoxModel(
			new String[] { "B.E", "B.Tech", "M.Tech", "MBA", "BBA", "BCA", "B.Sc", "M.Sc", "B.Com", "M.Com" }));
	comboBox_3.setForeground(Color.BLACK);
	comboBox_3.setFont(new Font("Tahoma", Font.BOLD, 16));
	comboBox_3.setBounds(342, 450, 176, 20);
	contentPane.add(comboBox_3);
        
        contentPane.setBackground(Color.WHITE);
        
        JButton btnNewButton = new JButton("BACK");
        btnNewButton.setForeground(Color.RED);
        btnNewButton.setBackground(Color.BLACK);
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		
        		contentPane.setVisible(false);
				new AdminModule().setVisible(true);
        	}
        });
        btnNewButton.setBounds(912, 631, 85, 31);
        contentPane.add(btnNewButton);
        
        JLabel lblNewLabel_2 = new JLabel("ENTER STUDENT DEATILS..");
        lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD, 25));
        lblNewLabel_2.setBounds(358, 75, 341, 67);
        contentPane.add(lblNewLabel_2);
        
       
	random();
    }
    
    
    
    
    public void actionPerformed(ActionEvent ae){
        try{
        	String pNum = t4.getText();
			int length = pNum.length();
			if(length<10) { 
				if (t2.getText().equals("") ||t3.getText().equals("") ||t4.getText().equals("")   ) {
		        	
		        	JOptionPane.showMessageDialog(null," Please Enter Complete Details.!!" );
		        } 
				

				
				
				else {
				JOptionPane.showMessageDialog(null," Please Enter Valid Mobile Number!!" );
			}
			}
			
			else if (t2.getText().equals("") ||t3.getText().equals("") ||t4.getText().equals("")  ) {
	        	
	        	JOptionPane.showMessageDialog(null," Please Enter Complete Details.!!" );
	        } 
else if(ae.getSource() == b1){
                try{
                conn con = new conn();
                String sql = "insert into student(student_id, name, surname,s_mobile, course, branch, year, semester) values(?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, t1.getText());
		st.setString(2, t2.getText());
		st.setString(3, t3.getText());
		st.setString(4, t4.getText());
		st.setString(5, (String) comboBox_3.getSelectedItem());
		st.setString(6, (String) comboBox.getSelectedItem());
		st.setString(7, (String) comboBox_1.getSelectedItem());
		st.setString(8, (String) comboBox_2.getSelectedItem());

		int i = st.executeUpdate();
		if (t1.getText().equals("") ||t2.getText().equals("") ||t3.getText().equals("")
    			||t4.getText().equals("")) {
			        	
			        	JOptionPane.showMessageDialog(null," Please Fill Complete  Details.!!" );
			        } 
		else if (i > 0){
                    JOptionPane.showMessageDialog(null, "Successfully Added");
//                    this.setVisible(false);
//                    new AdminModule().setVisible(true);
                }
		else
                    JOptionPane.showMessageDialog(null, "error");
		Random rd = new Random();
		        t1.setText("" + rd.nextInt(1000 + 1));
                t2.setText("");
                t3.setText("");
                t4.setText("");
                
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            
//            if(ae.getSource() == b2){
//                this.setVisible(false);
//		new AdminModule().setVisible(true);		
//            }
        }catch(Exception e){
            
        }
    }
}