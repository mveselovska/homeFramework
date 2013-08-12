package com.livejournalmain.testcategories.logintests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.livejournal.main.tests.MainTest;

@Test
public class HomePageActualTest extends MainTest {
	@Test
	public void profileSettings() throws InterruptedException{

	home.selectSettings();
	Assert.assertTrue(home.verifySettingsPage(settingsUrl));
	}
	
}
