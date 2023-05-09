package net.fm.superadmin.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.superadmin.pages.FMSuperAdminPage;
import net.superadmin.utility.BrowserOpen;


public class FM_SuperAdmin_StepDef {

	WebDriver driver;
	
	BrowserOpen bo = new BrowserOpen();
	
	FMSuperAdminPage fmsuperadminpage;

	@Given("user opens the {string} browser")
	public void user_opens_the_browser(String browsername) {
	   
		driver = bo.browseropen(browsername);
		
		 fmsuperadminpage = new FMSuperAdminPage(driver);
		
	}
	@When("user enters the url as {string}")
	public void user_enters_the_url_as(String url) {
	   
		driver.get(url);
		
	}
	@Then("user is to enter username as {string}")
	public void user_is_to_enter_username_as(String username) {
	    
		fmsuperadminpage.enterUserName();
		
	}
	@Then("user is to enter password as {string}")
	public void user_is_to_enter_password_as(String password) {
	    
		fmsuperadminpage.enterPassword();
		
	}
	@Then("user is to click the button {string}")
	public void user_is_to_click_the_button(String submit) {
	    
		fmsuperadminpage.clickSubmit();
		
	}
	@Then("user is to click the {string}")
	public void user_is_to_click_the(String filemanager) {
	    
		fmsuperadminpage.clickFileManager();
		
	}
	@Then("user is to click the Add folder button")
	public void user_is_to_click_the_add_folder_button() {
	    
		fmsuperadminpage.clickAddFolderButton();
		
	}
	@Then("user is to verify the New folder textbox")
	public void user_is_to_verify_the_new_folder_textbox() {
	    
		fmsuperadminpage.verifyNewFolderTextbox();
		
	}
	@Then("user is to verify the Add button")
	public void user_is_to_verify_the_add_button() {
	    
		fmsuperadminpage.verifyAddButton();
		
	}
	@Then("user is to verify the Cancel button")
	public void user_is_to_verify_the_cancel_button() {
	   
		fmsuperadminpage.verifyCancelButton();
		
	}
	@Then("user is to verify the Close button")
	public void user_is_to_verify_the_close_button() {
	   
		fmsuperadminpage.verifyCloseButton();
		
	}

	@Then("user is to click the Upload file button")
	public void user_is_to_click_the_upload_file_button() {
	    
		fmsuperadminpage.clickUploadFileButton();
		
	}
	@Then("user is to verify the Choose file button")
	public void user_is_to_verify_the_choose_file_button()  {
	   
		fmsuperadminpage.verifyChooseButton();
		
	}
	@Then("user is to verify the Upload button")
	public void user_is_to_verify_the_upload_button() {
	    
		fmsuperadminpage.verifyUploadButton();
		
	}
	@Then("user is to verify the Cancel button1")
	public void user_is_to_verify_the_cancel_button1() {
	   
		fmsuperadminpage.verifyCancelButton();
		
	}
	@Then("user is to verify the Close button1")
	public void user_is_to_verify_the_close_button1() {
	 
		fmsuperadminpage.verifyCloseButton();
		
	}
	@Then("user is to verify the Go home button on main page")
	public void user_is_to_verify_the_go_home_button_on_main_page() {
	    
		fmsuperadminpage.verifyGoHomeButton();
		
	}
	@Then("user is not allowed to click the Go home button")
	public void user_is_not_allowed_to_click_the_go_home_button() {
	   
		fmsuperadminpage.clickGoHomeButton();
		
	}
	@Then("user is to verify the Back one level button on main page")
	public void user_is_to_verify_the_back_one_level_button_on_main_page() {
	    
		fmsuperadminpage.verifyBackOneLevelButton();
		
	}
	@Then("user is not allowed to click the Back one level button")
	public void user_is_not_allowed_to_click_the_back_one_level_button() {
	   
		fmsuperadminpage.clickBackOneLevelButton();
		
	}
	@Then("user is to click the dropdown arrows")
	public void user_is_to_click_the_dropdown_arrows() {
	    
		fmsuperadminpage.clickEntries();
		
	}
	@Then("user is to verify the options in the list")
	public void user_is_to_verify_the_options_in_the_list() {
	   
		fmsuperadminpage.verifyEntries();
		
	}
	@Then("user is to click the options in the list")
	public void user_is_to_click_the_options_in_the_list() {
	    
		fmsuperadminpage.clickEntriesOptions();
		
	}
	@Then("user is to verify all the actions in the Settings menu")
	public void user_is_to_verify_all_the_actions_in_the_settings_menu() {
	   
		fmsuperadminpage.clickSettingsMenu();
		
	}
	@Then("user is to click the Next button")
	public void user_is_to_click_the_next_button() {
	   
		fmsuperadminpage.clickNextButton();
		
	}
	@Then("user is to click the Previous button")
	public void user_is_to_click_the_previous_button() {
	   
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tbllistid_previous")));
		fmsuperadminpage.clickPreviousButton();
		
	}
	@Then("user is to verify the documents in the folders")
	public void user_is_to_verify_the_documents_in_the_folders() {
	   
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//i[@class='fa fa-folder'])[2]")));
		fmsuperadminpage.clickFolder();
		
	}
	@Then("user is to click the Folder")
	public void user_is_to_click_the_folder() {
	    
		fmsuperadminpage.clickFolder();
		
	}
	@Then("user is to verify the documents")
	public void user_is_to_verify_the_documents() {
	    
	}
	@Then("user is to click the Go home button")
	public void user_is_to_click_the_go_home_button() {
	   
		fmsuperadminpage.clickGoHomeButton();
		
	}
	@Then("user is to click the Folder1")
	public void user_is_to_click_the_folder1() {
	    
		fmsuperadminpage.clickFolder();
		
	}
	@Then("user is to click the Back one level button")
	public void user_is_to_click_the_back_one_level_button() {
	    
		fmsuperadminpage.clickBackOneLevelButton();
		
	}
	@Then("user is to click the Home button of the page")
	public void user_is_to_click_the_home_button_of_the_page() throws InterruptedException
	{
	//	Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Home']")));
		fmsuperadminpage.clickHomeButton();
	}
	
