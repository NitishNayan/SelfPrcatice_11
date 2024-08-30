package Selenium_Practice;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.qsy7.file.api.service.FileUtil;

public class FlipkartScreenShot
{
	@Test
	public void Scrrenshot() throws IOException
	{
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		TakesScreenshot ts = (TakesScreenshot) driver; 
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File parm= new File("./BugShot."+"fk.png");
		org.openqa.selenium.io.FileHandler.copy(temp, parm);
		
	}

}
