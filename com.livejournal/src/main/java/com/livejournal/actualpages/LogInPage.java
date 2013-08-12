package com.livejournal.actualpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.livejournal.MainPage.MainPage;

public class LogInPage extends MainPage {

	public LogInPage(WebDriver driver) {
		super(driver);
		}
	
@FindBy(how = How.ID, using = "login_user")
public WebElement loginTextBox;

@FindBy(how = How.ID, using = "login_password")
public WebElement passwordTextBox;

@FindBy(how = How.ID, using = "loginlj_submit")
public WebElement buttonSubmit;

public HomePage openHomePage (String login, String password){
	loginTextBox.clear();
	passwordTextBox.clear();
	loginTextBox.sendKeys(login);
	passwordTextBox.sendKeys(password);
	buttonSubmit.click();
	return PageFactory.initElements(webDriver, HomePage.class);

}

}
