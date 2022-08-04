package net.superadmin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FMSuperAdminPage {

	WebDriver driver;
	
	public FMSuperAdminPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID ,using= "user_name")
	WebElement username;
	
	@FindBy(how = How.NAME ,using= "user_pass")
	WebElement password;
	
	@FindBy(how = How.ID ,using= "snbtn")
	WebElement submit;
	
	@FindBy(how = How.XPATH ,using= "//a[text()='FILE MANAGER ']")
	WebElement fileManager;
	
	@FindBy(how = How.XPATH ,using= "//button[@title='Add Folder']")
	WebElement addFolderButton;
	
	@FindBy(how = How.NAME ,using= "newfolder_name")
	WebElement newFolderTextbox;
	
	@FindBy(how = How.XPATH ,using= "//button[text()='Add']")
	WebElement addButton;
	
	@FindBy(how = How.XPATH ,using= "//button[text()='Cancel']")
	WebElement cancelButton;
	
	@FindBy(how = How.XPATH ,using= "(//button[@class='close'])[3]")
	WebElement closeButton;
	
	@FindBy(how = How.XPATH ,using= "//button[@title='Upload File']")
	WebElement uploadFileButton;
	
	@FindBy(how = How.XPATH ,using= "//input[@type='file']")
	WebElement chooseButton;
	
	@FindBy(how = How.XPATH ,using= "//button[text()='Upload']")
	WebElement uploadButton;
	
	@FindBy(how = How.XPATH ,using= "//button[@title='Go Home']")
    WebElement goHomeButton;
	
	@FindBy(how = How.XPATH ,using= "//button[@title='Back One Level']")
	WebElement backOneLevelButton;
	
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
	
	@FindBy(how = How.XPATH ,using= "(//i[@class='fa fa-folder'])[2]")
	WebElement folder;
    
	@FindBy(how = How.XPATH ,using= "//i[@class='fa fa-file-o']")
	WebElement documents;
	
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
	public void clickFileManager()
	{
		fileManager.click();
	}
	public void clickAddFolderButton()
	{
		addFolderButton.click();
	}
	
    public void verifyNewFolderTextbox()
    {
    	newFolderTextbox.click();
    }
	public void verifyAddButton()
	{
		addButton.isDisplayed();
	}
	
	public void verifyCancelButton()
	{
		cancelButton.isDisplayed();
	}
	public void verifyCloseButton()
	{
		closeButton.click();
	}
	
	public void clickUploadFileButton()
	{
		uploadFileButton.click();
	}
	public void verifyChooseButton() 
	{
		chooseButton.isDisplayed();
		
	}
	public void verifyUploadButton()
	{
		uploadButton.isDisplayed();
	}
	public void verifyGoHomeButton()
	{
		goHomeButton.isDisplayed();
	}
	public void clickGoHomeButton()
	{
		goHomeButton.click();
	}
    public void verifyBackOneLevelButton()
    {
    	backOneLevelButton.isDisplayed();
    }
    public void clickBackOneLevelButton()
    {
    	backOneLevelButton.click();
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
	public void clickFolder()
	{
		folder.click();
	}
	
	public void verifyDocuments()
	{
		documents.isDisplayed();
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
