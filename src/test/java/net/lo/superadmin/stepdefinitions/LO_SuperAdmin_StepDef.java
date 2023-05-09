package net.lo.superadmin.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.superadmin.pages.LOSuperAdminPage;
import net.superadmin.utility.BrowserOpen;


public class LO_SuperAdmin_StepDef {

	WebDriver driver;
	
	BrowserOpen bo = new BrowserOpen();
	LOSuperAdminPage losuperadminpage;
	
	
	@Given("user opens the {string} browser")
	public void user_opens_the_browser(String browsername) {
		
		driver = bo.browseropen(browsername);
		losuperadminpage = new LOSuperAdminPage(driver);
		
	}
	
	@When("user enters the url as {string}")
	public void user_enters_the_url_as(String url) {
		
		driver.get(url);
	}
	
	@Then("user is to enter username as {string}")
	public void user_is_to_enter_username_as(String username)  {
		
		
		losuperadminpage.enterUsername();
	}
	
	@Then("user is to enter password as {string}")
	public void user_is_to_enter_password_as(String password) {
		
		losuperadminpage.enterPassword();
	}
	
	@Then("user is to click the button {string}")
	public void user_is_to_click_the_button(String submit) {
		
		losuperadminpage.clickSubmit();
	}
	
	@Then("user is to click the {string}")
	public void user_is_to_click_the(String LOGOUT)  {
		
		
		losuperadminpage.clickLogout();
	}
	
	@Then("user is to verify the Yes button")
	public void user_is_to_verify_yes_button() 
	{
		
		losuperadminpage.verifyYesButton();
	}
	
	@Then("user is to verify the No button")
	public void user_is_to_verify_no_button()
	{
    	losuperadminpage.verifyNoButton();
	}
	
	@Then("user is to verify the Close button")
	public void user_is_to_verify_close_button()
	{
	    losuperadminpage.verifyCloseButton();
	}
	
	@Then("user is to click the No button")
	public void user_is_to_click_the_no_button()  
	{
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[last()]")));
		losuperadminpage.clickNoButton();
	}
	
	@Then("user is to click the Logout")
	public void user_is_to_click_the_logout() 
	{
			
        	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='LOGOUT']")));
		losuperadminpage.clickLogout();
		
	}
	
	@Then("user is to click the Close button")
	public void user_is_to_click_the_close_button()  
	{
	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='close'])[last()]")));
		losuperadminpage.clickCloseButton();
	}
	
	@Then("user is to click the Logout1")
	public void user_is_to_click_the_logout1()
	{
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='LOGOUT']")));
		losuperadminpage.clickLogout();
	}
	
	@Then("user is to click the Yes button")
	public void user_is_to_click_the_yes_button()
	{
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[last()-1]")));
		losuperadminpage.clickYesButton();
	}
	
	@After
	public void browserclose()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
