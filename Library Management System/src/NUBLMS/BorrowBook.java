package NUBLMS;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class BorrowBook extends ConnectionDb {

	public JFrame borrowFrame;
	private JTextField txtBorrowDay;
	private JTextField txtBorrowMonth;
	private JTextField txtBorrowYear;
	private JTextField txtBorrowID;

	public BorrowBook() {
		initialize();
	}

	private void initialize() {
		borrowFrame = new JFrame("Borrow");
		borrowFrame.setBounds(100, 100, 500, 350);
		borrowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		borrowFrame.setLocationRelativeTo(borrowFrame);
		borrowFrame.getContentPane().setLayout(null);
		
		JPanel loginPanel = new JPanel();
		loginPanel.setBackground(Color.BLACK);
		loginPanel.setBounds(126, 30, 236, 29);
		borrowFrame.getContentPane().add(loginPanel);
		
		JLabel lblBorrowABook = new JLabel("BORROW A BOOK");
		lblBorrowABook.setForeground(Color.WHITE);
		lblBorrowABook.setFont(new Font("Tahoma", Font.PLAIN, 16));
		loginPanel.add(lblBorrowABook);
		
		JLabel lblChoose = new JLabel("Choose from the available books below:");
		lblChoose.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblChoose.setBounds(126, 71, 236, 14);
		borrowFrame.getContentPane().add(lblChoose);
		
		JComboBox<Object> cmbBorrowBooks = new JComboBox<Object>();
		cmbBorrowBooks.setModel(new DefaultComboBoxModel<Object>(new String[] {"Java for Intermediate Use", "C#: The Learning Path", "php: Road to Web Development", "Laravel: Web Frameworks", "Github for Beginners", "C++ Notes for Professional", "AngularJS for Dummies", "Beyond Web: Internet 3.0", "The Age of Technology: Innovation", "Python Crash Course"}));
		cmbBorrowBooks.setBounds(126, 96, 236, 22);
		borrowFrame.getContentPane().add(cmbBorrowBooks);
		
		JButton btnBorrow = new JButton("Borrow");
		btnBorrow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Progress on Pause
				/*
				 * String getBorrowID = txtBorrowID.getText(); String getBorrowBook =
				 * cmbBorrowBooks.getSelectedItem().toString(); String getBorrowDay =
				 * txtBorrowDay.getText().toString(); String getBorrowMonth =
				 * txtBorrowMonth.getText(); String getBorrowYear = txtBorrowYear.getText();
				 * 
				 * saveBook(getBorrowID,getBorrowBook, getBorrowDay,
				 * getBorrowMonth,getBorrowYear);
				 */
				 
				
			}
		});

		btnBorrow.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBorrow.setBounds(174, 248, 144, 23);
		borrowFrame.getContentPane().add(btnBorrow);
		
		txtBorrowDay = new JTextField();
		txtBorrowDay.setColumns(10);
		txtBorrowDay.setBounds(231, 162, 116, 20);
		borrowFrame.getContentPane().add(txtBorrowDay);
		
		JLabel lblMonth = new JLabel("Month of Due:");
		lblMonth.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMonth.setBounds(126, 193, 97, 14);
		borrowFrame.getContentPane().add(lblMonth);
		
		txtBorrowMonth = new JTextField();
		txtBorrowMonth.setColumns(10);
		txtBorrowMonth.setBounds(231, 191, 116, 20);
		borrowFrame.getContentPane().add(txtBorrowMonth);
		
		JLabel lblYear = new JLabel("Year of Due:");
		lblYear.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblYear.setBounds(126, 219, 92, 18);
		borrowFrame.getContentPane().add(lblYear);
		
		txtBorrowYear = new JTextField();
		txtBorrowYear.setColumns(10);
		txtBorrowYear.setBounds(231, 219, 116, 20);
		borrowFrame.getContentPane().add(txtBorrowYear);
		
		JLabel lblDuration = new JLabel("Day of Due:");
		lblDuration.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDuration.setBounds(126, 164, 80, 14);
		borrowFrame.getContentPane().add(lblDuration);
		
		JLabel lblStudentId = new JLabel("Student ID:");
		lblStudentId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStudentId.setBounds(126, 139, 80, 14);
		borrowFrame.getContentPane().add(lblStudentId);
		
		txtBorrowID = new JTextField();
		txtBorrowID.setColumns(10);
		txtBorrowID.setBounds(231, 135, 116, 20);
		borrowFrame.getContentPane().add(txtBorrowID);
		
		
	}
}
