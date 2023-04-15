package com.carwale23a;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.carwale23a.config.TestBase;
import com.carwale23a.keywords.UIKeyword;
import com.carwale23a.pages.Homepage;
import com.carwale23a.pages.MarutiCarPage;
import com.carwale23a.pages.NewCarsPage;
import com.carwale23a.util.Environment;

public class CarTests extends TestBase {
	UIKeyword keyword = new UIKeyword();

	@Test
	public void verifySearchResultForMarutiBrand() throws IOException, InvocationTargetException, InterruptedException {
		UIKeyword.launchUrl(Environment.URL);
		Homepage home = PageFactory.initElements(UIKeyword.driver, Homepage.class);
		home.hoverOnNewCar();
		home.clickOnfindNewCars();

		UIKeyword.scrollby();

		NewCarsPage newcarpage = PageFactory.initElements(UIKeyword.driver, NewCarsPage.class);
		UIKeyword.waitForElementToBePresent(newcarpage.marutiSuzuki);
		newcarpage.clickOnMarutiSuzuki();

		MarutiCarPage maruticarpage = PageFactory.initElements(UIKeyword.driver, MarutiCarPage.class);
		maruticarpage.getTextFromMarutiSuzukiBrezza();

	}
	@Test
	public void verifySearchResultForTataBrand() {
	
		UIKeyword.launchUrl(Environment.URL);
		Homepage home = PageFactory.initElements(UIKeyword.driver, Homepage.class);
		home.hoverOnNewCar();
		home.clickOnfindNewCars();

		UIKeyword.scrollby();
		NewCarsPage newcarpage = PageFactory.initElements(UIKeyword.driver, NewCarsPage.class);
		UIKeyword.waitForElementToBePresent(newcarpage.Tata);
		newcarpage.clickOnTata();
		MarutiCarPage maruticarpage = PageFactory.initElements(UIKeyword.driver, MarutiCarPage.class);
		maruticarpage.getTextFromTata();


	}
	@Test
	public void verifySearchResultForMahindraBrand() {
		
		UIKeyword.launchUrl(Environment.URL);
		Homepage home = PageFactory.initElements(UIKeyword.driver, Homepage.class);
		home.hoverOnNewCar();
		home.clickOnfindNewCars();

		UIKeyword.scrollby();
		NewCarsPage newcarpage = PageFactory.initElements(UIKeyword.driver, NewCarsPage.class);
		UIKeyword.waitForElementToBePresent(newcarpage.Mahindra);
		newcarpage.clickOnMahindra();
		MarutiCarPage maruticarpage = PageFactory.initElements(UIKeyword.driver, MarutiCarPage.class);
		maruticarpage.getTextFromMahindra();


	}
@Test
public void verifySearchResultForHyundaiBrand() {
		
		UIKeyword.launchUrl(Environment.URL);
		Homepage home = PageFactory.initElements(UIKeyword.driver, Homepage.class);
		home.hoverOnNewCar();
		home.clickOnfindNewCars();

		UIKeyword.scrollby();
		NewCarsPage newcarpage = PageFactory.initElements(UIKeyword.driver, NewCarsPage.class);
		UIKeyword.waitForElementToBePresent(newcarpage.Hyuandai);
		newcarpage.clickOnHyundai();
		MarutiCarPage maruticarpage = PageFactory.initElements(UIKeyword.driver, MarutiCarPage.class);
		maruticarpage.getTextFromHyundai();


	}
@Test
public void verifySearchResultForBMWBrand() {
	
	UIKeyword.launchUrl(Environment.URL);
	Homepage home = PageFactory.initElements(UIKeyword.driver, Homepage.class);
	home.hoverOnNewCar();
	home.clickOnfindNewCars();

	UIKeyword.scrollby();
	NewCarsPage newcarpage = PageFactory.initElements(UIKeyword.driver, NewCarsPage.class);
	UIKeyword.waitForElementToBePresent(newcarpage.BMW);
	newcarpage.clickOnBMW();
	MarutiCarPage maruticarpage = PageFactory.initElements(UIKeyword.driver, MarutiCarPage.class);
	maruticarpage.getTextFromBMW();


}
@Test
public void verifySearchResultForMercedesBrand() {
	
	UIKeyword.launchUrl(Environment.URL);
	Homepage home = PageFactory.initElements(UIKeyword.driver, Homepage.class);
	home.hoverOnNewCar();
	home.clickOnfindNewCars();

	UIKeyword.scrollby();
	NewCarsPage newcarpage = PageFactory.initElements(UIKeyword.driver, NewCarsPage.class);
	UIKeyword.waitForElementToBePresent(newcarpage.Mercedes);
	newcarpage.clickOnMercedes();
	MarutiCarPage maruticarpage = PageFactory.initElements(UIKeyword.driver, MarutiCarPage.class);
	maruticarpage.getTextFromMercedes();


}



}

