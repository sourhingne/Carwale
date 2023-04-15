package com.carwale23a.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.carwale23a.config.TestBase;
import com.carwale23a.keywords.UIKeyword;

public class MarutiCarPage extends TestBase {
	@FindBy(css = "ul>li.o-fzoHAP>div>div>div>a>h3")
	public List<WebElement> marutiSuzukiBrezzaElement;
	@FindBy(css = "li:nth-child(2)>a>div.o-cohPRA.o-cohQay.UaZtoi>div>img")
	public List<WebElement> Tata;
	@FindBy(css = " ul>li.o-fzoHAP>div>div>div>a>h3")
	public List<WebElement> Hyundai;

	@FindBy(css = "li:nth-child(4)>a>div.o-cpNAVm.o-byFsZJ.o-eemiLE.o-fzpihx")
	public List<WebElement> Mahindra;
	@FindBy(css = "li.o-fzoHAP>div>div>div>a>h3")
	public List<WebElement> BMW;
	@FindBy(css = " ul>li.o-fzoHAP>div>div>div>a>h3")
	public List<WebElement>Mercedes ;

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

	public void getTextFromHyundai() {
		List<String> cars = UIKeyword.getTexts(Hyundai);
		for (String car : cars) {
			Assert.assertTrue(car.contains("Hyundai"), "car title doesn't contains  Hyundai:" + car);

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
	public void getTextFromMercedes() {
		List<String> cars = UIKeyword.getTexts(Mercedes);
		for (String car : cars) {
			Assert.assertTrue(car.contains("Mercedes"), "car title doesn't contains  Mercedes:" + car);

		}
	}


}
