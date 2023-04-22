package NUBLMS;


import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;

public class StudTable extends ConnectionDb{

	public JFrame tblFrame;
	public static JTable table;
	private JLabel lblNewLabel;
	
	JPanel panel;
	private JScrollPane scrollPane;


	public StudTable() {
		initialize();
	}


	private void initialize() {
		tblFrame = new JFrame("Table");
		tblFrame.setBounds(100, 100, 800, 400);
		tblFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tblFrame.getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(46, 65, 696, 285);
		tblFrame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		tablePopulate(table);
		tblFrame.setLocationRelativeTo(tblFrame);
		
		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setForeground(Color.BLACK);
		panel.setBounds(245, 11, 272, 43);
		tblFrame.getContentPane().add(panel);
		
		lblNewLabel = new JLabel("LIST OF STUDENTS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setForeground(Color.WHITE);
		panel.add(lblNewLabel);
		
		
	}
}
