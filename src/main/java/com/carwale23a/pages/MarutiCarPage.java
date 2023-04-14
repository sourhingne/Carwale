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

	public void getTextFromMarutiSuzukiBrezza() {
		List<String> cars = UIKeyword.getTexts(marutiSuzukiBrezzaElement);
		for (String car : cars) {
			Assert.assertTrue(car.contains("Maruti Suzuki"), "car title doesn't contains Maruti Suzuki:" + car);

		}
	}

}
