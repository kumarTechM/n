package reading_properties_excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practice {

	public static void main(String[] args) throws IOException
	{
		//FileInputStream fis= new FileInputStream("C:\\Users\\king\\Downloads\\ashish\\src\\reading_properties_excel\\Practice.java");
		XSSFWorkbook wb= new XSSFWorkbook();
		XSSFSheet sheet=wb.createSheet("pravin");
		XSSFRow row=sheet.createRow(0);
		row.createCell(0).setCellValue("pra");
		row.createCell(1).setCellValue("ash");
		XSSFRow row2=sheet.createRow(1);
		row2.createCell(0).setCellValue("bhjgh");
		FileOutputStream fos= new FileOutputStream("dlkfhjfk");
		wb.write(fos);
		wb.close();
		
		
		
	
		
		
	}
		
		

	}


