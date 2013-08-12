package com.livejournal.actualpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.livejournal.mainpage.MainPage;

public class LogInPage extends MainPage {

	public LogInPage(WebDriver webDriver) {
		super(webDriver);
		}
	
@FindBy(how = How.ID, using = "login_user")
public WebElement loginTextBox;

@FindBy(how = How.ID, using = "login_password")
public WebElement passwordTextBox;

@FindBy(how = How.ID, using = "loginlj_submit")
public WebElement buttonSubmit;

public HomePage openHomePage (String loginName, String password){
	loginTextBox.clear();
	passwordTextBox.clear();
	loginTextBox.sendKeys(loginName);
	passwordTextBox.sendKeys(password);
	buttonSubmit.click();
	return PageFactory.initElements(webDriver, HomePage.class);

}

}