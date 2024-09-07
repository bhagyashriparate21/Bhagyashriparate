package Selenium.Selenium_01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_launch {

	public static void main(String[] args) throws InterruptedException {
		
		// WebDriver driver = new ChromeDriver();

		//WebDriver driver = new FirefoxDriver();
		
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.snapchat.com/");
		
		Thread.sleep(10000);
		driver.findElement(null);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("gw-ftGr-desktop-hero-4"));
		driver.findElement(By.linkText("Mobiles"));
		
		driver.findElement(By.className("skip-link"));
		
		driver.findElement(By.linkText("Mobiles"));
		driver.findElement(By.linkText("Today's Deals"));
		
		driver.findElement(By.partialLinkText("Toda"));
		
		driver.findElement(By.tagName("option"));
		
		//tagname#id
		driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		
		//tagname.class
		driver.findElement(By.cssSelector("div.right-pane-results-container"));
		
	    //css- single attribute
		driver.findElement(By.cssSelector("input[placeholder=\"Search Amazon.in\"]"));
		driver.close();
	}

}