	@Then("user is to click the File Manager")
	public void user_is_to_click_the_file_manager()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='FILE MANAGER ']")));
		fmsuperadminpage.clickFileManager();
	}
	
	@Then("user is to click the Modules button of the page")
	public void user_is_to_click_the_modules_button_of_the_page()
	{
		fmsuperadminpage.clickModulesButton();
	}
	@Then("user is to click the Backward navigation button")
	public void user_is_to_click_the_backward_navigation_button() throws InterruptedException  {
		
	//	Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-arrow-left']")));
		fmsuperadminpage.clickBackwardButton();
	}
	
	@Then("user is to click the File Manager1")
	public void user_is_to_click_the_file_manager1() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='FILE MANAGER ']")));
		fmsuperadminpage.clickFileManager();
	}
	
	@Then("user is to click the Forward navigation button")
	public void user_is_to_click_the_forward_navigation_button() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-arrow-right']")));
		fmsuperadminpage.clickForwardButton();
	}
	
	@Then("user is to click the Help dropdown button")
	public void user_is_to_click_the_help_dropdown_button() {
		
		fmsuperadminpage.clickHelpButton();
	}
	
	@Then("user is to verify About IETM in the dropdown")
	public void user_is_to_verify_about_ietm_in_the_dropdown() {
		
	    fmsuperadminpage.aboutIetmButton();
	
	}
	
	
	@Then("user is to verify How to use IETM? in the dropdown")
	public void user_is_to_verify_how_to_use_ietm_in_the_dropdown() {
		
		fmsuperadminpage.howToUseButton();
	}
	
	@Then("user is to verify Version & Revision History in the dropdown")
	public void user_is_to_verify_version_revision_history_in_the_dropdown() {
		
		fmsuperadminpage.versionHistoryButton();
		
	}
	
	@Then("user is to click the Logout button")
	public void user_is_to_click_the_logout_button()  {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Logout']")));
		fmsuperadminpage.clickLogoutButton();
	}
	
	@Then("user is to click the Close button")
	public void user_is_to_click_the_close_button()  {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='close'])[3]")));
		fmsuperadminpage.clickCloseButton();
	}
	
	@Then("user is to click the No button")
	public void user_is_to_click_the_no_button() {
		
		fmsuperadminpage.clickLogoutButton();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' NO']")));
		fmsuperadminpage.clickNoButton();
		
	}
	
	@Then("user is to click the Yes button")
	public void user_is_to_click_the_yes_button() {
		
		fmsuperadminpage.clickLogoutButton();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='YES']")));
		fmsuperadminpage.clickYesButton();
	}
	







	
	
	
	
	
	
	
	
	@After
	public void browserclose()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
