package Selenium.Selenium_01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_methods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		
		//click
		WebElement Searchbox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		Searchbox.click();
		
		//sendkeys
		Searchbox.sendKeys("Mobiles");
		
		Thread.sleep(3000);
		
		//clear
		Searchbox.clear();

		Searchbox.sendKeys("Books");
		
		//get Attribute
		System.out.println(Searchbox.getAttribute("value"));
		
		//getlocation
		System.out.println("The x coordinate of Searchbox lies at : " + Searchbox.getLocation().x);
		System.out.println("The y coordinate of Searchbox lies at : " + Searchbox.getLocation().y);
		
		//get size
		System.out.println("Size of Searchbox is : " + Searchbox.getSize());
		
		//get Tagname
		System.out.println(Searchbox.getTagName());
		
		//is displayed
	
		//is enabled
		
		//is selected
		
		//get Text
		//System.out.println(Searchbox.getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
