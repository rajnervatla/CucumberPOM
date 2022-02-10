package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Homepage {
	private WebDriver driver = null;
	private By logo = By.xpath("//*[text()='Gmail']");
	private By textbox = By.xpath("//*[@id='twotabsearchtextbox']");
	private By allselectdropdwn = By.xpath("//select[@id='searchDropdownBox']");
	private By searchButton = By.xpath("//input[@id='nav-search-submit-button']");

	public Homepage(WebDriver driver) {
		this.driver = driver;

	}

	public void logotest() {
		driver.findElement(textbox).sendKeys("Mobile");
		// driver.findElement(logo).isDisplayed();
		System.out.println("Mobile is entered...");

	}

	public void verifyDropdown() {
		Select selectobj = new Select(driver.findElement(allselectdropdwn));
		// selectobj.selectByIndex(1);
		List<WebElement> op = selectobj.getOptions();

		int sizeofptions = op.size();
		System.out.println(sizeofptions);
		for (int i = 0; i < sizeofptions; i++) {
			String options = op.get(i).getText();
			System.out.println(options);
		}

	}

	public void clickbtn() {
		driver.findElement(searchButton).click();
	}
}
