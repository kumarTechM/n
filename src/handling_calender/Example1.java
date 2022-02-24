package handling_calender;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.expedia.co.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='hotel-checkin-wrapper-hp-hotel']//span[@class='uitk-icon uitk-icon-calendar field-border-in-high-contrast-mode']")).click();
		System.out.println("now for calender");
		String header_name=driver.findElement(By.xpath("(//div[@class='datepicker-cal-month'])[1]//*[@class='datepicker-cal-month-header']")).getText();
		String [] name=header_name.split(" ");
		for
	System.out.println(name.toString());
		
		
		
		System.out.println(driver.findElement(By.xpath("(//div[@class='datepicker-cal-month'])[1]//*[@class='datepicker-cal-month-header']")).getText());
		/*List<WebElement> list_of_dates=driver.findElements(By.xpath("(//div[@class='datepicker-cal-month'])[1]//td//*[@class='datepicker-cal-date']"));
		for(WebElement dates:list_of_dates)
		{
			System.out.print(dates.getText());
		}*/



	}

}
