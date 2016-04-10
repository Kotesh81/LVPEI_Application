import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import java.awt.Window.Type;


public class GUITest {

	private JFrame frmPediperi;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUITest window = new GUITest();
					window.frmPediperi.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUITest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * Designing The MAin Layout Of The Application
	 */
	
	private void initialize() {
		
		// Define The Frame TO Add All The Components
		frmPediperi = new JFrame("                                             PEDIATRIC-PERIMETER");
		frmPediperi.setType(Type.POPUP);
		frmPediperi.setBounds(100, 100, 450, 300);
		frmPediperi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPediperi.getContentPane().setLayout(null);
		
		//Defining A Button
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.setBounds(73, 215, 89, 23);
		frmPediperi.getContentPane().add(btnNewButton);
		//Defining A Button
		JButton btnNewButton_1 = new JButton("Start Anyway");
		btnNewButton_1.setBounds(246, 215, 123, 23);
		frmPediperi.getContentPane().add(btnNewButton_1);
		
		//Defining A Text Field To Enter Name Of The Patient
		textField = new JTextField();
		textField.setBounds(198, 31, 160, 20);
		frmPediperi.getContentPane().add(textField);
		
		textField.setColumns(25);
		//Defining A Text Field To Enter Age Of The Patient
		textField_1 = new JTextField();
		textField_1.setBounds(91, 62, 54, 20);
		frmPediperi.getContentPane().add(textField_1);
		textField_1.setColumns(2);
		//Defining A Label
		JLabel lblNewLabel = new JLabel("Name Of The Patient ");
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setBounds(44, 34, 120, 14);
		frmPediperi.getContentPane().add(lblNewLabel);
		//Defining A Label
		JLabel lblNewLabel_1 = new JLabel("Age");
		lblNewLabel_1.setBounds(44, 59, 46, 23);
		frmPediperi.getContentPane().add(lblNewLabel_1);
		//Defining A Label
		JLabel lblNewLabel_2 = new JLabel("Gender");
		lblNewLabel_2.setBounds(198, 65, 46, 14);
		frmPediperi.getContentPane().add(lblNewLabel_2);
		//Defining The 6 Check Boxes Required
		JCheckBox chckbxNewCheckBox = new JCheckBox("Option-1");
		chckbxNewCheckBox.setBounds(44, 104, 97, 23);
		frmPediperi.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxOption = new JCheckBox("Option-2");
		chckbxOption.setBounds(172, 104, 97, 23);
		frmPediperi.getContentPane().add(chckbxOption);
		
		JCheckBox chckbxOption_1 = new JCheckBox("Option-3");
		chckbxOption_1.setBounds(284, 104, 97, 23);
		frmPediperi.getContentPane().add(chckbxOption_1);
		
		JCheckBox chckbxOption_4 = new JCheckBox("Option-6");
		chckbxOption_4.setBounds(284, 153, 97, 23);
		frmPediperi.getContentPane().add(chckbxOption_4);
		
		JCheckBox chckbxOption_3 = new JCheckBox("Option-5");
		chckbxOption_3.setBounds(172, 153, 97, 23);
		frmPediperi.getContentPane().add(chckbxOption_3);
		
		JCheckBox chckbxOption_2 = new JCheckBox("Option-4");
		chckbxOption_2.setBounds(44, 153, 97, 23);
		frmPediperi.getContentPane().add(chckbxOption_2);
		
		// Defining The Combo Box To Select The Gender
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"(Select)","Male", "Female", "Others"}));
		comboBox.setBounds(267, 62, 91, 20);
		frmPediperi.getContentPane().add(comboBox);
	}
}
