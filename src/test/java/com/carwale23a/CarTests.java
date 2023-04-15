package com.carwale23a;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.carwale23a.config.TestBase;
import com.carwale23a.keywords.UIKeyword;
import com.carwale23a.pages.AllBrandsCarPage;
import com.carwale23a.pages.Homepage;
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

		AllBrandsCarPage maruticarpage = PageFactory.initElements(UIKeyword.driver, AllBrandsCarPage.class);
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
		newcarpage.clickOntata();
		AllBrandsCarPage maruticarpage = PageFactory.initElements(UIKeyword.driver, AllBrandsCarPage.class);
		maruticarpage.getTextFromTata();

	}

	@Test
	public void verifySearchResultForToyotaBrand() {

		UIKeyword.launchUrl(Environment.URL);
		Homepage home = PageFactory.initElements(UIKeyword.driver, Homepage.class);
		home.hoverOnNewCar();
		home.clickOnfindNewCars();

		UIKeyword.scrollby();
		NewCarsPage newcarpage = PageFactory.initElements(UIKeyword.driver, NewCarsPage.class);
		UIKeyword.waitForElementToBePresent(newcarpage.Toyota);newcarpage.clickOnToyota();
		AllBrandsCarPage maruticarpage = PageFactory.initElements(UIKeyword.driver, AllBrandsCarPage.class);
		maruticarpage.getTextFromToyota();

	}

	@Test
	public void verifySearchResultForKiaBrand() {
		UIKeyword.launchUrl(Environment.URL);
		Homepage home = PageFactory.initElements(UIKeyword.driver, Homepage.class);
		home.hoverOnNewCar();
		home.clickOnfindNewCars();

		UIKeyword.scrollby();
		NewCarsPage newcarpage = PageFactory.initElements(UIKeyword.driver, NewCarsPage.class);
		UIKeyword.waitForElementToBePresent(newcarpage.Kia);newcarpage.clickOnKia();
		AllBrandsCarPage maruticarpage = PageFactory.initElements(UIKeyword.driver, AllBrandsCarPage.class);
		maruticarpage.getTextFromKia();

	}

	public void verifySearchResultForMGBrand() {
		UIKeyword.launchUrl(Environment.URL);
		Homepage home = PageFactory.initElements(UIKeyword.driver, Homepage.class);
		home.hoverOnNewCar();
		home.clickOnfindNewCars();

		UIKeyword.scrollby();
		NewCarsPage newcarpage = PageFactory.initElements(UIKeyword.driver, NewCarsPage.class);
		UIKeyword.waitForElementToBePresent(newcarpage.MG);
		newcarpage.clickOnMG();
		AllBrandsCarPage maruticarpage = PageFactory.initElements(UIKeyword.driver, AllBrandsCarPage.class);
		maruticarpage.getTextFromMG();
	}
	public void verifySearchResultForHondaBrand() {
		UIKeyword.launchUrl(Environment.URL);
		Homepage home = PageFactory.initElements(UIKeyword.driver, Homepage.class);
		home.hoverOnNewCar();
		home.clickOnfindNewCars();

		UIKeyword.scrollby();
		NewCarsPage newcarpage = PageFactory.initElements(UIKeyword.driver, NewCarsPage.class);
		UIKeyword.waitForElementToBePresent(newcarpage.Honda);
		newcarpage.clickOnHonda();
		AllBrandsCarPage maruticarpage = PageFactory.initElements(UIKeyword.driver, AllBrandsCarPage.class);
		maruticarpage.getTextFromHonda();
	}
}