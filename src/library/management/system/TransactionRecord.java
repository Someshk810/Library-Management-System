//package library.management.system;
//
//import javax.swing.*;
//import javax.swing.border.*;
//import java.awt.*;
//import com.toedter.calendar.JDateChooser;
//
//import net.proteanit.sql.DbUtils;
//
//import java.awt.event.*;
//import java.sql.*;
//
//public class TransactionRecord extends JFrame implements ActionListener{
//
//    private JPanel contentPane;
//    private JTextField textField;
//    private JTextField textField_1;
//    private JTextField textField_2;
//    private JTextField textField_3;
//    private JTextField textField_4;
//    private JTextField textField_5;
//    private JTextField textField_6;
//    private JButton b1,b2,b3;
//    private JDateChooser dateChooser;
//    private JLabel lblNewLabel_1;
//
//    public static void main(String[] args) {
//	new TransactionRecord().setVisible(true);
//    }
//
//    public void delete() {
//        try {
//            conn con = new conn();
//            String sql = "delete from issueBook where book_id=?";
//            PreparedStatement st = con.c.prepareStatement(sql);
//            st.setString(1, textField.getText());
//            int i = st.executeUpdate();
//            if (i > 0) {
////                JOptionPane.showConfirmDialog(null, "Book Returned");
//            	 JOptionPane.showMessageDialog(null, "Book Returned");
//            textField.setText("");
//            textField_1.setText("");
//            textField_2.setText("");
//            textField_3.setText("");
//            textField_4.setText("");
//            textField_5.setText("");
//            textField_6.setText("");
//            }
//            else
//                JOptionPane.showMessageDialog(null, "error in Deleting");
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, e);
//            e.printStackTrace();
//	}
//    }
//
//    
//    public TransactionRecord() {
//        setBounds(180,10,1050,750);
//	contentPane = new JPanel();
//	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//	setContentPane(contentPane);
//        contentPane.setBackground(Color.WHITE);
//	contentPane.setLayout(null);
//
//	JLabel lblNewLabel = new JLabel("Book_id");
//	lblNewLabel.setForeground(new Color(0, 0, 0));
//	lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
//	lblNewLabel.setBounds(167, 180, 87, 24);
//	contentPane.add(lblNewLabel);
//
//	JLabel lblStudentid = new JLabel("Student_id");
//	lblStudentid.setForeground(Color.BLACK);
//	lblStudentid.setFont(new Font("Tahoma", Font.BOLD, 14));
//	lblStudentid.setBounds(442, 180, 87, 24);
//	contentPane.add(lblStudentid);
//
//	JLabel lblBook = new JLabel("Book");
//	lblBook.setForeground(Color.BLACK);
//	lblBook.setFont(new Font("Tahoma", Font.BOLD, 14));
//	lblBook.setBounds(82, 248, 71, 24);
//	contentPane.add(lblBook);
//
//	JLabel lblName = new JLabel("Name");
//	lblName.setForeground(Color.BLACK);
//	lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
//	lblName.setBounds(454, 248, 71, 24);
//	contentPane.add(lblName);
//
//        JLabel lblCourse = new JLabel("Course");
//	lblCourse.setForeground(Color.BLACK);
//	lblCourse.setFont(new Font("Tahoma", Font.BOLD, 14));
//	lblCourse.setBounds(86, 299, 87, 24);
//	contentPane.add(lblCourse);
//
//        JLabel lblBranch = new JLabel("Branch");
//	lblBranch.setForeground(Color.BLACK);
//	lblBranch.setFont(new Font("Tahoma", Font.BOLD, 14));
//	lblBranch.setBounds(454, 299, 68, 24);
//	contentPane.add(lblBranch);
//
//	JLabel lblDateOfIssue = new JLabel("Date of Issue");
//	lblDateOfIssue.setForeground(Color.BLACK);
//	lblDateOfIssue.setFont(new Font("Tahoma", Font.BOLD, 14));
//	lblDateOfIssue.setBounds(203, 393, 105, 29);
//	contentPane.add(lblDateOfIssue);
//
//	JLabel lblDateOfReturn = new JLabel("Date of Return");
//	lblDateOfReturn.setForeground(Color.BLACK);
//	lblDateOfReturn.setFont(new Font("Tahoma", Font.BOLD, 14));
//	lblDateOfReturn.setBounds(203, 451, 118, 29);
//	contentPane.add(lblDateOfReturn);
//
//        textField = new JTextField();
//	textField.setForeground(new Color(105, 105, 105));
//	textField.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
//	textField.setBounds(264, 183, 105, 26);
//	contentPane.add(textField);
//	textField.setColumns(10);
//
//	textField_1 = new JTextField();
//	textField_1.setForeground(new Color(105, 105, 105));
//	textField_1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
//	textField_1.setBounds(572, 183, 93, 26);
//	contentPane.add(textField_1);
//	textField_1.setColumns(10);
//
//	b1 = new JButton("Search");
//	b1.setFont(new Font("Tahoma", Font.PLAIN, 14));
//	b1.addActionListener(this);
//	b1.setBounds(699, 180, 105, 29);
//        b1.setBackground(Color.LIGHT_GRAY);
//        b1.setForeground(Color.BLACK);
//	contentPane.add(b1);
//
//	textField_2 = new JTextField();
//	textField_2.setEditable(false);
//	textField_2.setForeground(new Color(0, 100, 0));
//	textField_2.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
//	textField_2.setBounds(183, 246, 223, 30);
//	contentPane.add(textField_2);
//	textField_2.setColumns(10);
//
//	textField_3 = new JTextField();
//	textField_3.setEditable(false);
//	textField_3.setForeground(new Color(0, 100, 0));
//	textField_3.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
//	textField_3.setColumns(10);
//	textField_3.setBounds(572, 246, 233, 30);
//	contentPane.add(textField_3);
//
//        textField_4 = new JTextField();
//	textField_4.setEditable(false);
//	textField_4.setForeground(new Color(0, 100, 0));
//	textField_4.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
//	textField_4.setColumns(10);
//	textField_4.setBounds(183, 297, 223, 30);
//	contentPane.add(textField_4);
//
//	textField_5 = new JTextField();
//	textField_5.setForeground(new Color(0, 100, 0));
//	textField_5.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
//	textField_5.setEditable(false);
//	textField_5.setColumns(10);
//	textField_5.setBounds(572, 302, 233, 29);
//	contentPane.add(textField_5);
//
//	textField_6 = new JTextField();
//	textField_6.setForeground(new Color(0, 100, 0));
//	textField_6.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
//	textField_6.setEditable(false);
//	textField_6.setColumns(10);
//	textField_6.setBounds(414, 398, 172, 24);
//	contentPane.add(textField_6);
//
//	dateChooser = new JDateChooser();
//	dateChooser.getCalendarButton().addActionListener(new ActionListener() {
//		public void actionPerformed(ActionEvent e) {
//		}
//	});
//	dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
//	dateChooser.setBounds(414, 451, 172, 29);
//	contentPane.add(dateChooser);
//
//	b2 = new JButton("Return");
//	b2.addActionListener(this);
//	b2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
//	b2.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
//	b2.setBounds(335, 546, 149, 46);
//        b2.setBackground(Color.LIGHT_GRAY);
//        b2.setForeground(Color.BLACK);
//
//	contentPane.add(b2);
//
//	b3 = new JButton("Back");
//	b3.addActionListener(this);
//	b3.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
//	b3.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
//	b3.setBounds(822, 612, 149, 46);
//        b3.setBackground(Color.LIGHT_GRAY);
//        b3.setForeground(Color.BLACK);
//	contentPane.add(b3);
//	
//	lblNewLabel_1 = new JLabel("Return Book..!!");
//	lblNewLabel_1.setForeground(Color.RED);
//	lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 38));
//	lblNewLabel_1.setBackground(new Color(240, 240, 240));
//	lblNewLabel_1.setBounds(354, 52, 414, 46);
//	contentPane.add(lblNewLabel_1);
//    }
//
//    public void issueBook() {
//	try {
//            conn con =  new conn();
//            String sql = "select * from issueBook";
//            PreparedStatement st = con.c.prepareStatement(sql);
//            ResultSet rs = st.executeQuery();
//
//            table.setModel(DbUtils.resultSetToTableModel(rs));
//
//	} catch (Exception e) {
//			// TODO: handle exception
//	}
//    }
//
//    public void returnBook() {
//        try {
//            conn con = new conn();
//            String sql = "select * from returnBook";
//            PreparedStatement st = con.c.prepareStatement(sql);
//            ResultSet rs = st.executeQuery();
//            table_1.setModel(DbUtils.resultSetToTableModel(rs));
//	} catch (Exception e) {
//			// TODO: handle exception
//	}
//    }
//    
//    public void actionPerformed(ActionEvent ae){
//        try{
//            conn con = new conn();
//            if(ae.getSource() == b1){
//                String sql = "select * from issueBook where student_id = ? and book_id =?";
//		PreparedStatement st = con.c.prepareStatement(sql);
//		st.setString(1, textField_1.getText());
//		st.setString(2, textField.getText());
//		ResultSet rs = st.executeQuery();
//		
//                while (rs.next()) {
//                    textField_2.setText(rs.getString("bname"));
//                    textField_3.setText(rs.getString("sname"));
//                    textField_4.setText(rs.getString("course"));
//                    textField_5.setText(rs.getString("branch"));
//                    textField_6.setText(rs.getString("dateOfIssue"));
//		}
//		st.close();
//		rs.close();
//		
//            }
//            if(ae.getSource() == b2){
//                String sql = "insert into returnBook(book_id, student_id, bname, sname,course, branch, dateOfIssue, dateOfReturn) values(?, ?, ?, ?, ?, ?, ?, ?)";
//		PreparedStatement st = con.c.prepareStatement(sql);
//		st.setString(1, textField.getText());
//		st.setString(2, textField_1.getText());
//		st.setString(3, textField_2.getText());
//		st.setString(4, textField_3.getText());
//		st.setString(5, textField_4.getText());
//		st.setString(6, textField_5.getText());
//		st.setString(7, textField_6.getText());
//
//		st.setString(8, ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText());
//		int i = st.executeUpdate();
//		if (textField.getText().equals("") ||textField_1.getText().equals("")||textField_2.getText().equals("") ||textField_3.getText().equals("")
//				||textField_4.getText().equals("")||textField_5.getText().equals("")||textField_6.getText().equals("")) {
//			        	
//			        	JOptionPane.showMessageDialog(null," Invalid Details.!!" );
//			        } 
//		  else	if (i > 0) {
////                    JOptionPane.showMessageDialog(null, "Processing..");
//                    delete();
//		} else
//                    JOptionPane.showMessageDialog(null, "error");
//		
//            }
//           
//            if(ae.getSource() == b3){
//                this.setVisible(false);
//		new Home().setVisible(true);
//			
//            }
//        }catch(Exception e){
//            
//        }
//    }
//}


