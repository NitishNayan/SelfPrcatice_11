package car;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pom.HomePage;
import pom.LoginPage;
import pom.WelcomePage;

public class Base 
{
	public WebDriver driver;
	public WelcomePage wp;
	public LoginPage lp;
	public HomePage hp;
	
	@BeforeClass
	public void openBrowser()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.recorem.com/");
	}
	
	@BeforeMethod
	public void login()
	{
		wp= new WelcomePage(driver);
		wp.getLoginButton().click();
		lp = new LoginPage(driver);
		lp.getLoginWithPasswordButton().click();
		lp.getEmailAddressTextField().sendKeys("nitishnayan26@gmail.com");
		lp.getPasswordTextfield().sendKeys("abcd@1234");
		lp.getKeepMeLoginCheckBox().click();
		lp.getContnueButton().click();
		
		
	}
	
	@AfterMethod
	public void logout()
	{
		hp=new HomePage(driver);
		hp.getProfileDropdown().click();
		hp.getLogutButton();
		
	}
	 
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
		
		
	}

}
