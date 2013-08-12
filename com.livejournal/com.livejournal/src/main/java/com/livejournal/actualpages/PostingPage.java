package com.livejournal.actualpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

import com.livejournal.mainpage.MainPage;

public class PostingPage extends MainPage {

	public PostingPage(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
			}
	protected PostingPage goToPost;
	@FindBy(how = How.ID, using ="subject")
	public WebElement subjectTextBox;
	
	@FindBy(how = How.ID, using = "body")
	public WebElement bodyOfPost;
	
	@FindBy(how = How.XPATH, xpath = "//button[contains(text(),'Post to')]")
	public WebElement buttonPost;
	
	@FindBy(how = How.XPATH, xpath = "//.[@class='b-singlepost-wrapper']")
	public WebElement articleBody;
	
	@FindBy(how = How.XPATH, xpath = "//a[contains(text(),'Post to journal')]")
	public WebElement postToJournalLink;
	
	public PostingPage openPostingPage(){
	    postToJournalLink.click();
	    return PageFactory.initElements(webDriver, PostingPage.class);
		}
	
	
	public PostingPage createNewPost (String subject, String body){
		subjectTextBox.sendKeys(subject);
		bodyOfPost.sendKeys(body);
		buttonPost.click();
	return PageFactory.initElements(webDriver, PostingPage.class);
}

	public boolean isPostDisplayed (){
		return articleBody.isDisplayed();
}
	@BeforeClass
	public PostingPage goToPost() throws InterruptedException{
		PostingPage post = goToPost.openPostingPage();
		Thread.sleep(2000);
		return PageFactory.initElements(webDriver, PostingPage.class);
	}
	

}
