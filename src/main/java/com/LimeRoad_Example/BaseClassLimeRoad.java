package com.LimeRoad_Example;



	import java.io.File;
	import java.io.IOException;
import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClassLimeRoad {
	
		
		protected static WebDriver driver;
		static JavascriptExecutor js;
		static Alert alert;
		static Actions act;
		
		public WebDriver browserLaunch(String url) {
			
			if(url.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			else if(url.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
			else if(url.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}
			return driver;
			
		}
		
		public WebDriver urlLaunch(String url) {
			
			driver.get(url);
			driver.manage().window().maximize();
		return driver;
		}
		
		public void clickElement(WebElement ele) {
			
			ele.click();
		}
		
		public void sendValue(WebElement ele,String search) {
			
			ele.sendKeys(search);
		}
		
		public void takeSSfileName(String filename) throws IOException {
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File des = new File("C:\\Users\\Shravanthi\\eclipse-workspace\\IPT\\screenshot\\"+filename+".png");
			FileHandler.copy(src, des);
			
		}
		
		public static void takeSSlocalTime() throws IOException {
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			LocalTime time = LocalTime.now();
			String loc_time = time.toString();
			File src = ts.getScreenshotAs(OutputType.FILE);
			File des = new File("C:\\Users\\Shravanthi\\eclipse-workspace\\IPT\\screenshot\\"+loc_time+".png");
			FileHandler.copy(src, des);
		}
		
		public void impWait(int sec) {
			
			driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
		}
		
		public void expWait(WebElement ele, int sec) {
			
			WebDriverWait wait = new WebDriverWait(driver,sec);
			wait.until(ExpectedConditions.visibilityOf(ele));
			
		}
		
		//scroll up, down, left, down
		public void JSExeAxis(int x, int y) {
			
			js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy("+ x +","+ y +")");
			
		}
		
		//scroll to the end of the page
		public void JSExeEnd(int x) {
			
			js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy("+x+",document.body.scrollHeight)");
			
		}
		
		//scroll into view
		public void JSExeEle(WebElement ele) {
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();",ele);
			//ele.click(); //if it is a button then click

		}
		
		public void JSEclickEle(WebElement ele) {
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", ele);
		}
		
		public void JSEclickID(String id) {
			
			js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementById('"+id+"').click();");
		}
		
		public void JSEsendKEys(String id, String value) {
			
			js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementById('"+id+"').value('"+value+"');");
		}
		
		public void simpleAlert() {
			
			alert = driver.switchTo().alert();
			alert.accept();
			
		}
		
		public void confirmAlert(String message) {
			
			alert = driver.switchTo().alert();
			
			if (message.equalsIgnoreCase("accept")) {
				
				alert.accept();
			
			}
			else if(message.equalsIgnoreCase("dismiss")) {
	
				alert.dismiss();
			}
		}
		
		public void promptAlert(String sendKeys) {
			alert = driver.switchTo().alert();
			alert.sendKeys(sendKeys);
			
		}
		
		public void dropDown(WebElement ele,String select, String value) {
			
			Select s = new Select(ele);
			if(select.equals("text")){
				s.selectByVisibleText(value);
			}else if(select.equals("value")) {
				s.selectByValue(value);
			}else if (select.equals("index")) {
				int n = Integer.parseInt(value);
				s.selectByIndex(n);
			}
			
		}
		
		public void switchToFrame(String option,String value) {
			
			if(option.equals("index")) {
				int index = Integer.parseInt(value);
				driver.switchTo().frame(index);
			}else if ((option.equals("id"))||(option.equals("name"))){
				driver.switchTo().frame(value);
			}
			
		}
		public void switchWindow() {
			
			List<String> tabs = new LinkedList<>(driver.getWindowHandles());
			int size = tabs.size();
			driver.switchTo().window(tabs.get(size-1));
		}
		
		public void switchFrameUsingElement(WebElement element) {
			
			driver.switchTo().frame(element);
		}
			
		public void doubleClick(WebElement element) {
			
			act = new Actions(driver);
			act.doubleClick(element).build().perform();
			
		}
		public void contextClick(WebElement element) {
			
			act = new Actions(driver);
			act.contextClick(element).build().perform();
		}
		public void mouseOver(WebElement element) {
			
			act = new Actions(driver);
			act.moveToElement(element);
		}
		public void dragAndDrop(WebElement src,WebElement des) {
			act.dragAndDrop(src, des);
		}

	}






