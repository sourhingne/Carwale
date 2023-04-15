package com.carwale23a.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.carwale23a.config.TestBase;
import com.carwale23a.keywords.UIKeyword;

public class NewCarsPage extends TestBase {
	@FindBy(css = "  a > div.o-cohPRA.o-cohQay.UaZtoi > div > img")
	public WebElement marutiSuzuki;

	@FindBy(css = "ul > li.o-fzoHAP > div > div > div > a > h3")
	public WebElement Tata;

	@FindBy(css = " div > ul > li:nth-child(5) > a > div.o-cpNAVm.o-byFsZJ.o-eemiLE.o-fzpihx")
	public WebElement Toyota;

	@FindBy(css = " div > ul > li:nth-child(6) a > div.o-cohPRA.o-cohQay.UaZtoi > div > img")
	public WebElement Kia;

	public void clickOnMarutiSuzuki() {
		UIKeyword.clickOn(marutiSuzuki);
	}

	public void hoverOnMarutiSuzuki() {
		UIKeyword.mousemove(marutiSuzuki);
	}

	public void clickOntata() {
		UIKeyword.clickOn(Tata);
	}

	public void hoverOntata() {
		UIKeyword.mousemove(Tata);
	}

	public void clickOnToyota() {
		UIKeyword.clickOn(Toyota);
	}

	public void hoverOnToyota() {
		UIKeyword.mousemove(Toyota);

	}

	public void clickOnKia() {
		UIKeyword.clickOn(Kia);
	}

	public void hoverOnKia() {
		UIKeyword.mousemove(Kia);

	}

}
