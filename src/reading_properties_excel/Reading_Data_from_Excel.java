package reading_properties_excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading_Data_from_Excel {

	public static void main(String[] args) throws Exception
	{
		FileInputStream fis= new FileInputStream(".//src//reading_properties_excel//data.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		
	int row=sheet.getLastRowNum();
CellAddress ad=sheet.getActiveCell();
System.out.println(row);
System.out.println(ad);
// getting all data at time
for(int i=0;i<=row;i++)
{
	String s=sheet.getRow(i).getCell(0).getStringCellValue();
	System.out.println(s);
	String s1=sheet.getRow(i).getCell(1).getStringCellValue();
	System.out.println(s1);
}

		/*String s=sheet.getRow(0).getCell(0).getStringCellValue();
		String s1=sheet.getRow(0).getCell(1).getStringCellValue();
		String s2=sheet.getRow(1).getCell(0).getStringCellValue();
		String s3=sheet.getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);*/
		
		
		

	}

}
