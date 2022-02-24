package crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser_testing 
{
	@Test
	@Parameters("browser")
	public void openbrowser(String browser)
	{
		if(browser.equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.close();
		}
		else if(browser.equals("firefox"))
		{

			System.setProperty("webdriver.gecko.driver","C:\\Users\\ps11184490\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			WebDriver driver= new FirefoxDriver();
			driver.get("http://www.SoftwareTestingMaterial.com");
			driver.close();
		}
	}
	
	
	

}
