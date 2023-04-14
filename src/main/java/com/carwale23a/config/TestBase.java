package com.carwale23a.config;

import java.awt.Window;
import java.util.concurrent.ForkJoinPool.ManagedBlocker;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.carwale23a.keywords.UIKeyword;

public class TestBase {

	@BeforeMethod
	public void setUpMethod() throws Exception {
		UIKeyword.openBrowser("Chrome");
		UIKeyword.launchUrl("https://www.carwale.com");
		
	}

	@AfterMethod
	public void tearDown() throws Exception {
		UIKeyword.closeBrowser();
	}

}
