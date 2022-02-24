package reading_properties_excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_data_to_Excel {

	public static void main(String[] args) throws IOException
	{
		
		XSSFWorkbook wb=new XSSFWorkbook();
		FileOutputStream fis= new FileOutputStream(".//src//reading_properties_excel//data.xlsx");
		XSSFSheet sheet=wb.createSheet("sarkate");
		//XSSFSheet sheet1=wb.getSheet("pravin");
		XSSFRow row1=sheet.createRow(0);
		row1.createCell(0).setCellValue("ashish");
		row1.createCell(1).setCellValue("pravin");
		row1.createCell(2).setCellValue("pk");
		row1.createCell(3).setCellValue("ash");
		XSSFRow row2=sheet.createRow(1);
		row2.createCell(0).setCellValue("ashish");
		row2.createCell(1).setCellValue("pravin");
		row2.createCell(2).setCellValue("pk");
		row2.createCell(3).setCellValue("ash");
		
	/*	// creating sheet
		XSSFSheet sheet1=wb.createSheet("sarkate");
		XSSFRow row5=sheet1.createRow(0);
		row5.createCell(0).setCellValue("ashish");
		//creating sheeet
		XSSFSheet sheet2=wb.createSheet("vishnu");
		XSSFRow row6=sheet1.createRow(0);
		row6.createCell(0).setCellValue("ashish");*/
		
		wb.write(fis);
		fis.close();

	}

}
