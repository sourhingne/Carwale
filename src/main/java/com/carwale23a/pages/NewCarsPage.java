package com.carwale23a.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.carwale23a.config.TestBase;
import com.carwale23a.keywords.UIKeyword;

public class NewCarsPage extends TestBase {
	@FindBy(css="  a > div.o-cohPRA.o-cohQay.UaZtoi > div > img")
     public WebElement marutiSuzuki;
	
	public void clickOnMarutiSuzuki() {
          UIKeyword.clickOn(marutiSuzuki);
	}
	public  void hoverOnMarutiSuzuki() {
        UIKeyword.mousemove(marutiSuzuki);
	}
	
	
	
}
