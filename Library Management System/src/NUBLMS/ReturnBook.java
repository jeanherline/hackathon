package NUBLMS;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ReturnBook extends ConnectionDb {

	public JFrame returnFrame;
	private JTextField txtReturnID;
	private JTextField txtReturnDay;
	private JTextField txtReturnMonth;
	private JTextField txtReturnYear;


	public ReturnBook() {
		initialize();
	}

	private void initialize() {
		returnFrame = new JFrame("Return");
		returnFrame.setBounds(100, 100, 500, 350);
		returnFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		returnFrame.getContentPane().setLayout(null);
		returnFrame.setLocationRelativeTo(returnFrame);
		
		JLabel lblNewLabel_1 = new JLabel("Choose from the available books below:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(125, 74, 236, 14);
		returnFrame.getContentPane().add(lblNewLabel_1);
		
		JComboBox<Object> cmbBooks = new JComboBox<Object>();
		cmbBooks.setModel(new DefaultComboBoxModel<Object>(new String[] {"Java for Intermediate Use", "C#: The Learning Path", "php: Road to Web Development", "Laravel: Web Frameworks", "Github for Beginners", "C++ Notes for Professional", "AngularJS for Dummies", "Beyond Web: Internet 3.0", "The Age of Technology: Innovation", "Python Crash Course"}));
		cmbBooks.setBounds(125, 109, 236, 22);
		returnFrame.getContentPane().add(cmbBooks);
		
		JPanel loginPanel = new JPanel();
		loginPanel.setBackground(Color.BLACK);
		loginPanel.setBounds(125, 34, 236, 29);
		returnFrame.getContentPane().add(loginPanel);
		
		JLabel lblBorrowABook = new JLabel("RETURN A BOOK");
		lblBorrowABook.setForeground(Color.WHITE);
		lblBorrowABook.setFont(new Font("Tahoma", Font.PLAIN, 16));
		loginPanel.add(lblBorrowABook);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnReturn.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnReturn.setBounds(173, 260, 144, 23);
		returnFrame.getContentPane().add(btnReturn);
		
		JLabel lblStudentId = new JLabel("Student ID:");
		lblStudentId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStudentId.setBounds(125, 147, 80, 14);
		returnFrame.getContentPane().add(lblStudentId);
		
		txtReturnID = new JTextField();
		txtReturnID.setColumns(10);
		txtReturnID.setBounds(240, 145, 116, 20);
		returnFrame.getContentPane().add(txtReturnID);
		
		JLabel lblDayReturned = new JLabel("Day Returned:");
		lblDayReturned.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDayReturned.setBounds(125, 174, 105, 14);
		returnFrame.getContentPane().add(lblDayReturned);
		
		txtReturnDay = new JTextField();
		txtReturnDay.setColumns(10);
		txtReturnDay.setBounds(240, 172, 116, 20);
		returnFrame.getContentPane().add(txtReturnDay);
		
		txtReturnMonth = new JTextField();
		txtReturnMonth.setColumns(10);
		txtReturnMonth.setBounds(240, 201, 116, 20);
		returnFrame.getContentPane().add(txtReturnMonth);
		
		JLabel lblMonthReturned = new JLabel("Month Returned:");
		lblMonthReturned.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMonthReturned.setBounds(125, 203, 116, 14);
		returnFrame.getContentPane().add(lblMonthReturned);
		
		JLabel lblYearReturned = new JLabel("Year Returned:");
		lblYearReturned.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblYearReturned.setBounds(125, 231, 116, 18);
		returnFrame.getContentPane().add(lblYearReturned);
		
		txtReturnYear = new JTextField();
		txtReturnYear.setColumns(10);
		txtReturnYear.setBounds(240, 229, 116, 20);
		returnFrame.getContentPane().add(txtReturnYear);
		
		
		
		
	}

}
