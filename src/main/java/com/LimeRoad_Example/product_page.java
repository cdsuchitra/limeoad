package com.LimeRoad_Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class product_page extends BaseClassLimeRoad{
	
	
	public WebDriver driver;
	@FindBy(xpath="//span[text()=' 34 ']")
	private WebElement size_change;
	
	@FindBy(xpath="//div[text()='ADD TO CART']")
	private WebElement add_cart;
	
	
	public product_page(WebDriver drv) {
		driver = drv;
		PageFactory.initElements(driver, this);

	}


	


	public WebElement getSize_change() {
		return size_change;
	}


	public WebElement getAdd_cart() {
		return add_cart;
	}
	
	
}
