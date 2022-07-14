package library.management.system;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.sql.*;

public class ReturnBook extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JButton b1,b2,b3;
    private JDateChooser dateChooser;
    private JLabel lblNewLabel_1;

    public static void main(String[] args) {
	new ReturnBook().setVisible(true);
    }

    public void delete() {
       try {
            conn con = new conn();
           String sql = "delete from issueBook where book_id=?";
           PreparedStatement st = con.c.prepareStatement(sql);
           st.setString(1, textField.getText());
           int i = st.executeUpdate();
           if (i > 0) {
//               JOptionPane.showConfirmDialog(null, "Book Returned");
            	 JOptionPane.showMessageDialog(null, "Book Returned");
            	 try {
                     
                     String sql2 = "update book set copies = copies + 1 where book_id= ?";
                		PreparedStatement st2 = con.c.prepareStatement(sql2);
                		st2.setString(1, textField.getText());
                		int j = st2.executeUpdate();
             		
//                		st2.close();
                     }
                     catch(Exception e){
                         e.printStackTrace();
                                 }
           
            }
            else
                JOptionPane.showMessageDialog(null, "error in Deleting");
           textField.setText("");
           textField_1.setText("");
           textField_2.setText("");
           textField_3.setText("");
           textField_4.setText("");
           textField_5.setText("");
           textField_6.setText("");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
           e.printStackTrace();
	}
    }

    
    public ReturnBook() {
        setBounds(180,10,1050,750);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
	contentPane.setLayout(null);

	JLabel lblNewLabel = new JLabel("Book_id");
	lblNewLabel.setForeground(new Color(0, 0, 0));
	lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblNewLabel.setBounds(167, 180, 87, 24);
	contentPane.add(lblNewLabel);

	JLabel lblStudentid = new JLabel("Student_id");
	lblStudentid.setForeground(Color.BLACK);
	lblStudentid.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblStudentid.setBounds(442, 180, 87, 24);
	contentPane.add(lblStudentid);

	JLabel lblBook = new JLabel("Book");
	lblBook.setForeground(Color.BLACK);
	lblBook.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblBook.setBounds(82, 248, 71, 24);
	contentPane.add(lblBook);

	JLabel lblName = new JLabel("Name");
	lblName.setForeground(Color.BLACK);
	lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblName.setBounds(454, 248, 71, 24);
	contentPane.add(lblName);

        JLabel lblCourse = new JLabel("Course");
	lblCourse.setForeground(Color.BLACK);
	lblCourse.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblCourse.setBounds(86, 299, 87, 24);
	contentPane.add(lblCourse);

        JLabel lblBranch = new JLabel("Branch");
	lblBranch.setForeground(Color.BLACK);
	lblBranch.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblBranch.setBounds(454, 299, 68, 24);
	contentPane.add(lblBranch);

	JLabel lblDateOfIssue = new JLabel("Date of Issue");
	lblDateOfIssue.setForeground(Color.BLACK);
	lblDateOfIssue.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblDateOfIssue.setBounds(203, 393, 105, 29);
	contentPane.add(lblDateOfIssue);

	JLabel lblDateOfReturn = new JLabel("Date of Return");
	lblDateOfReturn.setForeground(Color.BLACK);
	lblDateOfReturn.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblDateOfReturn.setBounds(203, 451, 118, 29);
	contentPane.add(lblDateOfReturn);

        textField = new JTextField();
	textField.setForeground(new Color(105, 105, 105));
	textField.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	textField.setBounds(264, 183, 105, 26);
	contentPane.add(textField);
	textField.setColumns(10);

	textField_1 = new JTextField();
	textField_1.setForeground(new Color(105, 105, 105));
	textField_1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	textField_1.setBounds(572, 183, 93, 26);
	contentPane.add(textField_1);
	textField_1.setColumns(10);

	b1 = new JButton("Search");
	b1.setFont(new Font("Tahoma", Font.PLAIN, 14));
	b1.addActionListener(this);
	b1.setBounds(699, 180, 105, 29);
        b1.setBackground(Color.LIGHT_GRAY);
        b1.setForeground(Color.BLACK);
	contentPane.add(b1);

	textField_2 = new JTextField();
	textField_2.setEditable(false);
	textField_2.setForeground(new Color(0, 100, 0));
	textField_2.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
	textField_2.setBounds(183, 246, 223, 30);
	contentPane.add(textField_2);
	textField_2.setColumns(10);

	textField_3 = new JTextField();
	textField_3.setEditable(false);
	textField_3.setForeground(new Color(0, 100, 0));
	textField_3.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
	textField_3.setColumns(10);
	textField_3.setBounds(572, 246, 233, 30);
	contentPane.add(textField_3);

        textField_4 = new JTextField();
	textField_4.setEditable(false);
	textField_4.setForeground(new Color(0, 100, 0));
	textField_4.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
	textField_4.setColumns(10);
	textField_4.setBounds(183, 297, 223, 30);
	contentPane.add(textField_4);

	textField_5 = new JTextField();
	textField_5.setForeground(new Color(0, 100, 0));
	textField_5.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
	textField_5.setEditable(false);
	textField_5.setColumns(10);
	textField_5.setBounds(572, 302, 233, 29);
	contentPane.add(textField_5);

	textField_6 = new JTextField();
	textField_6.setForeground(new Color(0, 100, 0));
	textField_6.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
	textField_6.setEditable(false);
	textField_6.setColumns(10);
	textField_6.setBounds(414, 398, 172, 24);
	contentPane.add(textField_6);

	dateChooser = new JDateChooser();
	dateChooser.getCalendarButton().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
	dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
	dateChooser.setBounds(414, 451, 172, 29);
	contentPane.add(dateChooser);

	b2 = new JButton("Return");
	b2.addActionListener(this);
	b2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	b2.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
	b2.setBounds(335, 546, 149, 46);
        b2.setBackground(Color.LIGHT_GRAY);
        b2.setForeground(Color.BLACK);

	contentPane.add(b2);

	b3 = new JButton("Back");
	b3.addActionListener(this);
	b3.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	b3.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
	b3.setBounds(822, 612, 149, 46);
        b3.setBackground(Color.LIGHT_GRAY);
        b3.setForeground(Color.BLACK);
	contentPane.add(b3);
	
	lblNewLabel_1 = new JLabel("Return Book..!!");
	lblNewLabel_1.setForeground(Color.RED);
	lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 38));
	lblNewLabel_1.setBackground(new Color(240, 240, 240));
	lblNewLabel_1.setBounds(354, 52, 414, 46);
	contentPane.add(lblNewLabel_1);
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            conn con = new conn();
            if(ae.getSource() == b1){
                String sql = "select * from issueBook where student_id = ? and book_id =?";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, textField_1.getText());
		st.setString(2, textField.getText());
		ResultSet rs = st.executeQuery();
		
                while (rs.next()) {
                    textField_2.setText(rs.getString("bname"));
                    textField_3.setText(rs.getString("sname"));
                    textField_4.setText(rs.getString("course"));
                    textField_5.setText(rs.getString("branch"));
                    textField_6.setText(rs.getString("dateOfIssue"));
		}
		st.close();
		rs.close();
		
            }
            if(ae.getSource() == b2){
                String sql = "insert into returnBook(book_id, student_id, bname, sname,course, branch, dateOfIssue, dateOfReturn) values(?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, textField.getText());
		st.setString(2, textField_1.getText());
		st.setString(3, textField_2.getText());
		st.setString(4, textField_3.getText());
		st.setString(5, textField_4.getText());
		st.setString(6, textField_5.getText());
		st.setString(7, textField_6.getText());

		st.setString(8, ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText());
		int i = st.executeUpdate();
		if (textField.getText().equals("") ||textField_1.getText().equals("")||textField_2.getText().equals("") ||textField_3.getText().equals("")
				||textField_4.getText().equals("")||textField_5.getText().equals("")||textField_6.getText().equals("")) {
			        	
			        	JOptionPane.showMessageDialog(null," Invalid Details.!!" );
			        } 
		  else	if (i > 0) {
//                    JOptionPane.showMessageDialog(null, "Processing..");
                    delete();
		} else
                    JOptionPane.showMessageDialog(null, "error");
		
            }
           
            if(ae.getSource() == b3){
                this.setVisible(false);
		new Home().setVisible(true);
			
            }
        }catch(Exception e){
            
        }
    }
}