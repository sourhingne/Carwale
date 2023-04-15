package com.carwale23a.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.carwale23a.config.TestBase;
import com.carwale23a.keywords.UIKeyword;

import net.bytebuddy.asm.Advice.This;

public class AllBrandsCarPage extends TestBase {

	public AllBrandsCarPage() {
		PageFactory.initElements(UIKeyword.driver, this);
	}

	@FindBy(css = "ul>li.o-fzoHAP>div>div>div>a>h3")
	public List<WebElement> marutiSuzukiBrezzaElement;
	@FindBy(css = "li:nth-child(2)>a>div.o-cohPRA.o-cohQay.UaZtoi>div>img")
	public List<WebElement> Tata;
	@FindBy(css = "ul>li.o-fzoHAP div>div>div>a>h3")
	public List<WebElement> Toyota;
	@FindBy(css = "ul>li.o-fzoHAP>div>div>div>a>h3")
	public List<WebElement> Kia;
	@FindBy(css = " div.aGK5Mk.o-fpkJwH.o-dCyDMp.o-fzovSM>ul>li.o-fzoHAP>div>div>div>a>h3")
	public List<WebElement> MG;
	@FindBy(css = "ul>li.o-fzoHAP>div>div>div>a>h3")
	public List<WebElement> Honda;
	@FindBy(css = "ul>li.o-fzoHAP>div>div>div>a>h3")
	public List<WebElement> Volkswagen;
	@FindBy(css = "ul>li.o-fzoHAP>div>div>div>a>h3")
	public List<WebElement> Mercedes;
	@FindBy(css = "ul>li.o-fzoHAP>div>div>div>a>h3")
	public List<WebElement> Mahindra;
	@FindBy(css = "ul>li.o-fzoHAP>div>div>div>a>h3")
	public List<WebElement> Hyundai;

	@FindBy(css = "ul>li.o-fzoHAP>div>div>div>a>h3")
	public List<WebElement> BMW;

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
			Assert.assertTrue(car.contains("Honda"), "car title doesn't contains  Honda:" + car);

		}
	}

	public void getTextFromVolkswagen() {
		List<String> cars = UIKeyword.getTexts(Volkswagen);
		for (String car : cars) {
			Assert.assertTrue(car.contains("Volkswagen"), "car title doesn't contains Volkswagen :" + car);

		}
	}

	public void getTextFromMercedes() {
		List<String> cars = UIKeyword.getTexts(Mercedes);
		for (String car : cars) {
			Assert.assertTrue(car.contains("Mercedes"), "car title doesn't contains  Mercedes:" + car);

		}

	}

	public void getTextFromMahindra() {
		List<String> cars = UIKeyword.getTexts(Mahindra);
		for (String car : cars) {
			Assert.assertTrue(car.contains("Mahindra"), "car title doesn't contains  Mahindra:" + car);

		}

	}

	public void getTextFromBMW() {
		List<String> cars = UIKeyword.getTexts(BMW);
		for (String car : cars) {
			Assert.assertTrue(car.contains("BMW"), "car title doesn't contains  BMW:" + car);

		}

	}

	public void getTextFromHyundai() {

		List<String> cars = UIKeyword.getTexts(Hyundai);
		for (String car : cars) {
			Assert.assertTrue(car.contains("Hyundai"), "car title doesn't contains  Hyundai:" + car);

		}

	}

	public void getTextBMW() {
		List<String> cars = UIKeyword.getTexts(BMW);
		for (String car : cars) {
			Assert.assertTrue(car.contains("BMW"), "car title doesn't contains  BMW:" + car);

		}

	}

}
