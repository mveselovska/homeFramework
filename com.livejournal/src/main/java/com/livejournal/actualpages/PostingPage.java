package com.livejournal.actualpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.livejournal.MainPage.MainPage;

public class PostingPage extends MainPage {

	public PostingPage(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
			}
	@FindBy(how = How.ID, using ="subject")
	public WebElement subjectTextBox;
	
	@FindBy(how = How.ID, using = "body")
	public WebElement bodyOfPost;
	
	@FindBy()
	
	public PostingPage createNewPost (String subject, String body){
		subjectTextBox.sendKeys(subject);
		bodyOfPost.sendKeys(body);
		
	return PageFactory.initElements(webDriver, PostingPage.class);
}



}
