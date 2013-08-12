package com.livejournal.actualpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.livejournal.MainPage.MainPage;

public class HomePage extends MainPage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
		@FindBy(how = How.CLASS_NAME, using = "userbar")
		public WebElement userBarMenu;
		@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Post to journal")
		public WebElement postToJournalLink;
		//a[contains(text(), "Post to journal")]/@href
		
		public boolean isHomePageDisplayed(){
			return userBarMenu.isDisplayed();
		}
		
		public PostingPage openPostingPage(){
	    postToJournalLink.click();
	    return PageFactory.initElements(webDriver, PostingPage.class);
		}
}

