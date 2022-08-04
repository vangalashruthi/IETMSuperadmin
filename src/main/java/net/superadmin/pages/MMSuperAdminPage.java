package net.superadmin.pages;

import java.awt.AWTException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class MMSuperAdminPage {

WebDriver driver;
	
	public MMSuperAdminPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID ,using= "user_name")
	WebElement username;
	
	@FindBy(how = How.NAME ,using= "user_pass")
	WebElement password;
	
	@FindBy(how = How.ID ,using= "snbtn")
	WebElement submit;
	
	@FindBy(how = How.XPATH ,using= "//a[text()=' MANAGE MODULES']")
	WebElement manageModules;
	
	@FindBy(how = How.XPATH ,using= "//input[@type='search']")
	WebElement searchTextBox;
	
	@FindBy(how = How.XPATH ,using= "(//th[contains(@aria-label,'Module Name')])[1]")
	WebElement modules;
	
	@FindBy(how = How.NAME ,using= "tbllistid_length")
	WebElement entries;
	
	@FindBy(how = How.XPATH ,using= "//option[text()='50']")
	WebElement entriesOptions;
	
	@FindBy(how = How.XPATH ,using= "(//button[@type='button'])[7]")
	WebElement settingsMenu;
	
	@FindBy(how = How.ID ,using= "tbllistid_next")
	WebElement nextButton;
	
	@FindBy(how = How.ID ,using= "tbllistid_previous")
	WebElement previousButton;
	
	@FindBy(how = How.XPATH ,using= "//button[text()='Print']")
	WebElement printButton;
	
	@FindBy(how = How.ID ,using= "snbtn1")
	WebElement addModuleButton;
	
	@FindBy(how = How.XPATH ,using= "//input[@type='text']")
	WebElement moduleName;
	
	@FindBy(how = How.XPATH ,using= "//input[@type='number']")
	WebElement modulePosition;
	
	@FindBy(how = How.XPATH ,using= "//input[@type='file']")
	WebElement chooseFileButton;
	
	@FindBy(how = How.ID ,using= "adUser")
	WebElement saveButton;
	
	@FindBy(how = How.XPATH ,using= "(//button[@class='close'])[last()]")
	WebElement closeAddModule;
	
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
	
	@FindBy(how = How.XPATH ,using= "(//button[@class='close'])[3]")
	WebElement closeButton;
	
	@FindBy(how = How.XPATH ,using= "//button[text()=' NO']")
	WebElement noButton;
	
	@FindBy(how = How.XPATH ,using= "//button[text()='YES']")
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
	public void clickManageModules()
	{
		manageModules.click();
	}
	public void clickSearchTextBox()
	{
	  searchTextBox.click();
	}
	public void clearSearchTextBox()
	{
		searchTextBox.clear();
	}
	public void enterModuleName()
	{
		searchTextBox.sendKeys("electric");
	}
	public void verifyModules()
	{
		modules.isDisplayed();
	}
	public void clickEntries()
	{
		entries.click();
	}
	
	public void verifyEntries()
	{
		entriesOptions.isDisplayed();
	}
	
	public void clickEntriesOptions()
	{
		entriesOptions.click();
	}
	public void clickSettingsMenu()
	{
		settingsMenu.click();
	}
	public void clickNextButton()
	{
		nextButton.click();
	}
	public void clickPreviousButton()
	{
		previousButton.click();
	}
	public void verifyPrintButton()
	{
		printButton.isDisplayed();
	}
	public void clickAddModule()
	{
		addModuleButton.click();
	}
	public void verifyModuleNameTextBox()
	{
		moduleName.click();
		moduleName.sendKeys("Create");
	}
	public void verfiyModulePositionTextBox()
	{
		modulePosition.click();
		modulePosition.sendKeys("2");
	}
	public void verfiyChooseFileButton() throws AWTException
	{
		chooseFileButton.isDisplayed();
	}
	
	public void verifySaveButton()
	{
		saveButton.isDisplayed();
	}
	public void clickCloseAddModule()
	{
		closeAddModule.click();
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
