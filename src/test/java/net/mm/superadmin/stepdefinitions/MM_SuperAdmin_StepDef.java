package net.mm.superadmin.stepdefinitions;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.superadmin.pages.MMSuperAdminPage;
import net.superadmin.utility.BrowserOpen;


public class MM_SuperAdmin_StepDef {

	WebDriver driver;
	BrowserOpen bo = new BrowserOpen();
	
	MMSuperAdminPage mmsuperadminpage;
	
	@Given("user opens the {string} browser")
	public void user_opens_the_browser(String browsername) {
		
		driver = bo.browseropen(browsername);
	    mmsuperadminpage = new MMSuperAdminPage(driver);
		
	}
	@When("user enters the url as {string}")
	public void user_enters_the_url_as(String url) {
		
		driver.get(url);
	    
	}
	@Then("user is to enter username as {string}")
	public void user_is_to_enter_username_as(String username) {
		
		mmsuperadminpage.enterUserName();
	   
	}
	@Then("user is to enter password as {string}")
	public void user_is_to_enter_password_as(String password) {
		
		mmsuperadminpage.enterPassword();
	   
	}
	@Then("user is to click the button {string}")
	public void user_is_to_click_the_button(String submit) {
		
		mmsuperadminpage.clickSubmit();
		
	}	
		
	@Then("user is to click the {string}")
	public void user_is_to_click_the(String manageModules) {
		
		mmsuperadminpage.clickManageModules();
	}
	
	@Then("user is to click the Search TextBox")
	public void user_is_to_click_the_search_textbox()
	{
		mmsuperadminpage.clickSearchTextBox();
	}
	
	@Then("user is to clear the Search TextBox")
	public void user_is_to_clear_the_search_textbox()
	{
		mmsuperadminpage.clearSearchTextBox();
	}
	
	@Then("user is to enter the Module name in the Search TextBox")
	public void user_is_to_enter_the_module_name_in_the_search_textbox()
	{
		mmsuperadminpage.enterModuleName();
	}
	
	@Then("user is to verify the Modules related to Module name")
	public void user_is_to_verify_the_modules_related_to_module_name()
	{
		mmsuperadminpage.verifyModules();
	}
	
	@Then("user is to click the dropdown arrows")
	public void user_is_to_click_the_dropdown_arrows()
	{
		mmsuperadminpage.clickEntries();
	}
	
	@Then("user is to verify the options in the list")
	public void user_is_to_verify_the_options_in_the_list()
	{
		mmsuperadminpage.verifyEntries();
	}
	
	@Then("user is to click the options in the list")
	public void user_is_to_click_the_options_in_the_list()
	{
		mmsuperadminpage.clickEntriesOptions();
	}
	
	@Then("user is to verify all the actions in the Settings menu")
	public void user_is_to_verify_all_the_actions_in_the_settings_menu() throws InterruptedException
	{
		Thread.sleep(1000);
	//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("(//button[@type='button'])[7]")));
		mmsuperadminpage.clickSettingsMenu();
	}
	
	@Then("user is to click the Next button")
	public void user_is_to_click_the_next_button()
	{
		mmsuperadminpage.clickNextButton();
	}
	
	@Then("user is to click the Previous button")
	public void user_is_to_click_the_previous_button()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tbllistid_previous")));
		mmsuperadminpage.clickPreviousButton();
	}
	
	@Then("user is to verify the Print button")
	public void user_is_to_verify_the_print_button()
	{
		mmsuperadminpage.verifyPrintButton();
	}
	
	@Then("user is to click the Add Module button")
	public void user_is_to_click_the_add_module_button()
	{
		mmsuperadminpage.clickAddModule();
	}
	
	@Then("user is to verify the Module name TextBox")
	public void user_is_to_verify_the_module_name_textbox()
	{
		mmsuperadminpage.verifyModuleNameTextBox();
	}
	
	@Then("user is to verify the Module positon TextBox")
	public void user_is_to_verify_the_module_positon_textbox()
	{
		mmsuperadminpage.verfiyModulePositionTextBox();
	}
	
	@Then("user is to verify the Module image Choose file button")
	public void user_is_to_verify_the_module_image_choose_file_button() throws AWTException
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='file']")));
		mmsuperadminpage.verfiyChooseFileButton();
	}
	
	@Then("user is to verify the Save button")
	public void user_is_to_verify_the_save_button()
	{
		mmsuperadminpage.verifySaveButton();
	}
	
	@Then("user is to click the Close button of Add module")
	public void user_is_to_click_the_close_button_of_add_module()
	{
		mmsuperadminpage.clickCloseAddModule();
	}
	
	@Then("user is to click the Home button of the page")
	public void user_is_to_click_the_home_button_of_the_page() throws InterruptedException
	{
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Home']")));
		mmsuperadminpage.clickHomeButton();
	}
	
	@Then("user is to click the Manage Modules")
	public void user_is_to_click_the_manage_modules()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=' MANAGE MODULES']")));
		mmsuperadminpage.clickManageModules();
	}
	
	@Then("user is to click the Modules button of the page")
	public void user_is_to_click_the_modules_button_of_the_page()
	{
		mmsuperadminpage.clickModulesButton();
	}
	
	@Then("user is to click the Backward navigation button")
	public void user_is_to_click_the_backward_navigation_button() throws InterruptedException  {
		
	//	Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-arrow-left']")));
		mmsuperadminpage.clickBackwardButton();
	}
	
	@Then("user is to click the Manage Modules1")
	public void user_is_to_click_the_manage_modules1() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=' MANAGE MODULES']")));
		mmsuperadminpage.clickManageModules();
	}
	
	@Then("user is to click the Forward navigation button")
	public void user_is_to_click_the_forward_navigation_button() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-arrow-right']")));
		mmsuperadminpage.clickForwardButton();
	}
	
	@Then("user is to click the Help dropdown button")
	public void user_is_to_click_the_help_dropdown_button() {
		
		mmsuperadminpage.clickHelpButton();
	}
	
	@Then("user is to verify About IETM in the dropdown")
	public void user_is_to_verify_about_ietm_in_the_dropdown() {
		
	    mmsuperadminpage.aboutIetmButton();
	
	}
	
	
	@Then("user is to verify How to use IETM? in the dropdown")
	public void user_is_to_verify_how_to_use_ietm_in_the_dropdown() {
		
		mmsuperadminpage.howToUseButton();
	}
	
	@Then("user is to verify Version & Revision History in the dropdown")
	public void user_is_to_verify_version_revision_history_in_the_dropdown() {
		
		mmsuperadminpage.versionHistoryButton();
		
	}
	
	@Then("user is to click the Logout button")
	public void user_is_to_click_the_logout_button()  {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Logout']")));
		mmsuperadminpage.clickLogoutButton();
	}
	
	@Then("user is to click the Close button")
	public void user_is_to_click_the_close_button()  {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='close'])[3]")));
		mmsuperadminpage.clickCloseButton();
	}
	
	@Then("user is to click the No button")
	public void user_is_to_click_the_no_button() {
		
		mmsuperadminpage.clickLogoutButton();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' NO']")));
		mmsuperadminpage.clickNoButton();
		
	}
	
	@Then("user is to click the Yes button")
	public void user_is_to_click_the_yes_button() {
		
		mmsuperadminpage.clickLogoutButton();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='YES']")));
		mmsuperadminpage.clickYesButton();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@After
	public void browserclose()
	{
		driver.quit();
	}
	
	
	
	
	
}
