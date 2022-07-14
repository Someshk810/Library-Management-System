package library.management.system;

import java.awt.*;



import javax.swing.*;
import javax.swing.border.*;
import net.proteanit.sql.DbUtils;
import java.sql.*;
import java.awt.event.*;

public class BookDetails extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTable table;
    private JButton b1,b2,b3;

    public static void main(String[] args) {
	new BookDetails().setVisible(true);
    }
    
    public void Book() {
	try {
            conn con = new conn();
            String sql = "select * from book";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            table.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            st.close();
            con.c.close();
	} catch (Exception e) {
	
	}
    }

    public BookDetails() {
        setBounds(120,10,1339,750);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);

	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(10, 134, 1298, 447);
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


	JLabel l1 = new JLabel("Book Details..!!");
	l1.setForeground(Color.RED);
	l1.setFont(new Font("Tahoma", Font.BOLD, 38));
	l1.setBounds(516, 37, 400, 47);
	contentPane.add(l1);

	JLabel l3 = new JLabel("Back");
	l3.setBackground(Color.WHITE);
	l3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				Home home = new Home();
				home.setVisible(true);
			}
		});
	l3.setForeground(Color.BLACK);
	l3.setFont(new Font("Tahoma", Font.BOLD, 22));
	ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/tenth.png"));
        Image i8 = i7.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        l3.setIcon(i9);
	l3.setBounds(1117, 39, 102, 33);
	contentPane.add(l3);
	Book();
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            
            conn con = new conn();
            if(ae.getSource() == b1){
             
                String sql = "select * from book where concat(name, book_id) like ?";
		PreparedStatement st = con.c.prepareStatement(sql);
//		st.setString(1, "%" + search.getText() + "%");
		ResultSet rs = st.executeQuery();

		table.setModel(DbUtils.resultSetToTableModel(rs));
                rs.close();
                st.close();

            }
            if(ae.getSource() == b2){
//                String sql = "delete from book where name = '" + search.getText() + "'";
//		PreparedStatement st = con.c.prepareStatement(sql);

//		JDialog.setDefaultLookAndFeelDecorated(true);
//		int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm",
//                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
//		if (response == JOptionPane.NO_OPTION) {
//
//		} else if (response == JOptionPane.YES_OPTION) {
//                    int rs = st.executeUpdate();
//                    JOptionPane.showMessageDialog(null, "Deleted !!");
//                } else if (response == JOptionPane.CLOSED_OPTION) {
//		
//                }
//                st.close();
//		
//		
      }
//            
            con.c.close();
        }catch(Exception e){
            
        }
    }
}