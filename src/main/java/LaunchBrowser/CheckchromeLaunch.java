package LaunchBrowser;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckchromeLaunch
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		WebDriver driver1= new FirefoxDriver();
		driver1.get("https://demowebshop.tricentis.com/");
		driver1.manage().window().fullscreen();
		driver1.manage().window().maximize();
		driver1.manage().window().minimize();
		Thread.sleep(2000);
		driver1.close();
	}

}
