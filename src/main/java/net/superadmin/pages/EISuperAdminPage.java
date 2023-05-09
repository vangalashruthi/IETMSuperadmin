package net.superadmin.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class EISuperAdminPage {

WebDriver driver;
	
	public EISuperAdminPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID ,using= "user_name")
	WebElement username;
	
	@FindBy(how = How.NAME ,using= "user_pass")
	WebElement password;
	
	@FindBy(how = How.ID ,using= "snbtn")
	WebElement submit;
	
	@FindBy(how = How.XPATH ,using= "//a[text()=' EDIT IETM ']")
	WebElement editIetm;
	
	@FindBy(how = How.XPATH ,using= "//h5[text()='General Information']")
	WebElement generalInformationModule;
	
	@FindBy(how = How.XPATH ,using= "//span[text()='Abbreviations']")
	WebElement abbreviationsContent;
	
	@FindBy(how = How.XPATH ,using= "//span[text()='Videos used in this IETM']")
	WebElement videosUsedInThisIetmContent;
	
	@FindBy(how = How.XPATH ,using= "//span[text()='Terms and Definitions']")
	WebElement termsAndDefinitions;
	
	@FindBy(how = How.XPATH ,using= "//a[@title='Add New Page']")
	WebElement addNewPageAction;
	
	@FindBy(how = How.ID_OR_NAME ,using= "title")
	WebElement pageTitleTextbox;
	
	@FindBy(how = How.XPATH ,using= "(//div[@role='presentation'])[2]")
	WebElement pageContentTextbox;
	
	@FindBy(how = How.XPATH ,using= "//i[@title='Add new Related Content']")
	WebElement relatedContentAction;
	
	@FindBy(how = How.XPATH ,using= "//label[text()=' Operator ']")
	WebElement operatorCheckbox;
	
	@FindBy(how = How.XPATH ,using= "//label[text()=' Maintainer ']")
	WebElement maintainerCheckbox;
	
	@FindBy(how = How.XPATH ,using= "//button[text()='SAVE']")
	WebElement saveButton;
	
	@FindBy(how = How.XPATH ,using= "//a[@title='Edit Page']")
	WebElement editPageAction;
	
	@FindBy(how = How.XPATH ,using= "//a[@title='Delete Page']")
	WebElement deletePageAction;
	
	@FindBy(how = How.XPATH ,using= "(//i[@class='lni lni-add-files'])[3]")
	WebElement addMainPageAction;
	
	@FindBy(how = How.ID_OR_NAME ,using= "title")
	WebElement textbox;
	
	@FindBy(how = How.XPATH ,using= "//button[@title='Next Topic']")
	WebElement nextButton;
	
	@FindBy(how = How.XPATH ,using= "//button[@title='Previous Topic']")
	WebElement previousButton;
	
	@FindBy(how = How.XPATH ,using= "//button[text()=' Related Content ']")
	WebElement relatedContentButton;
	
	@FindBy(how = How.XPATH ,using= "//a[@title='test3']")
	WebElement test3;
	
	@FindBy(how = How.XPATH ,using= "//button[@title='Close']")
	WebElement closeTest3;
	
	@FindBy(how = How.ID ,using= "localsearch")
	WebElement searchTextBox;
	
	@FindBy(how = How.XPATH ,using= "//h4[contains(text(),'Warn')]")
	WebElement relatedText;
	
	@FindBy(how = How.XPATH ,using= "//button[@title='Zoom']")
	WebElement zoomDropdownAction;
	
	@FindBy(how = How.XPATH ,using= "//i[@title='Increase']")
	WebElement increase;
	
	@FindBy(how = How.XPATH ,using= "//i[@title='Decrease']")
	WebElement decrease;
	
	@FindBy(how = How.XPATH ,using= "//div[contains(@class,'min-slider')]")
	WebElement slider;
	
	@FindBy(how = How.XPATH ,using= "//i[@title='Reset']")
	WebElement reset;
	
	@FindBy(how = How.XPATH ,using= "//a[text()='Manuals']")
	WebElement manualsButton;
	
	@FindBy(how = How.XPATH ,using= "//a[text()='Drawings']")
	WebElement drawingsButton;
	
	@FindBy(how = How.XPATH ,using= "//a[text()='Glossary']")
	WebElement glossaryButton;
	
	@FindBy(how = How.ID ,using= "fullscreen-trigger")
	WebElement fullScreen;
	
	@FindBy(how = How.XPATH ,using= "//i[@class='lni lni-bookmark']")
	WebElement bookmarkAction;
	
	@FindBy(how = How.XPATH ,using= "(//button[@class='close'])[last()]")
	WebElement closeBookmark;
	
	@FindBy(how = How.XPATH ,using= "//i[@class='lni lni-search']")
	WebElement searchAction;
	
	@FindBy(how = How.XPATH ,using= "//button[contains(@title,' Back')]")
	WebElement backButton;
	
	@FindBy(how = How.XPATH ,using= "//button[@title='Home']")
	WebElement homeButton;
	
	@FindBy(how = How.XPATH ,using= "//button[@title='Modules']")
	WebElement modulesButton;
	
	@FindBy(how = How.XPATH ,using= "//i[@class='fa fa-arrow-left']")
	WebElement backwardButton;
	
	@FindBy(how = How.XPATH ,using= "//i[@class='fa fa-arrow-right']")
	WebElement forwardButton;
	
	@FindBy(how = How.XPATH ,using= "//button[@title='Help']")
	WebElement helpButton;
	
	@FindBy(how = How.XPATH ,using= "//a[text()='About IETM']")
	WebElement aboutIetm;
	
	@FindBy(how = How.XPATH ,using= "//a[text()='How to Use IETM?']")
	WebElement howToUseIetm;
	
	@FindBy(how = How.XPATH ,using= "//a[text()='Version & Revision History']")
	WebElement versionHistory;
	
	@FindBy(how = How.XPATH ,using= "//button[@title='Logout']")
	WebElement logoutButton;
	
	@FindBy(how = How.XPATH ,using= "(//button[@class='close'])[last()]")
	WebElement closeButton;
	
	@FindBy(how = How.XPATH ,using= "//button[text()=' NO']")
	WebElement noButton;
	
	@FindBy(how = How.XPATH ,using= "(//button[text()='YES'])[last()]")
	WebElement yesButton;
	
	
	
	public void enterUserName()
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
	public void clickEditIETM()
	{
		editIetm.click();
	}
	public void clickGeneralnformationModule()
	{
		generalInformationModule.click();
	}
	public void clickVideosUsedContent()
	{
		videosUsedInThisIetmContent.click();
	}
	public void clickAbbreviationsContent()
	{
		abbreviationsContent.click();
	}
	public void clickTermsandDefinitions()
	{
		termsAndDefinitions.click();
	}
	
	public void clickAddNewPage()
	{
		addNewPageAction.click();
	}
	public void verifyTextboxes() throws InterruptedException
	{
		pageTitleTextbox.click();
	
		pageContentTextbox.click();
	}
	public void verifyRelatedContentAction()
	{
		relatedContentAction.click();
	}
	public void verifyAccessRights() throws InterruptedException
	{
		operatorCheckbox.click();
	
	
		maintainerCheckbox.click();
	}
	public void verifySaveButton()
	{
		saveButton.isDisplayed();
	}
	public void clickEditPage()
	{
		editPageAction.click();
	}
	public void clickDeletePage()
	{
		deletePageAction.click();
	}
	public void clickAddMainPage() throws InterruptedException
	{
	
		addMainPageAction.click();
	}
	public void verifyTextbox() throws InterruptedException
	{
		
		pageTitleTextbox.click();
	}
	public void clickSearchTextbox()
	{
		searchTextBox.click();
	}
	
	public void clearSearchTextBox()
	{
		searchTextBox.clear();
	}
	
	public void enterSearchTextBox()
	{
		searchTextBox.sendKeys("ensure");
	}
	
	public void verifyRelatedText() throws InterruptedException
	{
	
		relatedText.isDisplayed();
	}
	public void clickNextButton()
	{
		nextButton.click();
	}
	
	public void clickPreviousButton()
	{
		previousButton.click();
	}
	
	public void clickRelatedContentButton()
	{
		relatedContentButton.click();
	}
	
	public void clickTest3()
	{
		test3.click();
	}
	
	public void clickCloseTest3()
	{
		closeTest3.click();
	}
	
	public void clickZoomDropdown()
	{
		zoomDropdownAction.click();
	}
	public void clickIncrease()
	{
		increase.click();
	}
	public void clickDecrease()
	{
		decrease.click();
	}
	public void clickSlider()
	{
		slider.click();
	}
	public void clickReset()
	{
		reset.click();
	}
	public void clickManualsButton()
	{
		manualsButton.click();
	}
	public void clickDrawingsButton()
	{
		drawingsButton.click();
	}
	public void clickGlossarybutton()
	{
		glossaryButton.click();
	}
	public void clickFullScreen()
	{
		fullScreen.click();
	}
	public void clickEscape() throws AWTException
	{
		Robot rb = new Robot();
		
	  rb.keyPress(KeyEvent.VK_ESCAPE);
	  rb.keyRelease(KeyEvent.VK_ESCAPE);
	  
	}
	public void clickBookmarkAction()
	{
		bookmarkAction.click();
	}
	public void closeBookmarkAction()
	{
		closeBookmark.click();
	}
	public void clickSearchAction()
	{
		searchAction.click();
	}
	public void clickBackButton()
	{
		backButton.click();
	}
	public void clickHomeButton()
	{
		homeButton.click();
	}
	
	public void clickModulesButton()
	{
		modulesButton.click();
	}
	public void clickBackwardButton()
	{
		backwardButton.click();
	}
	
	public void clickForwardButton()
	{
		forwardButton.click();
	}
	
	public void clickHelpButton()
	{
		helpButton.click();
	}
	
	public void aboutIetmButton()
	{
		aboutIetm.isDisplayed();
	}
	
	public void howToUseButton()
	{
		howToUseIetm.isDisplayed();
	}
	
	public void versionHistoryButton()
	{
		versionHistory.isDisplayed();
	}
	
	public void clickLogoutButton()
	{
		logoutButton.click();
	}
	
	public void clickCloseButton()
	{
		closeButton.click();
	}
	
	public void clickNoButton()
	{
		noButton.click();
	}
	
	public void clickYesButton()
	{
		yesButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
