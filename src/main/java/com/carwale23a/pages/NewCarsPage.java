package com.carwale23a.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.carwale23a.config.TestBase;
import com.carwale23a.keywords.UIKeyword;

public class NewCarsPage extends TestBase {
	public NewCarsPage() {
		PageFactory.initElements(UIKeyword.driver, this);
	}

	@FindBy(css = "a[href=\"/maruti-suzuki-cars/\"]")
	public WebElement marutiSuzuki;
	@FindBy(css = "img[title='Tata']")
	public WebElement Tata;
	@FindBy(css = "a[title=\"Hyundai\"]")
	public WebElement Hyuandai;
	@FindBy(css = "img[alt=\"Mahindra\"]")
	public WebElement Mahindra;
	@FindBy(css = "a[href=\"/bmw-cars/\"]")
	public WebElement BMW;
	@FindBy(css = "a[href=\"/mercedes-benz-cars/\"]")
	public WebElement Mercedes;

	@FindBy(css = "a[title=\"Toyota\"]")
	public WebElement Toyota;

	@FindBy(css = " a[href=\"/kia-cars/\"]")
	public WebElement Kia;

	@FindBy(css = "a[href=\"/mg-cars/\"]")
	public WebElement MG;

	@FindBy(css = "a[href=\"/honda-cars/\"]")
	public WebElement Honda;

	@FindBy(css = "a[href=\"/volkswagen-cars/\"]")
	public WebElement Volkswagen;

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
		UIKeyword.clickOn(Hyuandai);
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
		UIKeyword.clickOn(Mercedes);
	}

	public void hoverOnMercedes() {
		UIKeyword.mousemove(Mercedes);
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

	public void clickOnMG() {
		UIKeyword.clickOn(MG);
	}

	public void hoverOnMG() {
		UIKeyword.mousemove(MG);

	}

	public void clickOnHonda() {
		UIKeyword.clickOn(Honda);
	}

	public void hoverOnHonda() {
		UIKeyword.mousemove(Honda);
	}

	public void clickOnVolkswagen() {
		UIKeyword.clickOn(Volkswagen);
	}

	public void hoverOnVolkswagen() {
		UIKeyword.mousemove(Volkswagen);
	}

}
