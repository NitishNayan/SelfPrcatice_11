package Selenium_Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SceenShotflipkartElement
{
	@Test
	public void TakeSccenChot() throws IOException, InterruptedException 
	{
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait Ewait = new WebDriverWait(driver, Duration.ofSeconds(5));
		String timeStamp = 	LocalDateTime.now().toString().replace(':', '-');
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement grocery = driver.findElement(By.xpath("//img[@alt='Grocery']"   ));
		File temp = grocery.getScreenshotAs(OutputType.FILE);
		File parm = new File("./BugShot/"+timeStamp+"grocery.png");
		org.openqa.selenium.io.FileHandler.copy(temp, parm);
		driver.quit();
		
		
	}

}
