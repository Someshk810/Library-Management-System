package library.management.system;

import java.awt.Color;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import com.toedter.calendar.JDateChooser;

public class IssueBook extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;
    private JButton b1,b2,b3,b4;
    private JTextField textField;
    private JLabel lblNewLabel;
    int copi;
    int i;

    public static void main(String[] args) {
	new IssueBook().setVisible(true);
			
    }
   
    public IssueBook() {
    	
        setBounds(180,10,1050,750);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
	contentPane.setLayout(null);

	JLabel l1 = new JLabel("Book_id");
	l1.setFont(new Font("Tahoma", Font.BOLD, 14));
	l1.setForeground(new Color(47, 79, 79));
	l1.setBounds(47, 63, 100, 23);
	contentPane.add(l1);

	JLabel l2 = new JLabel("Name");
	l2.setForeground(new Color(47, 79, 79));
	l2.setFont(new Font("Tahoma", Font.BOLD, 14));
	l2.setBounds(47, 97, 100, 23);
	contentPane.add(l2);

	JLabel l3 = new JLabel("ISBN");
	l3.setForeground(new Color(47, 79, 79));
	l3.setFont(new Font("Tahoma", Font.BOLD, 14));
	l3.setBounds(47, 131, 100, 23);
	contentPane.add(l3);

	JLabel l4 = new JLabel("Publisher");
	l4.setForeground(new Color(47, 79, 79));
	l4.setFont(new Font("Tahoma", Font.BOLD, 14));
	l4.setBounds(47, 165, 100, 23);
	contentPane.add(l4);

	JLabel l5 = new JLabel("Edition");
	l5.setForeground(new Color(47, 79, 79));
	l5.setFont(new Font("Tahoma", Font.BOLD, 14));
	l5.setBounds(47, 199, 100, 23);
	contentPane.add(l5);

	JLabel l6 = new JLabel("Price");
	l6.setForeground(new Color(47, 79, 79));
	l6.setFont(new Font("Tahoma", Font.BOLD, 14));
	l6.setBounds(47, 233, 100, 23);
	contentPane.add(l6);

	JLabel l7 = new JLabel("Pages");
	l7.setForeground(new Color(47, 79, 79));
	l7.setFont(new Font("Tahoma", Font.BOLD, 14));
	l7.setBounds(47, 267, 100, 23);
	contentPane.add(l7);

	t1 = new JTextField();
	t1.setBackground(Color.WHITE);
	t1.setForeground(new Color(47, 79, 79));
	t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t1.setBounds(126, 66, 86, 20);
	contentPane.add(t1);
	
	b1 = new JButton("Search");
	b1.addActionListener(this);
	b1.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
	b1.setFont(new Font("Tahoma", Font.BOLD, 14));
	b1.setBounds(234, 59, 100, 30);
        
	contentPane.add(b1);

	t2 = new JTextField();
	t2.setBackground(Color.WHITE);
	t2.setEditable(false);
	t2.setForeground(new Color(47, 79, 79));
	t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t2.setBounds(126, 100, 208, 20);
	contentPane.add(t2);
	t2.setColumns(10);

	t3 = new JTextField();
	t3.setBackground(Color.WHITE);
	t3.setEditable(false);
	t3.setForeground(new Color(47, 79, 79));
	t3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t3.setColumns(10);
	t3.setBounds(126, 131, 208, 20);
	contentPane.add(t3);

	t4 = new JTextField();
	t4.setBackground(Color.WHITE);
	t4.setEditable(false);
	t4.setForeground(new Color(47, 79, 79));
	t4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t4.setColumns(10);
	t4.setBounds(126, 168, 208, 20);
	contentPane.add(t4);

	t5 = new JTextField();
	t5.setBackground(Color.WHITE);
	t5.setEditable(false);
	t5.setForeground(new Color(47, 79, 79));
	t5.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t5.setColumns(10);
	t5.setBounds(126, 202, 208, 20);
	contentPane.add(t5);

	t6 = new JTextField();
	t6.setBackground(Color.WHITE);
	t6.setEditable(false);
	t6.setForeground(new Color(47, 79, 79));
	t6.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t6.setColumns(10);
	t6.setBounds(126, 236, 208, 20);
	contentPane.add(t6);

	t7 = new JTextField();
	t7.setBackground(Color.WHITE);
	t7.setEditable(false);
	t7.setForeground(new Color(47, 79, 79));
	t7.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t7.setColumns(10);
	t7.setBounds(126, 270, 208, 20);
	contentPane.add(t7);

	JPanel panel = new JPanel();
	panel.setBorder(new TitledBorder(new LineBorder(new Color(47, 79, 79), 2, true), "Book-Details", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(34, 139, 34)));
	panel.setFont(new Font("Tahoma", Font.BOLD, 14));
	panel.setBounds(10, 38, 345, 288);
        panel.setBackground(Color.WHITE);
	contentPane.add(panel);

	JLabel l8 = new JLabel("Student_id");
	l8.setForeground(new Color(47, 79, 79));
	l8.setFont(new Font("Tahoma", Font.BOLD, 14));
	l8.setBounds(524, 207, 100, 23);
	contentPane.add(l8);

	JLabel l9 = new JLabel("Name");
	l9.setForeground(new Color(47, 79, 79));
	l9.setFont(new Font("Tahoma", Font.BOLD, 14));
	l9.setBounds(524, 247, 100, 23);
	contentPane.add(l9);

	JLabel l10 = new JLabel("Surname");
	l10.setForeground(new Color(47, 79, 79));
	l10.setFont(new Font("Tahoma", Font.BOLD, 14));
	l10.setBounds(524, 291, 100, 23);
	contentPane.add(l10);

	JLabel l11 = new JLabel("Course");
	l11.setForeground(new Color(47, 79, 79));
	l11.setFont(new Font("Tahoma", Font.BOLD, 14));
	l11.setBounds(524, 331, 100, 23);
	contentPane.add(l11);

	JLabel l12 = new JLabel("Branch");
	l12.setForeground(new Color(47, 79, 79));
	l12.setFont(new Font("Tahoma", Font.BOLD, 14));
	l12.setBounds(524, 377, 100, 23);
	contentPane.add(l12);

	JLabel l13 = new JLabel("Year");
	l13.setForeground(new Color(47, 79, 79));
	l13.setFont(new Font("Tahoma", Font.BOLD, 14));
	l13.setBounds(524, 430, 100, 23);
	contentPane.add(l13);

	JLabel l14 = new JLabel("Semester");
	l14.setForeground(new Color(47, 79, 79));
	l14.setFont(new Font("Tahoma", Font.BOLD, 14));
	l14.setBounds(524, 476, 100, 23);
	contentPane.add(l14);

	t8 = new JTextField();
	t8.setForeground(new Color(47, 79, 79));
	t8.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t8.setColumns(10);
	t8.setBounds(648, 207, 86, 20);
	contentPane.add(t8);

	b2 = new JButton("Search");
	b2.addActionListener(this);
	b2.setFont(new Font("Tahoma", Font.BOLD, 14));
	b2.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
	b2.setBounds(750, 203, 100, 30);
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
	contentPane.add(b2);

	t9 = new JTextField();
	t9.setBackground(Color.WHITE);
	t9.setForeground(new Color(47, 79, 79));
	t9.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t9.setEditable(false);
	t9.setColumns(10);
	t9.setBounds(648, 250, 208, 20);
	contentPane.add(t9);

	t10 = new JTextField();
	t10.setBackground(Color.WHITE);
	t10.setForeground(new Color(47, 79, 79));
	t10.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t10.setEditable(false);
	t10.setColumns(10);
	t10.setBounds(648, 290, 208, 20);
	contentPane.add(t10);

	t11 = new JTextField();
	t11.setBackground(Color.WHITE);
	t11.setForeground(new Color(47, 79, 79));
	t11.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t11.setEditable(false);
	t11.setColumns(10);
	t11.setBounds(648, 334, 208, 20);
	contentPane.add(t11);

	t12 = new JTextField();
	t12.setBackground(Color.WHITE);
	t12.setForeground(new Color(47, 79, 79));
	t12.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t12.setEditable(false);
	t12.setColumns(10);
	t12.setBounds(648, 380, 208, 20);
	contentPane.add(t12);

	t13 = new JTextField();
	t13.setBackground(Color.WHITE);
	t13.setForeground(new Color(47, 79, 79));
	t13.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t13.setEditable(false);
	t13.setColumns(10);
	t13.setBounds(648, 430, 208, 20);
	contentPane.add(t13);

	t14 = new JTextField();
	t14.setBackground(Color.WHITE);
	t14.setForeground(new Color(47, 79, 79));
	t14.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t14.setEditable(false);
	t14.setColumns(10);
	t14.setBounds(648, 476, 208, 20);
	contentPane.add(t14);

	JPanel panel_1 = new JPanel();
	panel_1.setBorder(new TitledBorder(new LineBorder(new Color(70, 130, 180), 2, true), "Student-Details", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(100, 149, 237)));
	panel_1.setForeground(new Color(0, 100, 0));
	panel_1.setBounds(500, 150, 378, 372);
        panel_1.setBackground(Color.WHITE);
	contentPane.add(panel_1);
        
	JLabel l15 = new JLabel(" Date of Issue :");
	l15.setForeground(new Color(105, 105, 105));
	l15.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	l15.setBounds(20, 340, 118, 26);
	contentPane.add(l15);

	b3 = new JButton("Issue");
	b3.addActionListener(this);
	b3.setFont(new Font("Tahoma", Font.BOLD, 14));
	b3.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
	b3.setBounds(177, 516, 188, 56);
	b3.setBackground(Color.LIGHT_GRAY);
        b3.setForeground(Color.BLACK);
        contentPane.add(b3);

	b4 = new JButton("Back");
	b4.addActionListener(this);
	b4.setFont(new Font("Tahoma", Font.BOLD, 14));
	b4.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
	b4.setBounds(877, 641, 100, 33);
	b4.setBackground(Color.LIGHT_GRAY);
        b4.setForeground(Color.BLACK);
        contentPane.add(b4);
        
        textField = new JTextField();
        textField.setBackground(Color.WHITE);
        textField.setBounds(148, 340, 150, 26);
        contentPane.add(textField);
        textField.setColumns(10);
        
        lblNewLabel = new JLabel("Issue Book..!!");
        lblNewLabel.setForeground(Color.RED);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 38));
        lblNewLabel.setBounds(411, 38, 402, 48);
        contentPane.add(lblNewLabel);
    }
    
    public void actionPerformed(ActionEvent ae){
        try{

            conn con = new conn();
            if(ae.getSource() == b1){
                String sql = "select * from book where book_id = ?";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, t1.getText());
		ResultSet rs = st.executeQuery();
//		 final String copy() {
//		    	IssueBook i=new IssueBook();
		       
		       
				
//		    	
//		    }
//
//		copy();
//		  System.out.println("hello"+ rs.getString("copies"));
		
                while (rs.next()) {
                    t2.setText(rs.getString("name"));
                    t3.setText(rs.getString("isbn"));
                    t4.setText(rs.getString("publisher"));
                    t5.setText(rs.getString("edition"));
                    t6.setText(rs.getString("price"));
                    t7.setText(rs.getString("pages"));
		}
		st.close();
		rs.close();
		
            }
            if(ae.getSource() == b2){
                String sql = "select * from student where student_id = ?";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, t8.getText());
		ResultSet rs = st.executeQuery();
		
                while (rs.next()) {
                    t9.setText(rs.getString("name"));
                    t10.setText(rs.getString("surname"));
                    t11.setText(rs.getString("course"));
                    t12.setText(rs.getString("branch"));
                    t13.setText(rs.getString("year"));
                    t14.setText(rs.getString("semester"));
		}
		st.close();
		rs.close();

            }
            
            
            
            
            if(ae.getSource() == b3){
            	
        		
            try {
            	
            	
            	if(t1.getText().equals("") ||t2.getText().equals("") ||t3.getText().equals("")||t4.getText().equals("")||t5.getText().equals("")||t6.getText().equals("")||t7.getText().equals("")
        				||t8.getText().equals("")||t9.getText().equals("")||t10.getText().equals("")||t11.getText().equals("")
        				||t12.getText().equals("")||t13.getText().equals("")||t14.getText().equals("")||textField.getText().equals(""))
            	{
        			        	
        			        	JOptionPane.showMessageDialog(null," Invalid Details.!!" );
        			        } 
            	else  {
            	String sql1 = "select copies from book where book_id = ?";
           		PreparedStatement st1 = con.c.prepareStatement(sql1);
           		st1.setString(1, t1.getText());
           		ResultSet rs1 = st1.executeQuery();
           		while (rs1.next()) {
            	 copi= rs1.getInt("copies");}
            	if (copi<=0) {
            		             JOptionPane.showMessageDialog(null, " Out Of Stock..!");            		
            	             }
            	
            	else 
            		  {
            		
            		
            		st1.close();
            		rs1.close();
            		
      try {
                String sql = "insert into issuebook(book_id, student_id, bname, sname, course, branch, dateOfIssue) values(?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, t1.getText());
		st.setString(2, t8.getText());
		st.setString(3, t2.getText());
		st.setString(4, t9.getText());
		st.setString(5, t11.getText());
		st.setString(6, t12.getText());
		st.setString(7,  textField.getText());
        int i = st.executeUpdate();
            }
            		
            		   catch(Exception e)
                    {
            			   JOptionPane.showMessageDialog(null, "Book Already Issued..!");
                                }
            		
		
		

		 if (i > 0)
		      {
                    JOptionPane.showMessageDialog(null, "Successfully Book Issued..!");
                    try {
                    
                    String sql2 = "update book set copies = copies - 1 where book_id= ?";
               		PreparedStatement st2 = con.c.prepareStatement(sql2);
               		st2.setString(1, t1.getText());
               		int j = st2.executeUpdate();
            		
//               		st2.close();
                    }
                    catch(Exception e)
                    {
                        e.printStackTrace();
                                }
            	 }
		 
		 
		else 
            JOptionPane.showMessageDialog(null, "error");
		textField.setText("");
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        t7.setText("");
        t8.setText("");
        t9.setText("");
        t10.setText("");
        t11.setText("");
        t12.setText("");
        t13.setText("");
        t14.setText("");
		
                    }
            	}
                    }
            
            catch(Exception e){
                        e.printStackTrace();
                                }
            }
            
            
            
            
            
            if(ae.getSource() == b4){
                this.setVisible(false);
		new Home().setVisible(true);
			
            }
            
            con.c.close();
        }catch(Exception e){
            
        }
    }
    
}