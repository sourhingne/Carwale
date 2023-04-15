package com.carwale23a;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
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
		Homepage home = new Homepage();
		home.hoverOnNewCar();
		home.clickOnfindNewCars();
		UIKeyword.scrollby();
		NewCarsPage newcarpage = new NewCarsPage();
		UIKeyword.waitForElementToBePresent(newcarpage.marutiSuzuki);
		newcarpage.clickOnMarutiSuzuki();
		AllBrandsCarPage maruticarpage = new AllBrandsCarPage();
		maruticarpage.getTextFromMarutiSuzukiBrezza();

	}

	@Test
	public void verifySearchResultForTataBrand() {

		UIKeyword.launchUrl(Environment.URL);
		Homepage home = new Homepage();
		home.hoverOnNewCar();
		home.clickOnfindNewCars();
		UIKeyword.scrollby();
		NewCarsPage newcarpage = new NewCarsPage();
		UIKeyword.waitForElementToBePresent(newcarpage.Tata);
		newcarpage.clickOnTata();
		AllBrandsCarPage maruticarpage = new AllBrandsCarPage();
		maruticarpage.getTextFromTata();

	}

	@Test
	public void verifySearchResultForToyotaBrand() {

		UIKeyword.launchUrl(Environment.URL);
		Homepage home = new Homepage();
		home.hoverOnNewCar();
		home.clickOnfindNewCars();
		UIKeyword.scrollby();
		NewCarsPage newcarpage = new NewCarsPage();
		UIKeyword.waitForElementToBePresent(newcarpage.Toyota);
		newcarpage.clickOnToyota();
		AllBrandsCarPage maruticarpage = new AllBrandsCarPage();
		maruticarpage.getTextFromToyota();

	}

	@Test
	public void verifySearchResultForMahindraBrand() {

		UIKeyword.launchUrl(Environment.URL);
		Homepage home = new Homepage();
		home.hoverOnNewCar();
		home.clickOnfindNewCars();
		UIKeyword.scrollby();
		NewCarsPage newcarpage = new NewCarsPage();
		UIKeyword.waitForElementToBePresent(newcarpage.Mahindra);
		newcarpage.clickOnMahindra();
		AllBrandsCarPage maruticarpage = new AllBrandsCarPage();
		maruticarpage.getTextFromMahindra();

	}

	@Test
	public void verifySearchResultForHyundaiBrand() {

		UIKeyword.launchUrl(Environment.URL);
		Homepage home = new Homepage();
		home.hoverOnNewCar();
		home.clickOnfindNewCars();
		UIKeyword.scrollby();
		NewCarsPage newcarpage = new NewCarsPage();
		UIKeyword.waitForElementToBePresent(newcarpage.Hyuandai);
		newcarpage.clickOnHyundai();
		AllBrandsCarPage maruticarpage = new AllBrandsCarPage();
		maruticarpage.getTextFromHyundai();

	}

	@Test
	public void verifySearchResultForBMWBrand() {

		UIKeyword.launchUrl(Environment.URL);
		Homepage home = new Homepage();
		home.hoverOnNewCar();
		home.clickOnfindNewCars();
		UIKeyword.scrollby();
		NewCarsPage newcarpage = new NewCarsPage();
		UIKeyword.waitForElementToBePresent(newcarpage.BMW);
		newcarpage.clickOnBMW();
		AllBrandsCarPage maruticarpage = new AllBrandsCarPage();
		maruticarpage.getTextBMW();

		
	}

	@Test
	public void verifySearchResultForMercedesBrand() {

		UIKeyword.launchUrl(Environment.URL);
		Homepage home = new Homepage();
		home.hoverOnNewCar();
		home.clickOnfindNewCars();
		UIKeyword.scrollby();
		NewCarsPage newcarpage = new NewCarsPage();
		UIKeyword.waitForElementToBePresent(newcarpage.Mercedes);
		newcarpage.clickOnMercedes();
		AllBrandsCarPage maruticarpage = new AllBrandsCarPage();
		maruticarpage.getTextFromMercedes();

	}

	@Test
	public void verifySearchResultForKiaBrand() {
		UIKeyword.launchUrl(Environment.URL);
		Homepage home = new Homepage();
		home.hoverOnNewCar();
		home.clickOnfindNewCars();
		UIKeyword.scrollby();
		NewCarsPage newcarpage = new NewCarsPage();
		UIKeyword.waitForElementToBePresent(newcarpage.Kia);
		newcarpage.clickOnKia();
		AllBrandsCarPage maruticarpage = new AllBrandsCarPage();
		maruticarpage.getTextFromKia();

	}
@Test
	public void verifySearchResultForMGBrand() {
		UIKeyword.launchUrl(Environment.URL);
		Homepage home = new Homepage();
		home.hoverOnNewCar();
		home.clickOnfindNewCars();
		UIKeyword.scrollby();
		NewCarsPage newcarpage = new NewCarsPage();
		UIKeyword.waitForElementToBePresent(newcarpage.MG);
		newcarpage.clickOnMG();
		AllBrandsCarPage maruticarpage = new AllBrandsCarPage();
		maruticarpage.getTextFromMG();
	}
	@Test

	public void verifySearchResultForHondaBrand() {
		UIKeyword.launchUrl(Environment.URL);
		Homepage home = new Homepage();
		home.hoverOnNewCar();
		home.clickOnfindNewCars();
		UIKeyword.scrollby();
		NewCarsPage newcarpage = new NewCarsPage();
		UIKeyword.waitForElementToBePresent(newcarpage.Honda);
		newcarpage.clickOnHonda();
		AllBrandsCarPage maruticarpage = new AllBrandsCarPage();
		maruticarpage.getTextFromHonda();
	}
}