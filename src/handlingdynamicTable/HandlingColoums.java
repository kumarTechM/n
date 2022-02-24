package handlingdynamicTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingColoums {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\king\\Desktop\\N\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//*[@id="customers"]/tbody/tr[1]/th[1]
		//*[@id="customers"]/tbody/tr[1]/th[2]
		//*[@id="customers"]/tbody/tr[1]/th[3]
		// taking number of coloum
		List<WebElement> list_coloum=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]/th"));
		int coloum_count=list_coloum.size();
		System.out.println("coloum_count: "+coloum_count);
		String colbeforexpath="//*[@id='customers']/tbody/tr[1]/th[";
		String colAfterxpath="]";
		System.out.println("coloum values are: ");
		for(int i=1;i<=coloum_count;i++)
		{
			String totalxapth=colbeforexpath+i+colAfterxpath;
			WebElement ele=driver.findElement(By.xpath(totalxapth));
			System.out.println(ele.getText());
			
			
		}

	}

}
//https://classic.crmpro.com/index.html?e=2

/*how to handle dynamic webtable in selenium 
1.iterate rows and coloum and get cell values
2.using for loop get total rows and iterate table
3.put if(string matches ) then select values 

// another way
1.uisng customize xpath
using parent and preceding tags
no nedd to write for loop and no full iteration of table
it is more dynamic*/



