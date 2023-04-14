package com.carwale23a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.carwale23a.config.TestBase;
import com.carwale23a.keywords.UIKeyword;

public class Homepage extends TestBase {
	@FindBy(css = "div > nav > ul > li:nth-child(1) > div")
	public WebElement newCars;

	@FindBy(css = " div.SKGOr1.o-cpnuEd.o-biwSqu.o-cYOpxG.o-bfyaNx.o-cohPRA.o-cohQay.o-brXWGL > ul > a:nth-child(1) > div > div")
	public WebElement findNewCars;

	public void hoverOnNewCar() {
		UIKeyword.mousemove(newCars);
	}

	public void clickOnfindNewCars() {
		UIKeyword.clickOn(findNewCars);
	}
}
