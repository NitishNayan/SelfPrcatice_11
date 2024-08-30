package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	public HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//div[@class='sc-JsfZP kBcPwt']")
	private WebElement profileDropdown;
	
	@FindBy(xpath = "//div[text()='Logout']")
	private WebElement logutButton;

	public WebElement getProfileDropdown()
	{
		return profileDropdown;
	}

	public WebElement getLogutButton() 
	{
		return logutButton;
	}
}

