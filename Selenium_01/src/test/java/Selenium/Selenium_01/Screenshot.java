 package Selenium.Selenium_01;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Screenshot extends Dynamic_code{

	public static void main(String[] args) throws IOException {
		
		launch_browser("Chrome");
		TakesScreenshot ts = (TakesScreenshot) driver; 
		File Source = ts.getScreenshotAs(OutputType.FILE);
        File target = new File ("./Evidences/Browser_launched_1.png");
	    FileHandler.copy(Source, target);
	    
	    hiturl("https://snapdeal.com/");
	    
	    TakesScreenshot ts1 = (TakesScreenshot) driver; 
		File Source1= ts.getScreenshotAs(OutputType.FILE);
        File target1 = new File ("./Evidences/Snapdeal_1.png");
	    FileHandler.copy(Source1, target1);
	    
	    driver.findElement(By.cssSelector("input#inputValEnter")).sendKeys("Kitchen products");
	    
	    TakesScreenshot ts2 = (TakesScreenshot) driver; 
		File Source2= ts.getScreenshotAs(OutputType.FILE);
        File target2 = new File ("./Evidences/Search_product.png");
	    FileHandler.copy(Source2, target2);
	    
	    //by declaring project path
	    String Projectpath = System.getProperty("user.dir");
	    System.out.println(Projectpath);
	    TakesScreenshot ts3 = (TakesScreenshot) driver; 
		File Source3= ts.getScreenshotAs(OutputType.FILE);
		File target3 = new File(Projectpath + "\\Evidences\\Search_product.png");
		FileHandler.copy(Source3, target3);
	    
	    
	    
	  //Tell driver to take screenshot
	    // use takescreenshot interface (you need to create the object)
	  //with the help of ref.variable of takescreenshot interface use getscreenshot as method 
	  //directly with foldername and file name
		
	}

}