package library.management.system;

import java.awt.*;

import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;

public class TransactionRecord extends JFrame{

    private JPanel contentPane;
    private JTable table;
    private JTable table_1;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField txtStudentid;
    private JTextField txtStudentid_1;

    public static void main(String[] args) {
        new TransactionRecord().setVisible(true);
    }

    public void issueBook() {
	try {
            conn con =  new conn();
            String sql =  "select * from issueBook where student_id = ? ";
            PreparedStatement st = con.c.prepareStatement(sql);
          
           
    		st.setString(1, textField.getText());
//    		st.setString(2, textField.getText());
    		  ResultSet rs = st.executeQuery();
    		
    		

            table.setModel(DbUtils.resultSetToTableModel(rs));

	} catch (Exception e) {
			// TODO: handle exception
	}
    }

    public void returnBook() {
        try {
            conn con = new conn();
            String sql = "select * from returnBook where student_id = ?";
            PreparedStatement st = con.c.prepareStatement(sql);
            st.setString(1, textField_1.getText());
            ResultSet rs = st.executeQuery();
            table_1.setModel(DbUtils.resultSetToTableModel(rs));
	} catch (Exception e) {
			// TODO: handle exception
	}
    }

    public TransactionRecord() {
        setBounds(180,10,1118,786);
	contentPane = new JPanel();
        contentPane.setBackground(Color.BLACK);
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);

	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(40, 150, 1022, 206);
	contentPane.add(scrollPane);

