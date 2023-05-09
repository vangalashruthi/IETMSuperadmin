package net.mu.superadmin.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.superadmin.pages.MUSuperAdminPage;
import net.superadmin.utility.BrowserOpen;



public class MU_SuperAdmin_StepDef {

	WebDriver driver;
	BrowserOpen bo = new BrowserOpen();
	
	MUSuperAdminPage musuperadminpage;
	
	@Given("user opens the {string} browser")
	public void user_opens_the_browser(String browsername) {
		
		driver = bo.browseropen(browsername);
	    musuperadminpage = new MUSuperAdminPage(driver);
		
	}
	@When("user enters the url as {string}")
	public void user_enters_the_url_as(String url) {
		
		driver.get(url);
	    
	}
	@Then("user is to enter username as {string}")
	public void user_is_to_enter_username_as(String username) {
		
		musuperadminpage.enterUserName();
	   
	}
	@Then("user is to enter password as {string}")
	public void user_is_to_enter_password_as(String password) {
		
		musuperadminpage.enterPassword();
	   
	}
	@Then("user is to click the button {string}")
	public void user_is_to_click_the_button(String submit) {
		
		musuperadminpage.clickSubmit();
		
	}	
		
	@Then("user is to click the {string}")
	public void user_is_to_click_the(String manageUsers) {
		
		musuperadminpage.clickManageUsers();
	}
	
	@Then("user is to click the Search TextBox")
	public void user_is_to_click_the_search_textBox()
	{
		musuperadminpage.clickSearchTextBox();
	}
	
	@Then("user is to clear the Search TextBox")
	public void user_is_to_clear_the_search_textBox()
	{
		musuperadminpage.clearSearchTextBox();
	}
	
	@Then("user is to enter the ID no in the Search TextBox")
	public void user_is_to_enter_the_id_no_in_the_search_textBox()
	{
		musuperadminpage.enterIDno();
	}
	
	@Then("user is to verify the Users related to ID no")
	public void user_is_to_verify_the_users_related_to_id_no()
	{
		musuperadminpage.verifyUsers();
	}
	
	@Then("user is to click the Search TextBox1")
	public void user_is_to_click_the_search_textBox1()
	{
		musuperadminpage.clickSearchTextBox();
	}
	
	@Then("user is to clear the Search TextBox1")
	public void user_is_to_clear_the_search_textBox1()
	{
		musuperadminpage.clearSearchTextBox();
	}
	
	@Then("user is to enter the Username in the Search TextBox")
	public void user_is_to_enter_the_username_in_the_search_textBox()
	{
		musuperadminpage.enterUsernameSearchTextBox();
	}
	
	@Then("user is to verify the Users related to Username")
	public void user_is_to_verify_the_users_related_to_username()
	{
		musuperadminpage.verifyUsers();
	}
	
	@Then("user is to click the dropdown arrows")
	public void user_is_to_click_the_dropdown_arrows()
	{
		musuperadminpage.clickEntries();
	}
	
	@Then("user is to verify the options in the list")
	public void user_is_to_verify_the_options_in_the_list()
	{
		musuperadminpage.verifyEntries();
	}
	
	@Then("user is to click the options in the list")
	public void user_is_to_click_the_options_in_the_list()
	{
		musuperadminpage.clickEntriesOptions();
	}
	
	@Then("user is to verify all the actions in the Settings menu")
	public void user_is_to_verify_all_the_actions_in_the_settings_menu() throws InterruptedException
	{
		Thread.sleep(1000);
	//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("(//button[@type='button'])[7]")));
		musuperadminpage.clickSettingsMenu();
	}
	
	@Then("user is to click the Next button")
	public void user_is_to_click_the_next_button()
	{
		musuperadminpage.clickNextButton();
	}
	
