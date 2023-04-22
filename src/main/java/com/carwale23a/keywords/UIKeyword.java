package com.carwale23a.keywords;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class UIKeyword {
	
	private static final Logger log=Logger.getLogger(UIKeyword.class);

	public static RemoteWebDriver driver;
	public static FluentWait<WebDriver> wait;

	public static void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);

		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("IE")) {
			driver = new InternetExplorerDriver();
		}
		wait = new FluentWait<WebDriver>(driver);
		wait = wait.withTimeout(Duration.ofSeconds(60));
		wait = wait.pollingEvery(Duration.ofMillis(500));
		wait.ignoring(NoSuchElementException.class);

	}

	public static void waitForElementToBePresent(By by) {
		wait.until(ExpectedConditions.presenceOfElementLocated(by));

	}

	public static void launchUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		log.info("url is launched Successfully" + url);
	}

	public static void clickOn(By cssSelector) {
		driver.findElement(cssSelector).click();
	}

	public static void mousemove(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
	}

	public static void clickOn(String locator) {
		String locatorType = locator.split("##")[0];
		String locatorValue = locator.split("##")[1];
		if (locatorType.equalsIgnoreCase("css")) {
			driver.findElement(By.cssSelector(locatorValue)).click();
		} else if (locatorType.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(locatorValue)).click();
		} else if (locatorType.equalsIgnoreCase("id")) {
			driver.findElement(By.id(locatorValue)).click();
		} else if (locatorType.equalsIgnoreCase("tagName")) {
			driver.findElement(By.tagName(locatorValue)).click();
		} else if (locatorType.equalsIgnoreCase("linktext")) {
			driver.findElement(By.linkText(locatorValue)).click();
		} else if (locatorType.equalsIgnoreCase("partiallinktext")) {
			driver.findElement(By.partialLinkText(locatorValue)).click();
		} else if (locatorType.equalsIgnoreCase("className")) {
			driver.findElement(By.className(locatorValue)).click();
		}
	}

	public static void scrollby() {
		driver.executeScript("window.scrollBy(0,300)");
	}

	public static List<String> getTexts(By by) {
		List<WebElement> elements = driver.findElements(by);
		List<String> texts = new ArrayList<>();
		for (WebElement element : elements) {
			String text = element.getText();
			texts.add(text);
		}
		return texts;
	}

	public static void scrollwindow(int x, int y) {
		driver.executeScript("window.scrollBy(arguments[0],arguments[1]))", x, y);
	}

	public static void waitForElementToBePresent(String locator) {
		String parts[] = locator.split("##");
		String locatorType = parts[0];
		String locatorValue = parts[1];
		By by = null;
		if (locatorType.equalsIgnoreCase("css")) {
			by = By.cssSelector(locatorValue);
		} else if (locatorType.equalsIgnoreCase("xpath")) {
			by = By.xpath(locatorValue);

		}
		wait.until(ExpectedConditions.presenceOfElementLocated(by));

	}

	public static void clickOn(WebElement element) {
		element.click();

	}

	public static void waitForElementToBePresent(WebElement element) {
		wait.withTimeout(Duration.ofSeconds(6));
	}

	public static void waitelementToBeClickable(WebElement element) {
		wait.ignoring(org.openqa.selenium.NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static List<String> getTexts(List<WebElement> elements) {
		List<WebElement> element1 = elements;
		List<String> texts = new ArrayList<>();
		for (WebElement elemnt : elements) {
			String text = elemnt.getText();
			texts.add(text);

		}
		return texts;
	}

	public static void closeBrowser() {
		driver.close();
		log.info("Browser Has Been closed successfully");
	}

}
