package com.LimeRoad_StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.LimeRoad_Example.BaseClassLimeRoad;
import com.LimeRoad_Example.Jeans_Page;
import com.LimeRoad_Example.Men_Button;
import com.LimeRoad_Example.PageObjectManager;
import com.LimeRoad_TestRunner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef extends BaseClassLimeRoad {
	
	public WebDriver driver;
	PageObjectManager pom = new PageObjectManager();
	
	
	@Given("User has opened the url {string}")
	public void user_has_opened_the_url(String string) {
	    driver = browserLaunch("chrome");
	    driver=urlLaunch(string);
	}

	@When("User clicks the Men")
	public void user_clicks_the_men() {
	    pom.getMb().getMen_button().click();
	}

	@Then("User can view the Men Shopping page")
	public void user_can_view_the_men_shopping_page() throws InterruptedException {
	    Thread.sleep(5000);
	}

	@Given("User is in Men Shopping Page")
	public void user_is_in_men_shopping_page() {
	   
	}

	@When("User clicks Jeans")
	public void user_clicks_jeans() {
	   pom.getJp().getClick_jeans().click();
	}

	@Then("User can view the Jeans list in the current page")
	public void user_can_view_the_jeans_list_in_the_current_page() throws InterruptedException {
	    Thread.sleep(5000);
	}

	@Given("User is in the Jeans displayed page")
	public void user_is_in_the_jeans_displayed_page() {
		
	}

	@When("User clicks Funk it up a notch")
	public void user_clicks_funk_it_up_a_notch() {
	    pom.getJp().getClick_notch().click();
	}

	@Then("User goes to a page with all jeans in the category")
	public void user_goes_to_a_page_with_all_jeans_in_the_category() throws InterruptedException {
	   Thread.sleep(5000);
	}

	@Given("User is the the Funk it up a notch category page")
	public void user_is_the_the_funk_it_up_a_notch_category_page() {
	    
	}

	@When("User selects the second displayed product")
	public void user_selects_the_second_displayed_product() {
	   pom.getNp().getSecond_notch().click();
	}

	@Then("User goes to the selected product description page")
	public void user_goes_to_the_selected_product_description_page() throws InterruptedException {
	    Thread.sleep(5000);
	}

	@Given("User in the product page")
	public void user_in_the_product_page() {
	    
	}

	@When("Selects the size")
	public void selects_the_size() {
	    pom.getPp().getSize_change().click();
	}

	@Then("The size will be changed")
	public void the_size_will_be_changed() {
	   
	}

	@Given("User has selected the size")
	public void user_has_selected_the_size() {
	    
	}

	@When("User click Add to Cart Button")
	public void user_click_add_to_cart_button() {
	    pom.getPp().getAdd_cart().click();
	}

	@Then("The product is added to the cart")
	public void the_product_is_added_to_the_cart() {
	   //driver.quit();
	}

	


}
