package com.LimeRoad_Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jeans_Page extends BaseClassLimeRoad{
	
	@FindBy(xpath="/html/body/div[1]/main/div/div/div[1]/div[2]/div[1]/div[2]/div/div[4]/div[1]/div")
	private WebElement click_jeans;
	
	@FindBy(xpath="/html/body/div[1]/main/div/div/div[2]/div[4]/a/div")
	private WebElement click_notch;
	
	public Jeans_Page(WebDriver drv) {
		driver = drv;
		PageFactory.initElements(driver, this);
	}

	public WebElement getClick_jeans() {
		return click_jeans;
	}

	public WebElement getClick_notch() {
		return click_notch;
	}

	
}
