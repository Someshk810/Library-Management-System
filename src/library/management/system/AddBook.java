package library.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class AddBook extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField t1,t2,t3,t4,t5,t6;
    private JButton b1,b2;
    JComboBox comboBox;
    private JLabel lblNewLabel;
    private JTextField t7;
    private JLabel lblNewLabel_1;
        
    public static void main(String[] args) {
	new AddBook().setVisible(true);
    }

    public void random() {
        Random rd = new Random();
	t1.setText("" + rd.nextInt(1000 + 1));
    }

    public AddBook() {
        setBounds(180,10,1050,750);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);

	JLabel l1 = new JLabel("Name");
	l1.setForeground(new Color(47, 79, 79));
	l1.setFont(new Font("Tahoma", Font.BOLD, 16));
	l1.setBounds(301, 188, 90, 22);
	contentPane.add(l1);

	JLabel l2 = new JLabel("ISBN");
	l2.setForeground(new Color(47, 79, 79));
	l2.setFont(new Font("Tahoma", Font.BOLD, 16));
	l2.setBounds(301, 239, 90, 22);
	contentPane.add(l2);

	JLabel l3 = new JLabel("Author");
	l3.setForeground(new Color(47, 79, 79));
	l3.setFont(new Font("Tahoma", Font.BOLD, 16));
	l3.setBounds(301, 290, 90, 22);
	contentPane.add(l3);

	JLabel l4 = new JLabel("Price");
	l4.setForeground(new Color(47, 79, 79));
	l4.setFont(new Font("Tahoma", Font.BOLD, 16));
	l4.setBounds(301, 395, 90, 22);
	contentPane.add(l4);

	JLabel l5 = new JLabel("Pages");
	l5.setForeground(new Color(47, 79, 79));
	l5.setFont(new Font("Tahoma", Font.BOLD, 16));
	l5.setBounds(301, 444, 90, 22);
	contentPane.add(l5);

	JLabel l6 = new JLabel("Book_id");
	l6.setForeground(new Color(47, 79, 79));
	l6.setFont(new Font("Tahoma", Font.BOLD, 16));
	l6.setBounds(301, 142, 90, 22);
	contentPane.add(l6);

	JLabel l7 = new JLabel("Edition");
	l7.setForeground(new Color(47, 79, 79));
	l7.setFont(new Font("Tahoma", Font.BOLD, 16));
	l7.setBounds(301, 340, 90, 22);
	contentPane.add(l7);

	t1 = new JTextField();
	t1.setForeground(new Color(47, 79, 79));
	t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t1.setBounds(497, 139, 250, 30);
	contentPane.add(t1);
	t1.setColumns(10);

	t2 = new JTextField();
	t2.setForeground(new Color(47, 79, 79));
	t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t2.setColumns(10);
	t2.setBounds(497, 185, 250, 30);
	contentPane.add(t2);
	

	t3 = new JTextField();
	t3.setForeground(new Color(47, 79, 79));
	t3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t3.setColumns(10);
	t3.setBounds(497, 236, 250, 30);
	contentPane.add(t3);
	
	t3.addKeyListener(new KeyAdapter() {
 		@Override
 		public void keyPressed(KeyEvent e) {
 			String pNum = t3.getText();
 			int length = pNum.length();
 			
 			
 			char c = e.getKeyChar();
 		if(e.getKeyChar()>='0' && e.getKeyChar()<='9') {
 			
 			if(length<13) {
 				t3.setEditable(true);
 			}
 			else {
 				t3.setEditable(false);
 				
 			}
 		}
 			else {
 				if( e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE ||  e.getExtendedKeyCode()==KeyEvent.VK_DELETE) {
 					t3.setEditable(true);
 					
 				}
 				else {
 					t3.setEditable(false);
 				}
 				
 				
 			}
 		}
 	});
	
	
	t4 = new JTextField();
	t4.setForeground(new Color(47, 79, 79));
	t4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t4.setColumns(10);
	t4.setBounds(497, 287, 250, 30);
	contentPane.add(t4);
	t4.addKeyListener(new KeyAdapter() {
		@Override
		public void keyPressed(KeyEvent e) {
			char c = e.getKeyChar();
			if(Character.isLetter(c)||Character.isSpace(c)||Character.isISOControl(c)) {
				
				
					t4.setEditable(true);
			}
				
				else {
					t4.setEditable(false);
					
				}
		}
	});

        t5 = new JTextField();
	t5.setForeground(new Color(47, 79, 79));
	t5.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t5.setColumns(10);
	t5.setBounds(497, 392, 250, 30);
	contentPane.add(t5);
      
	t5.addKeyListener(new KeyAdapter() {
 		@Override
 		public void keyPressed(KeyEvent e) {
 			
 			
 			char c = e.getKeyChar();
 		if(e.getKeyChar()>='0' && e.getKeyChar()<='9') {
 			t5.setEditable(true);
 			

 		}
 			else {
 				if( e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE ||  e.getExtendedKeyCode()==KeyEvent.VK_DELETE) {
 					t5.setEditable(true);
 					
 				}
 				else {
 					t5.setEditable(false);
 				}
 				
 				
 			}
 		}
 	});
 	
	t6 = new JTextField();
	t6.setForeground(new Color(47, 79, 79));
	t6.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t6.setColumns(10);
	t6.setBounds(497, 441, 250, 30);
	contentPane.add(t6);
	
	t6.addKeyListener(new KeyAdapter() {
 		@Override
 		public void keyPressed(KeyEvent e) {
 			
 			
 			char c = e.getKeyChar();
 		if(e.getKeyChar()>='0' && e.getKeyChar()<='9') {
 			t6.setEditable(true);
 			

 		}
 			else {
 				if( e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE ||  e.getExtendedKeyCode()==KeyEvent.VK_DELETE) {
 					t6.setEditable(true);
 					
 				}
 				else {
 					t6.setEditable(false);
 				}
 				
 				
 			}
 		}
 	});

	comboBox = new JComboBox();
	comboBox.setBackground(Color.WHITE);
	comboBox.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
	comboBox.setBounds(497, 338, 250, 30);
	contentPane.add(comboBox);

        b1 = new JButton("Add");
	b1.addActionListener(this);
	b1.setBorder(new CompoundBorder(new LineBorder(new Color(128, 128, 128)), null));
        b1.setFont(new Font("Tahoma", Font.BOLD, 18));
	b1.setBounds(433, 601, 139, 50);
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
	contentPane.add(b1);

	b2 = new JButton("Back");
	b2.addActionListener(this);
	b2.setBorder(new CompoundBorder(new LineBorder(new Color(105, 105, 105)), null));
	b2.setFont(new Font("Tahoma", Font.BOLD, 14));
	b2.setBounds(877, 607, 108, 40);
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.RED);
	
	contentPane.add(b2);
        contentPane.setBackground(Color.WHITE);
        
        lblNewLabel = new JLabel("Enter Book Details..!!");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 32));
        lblNewLabel.setBounds(345, 45, 355, 35);
        contentPane.add(lblNewLabel);
        
        t7 = new JTextField();
        t7.setBounds(497, 495, 250, 30);
        contentPane.add(t7);
        t7.setColumns(10);
        
        lblNewLabel_1 = new JLabel("No Of Copies");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNewLabel_1.setBounds(283, 503, 108, 22);
        contentPane.add(lblNewLabel_1);
	random();

    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            conn con = new conn();
            if(ae.getSource() == b1){
            	
                String sql = "insert into book(book_id, name, isbn, publisher, edition, price, pages,copies) values(?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement st = con.c.prepareStatement(sql);
                // st.setInt(1, Integer.parseInt(textField.getText()));
		st.setString(1, t1.getText());
		st.setString(2, t2.getText());
		st.setString(3, t3.getText());
		st.setString(4, t4.getText());
		st.setString(5, (String) comboBox.getSelectedItem());
		st.setString(6, t5.getText());
		st.setString(7, t6.getText());
		st.setString(8, t7.getText());
		 
		int rs = st.executeUpdate();
		if (t1.getText().equals("") ||t2.getText().equals("") ||t3.getText().equals("")
    			||t4.getText().equals("")||t5.getText().equals("")||t6.getText().equals("")||t7.getText().equals("")
				) {
			        	
			        	JOptionPane.showMessageDialog(null," Please Fill Complete  Details.!!" );
			        } 
		else if (rs > 0)
                    JOptionPane.showMessageDialog(null, "Successfully Added");
		else {
                    JOptionPane.showMessageDialog(null, "Error");
		}
		 Random rd = new Random();
		t1.setText("" + rd.nextInt(1000 + 1));
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
                t6.setText("");
		st.close();
            }
            if(ae.getSource() == b2){
                this.setVisible(false);
		new AdminModule().setVisible(true);

            }
            con.c.close();
        }catch(Exception e){
            
        }
    }
}