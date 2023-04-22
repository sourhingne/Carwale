package com.carwale23a.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.carwale23a.config.TestBase;
import com.carwale23a.keywords.UIKeyword;

public class Homepage extends TestBase {
	@FindBy(css = "nav.o-fzokld.o-fzoker.o-cpnuEd.o-bUVylL.o-cqgkZn.o-eoatGj.o-bTDyCI>ul>li:nth-child(1)")
	public WebElement newCars;

	@FindBy(css = "a[href=\"/new-cars/\"]")
	public WebElement findNewCars;

	public Homepage() {
		PageFactory.initElements(UIKeyword.driver, this);
	}

	public void hoverOnNewCar() {
		UIKeyword.mousemove(newCars);
	}

	public void clickOnfindNewCars() {
		UIKeyword.clickOn(findNewCars);
	}
}
