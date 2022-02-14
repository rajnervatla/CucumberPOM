package com.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;

public class AlertHandlingage {

	WebDriver driver;
	private By alertbutton = By.xpath("//input[@name='alert']");
	private By anotherpopup = By.xpath("//input[@name='confirmation']");
	private By colorof_button = By.xpath("//*[@class='card-header']");
	private By alertbuttonFont = By.xpath("//*[@name='download']");

	// @FindBy(xpath = "//input[@name='confirmation']") public WebElement
	// anotherpopup;

	public AlertHandlingage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickonAlert() throws InterruptedException {
		driver.findElement(alertbutton).click();
		Thread.sleep(2000);
	}

	public void handlePopUp() throws InterruptedException {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		driver.findElement(anotherpopup).click();
		Thread.sleep(2000);
		alert.accept();

	}

	public void getFontcolor() {
		String colour = driver.findElement(colorof_button).getCssValue("color");
		System.out.println("Color fetched is : " + colour);
		String c = Color.fromString(colour).asHex();
		System.err.println("Wow color in HEx code " + c);

		System.out.println(driver.findElement(alertbuttonFont).getCssValue("font-size"));
	}
}
