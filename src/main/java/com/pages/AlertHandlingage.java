package com.pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class AlertHandlingage {

	WebDriver driver;
	private By alertbutton = By.xpath("//input[@name='alert']");
	private By anotherpopup = By.xpath("//input[@name='confirmation']");
	private By colorof_button = By.xpath("//*[@class='card-header']");
	private By alertbuttonFont = By.xpath("//*[@name='download']");
	private By webtable=By.xpath("//*[@class='table']/tbody");

	
	

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
		System.out.println("Checking the feature branch ...");
		System.out.println("Pushing the code to feature..");
	}
	
	public void fetchTableData()
	{
	
		
		WebElement t = driver.findElement(By.xpath("//*[@class='table']/tbody"));
		// count rows with size() method
		List<WebElement> rws = t.findElements(By.tagName("tr"));
		int rws_cnt = rws.size();
		// iterate rows of table
		for (int i = 0; i < rws_cnt; i++) {
			// count columns with size() method
			List<WebElement> cols = rws.get(i).findElements(By.tagName("td"));
			int cols_cnt = cols.size();
			// iterate cols of table
			for (int j = 0; j < cols_cnt; j++) {
				// get cell text with getText()
				String c = cols.get(j).getText();
				System.out.println("The cell value is: " + c);
			}
		}
	}
}
