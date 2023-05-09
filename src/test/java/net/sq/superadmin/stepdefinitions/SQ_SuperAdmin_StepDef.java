package net.sq.superadmin.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.superadmin.pages.SQSuperAdminPage;
import net.superadmin.utility.BrowserOpen;


public class SQ_SuperAdmin_StepDef {

	WebDriver driver;
	BrowserOpen bo = new BrowserOpen();
	SQSuperAdminPage sqsuperadminpage;
	
	

	@Given("user opens the {string} browser")
	public void user_opens_the_browser(String browsername) {
		
		driver = bo.browseropen(browsername);
		 sqsuperadminpage = new SQSuperAdminPage(driver);
		
		
	    
	}
	@When("user enters the url as {string}")
	public void user_enters_the_url_as(String url) {
		
		driver.get(url);
	    
	}
	@Then("user is to enter username as {string}")
	public void user_is_to_enter_username_as(String username)  {
		
		
		sqsuperadminpage.enterUserName();
	   
	}
	@Then("user is to enter password as {string}")
	public void user_is_to_enter_password_as(String password) {
		
		sqsuperadminpage.enterPassword();
	   
	}
	@Then("user is to click the button {string}")
	public void user_is_to_click_the_button(String submit) {
		
		sqsuperadminpage.clickSubmit();
		
	   
	}
	@Then("user is to click the {string}")
	public void user_is_to_click_the(String securityquestions)  {
		
	   
		sqsuperadminpage.clickSecurityQuestions();
		
	}
	@Then("user is to verify the Question1 textbox")
	public void user_is_to_verify_the_question1_textbox()  {
		
		
		sqsuperadminpage.question1Textbox();
	    
	}
	@Then("user is to verify the Question2 textbox")
	public void user_is_to_verify_the_question2_textbox() {
		
		sqsuperadminpage.question2Textbox();
	    
	}
	@Then("user is to verify the Answer1 textbox")
	public void user_is_to_verify_the_answer1_textbox() {
		
		sqsuperadminpage.answer1Textbox();
	   
	}
	@Then("user is to verify the Answer2 textbox")
	public void user_is_to_verify_the_answer2_textbox() {
		
		sqsuperadminpage.answer2Textbox();
	    
	}

	@Then("user is to click the Question1 textbox")
	public void user_is_to_click_the_question1_textbox()  {
		
		
		sqsuperadminpage.clickQuestion1();
	}
	
	@Then("user is to click the Question2 textbox")
	public void user_is_to_click_the_question2_textbox() {
		
		sqsuperadminpage.clickQuestion2();
		
	}
	
	@Then("user is to click the Answer1 textbox")
	public void user_is_to_click_the_answer1_textbox() {
		
		
		sqsuperadminpage.clickAnswer1();
	}
	
	@Then("user is to click the Answer2 textbox")
	public void user_is_to_click_the_answer2_textbox() {
		
		sqsuperadminpage.clickAnswer2();
		
	}
	
	@Then("user is to clear the Question1 textbox")
	public void user_is_to_clear_the_question1_textbox()  {
		
		
		sqsuperadminpage.clearQuestion1();
	}
	
	@Then("user is to clear the Question2 textbox")
	public void user_is_to_clear_the_question2_textbox() {
		
		sqsuperadminpage.clearQuestion2();
	}
	
	@Then("user is to clear the Answer1 textbox")
	public void user_is_to_clear_the_answer1_textbox() {
		
		sqsuperadminpage.clearAnswer1();
	}
	
	@Then("user is to clear the Answer2 textbox")
	public void user_is_to_clear_the_answer2_textbox() {
		
		sqsuperadminpage.clearAnswer2();
	}
	
	@Then("user is to click the submit button")
	public void user_is_to_click_the_submit_button() {
		
		sqsuperadminpage.clickSubmitButton();
	}
	
	@Then("user is to clear the value in Question1 textbox")
	public void user_is_to_clear_the_value_in_question1_textbox() throws InterruptedException  {
		
		Thread.sleep(1000);
		sqsuperadminpage.clearQuestion1();
	}
	
	@Then("user is to clear the value in Question2 textbox")
	public void user_is_to_clear_the_value_in_question2_textbox()  {
		
		
		sqsuperadminpage.clearQuestion2();
	}
	
	@Then("user is to clear the value in Answer1 textbox")
	public void user_is_to_clear_the_value_in_answer1_textbox()  {
		
		
		sqsuperadminpage.clearAnswer1();
	}
	
	@Then("user is to clear the value in Answer2 textbox")
	public void user_is_to_clear_the_value_in_answer2_textbox()  {
		
		
		sqsuperadminpage.clearAnswer2();
	}
	
