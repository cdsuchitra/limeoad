package com.LimeRoad_Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Men_Button extends BaseClassLimeRoad{
	
	public WebDriver driver;
	
  public Men_Button(WebDriver drv) {
	  driver = drv;
	  PageFactory.initElements(driver, this);
	  
	}
  @FindBy(xpath="//span[text()='SHOP MEN']")
  private WebElement men_button;
  
  public WebElement getMen_button() {
	return men_button;
}
  
  
}
