package handlingdynamicTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForDynamicRows {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\king\\Desktop\\N\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> rowlist=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		
		int row_count=rowlist.size();
		//*[@id="customers"]/tbody/tr[2]/td[1]
				//*[@id="customers"]/tbody/tr[4]/td[1]
				//*[@id="customers"]/tbody/tr[7]/td[1]
				String BeforeXapth="//*[@id='customers']/tbody/tr[";
				String AfterXapth="]/td[1]";
				// i=2 because my actual data start from 2 and end at 7
				for(int i=2;i<=row_count;i++)
				{
					String xpath=BeforeXapth+i+AfterXapth;
					WebElement ele=driver.findElement(By.xpath(xpath));
					System.out.println(ele.getText());
					
					if(ele.getText().equals("Magazzini Alimentari Riuniti"))
					{
						System.out.println("company name "+ele.getText()+"is found "+"at position:"+(i-1));
					}
					
				}
				// for contact
				//*[@id="customers"]/tbody/tr[2]/td[2]
				//*[@id="customers"]/tbody/tr[7]/td[2] so before xapth is same
				String Aftercontactxpath="]/td[2]";
				for(int i=2;i<=row_count;i++)
				{
					String xpath=BeforeXapth+i+Aftercontactxpath;
					WebElement ele=driver.findElement(By.xpath(xpath));
					System.out.println(ele.getText());
					
					if(ele.getText().equals("Giovanni Rovelli"))
					{
						System.out.println("company name "+ele.getText()+"is found "+"at position:"+(i-1));
					}
					
				}
				
				


	}

}
