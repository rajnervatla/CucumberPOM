package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AvailableLinksPage {

	WebDriver driver;

	public AvailableLinksPage(WebDriver driver) {
		this.driver = driver;
	}

	private By alllinks = By.tagName("a");
	private By cart=By.xpath("//a[@id='nav-cart']");

	public void numberoflinks() {
		List<WebElement> numberoflinks = driver.findElements(alllinks);
		int nooflinks = numberoflinks.size();
		System.out.println("Number of links"+nooflinks);
	}
	
	public void clickoncart()
	{
		driver.findElement(cart).click();
	}
	
	public void titleof_cart()
	{
		String title_expected="Amazon.in Shopping Cart";
		String title_actual=driver.getTitle();
		Assert.assertEquals(title_actual, title_expected);
		
	}
}
