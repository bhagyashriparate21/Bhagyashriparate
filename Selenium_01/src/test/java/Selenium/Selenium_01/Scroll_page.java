package Selenium.Selenium_01;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;

public class Scroll_page extends Dynamic_code{

	public static void main(String[] args) throws Throwable {
		launch_browser ("Chrome");

		takescreenshot("Browser_launch");
		
		hiturl("https://www.jeevansathi.com/");
		takescreenshot("jeevansathi webpage");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");
		takescreenshot("scroll by 500");
		
		js.executeScript("window.scrollBy(0, -500)");
		takescreenshot("scroll by -500");
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		takescreenshot("scroll to bottom");
		
		driver.findElement(By.xpath("//a[text()=\"About Us\"]")).click();
		System.out.println("title after click : " + driver.getTitle());
		takescreenshot("after clicking on about us");
		
		//navigate backward
		js.executeScript("window.history.back()");
		// driver.navigate().back();
		takescreenshot("back to jeevansathi");
		
		//navigate forward
		js.executeScript("window.history.forward()");
		//driver.navigate().forward();
		takescreenshot("forward to about us");
		
		//refresh
		//js.executeScript("window.history.go(0)");
		//driver.navigate().refresh();
		
		refresh();
		
		driver.close();
	}

}



















