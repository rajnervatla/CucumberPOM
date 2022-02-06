package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
private WebDriver driver=null;
private By logo=By.xpath("//*[text()='Gmail']");


public Homepage(WebDriver driver) {
	this.driver=driver;
	
}


public void logotest()
{
	driver.findElement(logo).isDisplayed();
	System.out.println("Logo is displayed...");
}
public void passt()
{
	System.out.println("Pass...");
}

}
