package net.ei.superadmin.stepdefinitions;

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
import net.superadmin.pages.EISuperAdminPage;
import net.superadmin.utility.BrowserOpen;


public class EI_SuperAdmin_StepDef {

	WebDriver driver;
	BrowserOpen bo = new BrowserOpen();
	EISuperAdminPage eisuperadminpage;
	
	
	@Given("user opens the {string} browser")
	public void user_opens_the_browser(String browsername) {
		
		driver = bo.browseropen(browsername);
	    eisuperadminpage = new EISuperAdminPage(driver);
		
	}
	
	@When("user enters the url as {string}")
	public void user_enters_the_url_as(String url) {
		
		driver.get(url);
	}
	
	@Then("user is to enter username as {string}")
	public void user_is_to_enter_username_as(String username) {
		
		eisuperadminpage.enterUserName();
	   
	}
	@Then("user is to enter password as {string}")
	public void user_is_to_enter_password_as(String password) {
		
		eisuperadminpage.enterPassword();
	   
	}
	@Then("user is to click the button {string}")
	public void user_is_to_click_the_button(String submit) {
		
		eisuperadminpage.clickSubmit();
		
	}	
		
	@Then("user is to click the {string}")
	public void user_is_to_click_the(String editIETM) {
		
		eisuperadminpage.clickEditIETM();	
	}
	
	@Then("user is to click General Information module")
	public void user_is_to_click_general_information_module()
	{
		eisuperadminpage.clickGeneralnformationModule();
	}
	
	@Then("user is to click the Abbreviations content")
	public void user_is_to_click_the_abbreviations_content()
	{
		eisuperadminpage.clickAbbreviationsContent();
	}
	
	@Then("user is to click the videos used in this IETM content")
	public void user_is_to_click_the_videos_used_in_this_ietm_content()
	{
		eisuperadminpage.clickVideosUsedContent();
	}
	