        table = new JTable();
	table.setBackground(new Color(224, 255, 255));
	table.setForeground(new Color(128, 128, 0));
	table.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	scrollPane.setViewportView(table);

	JPanel panel = new JPanel();
	panel.setBorder(new TitledBorder(new LineBorder(new Color(47, 79, 79), 2, true), "Issue-Book-Records", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 128)));
	panel.setForeground(new Color(0, 128, 128));
	panel.setBounds(26, 130, 1054, 238);
        panel.setBackground(Color.WHITE);
	contentPane.add(panel);

	JLabel l1 = new JLabel("Back");
	l1.setBackground(Color.WHITE);
	l1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
		setVisible(false);
		Home home = new Home();
		home.setVisible(true);
            }
	});
	l1.setForeground(Color.RED);
	l1.setFont(new Font("Tahoma", Font.BOLD, 18));
	ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/tenth.png"));
        Image i2 = i1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l1.setIcon(i3);
	l1.setBounds(1008, 17, 96, 27);
	contentPane.add(l1);

	JScrollPane scrollPane_1 = new JScrollPane();
	scrollPane_1.setBounds(40, 500, 1022, 206);
	contentPane.add(scrollPane_1);

	table_1 = new JTable();
	table_1.setBackground(new Color(204, 255, 255));
	table_1.setForeground(new Color(153, 51, 0));
	table_1.setFont(new Font("Sitka Small", Font.BOLD, 12));
	scrollPane_1.setViewportView(table_1);

	JPanel panel_1 = new JPanel();
	panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 204, 153), 2, true), "Return-Book-Records", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 102, 51)));
	panel_1.setBounds(22, 475, 1058, 250);
        panel_1.setBackground(Color.WHITE);
	contentPane.add(panel_1);
	
	JLabel lblNewLabel = new JLabel("Transaction Records..!!");
	lblNewLabel.setForeground(Color.CYAN);
	lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
	lblNewLabel.setBounds(398, 10, 333, 32);
	contentPane.add(lblNewLabel);
	
	textField = new JTextField();
	textField.setBounds(684, 93, 96, 27);
	contentPane.add(textField);
	textField.setColumns(10);
	
	textField_1 = new JTextField();
	textField_1.setBounds(684, 435, 116, 30);
	contentPane.add(textField_1);
	textField_1.setColumns(10);
	
	JButton btnNewButton = new JButton("Get Record");
	btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			issueBook();
			
		}
	});
	btnNewButton.setBounds(835, 93, 127, 27);
	contentPane.add(btnNewButton);
	
	JButton btnNewButton_1 = new JButton("Get Record");
	btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
	btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			returnBook();
		}
	});
	btnNewButton_1.setBounds(824, 435, 138, 38);
	contentPane.add(btnNewButton_1);
	
	txtStudentid = new JTextField();
	txtStudentid.setFont(new Font("Tahoma", Font.BOLD, 14));
	txtStudentid.setText("student_id");
	txtStudentid.setBounds(549, 445, 107, 20);
	contentPane.add(txtStudentid);
	txtStudentid.setColumns(10);
	
	txtStudentid_1 = new JTextField();
	txtStudentid_1.setText("student_id");
	txtStudentid_1.setFont(new Font("Tahoma", Font.BOLD, 14));
	txtStudentid_1.setBounds(560, 93, 96, 29);
	contentPane.add(txtStudentid_1);
	txtStudentid_1.setColumns(10);
        

	
	
    }
}