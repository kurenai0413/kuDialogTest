package kuDialogTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.*;
import kuDialogTest.kuCppWrapperTest;

public class kuDialogTest extends JDialog {
	
	JLabel 			 IndicatorLabel   = new JLabel();
	JLabel  		 ResultLabel      = new JLabel();
	JButton 		 Button1 	   	  = new JButton();
	kuActionListener kkActionListener = new kuActionListener();
	kuCppWrapperTest kkWrapperTest = new kuCppWrapperTest();
	
	public kuDialogTest() {
		// TODO Auto-generated constructor stub
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setTitle("kuDialogTest");
		setBounds(100, 100, 500, 400);
		getContentPane().setLayout(null);
		
		IndicatorLabel.setText("kk: please type in text:");
		IndicatorLabel.setBounds(20, 10, 175, 29);
		getContentPane().add(IndicatorLabel);
		
		final JTextField name = new JTextField();
		name.setBounds(20, 40, 175, 20);
		getContentPane().add(name);
				
		Button1.setText("Button1");
		Button1.setName("Button1");
		Button1.addActionListener(kkActionListener);
		Button1.setBounds(20, 75, 85, 25);
		getContentPane().add(Button1);
		
		ResultLabel.setBounds(20, 110, 200, 35);
		ResultLabel.setText("Result: ");
		getContentPane().add(ResultLabel);
	}
	
	public static void main(String[] args) {
		kuDialogTest kkDialog = new kuDialogTest();
		kkDialog.setVisible(true);
	}
	
	private class kuActionListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == Button1)
			{
				//ResultLabel.setText(Button1.getName() + " is clicked");
				
				int aa = kkWrapperTest.kuWrapperAddTest(5, 3);
				ResultLabel.setText("5 + 3 is " + aa);
			}
		}
	}
	
}