	@Then("user is to click the Terms and Definitions content")
	public void user_is_to_click_the_terms_and_definitions_content()
	{
		eisuperadminpage.clickTermsandDefinitions();
	}
	
	
	@Then("user is to click the Add New Page action")
	public void user_is_to_click_the_add_new_page_action() {
	    
		eisuperadminpage.clickAddNewPage();
		
	}
	@Then("user is to verify the textboxes of Add New Page")
	public void user_is_to_verify_the_textboxes_of_add_new_page() throws InterruptedException {
	   
		eisuperadminpage.verifyTextboxes();
		
	}
	@Then("user is to verify the Add New Related content action of Add New Page")
	public void user_is_to_verify_the_add_new_related_content_action_of_add_new_page() {
	    
		eisuperadminpage.verifyRelatedContentAction();
		
	}
	@Then("user is to verify the Access rights checkboxes of Add New Page")
	public void user_is_to_verify_the_access_rights_checkboxes_of_add_new_page() throws InterruptedException {
	    
		eisuperadminpage.verifyAccessRights();
		
	}
	@Then("user is to verify the Save button of Add New Page")
	public void user_is_to_verify_the_save_button_of_add_new_page() {
	 
		eisuperadminpage.verifySaveButton();
		
	}
	@Then("user is to click the Edit Page action")
	public void user_is_to_click_the_edit_page_action() {
	    
		eisuperadminpage.clickEditPage();
		
	}
	@Then("user is to verify the textboxes of Edit Page")
	public void user_is_to_verify_the_textboxes_of_edit_page() throws InterruptedException {
	    
		eisuperadminpage.verifyTextboxes();
		
	}
	@Then("user is to verify the Add New Related content action of Edit Page")
	public void user_is_to_verify_the_add_new_related_content_action_of_edit_page() {
	   
		eisuperadminpage.verifyRelatedContentAction();
		
	}
	@Then("user is to verify the Access rights checkboxes of Edit Page")
	public void user_is_to_verify_the_access_rights_checkboxes_of_edit_page() throws InterruptedException {
	   
		eisuperadminpage.verifyAccessRights();
		
	}
	@Then("user is to verify the Save button of Edit Page")
	public void user_is_to_verify_the_save_button_of_edit_page() {
	    
		eisuperadminpage.verifySaveButton();
		
	}
	@Then("user is to click the Add Main Page action")
	public void user_is_to_click_the_add_main_page_action() throws InterruptedException {
	   
		Thread.sleep(5000);
	//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	//   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@title='Add Main Page'])[1]")));
		eisuperadminpage.clickAddMainPage();
		
	}
	@Then("user is to verify the textboxes of Add Main Page")
	public void user_is_to_verify_the_textboxes_of_add_main_page() throws InterruptedException {
	   
	//	Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@role='presentation'])[2]")));
		eisuperadminpage.verifyTextboxes();
		
	}
	@Then("user is to verify the Add New Related content action of Add Main Page")
	public void user_is_to_verify_the_add_new_related_content_action_of_add_main_page() {
	   
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@title='Add new Related Content']")));
		eisuperadminpage.verifyRelatedContentAction();
		
	}
	@Then("user is to verify the Access rights checkboxes of Add Main Page")
	public void user_is_to_verify_the_access_rights_checkboxes_of_add_main_page() throws InterruptedException {
	    
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()=' Maintainer ']")));
		eisuperadminpage.verifyAccessRights();
		
	}
	@Then("user is to verify the Save button of Add Main Page")
	public void user_is_to_verify_the_save_button_of_add_main_page() {
	    
		eisuperadminpage.verifySaveButton();
		
	}
	
	@Then("user is to click the Next button")
	public void user_is_to_click_the_next_button()
	{
		eisuperadminpage.clickNextButton();
	}
	
	@Then("user is to click the Previous button")
	public void user_is_to_click_the_previous_button()
	{
		eisuperadminpage.clickPreviousButton();
	}
	
	@Then("user is to click the Related Content button")
	public void user_is_to_click_the_related_Content_button()
	{
		eisuperadminpage.clickRelatedContentButton();
	}
	
	@Then("user is to click the test3 in Related content dropdown")
	public void user_is_to_click_the_test3_in_related_content_dropdown()
	{
		eisuperadminpage.clickTest3();
	}
	
	@Then("user is to click the close button of test3 Popup page")
	public void user_is_to_click_the_close_button_of_test3_popup_page()
	{
		eisuperadminpage.clickCloseTest3();
	}
	
	@Then("user is to click the Zoom dropdown action")
	public void user_is_to_click_the_zoom_dropdown_action()
	{
		eisuperadminpage.clickZoomDropdown();
	}
	
	@Then("user is to click the Increase")
	public void user_is_to_click_the_increase()
	{
		eisuperadminpage.clickIncrease();
	}
	
	@Then("user is to click the Decrease")
	public void user_is_to_click_the_decrease() 
	{
		eisuperadminpage.clickDecrease();
	}
	
	@Then("user is to click the Slider")
	public void user_is_to_click_the_slider() 
	{
		eisuperadminpage.clickSlider();
	}
	
	@Then("user is to click the Reset")
	public void user_is_to_click_the_reset()
	{
		eisuperadminpage.clickReset();
	}
	
	@Then("user is to click the Manuals button")
	public void user_is_to_click_the_manuals_button()
	{
		eisuperadminpage.clickManualsButton();
	}
	
	@Then("user is to click the Drawings button")
	public void user_is_to_click_the_drawings_button()
	{
		eisuperadminpage.clickDrawingsButton();
	}
	
	@Then("user is to click the Glossary button")
	public void user_is_to_click_the_glossary_button()
	{
		eisuperadminpage.clickGlossarybutton();
	}
	@Then("user is to click the Search Textbox")
	public void user_is_to_click_the_search_textbox()
	{
		eisuperadminpage.clickSearchTextbox();
	}
	
	@Then("user is to clear the Search Textbox")
	public void user_is_to_clear_the_search_textbox()
	{
		eisuperadminpage.clearSearchTextBox();
	}
	
	@Then("user is to enter the Search Textbox")
	public void user_is_to_enter_the_search_textbox()
	{
		eisuperadminpage.enterSearchTextBox();
	}
	
	@Then("user is to verify the related text")
	public void user_is_to_verify_the_related_text() throws InterruptedException
	{
		eisuperadminpage.verifyRelatedText();
	}
	
	  @Then("user is to click the FullScreen action")
	  public void user_is_to_click_the_fullscreen_action() {
	
		  eisuperadminpage.clickFullScreen(); 
	  } 
	  @Then("user is to click the Escape key in keyboard")         
	  public void user_is_to_click_the_escape_key_in_keyboard() throws AWTException {
	
		  eisuperadminpage.clickEscape(); 
	  } 
	  @Then("user is to click the Bookmark action") 
	  public void user_is_to_click_the_bookmark_action() {
	 
		  eisuperadminpage.clickBookmarkAction(); 
	  }
	  @Then("user is to close the Bookmark action")
	  public void user_is_to_close_the_bookmark_action() {
	
		  eisuperadminpage.closeBookmarkAction(); 
	  }
	  @Then("user is to click the Search action") 
	  public void user_is_to_click_the_search_action() { 
		  eisuperadminpage.clickSearchAction();
	  }
	  
	  @Then("user is to click the Back navigation button") 
	  public void user_is_to_click_the_back_navigation_button() {
		
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@title,' Back')]")));
		    eisuperadminpage.clickBackButton(); 
	  }
	  @Then("user is to click the Home button of the page")
	  public void user_is_to_click_the_home_button_of_the_page() throws InterruptedException
	  {
			Thread.sleep(1000);
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Home']")));
			eisuperadminpage.clickHomeButton();
	  }
		
		@Then("user is to click the Edit IETM")
		public void user_is_to_click_the_edit_ietm()
		{
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()=' EDIT IETM ']")));
			eisuperadminpage.clickEditIETM();
		}
		
		@Then("user is to click the Modules button of the page")
		public void user_is_to_click_the_modules_button_of_the_page()
		{
			eisuperadminpage.clickModulesButton();
		}
		@Then("user is to click the Backward navigation button")
		public void user_is_to_click_the_backward_navigation_button() throws InterruptedException  {
			
	//		Thread.sleep(1000);
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='fa fa-arrow-left']")));
			eisuperadminpage.clickBackwardButton();
		}
		
		@Then("user is to click the General information module")
		public void user_is_to_click_the_general_information_module() throws InterruptedException {
			
	//		Thread.sleep(4000);
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h5[text()='General Information']")));
	    	eisuperadminpage.clickGeneralnformationModule();
		}
		
		@Then("user is to click the Forward navigation button")
		public void user_is_to_click_the_forward_navigation_button() {
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
	    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='fa fa-arrow-right']")));
	    	eisuperadminpage.clickForwardButton();
		}
		
		@Then("user is to click the Help dropdown button")
		public void user_is_to_click_the_help_dropdown_button() {
			
			eisuperadminpage.clickHelpButton();
		}
		
		@Then("user is to verify About IETM in the dropdown")
		public void user_is_to_verify_about_ietm_in_the_dropdown() {
			
			eisuperadminpage.aboutIetmButton();
		
		}
		
		
		@Then("user is to verify How to use IETM? in the dropdown")
		public void user_is_to_verify_how_to_use_ietm_in_the_dropdown() {
			
			eisuperadminpage.howToUseButton();
		}
		
		@Then("user is to verify Version & Revision History in the dropdown")
		public void user_is_to_verify_version_revision_history_in_the_dropdown() {
			
			eisuperadminpage.versionHistoryButton();
			
		}
		
		@Then("user is to click the Logout button")
		public void user_is_to_click_the_logout_button()  {
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Logout']")));
			eisuperadminpage.clickLogoutButton();
		}
		
		@Then("user is to click the Close button")
		public void user_is_to_click_the_close_button()   {
			
		
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='close'])[last()]")));
			eisuperadminpage.clickCloseButton();
		}
		
		@Then("user is to click the No button")
		public void user_is_to_click_the_no_button() {
			
			eisuperadminpage.clickLogoutButton();
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' NO']")));
			eisuperadminpage.clickNoButton();
			
		}
		
		@Then("user is to click the Yes button")
		public void user_is_to_click_the_yes_button() {
			
			eisuperadminpage.clickLogoutButton();
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()='YES'])[last()]")));
			eisuperadminpage.clickYesButton();
		}






	
	
	
	
	@After
	public void browserclose()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
