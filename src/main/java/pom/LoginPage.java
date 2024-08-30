package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	@FindBy(xpath = "//button[text()='Login with password']")
	private WebElement loginWithPasswordButton;
	
	@FindBy(id = "login-with-password_email")
	private WebElement emailAddressTextField;
	
	@FindBy(id = "login-with-password_password")
	private WebElement passwordTextfield;
	
	@FindBy(xpath = "//span[text()='Keep me logged in']")
	private WebElement keepMeLoginCheckBox; 
	
	@FindBy(xpath = "//button[text()='continue']")
	private WebElement contnueButton;

	public WebElement getLoginWithPasswordButton() {
		return loginWithPasswordButton;
	}

	public WebElement getEmailAddressTextField() {
		return emailAddressTextField;
	}

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}

	public WebElement getKeepMeLoginCheckBox() {
		return keepMeLoginCheckBox;
	}

	public WebElement getContnueButton() {
		return contnueButton;
	}

}
