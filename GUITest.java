
import java.awt.EventQueue;

/* Swing Libraries To Create The GUI */
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

/* Apache Libraries For Performing OPerations On MS EXCEL (.XLSX) */ 

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;


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
		//Set The Title OF The Frame in The Argumens
		frmPediperi = new JFrame("                                             PEDIATRIC-PERIMETER");
		// Set The Size/Boundaries OF The Frame 
		//@Args : Top, Bottom, Left, Right
		frmPediperi.setBounds(100, 100, 450, 300);
		//Close The Window When The Close Button Is Pressed
		frmPediperi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frmPediperi.getContentPane().setLayout(null);
				
		//Defining A Button To Proceed Even WithOut The PAtient Details
		JButton btnNewButton_1 = new JButton("Start Anyway");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		// Set The Position Of The BUtton On The Layout
		//@Args : Top, Bottom, Left, Right
		btnNewButton_1.setBounds(246, 215, 123, 23);
		// Add The Button To The Frame
		frmPediperi.getContentPane().add(btnNewButton_1);
		
		//Defining A Text Field To Enter Name Of The Patient
		textField = new JTextField();
		// Set The Position Of The Text Field On The Layout
		//@Args : Top, Bottom, Left, Right
		textField.setBounds(198, 31, 160, 20);
		//ADd The Button To The Frame
		frmPediperi.getContentPane().add(textField);
		// Width Of The Text Field Displayed ON The Screen
		textField.setColumns(25);

		//Defining A Text Field To Enter Age Of The Patient
		textField_1 = new JTextField();
		//Set The Boundaries / Location Of The Text Field On The Frame
		//@Args : Top, Bottom, Left, Right
		textField_1.setBounds(91, 62, 54, 20);
		// Add The Component To The Frame
		frmPediperi.getContentPane().add(textField_1);
		textField_1.setColumns(2);

		//Defining A Label To The Text Field 
		JLabel lblNewLabel = new JLabel("Name Of The Patient ");
		// Set The Colour Of The Label On The Frame
		lblNewLabel.setBackground(new Color(240, 240, 240));
		//Set The Boundaries/Position Of The Label On The Frame
		//@Args : Top, Bottom, Left, Right
		lblNewLabel.setBounds(44, 34, 120, 14);
		// Add The label Compnent To The Frame
		frmPediperi.getContentPane().add(lblNewLabel);

		//Defining A Label 
		//@Args : Name To Be Displayed ON It
		JLabel lblNewLabel_1 = new JLabel("Age");
		lblNewLabel_1.setBounds(44, 59, 46, 23);
		frmPediperi.getContentPane().add(lblNewLabel_1);

		//Defining A Label
		//@Args : Name To Be Displayed ON It
		JLabel lblNewLabel_2 = new JLabel("Gender");
		lblNewLabel_2.setBounds(198, 65, 46, 14);
		frmPediperi.getContentPane().add(lblNewLabel_2);

	        // Define 6 Check Boxes To Take The Options From The Patient
		
		
		//Define a Check BOx 
		//@Args : Name To Displayed Against It 
		final JCheckBox chckbxNewCheckBox = new JCheckBox("Option-1");
		chckbxNewCheckBox.setBounds(44, 104, 97, 23);
		frmPediperi.getContentPane().add(chckbxNewCheckBox);
		
		//Define a Check BOx 
		//@Args : Name To Displayed Against It
		final JCheckBox chckbxOption = new JCheckBox("Option-2");
		chckbxOption.setBounds(172, 104, 97, 23);
		frmPediperi.getContentPane().add(chckbxOption);

		//Define a Check BOx 
		//@Args : Name To Displayed Against It		
		final JCheckBox chckbxOption_1 = new JCheckBox("Option-3");
		chckbxOption_1.setBounds(284, 104, 97, 23);
		frmPediperi.getContentPane().add(chckbxOption_1);

		//Define a Check BOx 
		//@Args : Name To Displayed Against It	
		final JCheckBox chckbxOption_4 = new JCheckBox("Option-6");
		chckbxOption_4.setBounds(284, 153, 97, 23);
		frmPediperi.getContentPane().add(chckbxOption_4);

		//Define a Check BOx 
		//@Args : Name To Displayed Against It	
		final JCheckBox chckbxOption_3 = new JCheckBox("Option-5");
		chckbxOption_3.setBounds(172, 153, 97, 23);
		frmPediperi.getContentPane().add(chckbxOption_3);


		//Define a Check BOx 
		//@Args : Name To Displayed Against It	
		final JCheckBox chckbxOption_2 = new JCheckBox("Option-4");
		chckbxOption_2.setBounds(44, 153, 97, 23);
		frmPediperi.getContentPane().add(chckbxOption_2);
		
		// Defining The Combo Box To Select The Gender
		final JComboBox comboBox = new JComboBox();
		//Configure The Values To Be Displayed In The Combo Box
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"(Select)","Male", "Female", "Others"}));
		comboBox.setBounds(267, 62, 91, 20);
		frmPediperi.getContentPane().add(comboBox);
		
		//Defining A Button
		JButton btnNewButton = new JButton("Ok");

		/* If Button Is Clicked Then Retrieve All The Information  From The Screen
		 * ( From Text Boxes, Check Boxes And Combo Box).
		 * Retrieved Information Is Updated In The Excel Sheet
		 * Function "WriteExcel" Is Called To Update The INformation IN THe EXCEL Sheet
		 */
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String PatientName;
		// Get The Text Value From The Pateint Name Field Provided On The Screen		
                                PatientName  = textField.getText();
				 
				String PatientAge;
		// Get The Text Value From The Pateint Age Field Provided On The Screen	
				PatientAge   = textField_1.getText();
				
				String PatientGender;
		// Get The Text of The Value Selected In The Combo Box Field Provided On The Screen	
				PatientGender   = comboBox.getSelectedItem().toString();
				
				String P_Option1;
		// Get The Text of The Value OPtion-1 Selected Only When It IS Selected
				 boolean selected = chckbxNewCheckBox.isSelected();
				    if (selected) {
		             P_Option1 = chckbxNewCheckBox.getText();
		             System.out.println("PatientName");
				      // System.out.println("Check box state is selected.");
				    } else {
				      P_Option1 = " ";
				    }
		
		// Get The Text of The Value OPtion-2 Selected Only When It IS Selected		    
				String P_Option2;
				 selected = chckbxOption.isSelected();
				    if (selected) {
				    	P_Option2 = chckbxOption.getText();
				      // System.out.println("Check box state is selected.");
				    } else {
				    	P_Option2 = " ";
				    }
				    System.out.println("PatientName");

		// Get The Text of The Value OPtion-3 Selected Only When It IS Selected
				String P_Option3;
				 selected = chckbxOption_1.isSelected();
				    if (selected) {
				    	P_Option3 = chckbxOption_1.getText();
				      // System.obut.println("Check box state is selected.");
				    } else {
				    	P_Option3 = " ";
				    }
				    System.out.println("PatientName");

		// Get The Text of The Value OPtion-4 Selected Only When It IS Selected
				String P_Option4;
				 selected = chckbxOption_2.isSelected();
				    if (selected) {
				    	P_Option4 = chckbxOption_2.getText();
				      // System.obut.println("Check box state is selected.");
				    } else {
				    	P_Option4 = " ";
				    }
				    System.out.println("PatientName");

		// Get The Text of The Value OPtion-5 Selected Only When It IS Selected
				String P_Option5;
				 selected = chckbxOption_3.isSelected();
				    if (selected) {
				    	P_Option5 = chckbxOption_3.getText();
				      // System.obut.println("Check box state is selected.");
				    } else {
				    	P_Option5 = " ";
				    }
				    System.out.println("PatientName");

		// Get The Text of The Value OPtion-6 Selected Only When It IS Selected
				String P_Option6;
				 selected = chckbxOption_4.isSelected();
				    if (selected) {
				    	P_Option6 = chckbxOption_4.getText();
				      // System.obut.println("Check box state is selected.");
				    } else {
				    	P_Option6 = " ";
				    }
				    System.out.println("PatientName");

		/* Call The Function "WriteExcel" To Append The Values In The Excel Sheet
	
		 */
		
				    try {
  						WriteExcel(PatientName, PatientAge,
								 PatientGender,  P_Option1, P_Option2,
								 P_Option3,  P_Option4,  P_Option5,  P_Option6);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
				
			}
		});
		
		btnNewButton.setBounds(73, 215, 89, 23);
		frmPediperi.getContentPane().add(btnNewButton);
		
	
	}


