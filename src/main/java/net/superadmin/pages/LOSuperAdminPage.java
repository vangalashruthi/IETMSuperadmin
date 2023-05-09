package net.superadmin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LOSuperAdminPage {

	WebDriver driver;
	
	public LOSuperAdminPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID ,using= "user_name")
	WebElement username;
	
	@FindBy(how = How.NAME ,using= "user_pass")
	WebElement password;
	
	@FindBy(how = How.ID ,using= "snbtn")
	WebElement submit;
	
	@FindBy(how = How.XPATH ,using= "//a[text()='LOGOUT']")
	WebElement logout;
	
	@FindBy(how = How.XPATH ,using= "(//button[@type='button'])[last()-1]")
	WebElement yesButton;
	
	@FindBy(how = How.XPATH ,using= "(//button[@type='button'])[last()]")
	WebElement noButton;
	
	@FindBy(how = How.XPATH ,using= "(//button[@class='close'])[last()]")
	WebElement closeButton;
	
	public void enterUsername()
	{
		username.click();
		username.sendKeys("superadmin");
	}
	
	public void enterPassword()
	{
		password.click();
		password.sendKeys("CNPSP");
	}
	
	public void clickSubmit()
	{
		submit.click();
	}
	
	public void clickLogout()
	{
		logout.click();
		
	}
	public void verifyYesButton()
	{
		yesButton.isDisplayed();
	}
	public void verifyNoButton()
	{
		noButton.isDisplayed();
	}
	public void verifyCloseButton()
	{
		closeButton.isDisplayed();
	}
	public void clickYesButton()
	{
		yesButton.click();
	}
	
	public void clickNoButton()
	{
		noButton.click();
	}
	
	public void clickCloseButton()
	{
		closeButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
