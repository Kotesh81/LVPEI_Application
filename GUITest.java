
import java.awt.EventQueue;

/**
 *  Swing Libraries To Create The GUI
 */
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

/**
 *  Apache Libraries For Performing OPerations On MS EXCEL (.XLSX)
 */ 
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

/**
 *  A Camera Application Software - This Provides an UI To Access The Live Feed Of An USB Camera/WebCam 
 *  <p>
 *  The First Screen Allows The User To Enter The Details Of The Patient. If Valid Details Are Entered
 *  Then It Leads To A Screen Where The User Will Be ABle To Access The USB Camera/ WebCam. The UI 
 *  Provides Extra Controls To Perform The Desired Actions.
 *  <p>
 *  @author   KoteswaraRao Chilakala <chilakala8412@gmail.com>
 *  @version  Initial Version  
 */
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
	 * Creates The Application Layout
	 */
	public GUITest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	
	 */
	
	private void initialize() {
		

		frmPediperi = new JFrame("                                             PEDIATRIC-PERIMETER");	

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
		btnNewButton_1.setBounds(246, 215, 123, 23);
		// Add The Button To The Frame
		frmPediperi.getContentPane().add(btnNewButton_1);
		
		
		//Defining A Text Field To Enter Name Of The Patient
		textField = new JTextField();
		textField.setBounds(198, 31, 160, 20);
		//ADd The Button To The Frame
		frmPediperi.getContentPane().add(textField);
		// Sets The Number Of Columns In This TextField To Be Displayed ON The Screen
		textField.setColumns(25);

		//Defining A Text Field To Enter Age Of The Patient
		textField_1 = new JTextField();
		textField_1.setBounds(91, 62, 54, 20);
		// Add The Component To The Frame
		frmPediperi.getContentPane().add(textField_1);
		// Sets The Number Of Columns In This TextField To Be Displayed ON The Screen
		textField_1.setColumns(2);

		//Defining A Label To The Text Field 
		JLabel lblNewLabel = new JLabel("Name Of The Patient ");
		// Set The Color Of The Label On The Frame
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setBounds(44, 34, 120, 14);
		// Add The label Component To The Frame
		frmPediperi.getContentPane().add(lblNewLabel);

		//Defining A Label To The Text Field
		JLabel lblNewLabel_1 = new JLabel("Age");
		lblNewLabel_1.setBounds(44, 59, 46, 23);
		frmPediperi.getContentPane().add(lblNewLabel_1);

		//Defining A Label
		JLabel lblNewLabel_2 = new JLabel("Gender");
		lblNewLabel_2.setBounds(198, 65, 46, 14);
		frmPediperi.getContentPane().add(lblNewLabel_2);

	    // Define 6 Check Boxes To Take The Options From The Patient
		 
		final JCheckBox chckbxNewCheckBox = new JCheckBox("Option-1");
		chckbxNewCheckBox.setBounds(44, 104, 97, 23);
		frmPediperi.getContentPane().add(chckbxNewCheckBox);
		
		final JCheckBox chckbxOption = new JCheckBox("Option-2");
		chckbxOption.setBounds(172, 104, 97, 23);
		frmPediperi.getContentPane().add(chckbxOption);

	
		final JCheckBox chckbxOption_1 = new JCheckBox("Option-3");
		chckbxOption_1.setBounds(284, 104, 97, 23);
		frmPediperi.getContentPane().add(chckbxOption_1);

		final JCheckBox chckbxOption_4 = new JCheckBox("Option-6");
		chckbxOption_4.setBounds(284, 153, 97, 23);
		frmPediperi.getContentPane().add(chckbxOption_4);

		final JCheckBox chckbxOption_3 = new JCheckBox("Option-5");
		chckbxOption_3.setBounds(172, 153, 97, 23);
		frmPediperi.getContentPane().add(chckbxOption_3);


		final JCheckBox chckbxOption_2 = new JCheckBox("Option-4");
		chckbxOption_2.setBounds(44, 153, 97, 23);
		frmPediperi.getContentPane().add(chckbxOption_2);
		
		// Defining The Combo Box To Select The Gender
		final JComboBox comboBox = new JComboBox();
		//Configure The Values To Be Displayed In The Combo Box
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"(Select)","Male", "Female", "Others"}));
		comboBox.setBounds(267, 62, 91, 20);
		frmPediperi.getContentPane().add(comboBox);
		
		//Defining A Button For Appending The EXCEL Sheet
		JButton btnNewButton = new JButton("OK");

		/** If Button Is Clicked Then Retrieve All The Information  From The Screen
		 * And Update It Into The EXCEL Sheet
		 * 
		 *  Use (@link #WriteExcel(PatientName, PatientAge, PatientGender,  
		 *						   P_Option1, P_Option2,P_Option3,P_Option4,  
		 *						   P_Option5,  P_Option6)
		 *  To Write Into The EXCE Sheet
		 *
		 */
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String PatientName;     //To Get The PAtient Name From The Text Box
				String PatientAge;      //To Get The PAtient Age  From The Text Box
				String PatientGender;   //To Get The Patient Gender Value Select n The Combo Box
				String P_Option1;       //To Get The The Text Of The OPtion-1 
				String P_Option2;       //To Get The The Text Of The OPtion-2 
				String P_Option3;       //To Get The The Text Of The OPtion-3 
				String P_Option4;       //To Get The The Text Of The OPtion-4 
				String P_Option5;       //To Get The The Text Of The OPtion-5
				String P_Option6;       //To Get The The Text Of The OPtion-6
				
		// Get The Text Value From The Patient Name Field Provided On The Screen		
                PatientName  = textField.getText();
				 
		// Get The Text Value From The Patient Age Field Provided On The Screen	
				PatientAge   = textField_1.getText();
			
		// Get The Text of The Value Selected In The Combo Box Field Provided On The Screen	
				PatientGender   = comboBox.getSelectedItem().toString();
				
		// Get The Text of The Value OPtion-1 Selected Only When It IS Selected
				 boolean selected = chckbxNewCheckBox.isSelected();
				    if (selected) {
		             P_Option1 = chckbxNewCheckBox.getText();
				    } else {
				      P_Option1 = " ";
				    }
		
		// Get The Text of The Value OPtion-2 Selected Only When It IS Selected		    		
				 selected = chckbxOption.isSelected();
				    if (selected) {
				    	P_Option2 = chckbxOption.getText();
				    } else {
				    	P_Option2 = " ";
				    }

		// Get The Text of The Value OPtion-3 Selected Only When It IS Selected	
				 selected = chckbxOption_1.isSelected();
				    if (selected) {
				    	P_Option3 = chckbxOption_1.getText();
				    } else {
				    	P_Option3 = " ";
				    }

		// Get The Text of The Value OPtion-4 Selected Only When It IS Selected			
				 selected = chckbxOption_2.isSelected();
				    if (selected) {
				    	P_Option4 = chckbxOption_2.getText();
				    } else {
				    	P_Option4 = " ";
				    }

		// Get The Text of The Value OPtion-5 Selected Only When It IS Selected
				 selected = chckbxOption_3.isSelected();
				    if (selected) {
				    	P_Option5 = chckbxOption_3.getText();
				    } else {
				    	P_Option5 = " ";
				    }

		// Get The Text of The Value OPtion-6 Selected Only When It IS Selected
				 selected = chckbxOption_4.isSelected();
				    if (selected) {
				    	P_Option6 = chckbxOption_4.getText();
				    	
				    } else {
				    	P_Option6 = " ";
				    }

		
		 // Call The Function "WriteExcel" To Append The Values In The Excel Sheet
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


        /** To Append The Excel Sheet With The Patient Details
         * 
		 *  @param    PatientName   - Value Entered In The TExt Box Opposite To The "Name Of Patient" Label
		 *  @param    PatientAge    - Value Entered In The TExt Box Opposite To The "Age" Label
	     *  @param    PatientGender - Value Entered In The Combo Box Opposite To The "Gender" Label 	
         *  @param    PatientName   - Value Entered In The TExt Box Opposite To The "Name Of Patient" Label
		 *  @param    P_Option1     - Text Value Against The Check Box Option - 1 If Selected
   		 *  @param    P_Option2     - Text Value Against The Check Box Option - 2 If Selected
		 *  @param    P_Option3     - Text Value Against The Check Box Option - 3 If Selected
		 *  @param    P_Option4     - Text Value Against The Check Box Option - 4 If Selected
		 *  @param    P_Option5     - Text Value Against The Check Box Option - 5 If Selected
		 *  @param    P_Option6     - Text Value Against The Check Box Option - 6 If Selected
         */ 
public void  WriteExcel(String PatientName, String PatientAge,String PatientGender,
		 String P_Option1, String P_Option2,String P_Option3, String P_Option4,
		 String P_Option5, String P_Option6) throws IOException 
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

		// Create Each Row Each Field On The Screen And Populate The corresponding Value To The Excel Sheet
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
