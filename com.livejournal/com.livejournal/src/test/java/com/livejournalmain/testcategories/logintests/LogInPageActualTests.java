package com.livejournalmain.testcategories.logintests;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.livejournal.main.tests.MainTest;
@Test

public class LogInPageActualTests extends MainTest {
	@Test
	public void verifyHomePage() throws InterruptedException{
		Assert.assertTrue(home.isHomePageDisplayed());
			
	}
	
}
