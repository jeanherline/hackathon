package NUBLMS;

import java.awt.Toolkit;
import java.sql.*;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

public class ConnectionDb {

	static Connection con;
	static PreparedStatement sqlStatement;
	static ResultSet rs;

	final static String connection = "jdbc:mysql://localhost:3306/library";
	final static String username = "myLibrary";
	final static String password = "nubaliwag2022";

	static String qryAll;
	static String qryFind;
	static String qryUpdate;
	static String qryDelete;
	static String qryCheck;

	public static void connectionDb() {

		try {
			con = DriverManager.getConnection(connection, username, password);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	//Connection Establish
	public static void conEstablish() {

		try {
			con = DriverManager.getConnection(connection, username, password);

			if(con!=null) {
				System.out.println("Connection Established!");
			} else {
				System.out.println("Error Connection!");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	//Connection Close
	public static void close() {
		try {
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	//Search Method
	public void search(JTextField txtSearch, JTable tblStd) {
		try {
			connectionDb();
			qryFind = "SELECT * FROM tblstudents WHERE studID = ?";

			sqlStatement = con.prepareStatement(qryFind);
			sqlStatement.setString(1, txtSearch.getText());
			rs = sqlStatement.executeQuery();
			StudTable.table.setModel(DbUtils.resultSetToTableModel(rs));

			close();

		}catch(Exception e) {System.out.print(e);}
	}

	//Save Method
	public static void save(JTextField txtStudID, JTextField txtStudName, JTextField txtStudEmail, JComboBox<String> cmbSex, JComboBox<Object> cmbDept, JComboBox<Object> cmbCourse, JTextField txtStudSection, JTextField txtStudContact, JTextField txtStudAddress){
		String getStudID = txtStudID.getText();
		String getStudName = txtStudName.getText();
		String getStudEmail = txtStudEmail.getText();
		String getStudSex = cmbSex.getSelectedItem().toString();
		String getStudDept = cmbDept.getSelectedItem().toString();
		String getStudCourse = cmbCourse.getSelectedItem().toString();
		String getStudSection = txtStudSection.getText();
		String getStudContact = txtStudContact.getText();
		String getStudAddress = txtStudAddress.getText();


		if(getStudID.equals("") || getStudName.equals("")) {
			Toolkit.getDefaultToolkit().beep();
			JOptionPane.showMessageDialog(null,"Invalid! Input not found.");
		}else {
			try {
				connectionDb();
				sqlStatement = con.prepareStatement("INSERT into tblStudents (studName, studID, studEmail, studSex, studDept, studCourse, studSection, studContact, studAddress) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");

				sqlStatement.setString(1, getStudName);
				sqlStatement.setString(2, getStudID);
				sqlStatement.setString(3, getStudEmail);
				sqlStatement.setString(4, getStudSex);
				sqlStatement.setString(5, getStudDept);
				sqlStatement.setString(6, getStudCourse);
				sqlStatement.setString(7, getStudSection);
				sqlStatement.setString(8, getStudContact);
				sqlStatement.setString(9, getStudAddress);

				sqlStatement.executeUpdate();

				//tablePopulate(tblStudents);
				JOptionPane.showMessageDialog(null, "Record Created!");

				close();

			}catch(Exception er) {System.out.print(er);}
		}
	}

	//Table View
	public void tablePopulate(JTable tblStud) {
		try {
			connectionDb();
			qryAll = "select * from tblstudents";

			sqlStatement = con.prepareStatement(qryAll);
			rs = sqlStatement.executeQuery(qryAll);
			tblStud.setModel(DbUtils.resultSetToTableModel(rs));

			close();

		}catch(Exception er){System.out.print(er);}
	}

	//Clear Data
	public static void cancel(JTextField txtStudID, JTextField txtStudName, JTextField txtStudEmail, JComboBox<String> cmbSex, JComboBox<Object> cmbDept, JComboBox<Object> cmbCourse, JTextField txtStudSection, JTextField txtStudContact, JTextField txtStudAddress) {
		String getStudID = txtStudID.getText();
		String getStudName = txtStudName.getText();


		if(getStudID.equals("") || getStudName.equals("")) {
			Toolkit.getDefaultToolkit().beep();
			JOptionPane.showMessageDialog(null,"There is no input data to be cleared out.");
		} else  {
			try {
				txtStudID.setText("");
				txtStudName.setText("");
				txtStudEmail.setText("");
				cmbSex.setSelectedIndex(0);
				cmbDept.setSelectedIndex(0);
				cmbCourse.setSelectedIndex(0);
				txtStudSection.setText("");
				txtStudContact.setText("");
				txtStudAddress.setText("");
				txtStudID.requestFocusInWindow();

				JOptionPane.showMessageDialog(null, "Record input has been cleared.");

			}catch(Exception er){System.out.print(er);}
		}
	}

	//Update Student Data
	public static void update(JTextField txtStudID, JTextField txtStudName, JTextField txtStudEmail, JComboBox<String> cmbSex, JComboBox<Object> cmbDept, JComboBox<Object> cmbCourse, JTextField txtStudSection, JTextField txtStudContact, JTextField txtStudAddress) {

		String getStudID = txtStudID.getText();
		String getStudName = txtStudName.getText();
		String getStudEmail = txtStudEmail.getText();
		String getStudSex = cmbSex.getSelectedItem().toString();
		String getStudDept = cmbDept.getSelectedItem().toString();
		String getStudCourse = cmbCourse.getSelectedItem().toString();
		String getStudSection = txtStudSection.getText();
		String getStudContact = txtStudContact.getText();
		String getStudAddress = txtStudAddress.getText();

		if(getStudID.equals("") || getStudName.equals("")) {
			Toolkit.getDefaultToolkit().beep();
			JOptionPane.showMessageDialog(null,"Invalid! Input not found.");

		}else{
			try {
				//Updated
				String messageBox = ("Are you sure you want to update the Student Data?");
				Toolkit.getDefaultToolkit().beep();
				int answer = JOptionPane.showConfirmDialog(null, messageBox, "Exit", JOptionPane.YES_NO_OPTION);

				if(answer == JOptionPane.YES_OPTION) {
					connectionDb();

					qryUpdate = "UPDATE tblstudents SET studName = ?, studID = ?, studEmail = ?, studSex = ?, studDept = ?, studCourse = ?, studSection = ?, studContact = ?, studAddress = ? WHERE studID = ?";
					sqlStatement = con.prepareStatement(qryUpdate);

					sqlStatement.setString(1, getStudName);
					sqlStatement.setString(2, getStudID);
					sqlStatement.setString(3, getStudEmail);
					sqlStatement.setString(4, getStudSex);
					sqlStatement.setString(5, getStudDept);
					sqlStatement.setString(6, getStudCourse);
					sqlStatement.setString(7, getStudSection);
					sqlStatement.setString(8, getStudContact);
					sqlStatement.setString(9, getStudAddress);
					sqlStatement.setString(10, getStudID);

					sqlStatement.executeUpdate();
					//tablePopulate(tblStd);
					JOptionPane.showMessageDialog(null, "Record Updated!");

					con.close();

					//Update Cancel
				} else if(answer == JOptionPane.NO_OPTION) {

					//tablePopulate(tblStd);
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showMessageDialog (null, "Updating of Student " + txtStudID.getText()+" has been cancelled.");

					close();
				}

			}catch(Exception er) {System.out.print(er);}
		}
	}

	//Student Exist
	public static boolean checkDelete(JTextField txtSearch) {
		try {
			connectionDb();
			qryCheck = "SELECT * FROM tblstudents WHERE studID = ?";

			sqlStatement = con.prepareStatement(qryCheck);
			sqlStatement.setString(1, txtSearch.getText());

			rs = sqlStatement.executeQuery();

			while(rs.next()) {
				close();
				return true;
			}
		} catch (Exception e) {System.out.println(e.toString());} 

		return false;
	}

	//Delete Method
	public static void delete(JTextField txtSearch, JTextField txtStudID, JTextField txtStudName, JTextField txtStudEmail, JComboBox<String> cmbSex, JComboBox<Object> cmbDept, JComboBox<Object> cmbCourse, JTextField txtStudSection, JTextField txtStudContact, JTextField txtStudAddress) {

		if(checkDelete(txtSearch)) {
			try {
				//Deletion Alert
				String messageBox = ("Are you sure you want to delete the Student Data?");
				Toolkit.getDefaultToolkit().beep();
				int answer = JOptionPane.showConfirmDialog(null, messageBox, "Exit", JOptionPane.YES_NO_OPTION);

				if(answer == JOptionPane.YES_OPTION) {
					close();
					connectionDb();
					qryDelete = "DELETE FROM tblstudents WHERE studID = ?";

					sqlStatement = con.prepareStatement(qryDelete);
					sqlStatement.setString(1, txtSearch.getText());
					sqlStatement.execute();

					close();

					//tablePopulate(tblStd);
					JOptionPane.showMessageDialog (null, "Student " + txtSearch.getText()+" has been deleted.");

					//Deletion Cancelled
				} else if(answer == JOptionPane.NO_OPTION) {
					//tablePopulate(tblStd);
					Toolkit.getDefaultToolkit().beep();

					JOptionPane.showMessageDialog (null, "Deletion of Student " + txtSearch.getText()+" has been cancelled.");
					con.close();
				}

			} catch (Exception e) {System.out.println(e.toString());}


		} else if (!txtStudID.getText().isEmpty() || (!txtStudName.getText().isEmpty())) {
			Toolkit.getDefaultToolkit().beep();
			JOptionPane.showMessageDialog (null, "Please delete a Student Data using the Search text field.");

		}else {
			Toolkit.getDefaultToolkit().beep();
			JOptionPane.showMessageDialog (null, "Student " + txtSearch.getText()+" not found!");
		}

	}
	public static void saveBook(JTextField txtBorrowID, JComboBox<Object> cmbBorrowBooks, JTextField txtBorrowDay,JTextField txtBorrowMonth,JTextField txtBorrowYear){
		String getBorrowID = txtBorrowID.getText();
		String getBorrowBook = cmbBorrowBooks.getSelectedItem().toString();
		String getBorrowDay = txtBorrowDay.getText();
		String getBorrowMonth = txtBorrowMonth.getText();
		String getBorrowYear = txtBorrowYear.getText();

		if(getBorrowID.equals("")) {
			Toolkit.getDefaultToolkit().beep();
			JOptionPane.showMessageDialog(null,"Invalid! Input not found.");
		}else {
			try {
				con = DriverManager.getConnection(connection, username, password);
				sqlStatement = con.prepareStatement("INSERT into tblStudents (studName, studID, studEmail, studSex, studDept, studCourse, studSection, studContact, studAddress) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");

				con = DriverManager.getConnection(connection, username, password);
				sqlStatement = con.prepareStatement("INSERT into tblbooks (studID, book, day, month, year) VALUES (?, ?, ?, ?, ?)");
				sqlStatement.setString(1, getBorrowID);
				sqlStatement.setString(2, getBorrowBook);
				sqlStatement.setString(3, getBorrowDay);
				sqlStatement.setString(4, getBorrowMonth);
				sqlStatement.setString(5, getBorrowYear);
				sqlStatement.executeUpdate();

				//tablePopulate(tblStudents);
				JOptionPane.showMessageDialog(null, "Record Created!");

				close();

			}catch(Exception er) {System.out.print(er);}
		}
	}
}

	