	@Then("user is to click the Previous button")
	public void user_is_to_click_the_previous_button()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tbllistid_previous")));
		musuperadminpage.clickPreviousButton();
	}
	
	@Then("user is to verify the Print button")
	public void user_is_to_verify_the_print_button()
	{
		musuperadminpage.verifyPrintButton();
	}
	
	@Then("user is to click the Add User button")
	public void user_is_to_click_the_add_user_button()
	{
		musuperadminpage.clickAddUserButton();
	}
	
	@Then("user is to verify the ID No Textbox")
	public void user_is_to_verify_the_id_no_textbox()
	{
		musuperadminpage.verifyIdNoTextbox();
	}
	
	@Then("user is to verify the Username Textbox")
	public void user_is_to_verify_the_username_textbox()
	{
		musuperadminpage.verifyUsernameTextbox();
	}
	
	@Then("user is to verify the Password Textbox")
	public void user_is_to_verify_the_password_textbox()
	{
		musuperadminpage.verifyPasswordTextbox();
	}
	
	@Then("user is to verify the Role Dropdown menu")
	public void user_is_to_verify_the_role_dropdown_menu()
	{
		musuperadminpage.verifyRoleDropdown();
	}
	
	@Then("user is to verify the Submit button")
	public void user_is_to_verify_the_submit_button()
	{
		musuperadminpage.clickSubmitButton();
	}
	
	@Then("user is to click the Home button of the page")
	public void user_is_to_click_the_home_button_of_the_page() throws InterruptedException
	{
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Home']")));
		musuperadminpage.clickHomeButton();
	}
	
	@Then("user is to click the Manage Users")
	public void user_is_to_click_the_manage_users()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=' MANAGE USERS']")));
		musuperadminpage.clickManageUsers();
	}
	
	@Then("user is to click the Modules button of the page")
	public void user_is_to_click_the_modules_button_of_the_page()
	{
		musuperadminpage.clickModulesButton();
	}
	
	@Then("user is to click the Backward navigation button")
	public void user_is_to_click_the_backward_navigation_button() throws InterruptedException  {
		
	//	Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-arrow-left']")));
		musuperadminpage.clickBackwardButton();
	}
	
	@Then("user is to click the Manage Users1")
	public void user_is_to_click_the_manage_users1() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=' MANAGE USERS']")));
		musuperadminpage.clickManageUsers();
	}
	
	@Then("user is to click the Forward navigation button")
	public void user_is_to_click_the_forward_navigation_button() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-arrow-right']")));
		musuperadminpage.clickForwardButton();
	}
	
	@Then("user is to click the Help dropdown button")
	public void user_is_to_click_the_help_dropdown_button() {
		
		musuperadminpage.clickHelpButton();
	}
	
	@Then("user is to verify About IETM in the dropdown")
	public void user_is_to_verify_about_ietm_in_the_dropdown() {
		
	    musuperadminpage.aboutIetmButton();
	
	}
	
	
	@Then("user is to verify How to use IETM? in the dropdown")
	public void user_is_to_verify_how_to_use_ietm_in_the_dropdown() {
		
		musuperadminpage.howToUseButton();
	}
	
	@Then("user is to verify Version & Revision History in the dropdown")
	public void user_is_to_verify_version_revision_history_in_the_dropdown() {
		
		musuperadminpage.versionHistoryButton();
		
	}
	
	@Then("user is to click the Logout button")
	public void user_is_to_click_the_logout_button()  {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Logout']")));
		musuperadminpage.clickLogoutButton();
	}
	
	@Then("user is to click the Close button")
	public void user_is_to_click_the_close_button()  {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='close'])[3]")));
		musuperadminpage.clickCloseButton();
	}
	
	@Then("user is to click the No button")
	public void user_is_to_click_the_no_button() {
		
		musuperadminpage.clickLogoutButton();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' NO']")));
		musuperadminpage.clickNoButton();
		
	}
	
	@Then("user is to click the Yes button")
	public void user_is_to_click_the_yes_button() {
		
		musuperadminpage.clickLogoutButton();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='YES']")));
		musuperadminpage.clickYesButton();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@After
	public void browserclose()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
