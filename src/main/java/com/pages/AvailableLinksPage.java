package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AvailableLinksPage {

	WebDriver driver;

	public AvailableLinksPage(WebDriver driver) {
		this.driver = driver;
	}

	private By alllinks = By.tagName("a");

	public void numberoflinks() {
		List<WebElement> numberoflinks = driver.findElements(alllinks);
		int nooflinks = numberoflinks.size();
		System.out.println("Number of links"+nooflinks);
	}
}