// Funtion To Apend The EXCel Sheet With The Patient Details
     /* @Args: 
		 *PatientName   - Value Entered In The TExt Box Opposite To The "Name Of Patient" Label
		 *PatientAge    - Value Entered In The TExt Box Opposite To The "Age" Label
	         *PatientGender - Value Entered In The Combo Box Opposite To The "Gender" Label 	
                 *PatientName   - Value Entered In The TExt Box Opposite To The "Name Of Patient" Label
		 *P_Option1     - Text Value Against The Check Box Option - 1 If Selected
   		 *P_Option2     - Text Value Against The Check Box Option - 2 If Selected
		 *P_Option3     - Text Value Against The Check Box Option - 3 If Selected
		 *P_Option4     - Text Value Against The Check Box Option - 4 If Selected
		 *P_Option5     - Text Value Against The Check Box Option - 5 If Selected
		 *P_Option6     - Text Value Against The Check Box Option - 6 If Selected
*/ 
public void  WriteExcel(String PatientName, String PatientAge,
		String PatientGender, String P_Option1, String P_Option2,
		String P_Option3, String P_Option4, String P_Option5, String P_Option6) throws IOException 
		{
	
		// Declaration Of The Cell Type While Writing INto Excel
		XSSFCell cell;
		
			String currentDirectory;
			String excelFileName = "workbook.xlsx";
		// Get The Current Directory To Get The Excel File 
			File file = new File(".");
			currentDirectory = file.getAbsolutePath();
			System.out.println(currentDirectory);
		// Changes The DIrectory To The Current Directory
			System.setProperty("user.dir", currentDirectory);
			
		
		// Open The File To Be Appended
		InputStream ExcelFileToRead = new FileInputStream(excelFileName);

		// PArse It Into The Local VAriable
		XSSFWorkbook  wb = new XSSFWorkbook(ExcelFileToRead);
		// Get The Sheet To Be Updated ( Assumed As The First Sheet )
		XSSFSheet sheet = wb.getSheetAt(0);
		// Get The NO. Of Rows Filled IN The Excel Sheet 
		int r = sheet.getLastRowNum();
		
		// Create The New Row On The Excel Sheet Which Is To Be Populated With The Current Patient Details
		XSSFRow row = sheet.createRow(r+1);

		// Create Eac Row Each Field On The Screen And Populate The corresponding Value To The Excel Sheet
				cell = row.createCell(0);
				cell.setCellValue(PatientName);
				cell = row.createCell(1);
				cell.setCellValue(PatientAge);
				cell = row.createCell(2);
				cell.setCellValue(PatientGender);
				cell = row.createCell(3);
				cell.setCellValue(P_Option1);
				cell = row.createCell(4);
				cell.setCellValue(P_Option2);
				cell = row.createCell(5);
				cell.setCellValue(P_Option3);
				cell = row.createCell(6);
				cell.setCellValue(P_Option4);
				cell = row.createCell(7);
				cell.setCellValue(P_Option5);
				cell = row.createCell(8);
				cell.setCellValue(P_Option6);
			
				
		FileOutputStream fileOut = new FileOutputStream(excelFileName);

		//write this workbook to an Output stream.
		wb.write(fileOut);
		fileOut.flush();
		fileOut.close();
	}
}
