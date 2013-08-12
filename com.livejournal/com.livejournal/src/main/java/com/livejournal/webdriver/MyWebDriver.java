package com.livejournal.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyWebDriver {

	public static WebDriver getInstance(){
		WebDriver webDriver = new FirefoxDriver();
		return webDriver;
	}
	
}
 