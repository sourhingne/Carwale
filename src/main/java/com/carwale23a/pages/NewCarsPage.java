package com.carwale23a.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.carwale23a.config.TestBase;
import com.carwale23a.keywords.UIKeyword;

public class NewCarsPage extends TestBase {
	@FindBy(css = "a>div.o-cohPRA.o-cohQay.UaZtoi>div>img")
	public WebElement marutiSuzuki;
	@FindBy(css = "ul>li.o-fzoHAP>div>div>div>a>h3")
	public WebElement Tata;
	@FindBy(css = "li:nth-child(3)>a>div.o-cohPRA.o-cohQay.UaZtoi>div>img")
	public WebElement Hyuandai;
	@FindBy(css = "li:nth-child(4)>a>div.o-cohPRA.o-cohQay.UaZtoi>div>img")
	public WebElement Mahindra;
	@FindBy(css = "li:nth-child(7)>a>div.o-cohPRA.o-cohQay.UaZtoi>div>img")
	public WebElement BMW;
	@FindBy(css = " li:nth-child(8)>a>div.o-cohPRA.o-cohQay.UaZtoi>div>img")
	public WebElement Mercedes;
	

	public void clickOnMarutiSuzuki() {
		UIKeyword.clickOn(marutiSuzuki);
	}

	public void hoverOnMarutiSuzuki() {
		UIKeyword.mousemove(marutiSuzuki);
	}

	public void clickOnTata() {
		UIKeyword.clickOn(Tata);
	}

	public void hoverOnTata() {
		UIKeyword.mousemove(Tata);
	}

	public void clickOnHyundai() {
		UIKeyword.clickOn(Tata);
	}

	public void hoverOnHundai() {
		UIKeyword.mousemove(Hyuandai);
	}
	public void clickOnMahindra() {
		UIKeyword.clickOn(Mahindra);
	}

	public void hoverOnMahindra() {
		UIKeyword.mousemove(Mahindra);
	}
	public void clickOnBMW() {
		UIKeyword.clickOn(BMW);
	}

	public void hoverOnBMW() {
		UIKeyword.mousemove(BMW);
	}

	public void clickOnMercedes() {
		UIKeyword.clickOn(BMW);
	}

	public void hoverOnMercedes() {
		UIKeyword.mousemove(BMW);
	}

}

