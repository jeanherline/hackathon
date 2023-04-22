package NUBLMS;

import java.awt.EventQueue;

public class Main {

		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Login window = new Login();
						window.loginFrame.setVisible(true);	

					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	}

