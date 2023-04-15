package com.carwale23a.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.carwale23a.config.TestBase;
import com.carwale23a.keywords.UIKeyword;

public class AllBrandsCarPage extends TestBase {
	@FindBy(css = "ul>li.o-fzoHAP>div>div>div>a>h3")
	public List<WebElement> marutiSuzukiBrezzaElement;

	@FindBy(css = "li:nth-child(2) > a > div.o-cohPRA.o-cohQay.UaZtoi > div > img")
	public List<WebElement> Tata;

	@FindBy(css = "ul>li.o-fzoHAP div>div>div>a>h3")
	public List<WebElement> Toyota;

	@FindBy(css = "ul>li.o-fzoHAP>div>div>div>a>h3")
	public List<WebElement> Kia;

	@FindBy(css = " div.aGK5Mk.o-fpkJwH.o-dCyDMp.o-fzovSM > ul > li.o-fzoHAP > div > div > div > a > h3")
	public List<WebElement> MG;
	
	
	@FindBy(css = "  ul > li.o-fzoHAP > div > div > div > a > h3")
	public List<WebElement> Honda;
	
	
	@FindBy(css = "ul > li.o-fzoHAP > div > div > div > a > h3")
	public List<WebElement> Volkswagen;

	public void getTextFromMarutiSuzukiBrezza() {
		List<String> cars = UIKeyword.getTexts(marutiSuzukiBrezzaElement);
		for (String car : cars) {
			Assert.assertTrue(car.contains("Maruti Suzuki"), "car title doesn't contains Maruti Suzuki:" + car);

		}
	}

	public void getTextFromTata() {
		List<String> cars = UIKeyword.getTexts(Tata);
		for (String car : cars) {
			Assert.assertTrue(car.contains("Tata"), "car title doesn't contains  Tata:" + car);

		}
	}

	public void getTextFromToyota() {
		List<String> cars = UIKeyword.getTexts(Toyota);
		for (String car : cars) {
			Assert.assertTrue(car.contains("Toyota"), "car title doesn't contains  Toyota:" + car);

		}
	}

	public void getTextFromKia() {
		List<String> cars = UIKeyword.getTexts(Kia);
		for (String car : cars) {
			Assert.assertTrue(car.contains("Kia"), "car title doesn't contains  Kia:" + car);

		}

	}

	public void getTextFromMG() {
		List<String> cars = UIKeyword.getTexts(MG);
		for (String car : cars) {
			Assert.assertTrue(car.contains("MG"), "car title doesn't contains  MG:" + car);

		}

	}

	public void getTextFromHonda() {
		List<String> cars = UIKeyword.getTexts(Honda);
		for (String car : cars) {
			Assert.assertTrue(car.contains("Honda"), "car title doesn't contains  MG:" + car);

	}
}

	public void getTextFromVolkswagen() {
		List<String> cars = UIKeyword.getTexts(Volkswagen);
		for (String car : cars) {
			Assert.assertTrue(car.contains("Volkswagen"), "car title doesn't contains  MG:" + car);

	}
}
}
