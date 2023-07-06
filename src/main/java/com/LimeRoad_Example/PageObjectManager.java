package com.LimeRoad_Example;

import org.openqa.selenium.WebDriver;

public class PageObjectManager extends BaseClassLimeRoad{
	
	private Men_Button mb;
	private Jeans_Page jp;
	private notch_page np;
	private product_page pp ;
	
	
	public Men_Button getMb() {
		if (mb==null) {
			mb = new Men_Button(driver);
		}
		return mb;
	}
	public Jeans_Page getJp() {
		
		if(jp==null) {
			jp = new Jeans_Page(driver);
		}
		return jp;
	}
	public notch_page getNp() {
		
		if(np==null) {
			np=new notch_page(driver);
		}
		return np;
	}
	public product_page getPp() {
		if(pp==null) {
			pp = new product_page(driver);
		}
		return pp;
	}
	
	
	
	

}
