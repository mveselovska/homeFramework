package com.livejournalmain.testcategories.logintests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.livejournal.actualpages.PostingPage;
import com.livejournal.main.tests.MainTest;
@Test
public class PostingPageActualTest extends MainTest {

	@Parameters({"webDriver"})
	@BeforeClass
	public void myInit() throws Exception{
		
		Thread.sleep(2000);
		home.openPostingPage();
		addPost = PageFactory.initElements(webDriver, PostingPage.class);
	}
	@Test
	public void addPost() throws InterruptedException{
	PostingPage post2 = addPost.createNewPost(getPostTitle(), getPostBody());
	Assert.assertTrue(post2.isPostDisplayed());

	}
	

}
