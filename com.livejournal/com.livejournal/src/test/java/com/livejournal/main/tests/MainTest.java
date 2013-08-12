package com.livejournal.main.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.livejournal.actualpages.HomePage;
import com.livejournal.actualpages.LogInPage;
import com.livejournal.actualpages.PostingPage;
import com.livejournal.propertyreader.PropertyReader;
import com.livejournal.webdriver.MyWebDriver;

public class MainTest {
protected static WebDriver webDriver;
protected static PostingPage addPost;
protected PostingPage goToPost;
protected static HomePage home;

	protected static String url;
	protected static String userName;
	protected static String password;
	protected static String subject;
	protected static String body;
	protected static String settingsUrl;
	
	public static String getLink() {
		return url;
	}
	public static String getLogin() {
		return userName;
	}
	public static String getPasswd() {
		return password;
	}
	public static String getPostTitle() {
		return subject;
	}
	public static String getPostBody() {
		return body;
	}
	
	protected static LogInPage enterApp;
	
	@Parameters({"webDriver"})
	@BeforeSuite(alwaysRun=true)
	 
	public static void openBrowser() throws Exception {
		url = PropertyReader.loadProperty("url");
		userName = PropertyReader.loadProperty("userName");
		password = PropertyReader.loadProperty("password");
		
		webDriver = MyWebDriver.getInstance();
//		webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		webDriver.get(url);
		
		
		enterApp = PageFactory.initElements(webDriver, LogInPage.class);
		home = enterApp.openHomePage(getLogin(), getPasswd());
				
		
		subject = PropertyReader.loadProperty("subject");
		body = PropertyReader.loadProperty("body");
	}
			
	public HomePage goToSettings(){
	settingsUrl = PropertyReader.loadProperty("settingsUrl");
	Select dropDownList = new Select(webDriver.findElement(By.id("horizon-menu-me")));
	dropDownList.selectByVisibleText("Settings");
	return PageFactory.initElements(webDriver, HomePage.class);
	}
	@AfterSuite(alwaysRun=true)
	public void closeBrowser() throws Exception {
		  webDriver.close();
	  }
	
}
