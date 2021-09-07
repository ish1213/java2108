package com.example.demo;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUserName;
	private JPasswordField txtPasswd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					if(DBUtil.dbconn == null ) DBUtil.DBConnect();
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login System");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(103, 22, 227, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Name :");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_1.setBounds(23, 106, 110, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password :");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_2.setBounds(36, 155, 87, 15);
		contentPane.add(lblNewLabel_2);
		
		txtUserName = new JTextField();
		txtUserName.setFont(new Font("굴림", Font.PLAIN, 16));
		txtUserName.setBounds(145, 104, 117, 21);
		contentPane.add(txtUserName);
		
		txtPasswd = new JPasswordField();
		txtPasswd.setBounds(145, 153, 117, 21);
		contentPane.add(txtPasswd);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(DBUtil.dbconn == null) DBUtil.DBConnect();
				String username = txtUserName.getText();
				String password = new String(txtPasswd.getPassword());
				
				String query = "SELECT * FROM users WHERE username=? and password=?";
				
				try {
					PreparedStatement pstmt = DBUtil.dbconn.prepareStatement(query);
					pstmt.setString(1, username);
					pstmt.setString(2, password);
				    System.out.println(username);
				    System.out.println(password);
					ResultSet rs = pstmt.executeQuery();
					if(rs.next()) {
						rs.close();
						pstmt.close();
						dispose();
						AppHome apphome = new AppHome();
						apphome.setVisible(true);
					}{
						//System.out.println("유저명과 비밀번호를 확인하세요.");
					}
					
				}catch(SQLException elogin) {
					System.out.println("유저명과 비밀번호를 확인하세요.");
				}
				
			}
		});
		btnLogin.setBounds(219, 211, 97, 23);
		contentPane.add(btnLogin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("프로그램을 모두 종료합니다.");
				if(DBUtil.dbconn != null) DBUtil.DBClose();
				System.exit(0);
			}
		});
		btnExit.setBounds(328, 228, 97, 23);
		contentPane.add(btnExit);
	}
}
