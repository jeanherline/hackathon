package NUBLMS;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Login extends ConnectionDb {

	public JFrame loginFrame;
	public JTextField txtUsername;
	public JPasswordField txtPassword;

	public Login() {
		initialize();
	}

	private void initialize() {
		loginFrame = new JFrame("Login");
		loginFrame.setBounds(100, 100, 450, 300);
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginFrame.getContentPane().setLayout(null);
		loginFrame.setLocationRelativeTo(null);

		JPanel loginPanel = new JPanel();
		loginPanel.setBackground(Color.BLACK);
		loginPanel.setBounds(100, 36, 236, 29);
		loginFrame.getContentPane().add(loginPanel);

		JLabel lblLogin = new JLabel("LOGIN ACCOUNT");
		loginPanel.add(lblLogin);
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUsername.setBounds(115, 95, 80, 14);
		loginFrame.getContentPane().add(lblUsername);

		txtUsername = new JTextField();
		txtUsername.setColumns(10);
		txtUsername.setBounds(207, 93, 116, 20);
		loginFrame.getContentPane().add(txtUsername);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPassword.setBounds(115, 126, 80, 14);
		loginFrame.getContentPane().add(lblPassword);

		txtPassword = new JPasswordField();
		txtPassword.setBounds(207, 124, 116, 20);
		loginFrame.getContentPane().add(txtPassword);

		JButton btnSignIn = new JButton("Sign in");
		btnSignIn.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {

				String getUsername = txtUsername.getText();
				@SuppressWarnings("deprecation")
				String getPassword = txtPassword.getText();
				
		
				if (getUsername.contains("NUBaliwag") && getPassword.contains("TechFest2022")){
				LibrarySystem window = new LibrarySystem();
				window.libraryFrame.setVisible(true);
				} else if (getUsername.isEmpty() && getPassword.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Input not found.");
				} else if (getUsername.isEmpty()){
					JOptionPane.showMessageDialog(null, "Username is blank."); 
				} else if (getPassword.isEmpty()){
					JOptionPane.showMessageDialog(null, "Password is blank."); 
				} else {
					JOptionPane.showMessageDialog(null, "Wrong input."); 
				}
				
			} 
		});



		btnSignIn.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSignIn.setBounds(174, 175, 89, 23);
		loginFrame.getContentPane().add(btnSignIn);
	}
}
