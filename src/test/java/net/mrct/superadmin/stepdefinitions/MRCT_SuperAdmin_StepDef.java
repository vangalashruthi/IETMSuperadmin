package net.mrct.superadmin.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.superadmin.pages.MRCTSuperAdminPage;
import net.superadmin.utility.BrowserOpen;


public class MRCT_SuperAdmin_StepDef {

	WebDriver driver;
	
	BrowserOpen bo = new BrowserOpen();
	
	MRCTSuperAdminPage mrctsuperadminpage;

	@Given("user opens the {string} browser")
	public void user_opens_the_browser(String browsername) {
	    
		driver = bo.browseropen(browsername);
		
		 mrctsuperadminpage = new MRCTSuperAdminPage(driver);
		
	}
	@When("user enters the url as {string}")
	public void user_enters_the_url_as(String url) {
	   
		driver.get(url);
	}
	@Then("user is to enter username as {string}")
	public void user_is_to_enter_username_as(String username) {
	    
		mrctsuperadminpage.enterUserName();
		
	}
	@Then("user is to enter password as {string}")
	public void user_is_to_enter_password_as(String password) {
	   
		mrctsuperadminpage.enterPassword();
		
	}
	@Then("user is to click the button {string}")
	public void user_is_to_click_the_button(String submit) {
	    
		mrctsuperadminpage.clickSubmit();
		
	}
	@Then("user is to click the {string}")
	public void user_is_to_click_the(String manageRelatedContentType) {
	   
		mrctsuperadminpage.clickManageRelatedContentType();
		
	}
	@Then("user is to click the Search Textbox")
	public void user_is_to_click_the_search_textbox() {
	    
		mrctsuperadminpage.clickSearchTextBox();
		
	}
	@Then("user is to clear the Search Textbox")
	public void user_is_to_clear_the_search_textbox() {
	    
		mrctsuperadminpage.clearSearchTextBox();
		
	}
	@Then("user is to enter the name in the Search Textbox")
	public void user_is_to_enter_the_name_in_the_search_textbox() {
	    
		mrctsuperadminpage.enterName();
		
	}
	@Then("user is to verify the content type related to name")
	public void user_is_to_verify_the_content_type_related_to_name() {
	   
		mrctsuperadminpage.verifyContentType();
		
	}
	@Then("user is to click the Next button")
	public void user_is_to_click_the_next_button() {
	    
		mrctsuperadminpage.clickNextButton();
		
	}
	@Then("user is to click the Previous button")
	public void user_is_to_click_the_previous_button() {
	   
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tbllistid_previous")));
		mrctsuperadminpage.clickPreviousButton();
		
	}
	@Then("user is to verify the Print button")
	public void user_is_to_verify_the_print_button() {
	    
		mrctsuperadminpage.verifyPrintButton();
		
	}
	@Then("user is to click the dropdown arrows")
	public void user_is_to_click_the_dropdown_arrows() {
	   
		mrctsuperadminpage.clickEntries();
		
	}
	@Then("user is to verify the options in the list")
	public void user_is_to_verify_the_options_in_the_list() {
	  
		mrctsuperadminpage.verifyEntries();
		
	}
	@Then("user is to click the options in the list")
	public void user_is_to_click_the_options_in_the_list() {
	    
		mrctsuperadminpage.clickEntriesOptions();
		
	}
	@Then("user is to verify all the actions in the Settings menu")
	public void user_is_to_verify_all_the_actions_in_the_settings_menu() throws InterruptedException {
	 
		Thread.sleep(1000);
	//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("(//button[@type='button'])[7]")));
		mrctsuperadminpage.clickSettingsMenu();
		
	}
	@Then("user is to click the Add Item button")
	public void user_is_to_click_the_add_item_button() {
	    
		mrctsuperadminpage.clickAddItem();
		
	}
	@Then("user is to verify the Content Type Name TextBox")
	public void user_is_to_verify_the_content_type_name_text_box() {
	    
		mrctsuperadminpage.verifyontentTypeTextbox();
		
	}
	@Then("user is to verify the Save button")
	public void user_is_to_verify_the_save_button() {
	    
		mrctsuperadminpage.verifySaveButton();
		
	}
	@Then("user is to click the Close button of Add Content Type")
	public void user_is_to_click_the_close_button_of_add_content_type() {
	   
		mrctsuperadminpage.clickCloseAddContentType();
		
	}
	@Then("user is to click the Home button of the page")
	public void user_is_to_click_the_home_button_of_the_page() throws InterruptedException
	{
	//	Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Home']")));
		mrctsuperadminpage.clickHomeButton();
	}
	
	@Then("user is to click the Manage Related Content Types")
	public void user_is_to_click_the_manage_related_content_types()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=' MANAGE RELATED CONTENT TYPES']")));
		mrctsuperadminpage.clickManageRelatedContentType();
	}
	
	@Then("user is to click the Modules button of the page")
	public void user_is_to_click_the_modules_button_of_the_page()
	{
		mrctsuperadminpage.clickModulesButton();
	}
	@Then("user is to click the Backward navigation button")
	public void user_is_to_click_the_backward_navigation_button() throws InterruptedException  {
		
	//	Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-arrow-left']")));
		mrctsuperadminpage.clickBackwardButton();
	}
	
	@Then("user is to click the Manage Related Content Types1")
	public void user_is_to_click_the_manage_related_content_types1() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=' MANAGE RELATED CONTENT TYPES']")));
		mrctsuperadminpage.clickManageRelatedContentType();
	}
	
	@Then("user is to click the Forward navigation button")
	public void user_is_to_click_the_forward_navigation_button() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-arrow-right']")));
		mrctsuperadminpage.clickForwardButton();
	}
	
	@Then("user is to click the Help dropdown button")
	public void user_is_to_click_the_help_dropdown_button() {
		
		mrctsuperadminpage.clickHelpButton();
	}
	
	@Then("user is to verify About IETM in the dropdown")
	public void user_is_to_verify_about_ietm_in_the_dropdown() {
		
	    mrctsuperadminpage.aboutIetmButton();
	
	}
	
	
	@Then("user is to verify How to use IETM? in the dropdown")
	public void user_is_to_verify_how_to_use_ietm_in_the_dropdown() {
		
		mrctsuperadminpage.howToUseButton();
	}
	
	@Then("user is to verify Version & Revision History in the dropdown")
	public void user_is_to_verify_version_revision_history_in_the_dropdown() {
		
		mrctsuperadminpage.versionHistoryButton();
		
	}
	
	@Then("user is to click the Logout button")
	public void user_is_to_click_the_logout_button()  {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Logout']")));
		mrctsuperadminpage.clickLogoutButton();
	}
	
	@Then("user is to click the Close button")
	public void user_is_to_click_the_close_button()  {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='close'])[3]")));
		mrctsuperadminpage.clickCloseButton();
	}
	
	@Then("user is to click the No button")
	public void user_is_to_click_the_no_button() {
		
		mrctsuperadminpage.clickLogoutButton();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' NO']")));
		mrctsuperadminpage.clickNoButton();
		
	}
	
	@Then("user is to click the Yes button")
	public void user_is_to_click_the_yes_button() {
		
		mrctsuperadminpage.clickLogoutButton();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='YES']")));
		mrctsuperadminpage.clickYesButton();
	}







	
	
	
	
	
	
	
	@After
	public void browserclose()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
