
package library.management.system;

import java.awt.*;

import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;
import net.proteanit.sql.DbUtils;

public class StudentDetails extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTable table;
    private JButton b1,b2;
    
    public static void main(String[] args) {
	new StudentDetails().setVisible(true);
    }

    public void student() {
        try {
            conn con = new conn();
            String sql = "select * from student";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
//
           table.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            st.close();
            con.c.close();
        } catch (Exception e) {

        }
    }

    public StudentDetails() {
        setBounds(180,10,1050,750);
        contentPane = new JPanel();
	contentPane.setBackground(new Color(220, 220, 220));
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
	contentPane.setLayout(null);

	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(79, 133, 918, 426);
	contentPane.add(scrollPane);

	table = new JTable();
	table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                int row = table.getSelectedRow();
//		search.setText(table.getModel().getValueAt(row, 1).toString());
            }
	});
	table.setBackground(new Color(240, 248, 255));
	table.setForeground(Color.DARK_GRAY);
	table.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
	scrollPane.setViewportView(table);
	ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/eight.png"));
        Image i2 = i1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
	ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/nineth.png"));
        Image i5 = i4.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);

	JLabel l1 = new JLabel("User Details..!!");
	l1.setBackground(Color.WHITE);
	l1.setForeground(Color.BLACK);
	l1.setFont(new Font("Tahoma", Font.BOLD, 40));
	l1.setBounds(333, 28, 400, 47);
	contentPane.add(l1);
	
	JButton btnNewButton = new JButton("BACK");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			 setVisible(false);
				new AdminModule().setVisible(true);
		}
	});
	btnNewButton.setBackground(Color.WHITE);
	btnNewButton.setForeground(Color.RED);
	btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
	btnNewButton.setBounds(870, 625, 97, 31);
	contentPane.add(btnNewButton);
        
	student();
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            
            conn con = new conn();
//            if( ae.getSource() == b1){
//                String sql = "select * from student where concat(name, student_id) like ?";
//		PreparedStatement st = con.c.prepareStatement(sql);
//		st.setString(1, "%" + search.getText() + "%");
//		ResultSet rs = st.executeQuery();
////
//		table.setModel(DbUtils.resultSetToTableModel(rs));
//		rs.close();
//		st.close();
//            }
    
//            if(ae.getSource() == b2){
//                String sql = "delete from student where name = '" + search.getText() + "'";
//		PreparedStatement st = con.c.prepareStatement(sql);
//
//		JDialog.setDefaultLookAndFeelDecorated(true);
//		int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm",
//		JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
//		if (response == JOptionPane.NO_OPTION) {
//
//		} else if (response == JOptionPane.YES_OPTION) {
//                    int rs = st.executeUpdate();
//                    JOptionPane.showMessageDialog(null, "Deleted !!");
//		} else if (response == JOptionPane.CLOSED_OPTION) {
//                
//                }
//		st.close();
//		
//            }
            con.c.close();
        }catch(Exception e){
            
        }
    }
}