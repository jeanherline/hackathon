package NUBLMS;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

public class LibrarySystem extends ConnectionDb {

	public JFrame libraryFrame;
	public JTextField txtStudName;
	public JTextField txtStudID;
	public JTextField txtStudEmail;
	public JTextField txtStudContact;
	public JTextField txtStudAddress;
	public JTextField txtSearch;
	public JTextField txtStudSection;
	
	JLabel lblStudentId;
	JLabel lblCourse;
	JLabel lblStudentSex;
	JLabel lblSection;
	JLabel lblContactNumber;
	JLabel lblAddress;
	JComboBox<String> cmbSex;
	JComboBox<Object> cmbDept;
	JComboBox<Object> cmbCourse;
	JLabel lblSearch;

	
	public LibrarySystem() {
		initialize();
	}


	private void initialize() {
		libraryFrame = new JFrame("Library Management System");
		libraryFrame.setBounds(100, 100, 800, 700);
		libraryFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		libraryFrame.getContentPane().setLayout(null);
		libraryFrame.setLocationRelativeTo(null);

		JPanel panel;
		JLabel lblStudInfo;
		JLabel lblDetails;
		JLabel lblStudName;
		JLabel lblStudID;
		JLabel lblDepartment;
		
		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(200, 108, 390, 36);
		libraryFrame.getContentPane().add(panel);

		lblStudInfo = new JLabel("STUDENT INFORMATION");
		lblStudInfo.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblStudInfo.setForeground(Color.WHITE);
		panel.add(lblStudInfo);

		lblDetails = new JLabel("Please enter the following details.");
		lblDetails.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDetails.setBounds(300, 156, 217, 20);
		libraryFrame.getContentPane().add(lblDetails);

		lblStudName = new JLabel("Student Name:");
		lblStudName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStudName.setBounds(100, 254, 104, 14);
		libraryFrame.getContentPane().add(lblStudName);

		txtStudName = new JTextField();
		txtStudName.setBounds(220, 252, 104, 20);
		libraryFrame.getContentPane().add(txtStudName);
		txtStudName.setColumns(10);

		lblStudID = new JLabel("Student ID:");
		lblStudID.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStudID.setBounds(316, 211, 87, 14);
		libraryFrame.getContentPane().add(lblStudID);

		txtStudID = new JTextField();
		txtStudID.setColumns(10);
		txtStudID.setBounds(413, 209, 104, 20);
		libraryFrame.getContentPane().add(txtStudID);

		lblDepartment = new JLabel("Department:");
		lblDepartment.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDepartment.setBounds(376, 322, 104, 14);
		libraryFrame.getContentPane().add(lblDepartment);

		txtStudEmail = new JTextField();
		txtStudEmail.setColumns(10);
		txtStudEmail.setBounds(220, 283, 104, 20);
		libraryFrame.getContentPane().add(txtStudEmail);

		lblStudentId = new JLabel("Email:");
		lblStudentId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStudentId.setBounds(100, 285, 104, 14);
		libraryFrame.getContentPane().add(lblStudentId);

		lblCourse = new JLabel("College Course:");
		lblCourse.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCourse.setBounds(376, 347, 104, 18);
		libraryFrame.getContentPane().add(lblCourse);

		lblStudentSex = new JLabel("Sex:");
		lblStudentSex.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStudentSex.setBounds(100, 316, 104, 14);
		libraryFrame.getContentPane().add(lblStudentSex);

		lblSection = new JLabel("Section:");
		lblSection.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSection.setBounds(376, 291, 104, 14);
		libraryFrame.getContentPane().add(lblSection);

		txtStudContact = new JTextField();
		txtStudContact.setColumns(10);
		txtStudContact.setBounds(220, 345, 104, 20);
		libraryFrame.getContentPane().add(txtStudContact);

		lblContactNumber = new JLabel("Contact Number:");
		lblContactNumber.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblContactNumber.setBounds(100, 347, 110, 14);
		libraryFrame.getContentPane().add(lblContactNumber);

		lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAddress.setBounds(376, 254, 104, 14);
		libraryFrame.getContentPane().add(lblAddress);

		txtStudAddress = new JTextField();
		txtStudAddress.setColumns(10);
		txtStudAddress.setBounds(486, 252, 187, 20);
		libraryFrame.getContentPane().add(txtStudAddress);
		
		cmbSex = new JComboBox<String>();
		cmbSex.setModel(new DefaultComboBoxModel<String>(new String[] {"Male", "Female"}));
		cmbSex.setBounds(220, 314, 104, 22);
		libraryFrame.getContentPane().add(cmbSex);

		cmbDept = new JComboBox<Object>();
		cmbDept.setModel(new DefaultComboBoxModel<Object>(new String[] {"College of Engineering & Technology", "College of Arts & Sciences", "College of Accountancy & Business Management"}));
		cmbDept.setBounds(486, 319, 237, 22);
		libraryFrame.getContentPane().add(cmbDept);

		cmbCourse = new JComboBox<Object>();
		cmbCourse.setModel(new DefaultComboBoxModel<Object>(new String[] {"BS in Information Technology", "BS in Architecture", "BS in Computer Engineering", "BS in Civil Engineering", "BS in Psychology", "BS in Physical Education", "BS in Accountancy", "BS in Accounting Information", "BS in Business Administration (Marketing Management)", "BS in Business Administration Financial Management)", "BS in Hospitality Management", "BS in Tourism Management"}));
		cmbCourse.setBounds(376, 373, 347, 23);
		libraryFrame.getContentPane().add(cmbCourse);

		lblSearch = new JLabel("Search/Delete by Student ID:");
		lblSearch.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSearch.setBounds(173, 496, 194, 14);
		libraryFrame.getContentPane().add(lblSearch);

		txtSearch = new JTextField();
		txtSearch.setColumns(10);
		txtSearch.setBounds(374, 494, 137, 20);
		libraryFrame.getContentPane().add(txtSearch);


		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				save(txtStudID, txtStudName, txtStudEmail, cmbSex, cmbDept, cmbCourse, txtStudSection, txtStudContact, txtStudAddress);

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(145, 526, 89, 23);
		libraryFrame.getContentPane().add(btnNewButton);

		JButton btnViewList = new JButton("View List");
		btnViewList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudTable window = new StudTable();
				window.tblFrame.setVisible(true);
				window.tblFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		btnViewList.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnViewList.setBounds(250, 526, 89, 23);
		libraryFrame.getContentPane().add(btnViewList);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update(txtStudID, txtStudName,txtStudEmail, cmbSex, cmbDept, cmbCourse, txtStudSection, txtStudContact, txtStudAddress);
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnUpdate.setBounds(346, 526, 89, 23);
		libraryFrame.getContentPane().add(btnUpdate);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cancel(txtStudID, txtStudName, txtStudEmail, cmbSex, cmbDept, cmbCourse, txtStudSection, txtStudContact, txtStudAddress);
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCancel.setBounds(443, 526, 89, 23);
		libraryFrame.getContentPane().add(btnCancel);

		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				delete(txtSearch,txtStudID, txtStudName, txtStudEmail, cmbSex, cmbDept, cmbCourse, txtStudSection, txtStudContact, txtStudAddress);
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDelete.setBounds(542, 526, 89, 23);
		libraryFrame.getContentPane().add(btnDelete);

		JButton btnBorrowABook = new JButton("Borrow a Book");
		btnBorrowABook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BorrowBook window = new BorrowBook();
				window.borrowFrame.setVisible(true);
				window.borrowFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

			}
		});
		btnBorrowABook.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBorrowABook.setBounds(220, 417, 144, 23);
		libraryFrame.getContentPane().add(btnBorrowABook);

		JButton btnReturnABook = new JButton("Return a Book");
		btnReturnABook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReturnBook window = new ReturnBook();
				window.returnFrame.setVisible(true);
				window.returnFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		btnReturnABook.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnReturnABook.setBounds(429, 417, 144, 23);
		libraryFrame.getContentPane().add(btnReturnABook);

		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String messageBox = ("Are you sure you want to delete the Student Data?");
				Toolkit.getDefaultToolkit().beep();
				int answer = JOptionPane.showConfirmDialog(null, messageBox, "Exit", JOptionPane.YES_NO_OPTION);

				if(answer == JOptionPane.YES_OPTION) {
					Login window = new Login();
					window.loginFrame.setVisible(true);
					libraryFrame.setVisible(false);
					libraryFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					
				} else if(answer == JOptionPane.NO_OPTION) {
					//tablePopulate(tblStd);
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showMessageDialog (null, "Logout has been cancelled.");
	
				}
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLogout.setBounds(330, 561, 119, 23);
		libraryFrame.getContentPane().add(btnLogout);

		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtSearch.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Invalid Input");

				} else {
					StudTable window = new StudTable();
					window.tblFrame.setVisible(true);
					window.tblFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

					search(txtSearch, StudTable.table);
					tablePopulate(StudTable.table);
				}
			}
		});

		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSearch.setBounds(521, 492, 89, 23);
		libraryFrame.getContentPane().add(btnSearch);

		txtStudSection = new JTextField();
		txtStudSection.setColumns(10);
		txtStudSection.setBounds(486, 289, 187, 20);
		libraryFrame.getContentPane().add(txtStudSection);

		JLabel lblBackground = new JLabel("New label");
		lblBackground.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\omsim.png"));
		lblBackground.setBounds(0, 0, 784, 661);
		libraryFrame.getContentPane().add(lblBackground);


	}
}
