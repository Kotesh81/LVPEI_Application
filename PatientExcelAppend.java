package PateintDetailsAppend;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 *  This Class contains the methods to write the patient details to an EXCEL sheet
 *  <p>
 *  @author   KoteswaraRao Chilakala <chilakala8412@gmail.com>
 *  @version  Initial Version  
 */
public class PatientExcelAppend {
	
	String PateintDetails [];
	String PatientAge;

    /** To Append The Excel Sheet With The Patient Details.
     * It Changes the directory to current directory while processing 
     * Reads The sheet and get the value of the last row written And Appends the 
     * data to its consecutive row. 
     * 
	 *  @param    PateintDetails []   - This Array Contains the details of the patient in the order
     *                                  PatientNAme, PatientGender, Option-1,Option-2,Option-3,Option-4,OPtion-5,Option-6
	 *  @param    PatientAge          - Value Entered In The TExt Box Opposite To The "Age" Label
  */
	public PatientExcelAppend(String[] pateintDetails, String patientAge) throws IOException {
		super();
		PateintDetails = pateintDetails;
		PatientAge = patientAge;
		
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

				// Create fields in a row to store the values On The Screen And Populate The corresponding Value To The Excel Sheet
						cell = row.createCell(0);
						cell.setCellValue(PateintDetails[1]);
						cell = row.createCell(1);
						cell.setCellValue(PatientAge);
						cell = row.createCell(2);
						cell.setCellValue(PateintDetails[2]);
						cell = row.createCell(3);
						cell.setCellValue(PateintDetails[3]);
						cell = row.createCell(4);
						cell.setCellValue(PateintDetails[4]);
						cell = row.createCell(5);
						cell.setCellValue(PateintDetails[5]);
						cell = row.createCell(6);
						cell.setCellValue(PateintDetails[6]);
						cell = row.createCell(7);
						cell.setCellValue(PateintDetails[7]);
						cell = row.createCell(8);
						cell.setCellValue(PateintDetails[8]);
					
						
				FileOutputStream fileOut = new FileOutputStream(excelFileName);

				//write this workbook to an Output stream.
				wb.write(fileOut);
				fileOut.flush();
				fileOut.close();
			}
		


	/**
	 * @param args
	 */
	// public static void main(String[] args) {
		// TODO Auto-generated method stub

	// }


}
