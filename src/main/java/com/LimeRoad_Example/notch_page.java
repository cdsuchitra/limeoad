package com.LimeRoad_Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class notch_page extends BaseClassLimeRoad {
	
	
	public WebDriver driver;
	@FindBy(xpath="/html/body/div[1]/main/div[1]/div[2]/div/div[2]/div/a[1]/img")
	private WebElement second_notch;
	
	public notch_page(WebDriver drv) {
		driver = drv;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSecond_notch() {
		return second_notch;
	}
	

}
