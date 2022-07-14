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

public class DeleteUser extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField t8,t9,t10,t11,t12,t13,t14;
    private JButton b2,b3,b4;

    public static void main(String[] args) {
	new DeleteUser().setVisible(true);
			
    }

    public DeleteUser() {
        setBounds(180,10,1050,750);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
	contentPane.setLayout(null);

	JLabel l8 = new JLabel("Student_id");
	l8.setForeground(new Color(47, 79, 79));
	l8.setFont(new Font("Tahoma", Font.BOLD, 14));
	l8.setBounds(384, 63, 100, 23);
	contentPane.add(l8);

	JLabel l9 = new JLabel("Name");
	l9.setForeground(new Color(47, 79, 79));
	l9.setFont(new Font("Tahoma", Font.BOLD, 14));
	l9.setBounds(384, 103, 100, 23);
	contentPane.add(l9);

	JLabel l10 = new JLabel("Surname");
	l10.setForeground(new Color(47, 79, 79));
	l10.setFont(new Font("Tahoma", Font.BOLD, 14));
	l10.setBounds(384, 147, 100, 23);
	contentPane.add(l10);

	JLabel l11 = new JLabel("Course");
	l11.setForeground(new Color(47, 79, 79));
	l11.setFont(new Font("Tahoma", Font.BOLD, 14));
	l11.setBounds(384, 187, 100, 23);
	contentPane.add(l11);

	JLabel l12 = new JLabel("Branch");
	l12.setForeground(new Color(47, 79, 79));
	l12.setFont(new Font("Tahoma", Font.BOLD, 14));
	l12.setBounds(384, 233, 100, 23);
	contentPane.add(l12);

	JLabel l13 = new JLabel("Year");
	l13.setForeground(new Color(47, 79, 79));
	l13.setFont(new Font("Tahoma", Font.BOLD, 14));
	l13.setBounds(384, 284, 100, 23);
	contentPane.add(l13);

	JLabel l14 = new JLabel("Semester");
	l14.setForeground(new Color(47, 79, 79));
	l14.setFont(new Font("Tahoma", Font.BOLD, 14));
	l14.setBounds(384, 336, 100, 23);
	contentPane.add(l14);

	t8 = new JTextField();
	t8.setForeground(new Color(47, 79, 79));
	t8.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t8.setColumns(10);
	t8.setBounds(508, 66, 86, 20);
	contentPane.add(t8);

	b2 = new JButton("Search");
	b2.addActionListener(this);
	b2.setFont(new Font("Tahoma", Font.BOLD, 14));
	b2.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
	b2.setBounds(604, 59, 100, 30);
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
	contentPane.add(b2);

	t9 = new JTextField();
	t9.setForeground(new Color(47, 79, 79));
	t9.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t9.setEditable(false);
	t9.setColumns(10);
	t9.setBounds(508, 106, 208, 20);
	contentPane.add(t9);

	t10 = new JTextField();
	t10.setForeground(new Color(47, 79, 79));
	t10.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t10.setEditable(false);
	t10.setColumns(10);
	t10.setBounds(508, 150, 208, 20);
	contentPane.add(t10);

	t11 = new JTextField();
	t11.setForeground(new Color(47, 79, 79));
	t11.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t11.setEditable(false);
	t11.setColumns(10);
	t11.setBounds(508, 190, 208, 20);
	contentPane.add(t11);

	t12 = new JTextField();
	t12.setForeground(new Color(47, 79, 79));
	t12.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t12.setEditable(false);
	t12.setColumns(10);
	t12.setBounds(508, 236, 208, 20);
	contentPane.add(t12);

	t13 = new JTextField();
	t13.setForeground(new Color(47, 79, 79));
	t13.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t13.setEditable(false);
	t13.setColumns(10);
	t13.setBounds(508, 286, 208, 20);
	contentPane.add(t13);

	t14 = new JTextField();
	t14.setForeground(new Color(47, 79, 79));
	t14.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t14.setEditable(false);
	t14.setColumns(10);
	t14.setBounds(508, 338, 208, 20);
	contentPane.add(t14);

	b3 = new JButton("Delete");
	b3.addActionListener(this);
	b3.setFont(new Font("Tahoma", Font.BOLD, 14));
	b3.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
	b3.setBounds(508, 415, 118, 33);
	b3.setBackground(Color.WHITE);
        b3.setForeground(Color.BLACK);
        contentPane.add(b3);

	b4 = new JButton("Back");
	b4.addActionListener(this);
	b4.setFont(new Font("Tahoma", Font.BOLD, 14));
	b4.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
	b4.setBounds(877, 607, 100, 33);
	b4.setBackground(Color.WHITE);
        b4.setForeground(Color.RED);
        contentPane.add(b4);
        
        JLabel lblNewLabel = new JLabel("Delete User..!!");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
        lblNewLabel.setBounds(443, 10, 340, 32);
        contentPane.add(lblNewLabel);
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            conn con = new conn();
//            if(ae.getSource() == b1){
//                String sql = "select * from book where book_id = ?";
//		PreparedStatement st = con.c.prepareStatement(sql);
//		st.setString(1, t1.getText());
//		ResultSet rs = st.executeQuery();
//		
//                while (rs.next()) {
//                    t2.setText(rs.getString("name"));
//                    t3.setText(rs.getString("isbn"));
//                    t4.setText(rs.getString("publisher"));
//                    t5.setText(rs.getString("edition"));
//                    t6.setText(rs.getString("price"));
//                    t7.setText(rs.getString("pages"));
//		}
//		st.close();
//		rs.close();
//		
//            }
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
//		student_id, name, surname,s_mobile, course, branch, year, semester
            }
            if(ae.getSource() == b3){
                    try{
                    	 String sql = " delete from student where student_id=?";
		PreparedStatement st = con.c.prepareStatement(sql);
		
		st.setString(1, t8.getText());
		

//		
		

		int i = st.executeUpdate();
		if (i > 0) {
			int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm",
		              JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (response == JOptionPane.NO_OPTION) {

			} else if (response == JOptionPane.YES_OPTION) {
		              int rs = st.executeUpdate();
		              JOptionPane.showMessageDialog(null, "Deleted !!");
		          } else if (response == JOptionPane.CLOSED_OPTION) {
			
		          }

			 t8.setText("");
		     t9.setText("");
		     t10.setText("");
		     t11.setText("");
		     t12.setText("");
		     t13.setText("");
		     t14.setText("");
	
		}

		else
                    JOptionPane.showMessageDialog(null, "error");
                    }catch(Exception e){
                        e.printStackTrace();
                                }
            }
            if(ae.getSource() == b4){
                this.setVisible(false);
		new AdminModule().setVisible(true);
			
            }
            
            con.c.close();
        }catch(Exception e){
            
        }
    }
}