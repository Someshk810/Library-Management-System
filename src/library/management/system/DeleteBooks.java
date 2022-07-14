package library.management.system;

import java.awt.Color;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
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

public class DeleteBooks extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField t1,t2,t3,t4,t5,t6,t7;
    private JButton b1,b3,b4;
    private JLabel lblNewLabel;

    public static void main(String[] args) {
	new DeleteBooks().setVisible(true);
			
    }

    public DeleteBooks() {
        setBounds(180,10,1050,750);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
	contentPane.setLayout(null);

	JLabel l1 = new JLabel("Book_id");
	l1.setFont(new Font("Tahoma", Font.BOLD, 16));
	l1.setForeground(new Color(47, 79, 79));
	l1.setBounds(301, 134, 100, 23);
	contentPane.add(l1);

	JLabel l2 = new JLabel("Name");
	l2.setForeground(new Color(47, 79, 79));
	l2.setFont(new Font("Tahoma", Font.BOLD, 16));
	l2.setBounds(301, 193, 100, 23);
	contentPane.add(l2);

	JLabel l3 = new JLabel("ISBN");
	l3.setForeground(new Color(47, 79, 79));
	l3.setFont(new Font("Tahoma", Font.BOLD, 16));
	l3.setBounds(301, 247, 100, 23);
	contentPane.add(l3);

	JLabel l4 = new JLabel("Publisher");
	l4.setForeground(new Color(47, 79, 79));
	l4.setFont(new Font("Tahoma", Font.BOLD, 16));
	l4.setBounds(301, 300, 100, 23);
	contentPane.add(l4);

	JLabel l5 = new JLabel("Edition");
	l5.setForeground(new Color(47, 79, 79));
	l5.setFont(new Font("Tahoma", Font.BOLD, 16));
	l5.setBounds(301, 351, 100, 23);
	contentPane.add(l5);

	JLabel l6 = new JLabel("Price");
	l6.setForeground(new Color(47, 79, 79));
	l6.setFont(new Font("Tahoma", Font.BOLD, 16));
	l6.setBounds(301, 403, 100, 23);
	contentPane.add(l6);

	JLabel l7 = new JLabel("Pages");
	l7.setForeground(new Color(47, 79, 79));
	l7.setFont(new Font("Tahoma", Font.BOLD, 16));
	l7.setBounds(301, 453, 100, 23);
	contentPane.add(l7);

	t1 = new JTextField();
	t1.setForeground(Color.BLACK);
	t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t1.setBounds(497, 131, 92, 30);
	contentPane.add(t1);
	
	b1 = new JButton("Search");
	b1.addActionListener(this);
	b1.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
	b1.setFont(new Font("Tahoma", Font.BOLD, 16));
	b1.setBounds(619, 130, 128, 30);
        
	contentPane.add(b1);

	t2 = new JTextField();
	t2.setEditable(false);
	t2.setForeground(new Color(47, 79, 79));
	t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t2.setBounds(497, 190, 250, 30);
	contentPane.add(t2);
	t2.setColumns(10);

	t3 = new JTextField();
	t3.setEditable(false);
	t3.setForeground(new Color(47, 79, 79));
	t3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t3.setColumns(10);
	t3.setBounds(497, 244, 250, 30);
	contentPane.add(t3);

	t4 = new JTextField();
	t4.setEditable(false);
	t4.setForeground(new Color(47, 79, 79));
	t4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t4.setColumns(10);
	t4.setBounds(497, 297, 250, 30);
	contentPane.add(t4);

	t5 = new JTextField();
	t5.setEditable(false);
	t5.setForeground(new Color(47, 79, 79));
	t5.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t5.setColumns(10);
	t5.setBounds(497, 348, 250, 30);
	contentPane.add(t5);

	t6 = new JTextField();
	t6.setEditable(false);
	t6.setForeground(new Color(47, 79, 79));
	t6.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t6.setColumns(10);
	t6.setBounds(497, 400, 250, 30);
	contentPane.add(t6);

	t7 = new JTextField();
	t7.setEditable(false);
	t7.setForeground(new Color(47, 79, 79));
	t7.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t7.setColumns(10);
	t7.setBounds(497, 450, 250, 30);
	contentPane.add(t7);

	b3 = new JButton("Delete Book");
	b3.addActionListener(this);
	b3.setFont(new Font("Tahoma", Font.BOLD, 18));
	b3.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
	b3.setBounds(446, 516, 158, 50);
	b3.setBackground(Color.WHITE);
        b3.setForeground(Color.BLACK);
        contentPane.add(b3);

	b4 = new JButton("Back");
	b4.addActionListener(this);
	b4.setFont(new Font("Tahoma", Font.BOLD, 14));
	b4.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
	b4.setBounds(877, 615, 108, 40);
	b4.setBackground(Color.WHITE);
        b4.setForeground(Color.BLACK);
        contentPane.add(b4);
//        l3.setForeground(Color.BLACK);
//    	l3.setFont(new Font("Tahoma", Font.BOLD, 22));
//    	ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/tenth.png"));
//            Image i8 = i7.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
//            ImageIcon i9 = new ImageIcon(i8);
//            l3.setIcon(i9);
//    	l3.setBounds(800, 615, 102, 33);
//    	contentPane.add(l3);
    	
        
        
        
        lblNewLabel = new JLabel("Delete Book..!!");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 32));
        lblNewLabel.setBounds(365, 23, 277, 40);
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
//            if(ae.getSource() == b2){
//                String sql = "select * from student where student_id = ?";
//		PreparedStatement st = con.c.prepareStatement(sql);
//		st.setString(1, t.getText());
//		ResultSet rs = st.executeQuery();
//		
//                while (rs.next()) {
//                    t9.setText(rs.getString("name"));
//                    t10.setText(rs.getString("surname"));
//                    t11.setText(rs.getString("course"));
//                    t12.setText(rs.getString("branch"));
//                    t13.setText(rs.getString("year"));
//                    t14.setText(rs.getString("semester"));
//		}
//		st.close();
//		rs.close();

////		student_id, name, surname,s_mobile, course, branch, year, semester
//            }
            if(ae.getSource() == b3){
                    try{
                String sql = " delete from book where book_id=?";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, t1.getText());
		
		
//          String sql = "delete from book where name = '" + search.getText() + "'";
//	PreparedStatement st = con.c.prepareStatement(sql);
//
//	JDialog.setDefaultLookAndFeelDecorated(true);
//	int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm",
//              JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
//	if (response == JOptionPane.NO_OPTION) {
//
//	} else if (response == JOptionPane.YES_OPTION) {
//              int rs = st.executeUpdate();
//              JOptionPane.showMessageDialog(null, "Deleted !!");
//          } else if (response == JOptionPane.CLOSED_OPTION) {
//	
//          }
//
//	 t1.setText("");
//     t2.setText("");
//     t3.setText("");
//     t4.setText("");
//     t5.setText("");
//     t6.setText("");
//     t7.setText("");

		int i = st.executeUpdate();
		if (i > 0)
		{
			int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm",
		              JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (response == JOptionPane.NO_OPTION) {

			} else if (response == JOptionPane.YES_OPTION) {
		              int rs = st.executeUpdate();
		              JOptionPane.showMessageDialog(null, "Deleted !!");
		          } else if (response == JOptionPane.CLOSED_OPTION) {
			
		          }

			 t1.setText("");
		     t2.setText("");
		     t3.setText("");
		     t4.setText("");
		     t5.setText("");
		     t6.setText("");
		     t7.setText("");
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