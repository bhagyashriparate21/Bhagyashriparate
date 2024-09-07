package Selenium.Selenium_01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.in/");
		
		System.out.println(driver.getTitle());
		
		WebElement Searchbox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		
		Searchbox.sendKeys("Books");
		
		System.out.println(Searchbox.getAttribute("value"));
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		System.out.println("Title after search : " + driver.getTitle());
		
		driver.findElement(By.xpath("//div[@class=\"_bGlmZ_container_1R4ul _bGlmZ_ar191To1_2MBoj\"]")).click();
		
		System.out.println("After selecting book = " + driver.getTitle());

	}

} 
