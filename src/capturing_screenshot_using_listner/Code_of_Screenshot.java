package capturing_screenshot_using_listner;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Code_of_Screenshot extends Example
{

	
	
	public static void getscreenshot(WebDriver driver) throws IOException 
	{
		TakesScreenshot tc=(TakesScreenshot)driver;
		File src=tc.getScreenshotAs(OutputType.FILE);
		//File destination= new File()
		FileUtils.copyFile(src, new File("./screenshots/"+driver+".png"));
	}

}
