package library.management.system;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{

	private JPanel contentPane;

	public static void main(String[] args) {
            new Home().setVisible(true);
	}
        
        public Home() {
	
            setBounds(180,10,1050,750);
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            
            JLabel l1 = new JLabel("WELCOME TO USER MODULE");
            l1.setBackground(Color.BLACK);
            l1.setForeground(Color.CYAN);
            l1.setFont(new Font("Tahoma", Font.BOLD, 34));
            l1.setBounds(268, 30, 701, 80);
            contentPane.add(l1);

            JLabel l2 = new JLabel("");
            l2.setVerticalAlignment(SwingConstants.TOP);
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/second.png"));
            Image i2 = i1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);

            JLabel l3 = new JLabel("");
            ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/third.png"));
            Image i5 = i4.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
            ImageIcon i6 = new ImageIcon(i5);

            JLabel l4 = new JLabel("");
            ImageIcon i7  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/fourth.png"));
            Image i8 = i7.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i9 = new ImageIcon(i8);

            JLabel l5 = new JLabel("");
            ImageIcon i10  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/fifth.png"));
            Image i11 = i10.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i12 = new ImageIcon(i11);

            JLabel l6 = new JLabel("");
            ImageIcon i13  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/sixth.png"));
            Image i14 = i13.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i15 = new ImageIcon(i14);

            JLabel l7 = new JLabel("");
            ImageIcon i16  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/seventh.png"));
            Image i17 = i16.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i18 = new ImageIcon(i17);
            
            getContentPane().setBackground(Color.BLACK);
            contentPane.setBackground(Color.BLACK);
            
            JButton btnNewButton = new JButton("View Books");
            btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
            btnNewButton.setBackground(Color.WHITE);
            btnNewButton.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            		contentPane.setVisible(false);
    				new BookDetails().setVisible(true);
            	}
            });
            btnNewButton.setBounds(137, 191, 280, 70);
            contentPane.add(btnNewButton);
            
            JButton btnNewButton_1 = new JButton("Issue Books");
            btnNewButton_1.setBackground(Color.WHITE);
            btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
            btnNewButton_1.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            		contentPane.setVisible(false);
    				new IssueBook().setVisible(true);
            	}
            });
            btnNewButton_1.setBounds(137, 357, 280, 70);
            contentPane.add(btnNewButton_1);
            
            JButton btnNewButton_2 = new JButton("Return Book");
            btnNewButton_2.setBackground(Color.WHITE);
            btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
            btnNewButton_2.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            		contentPane.setVisible(false);
    				new ReturnBook().setVisible(true);
            	}
            });
            btnNewButton_2.setBounds(586, 191, 280, 70);
            contentPane.add(btnNewButton_2);
            
            JButton btnNewButton_3 = new JButton("Transaction Record");
            btnNewButton_3.setBackground(Color.WHITE);
            btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
            btnNewButton_3.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            		contentPane.setVisible(false);
    				new TransactionRecord().setVisible(true);
            	}
            });
            btnNewButton_3.setBounds(611, 357, 280, 70);
            contentPane.add(btnNewButton_3);
            
            JButton btnNewButton_4 = new JButton("LOG OUT");
            btnNewButton_4.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            		contentPane.setVisible(false);
    				Window1 w1= new Window1();
    				w1.showWindow();
            		
            	}
            });
            btnNewButton_4.setForeground(Color.RED);
            btnNewButton_4.setBackground(Color.WHITE);
            btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 16));
            btnNewButton_4.setBounds(839, 591, 106, 35);
            contentPane.add(btnNewButton_4);
	}
        
        
        public void actionPerformed(ActionEvent ae){
            String msg = ae.getActionCommand();
            if(msg.equals("Logout")){
                setVisible(false);
		new Login_user().setVisible(true);
            }else if(msg.equals("Exit")){
                System.exit(ABORT);
            
            }else if(msg.equals("Read Me")){
            
            }else if(msg.equals("About Us")){
                setVisible(false);
		new aboutUs().setVisible(true);
            
            }else if(msg.equals("Book Details")){
                setVisible(false);
		new BookDetails().setVisible(true);
            }else if(msg.equals("Student Details")){
                setVisible(false);
                new StudentDetails().setVisible(true);
			
            }
            
        }
}