	@Then("user is to enter the value in Question1 textbox")
	public void user_is_to_enter_the_value_in_question1_textbox() throws InterruptedException {
		
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("qustion1")));
		sqsuperadminpage.enterQuestion1();
		
	}
	
	@Then("user is to enter the value in Question2 textbox")
	public void user_is_to_enter_the_value_in_question2_textbox() {
		
		sqsuperadminpage.enterQuestion2();
		
	}
	
	@Then("user is to enter the value in Answer1 textbox")
	public void user_is_to_enter_the_value_in_answer1_textbox() {
	
		sqsuperadminpage.enterAnswer1();
		
	}
	
	
		
	
	@Then("user is to click the submit1 button")
	public void user_is_to_click_the_submit1_button() {
		
		sqsuperadminpage.clickSubmitButton();
	}
	
	@Then("user is to clear the value in Question1 textbox1")
	public void user_is_to_clear_the_value_in_question1_textbox1()  {
		
		
		sqsuperadminpage.clearQuestion1();
	}
	
	@Then("user is to clear the value in Question2 textbox1")
	public void user_is_to_clear_the_value_in_question2_textbox1()  {
		
		
		sqsuperadminpage.clearQuestion2();
	}
	
	@Then("user is to clear the value in Answer1 textbox1")
	public void user_is_to_clear_the_value_in_answer1_textbox1()  {
		
		
		sqsuperadminpage.clearAnswer1();
	}
	
	@Then("user is to clear the value in Answer2 textbox1")
	public void user_is_to_clear_the_value_in_answer2_textbox1()  {
		
		
		sqsuperadminpage.clearAnswer2();
	}
	
	@Then("user is to enter the value in Question1 textbox1")
	public void user_is_to_enter_the_value_in_question1_textbox1() throws InterruptedException  {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("qustion1")));
		sqsuperadminpage.enterQuestion1();
		
	}
	
	@Then("user is to enter the value in Question2 textbox1")
	public void user_is_to_enter_the_value_in_question2_textbox1() {
		
		sqsuperadminpage.enterQuestion2();
		
	}
	
	@Then("user is to enter the value in Answer1 textbox1")
	public void user_is_to_enter_the_value_in_answer1_textbox1() {
		
		sqsuperadminpage.enterAnswer1();;
		
	}
	
	@Then("user is to enter the value in Answer2 textbox")
	public void user_is_to_enter_the_value_in_answer2_textbox() {
		
		sqsuperadminpage.enterAnswer2();
		
	}
	
	@Then("user is to click the submit2 button")
	public void user_is_to_click_the_submit2_button() {
		
		sqsuperadminpage.clickSubmitButton();
	}
	
	@Then("user is to click the Home button of the page")
	public void user_is_to_click_the_home_button_of_the_page() throws InterruptedException  {
		
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Home']")));
		sqsuperadminpage.clickHomeButton();
	}
	
	@Then("user is to click the Security Questions")
	public void user_is_to_click_the_security_questions() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='SECURITY QUESTIONS']")));
		sqsuperadminpage.clickSecurityQuestions();
	}
	
	@Then("user is to click the Modules button of the page")
	public void user_is_to_click_the_modules_button_of_the_page()  {
		
		
		sqsuperadminpage.clickModulesButton();
	}
	
	@Then("user is to click the Backward navigation button")
	public void user_is_to_click_the_backward_navigation_button() throws InterruptedException  {
		
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-arrow-left']")));
		sqsuperadminpage.clickBackwardButton();
	}
	
	@Then("user is to click the Security Questions1")
	public void user_is_to_click_the_security_questions1()  {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='SECURITY QUESTIONS']")));
		sqsuperadminpage.clickSecurityQuestions();
	}
	
	@Then("user is to click the Forward navigation button")
	public void user_is_to_click_the_forward_navigation_button()  {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-arrow-right']")));
		sqsuperadminpage.clickForwardButton();
	}
	
	@Then("user is to click the Help dropdown button")
	public void user_is_to_click_the_help_dropdown_button() {
		
		sqsuperadminpage.clickHelpButton();
	}
	
	@Then("user is to verify About IETM in the dropdown")
	public void user_is_to_verify_about_ietm_in_the_dropdown() {
		
		sqsuperadminpage.aboutIetmButton();
	}
	
	@Then("user is to verify How to use IETM? in the dropdown")
	public void user_is_to_verify_how_to_use_ietm_in_the_dropdown() {
		
		sqsuperadminpage.howToUseButton();
		
	}
	
	@Then("user is to verify Version & Revision History in the dropdown")
	public void user_is_to_verify_version_revision_history_in_the_dropdown() {
	
		sqsuperadminpage.versionHistoryButton();
		
	}
	
	@Then("user is to click the Logout button")
	public void user_is_to_click_the_logout_button()  {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Logout']")));
		sqsuperadminpage.clickLogoutButton();
	}
	
	@Then("user is to click the Close button")
	public void user_is_to_click_the_close_button() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='close'])[3]")));
		sqsuperadminpage.clickCloseButton();
	}
	
	@Then("user is to click the No button")
	public void user_is_to_click_the_no_button()  {
		
		sqsuperadminpage.clickLogoutButton();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' NO']")));
		sqsuperadminpage.clickNoButton();
		
		
	}
	
	@Then("user is to click the Yes button")
	public void user_is_to_click_the_yes_button()  {
		
		sqsuperadminpage.clickLogoutButton();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='YES']")));
		sqsuperadminpage.clickYesButton();
	}
	

	
	
	@After
	public void browserclose()
	{
		driver.quit();
	}
	
	
	
	
	
}
