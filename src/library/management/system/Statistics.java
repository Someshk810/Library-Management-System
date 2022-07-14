package library.management.system;

import java.awt.*;

import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;

public class Statistics extends JFrame{

    private JPanel contentPane;
    private JTable table;
    private JTable table_1;

    private JTable table_2;
    public static void main(String[] args) {
        new Statistics().setVisible(true);
    }

    public void issueBook() {
	try {
            conn con =  new conn();
            String sql = "select * from issueBook";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            table.setModel(DbUtils.resultSetToTableModel(rs));

	} catch (Exception e) {
			// TODO: handle exception
	}
    }

    public void returnBook() {
        try {
            conn con = new conn();
            String sql = "select * from returnBook";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            table_1.setModel(DbUtils.resultSetToTableModel(rs));
	} catch (Exception e) {
			// TODO: handle exception
	}
    }
    
    public void BookDetails() {
        try {
            conn con = new conn();
            String sql = "select * from book";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            table_2.setModel(DbUtils.resultSetToTableModel(rs));
	} catch (Exception e) {
			// TODO: handle exception
	}
    }

    public Statistics() {
        setBounds(180,10,1118,794);
	contentPane = new JPanel();
        contentPane.setBackground(Color.BLACK);
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);

	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(40, 90, 1011, 142);
	contentPane.add(scrollPane);

        table = new JTable();
	table.setBackground(new Color(224, 255, 255));
	table.setForeground(new Color(128, 128, 0));
	table.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	scrollPane.setViewportView(table);

	JPanel panel = new JPanel();
	panel.setBorder(new TitledBorder(new LineBorder(new Color(47, 79, 79), 2, true), "Issue-Book-Details",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 128)));
	panel.setForeground(new Color(0, 128, 128));
	panel.setBounds(26, 70, 1054, 183);
        panel.setBackground(Color.WHITE);
	contentPane.add(panel);

	JLabel l1 = new JLabel("Back");
	l1.setBackground(Color.WHITE);
	l1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
		
		 setVisible(false);
			new AdminModule().setVisible(true);
            }
	});
	l1.setForeground(Color.WHITE);
	l1.setFont(new Font("Tahoma", Font.BOLD, 18));
	ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/tenth.png"));
        Image i2 = i1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l1.setIcon(i3);
	l1.setBounds(927, 19, 96, 27);
	contentPane.add(l1);

	JScrollPane scrollPane_1 = new JScrollPane();
	scrollPane_1.setBounds(40, 320, 1022, 150);
	contentPane.add(scrollPane_1);

	table_1 = new JTable();
	table_1.setBackground(new Color(204, 255, 255));
	table_1.setForeground(new Color(153, 51, 0));
	table_1.setFont(new Font("Sitka Small", Font.BOLD, 12));
	scrollPane_1.setViewportView(table_1);

	JPanel panel_1 = new JPanel();
	panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 204, 153), 2, true), "Return-Book-Details",
		TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 102, 51)));
	panel_1.setBounds(26, 298, 1058, 190);
        panel_1.setBackground(Color.WHITE);
	contentPane.add(panel_1);
	
	
	
	
	
	JScrollPane scrollPane_2 = new JScrollPane();
	scrollPane_2.setBounds(40, 540, 1022, 161);
	contentPane.add(scrollPane_2);

	table_2 = new JTable();
	table_2.setBackground(new Color(204, 255, 255));
	table_2.setForeground(new Color(153, 51, 0));
	table_2.setFont(new Font("Sitka Small", Font.BOLD, 12));
	scrollPane_2.setViewportView(table_2);

	JPanel panel_2 = new JPanel();
	panel_2.setBorder(new TitledBorder(new LineBorder(new Color(0, 204, 153), 2, true), "Book-Details",
		TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 102, 51)));
	panel_2.setBounds(26, 520, 1054, 205);
        panel_2.setBackground(Color.WHITE);
	contentPane.add(panel_2);
	
	
	
	JLabel lblNewLabel = new JLabel("Statistics..!!");
	lblNewLabel.setForeground(Color.CYAN);
	lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 32));
	lblNewLabel.setBounds(416, 10, 333, 32);
	contentPane.add(lblNewLabel);
        

	issueBook();
	returnBook();
	BookDetails();
    }
}