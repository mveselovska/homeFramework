package com.livejournal.actualpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.livejournal.mainpage.MainPage;

public class HomePage extends MainPage {

	public HomePage(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}
		@FindBy (how = How.XPATH, xpath="//a[contains(text(), 'Settings')]")
		public WebElement mySettings;
		
		@FindBy (how = How.ID, id="m1")
		public WebElement profileMenu;
		@FindBy(how = How.CLASS_NAME, using = "userbar")
		public WebElement userBarMenu;

		public boolean isHomePageDisplayed() throws InterruptedException{
			Thread.sleep(2000);
			return userBarMenu.isDisplayed();
		}
		
		public HomePage selectSettings() throws InterruptedException{
			Actions builder = new Actions(webDriver); 
			builder.moveToElement(profileMenu).perform();
			Thread.sleep(500);
			mySettings.click();
//		((Select) myProfile).selectByVisibleText("Settings");
		//Select dropDownList = new Select(webDriver.findElement(By.id("horizon-menu-me")));
		//dropDownList.selectByVisibleText("Settings");
		return PageFactory.initElements(webDriver, HomePage.class);
		}
		
		public boolean verifySettingsPage(String settingsUrl){
			String currentUrl = webDriver.getCurrentUrl();
			return currentUrl.equals(settingsUrl);
		}
		
		@FindBy(how = How.XPATH, xpath = "//a[contains(text(),'Post to journal')]")
		public WebElement postToJournalLink;

		public PostingPage openPostingPage(){
			postToJournalLink.click();
			return PageFactory.initElements(webDriver, PostingPage.class);
		}
		
		
}

