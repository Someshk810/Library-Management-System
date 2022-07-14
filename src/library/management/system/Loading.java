package library.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Loading extends JFrame implements Runnable {

	private JPanel contentPane;
	private JProgressBar progressBar;
	Connection conn;
	int s;
	Thread th;

	public static void main(String[] args) {
            new Loading().setVisible(true);
	}

	public void setUploading() {
            setVisible(false);
            th.start();
	}

	public void run() {
            try {
                for (int i = 0; i < 200; i++) {
                    s = s + 1;
                    int m = progressBar.getMaximum();
                    int v = progressBar.getValue();
                    if (v < m) {
                        progressBar.setValue(progressBar.getValue() + 1);
                    } else {
                        i = 201;
                        setVisible(false);
                        new Home().setVisible(true);
                    }
                    Thread.sleep(50);
                }
            } catch (Exception e) {
		e.printStackTrace();
            }
	}

	public Loading() {
           
            super("Loading");
            th = new Thread((Runnable) this);

            setBounds(180,10,1050,750);
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel lbllibraryManagement = new JLabel("Loading....");
            lbllibraryManagement.setBackground(Color.BLACK);
            lbllibraryManagement.setForeground(Color.CYAN);
            lbllibraryManagement.setFont(new Font("Trebuchet MS", Font.BOLD, 38));
            lbllibraryManagement.setBounds(460, 210, 500, 45);
            contentPane.add(lbllibraryManagement);
	
            progressBar = new JProgressBar();
            progressBar.setForeground(Color.BLUE);
            progressBar.setFont(new Font("Tahoma", Font.BOLD, 12));
            progressBar.setStringPainted(true);
            progressBar.setBounds(350, 294, 434, 35);
            contentPane.add(progressBar);

            JLabel lblNewLabel_2 = new JLabel("Please Wait....");
            lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 26));
            lblNewLabel_2.setForeground(Color.RED);
            lblNewLabel_2.setBounds(440, 380, 250, 35);
            contentPane.add(lblNewLabel_2);

            JPanel panel = new JPanel();
            panel.setBackground(Color.BLACK);
            panel.setBounds(0, 0, 1026, 703);
            contentPane.add(panel);
                
            setUploading();
	}
}