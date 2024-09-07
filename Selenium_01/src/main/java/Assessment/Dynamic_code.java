package Assessment;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Dynamic_code {

	public static WebDriver driver;
	
	static Actions act = new Actions(driver);
	
	public static void Browser_launch (String browser){
		
		//to launch browser
		if(browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}else if (browser.equalsIgnoreCase("firefox{")) {
			
			driver = new FirefoxDriver();
		}
		
		//to maximize window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("Launched browser is : " + browser);
	}
	 
	   public static void hiturl(String url) {
		   driver.get(url);
		   System.out.println(driver.getTitle());
	   }
	    
	   public static void takescreenshot(String Screenshot_name) throws Throwable {
		   TakesScreenshot ts = (TakesScreenshot) driver;
		   File source = ts.getScreenshotAs(OutputType.FILE);
		   File target = new File("./Flipkart_ss/"+ Screenshot_name + ".png");
		   FileHandler.copy(source, target);
	   }
	   public static void screenshot(String ss_name) throws Throwable {
		   String Projectpath = System.getProperty("user.dir");
		   TakesScreenshot ts1 = (TakesScreenshot) driver;
		   File source1 = ts1.getScreenshotAs(OutputType.FILE);
		   File target1 = new File(Projectpath+"\\Flipkart_ss\\"+ss_name+".png");
		   FileHandler.copy(source1, target1);
	   }
	   
	   //Javascript executor interface
	   
	   //1) To refresh
	   
	   public static void refresh() {
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("window.history.go(0)");
		   
	   }
	   
	   //2) To go forward on url
	   
	   public static void forward() {
		   JavascriptExecutor js1 = (JavascriptExecutor) driver;
		   js1.executeScript("window.history.forward()");
		   
	   }
      //3) To go backward on url
	   
	   public static void back() {
		   JavascriptExecutor js2 = (JavascriptExecutor) driver;
		   js2.executeScript("window.history.back()");
		   
}
      //4) To scroll page to bottom
	   public static void ScrollToBottom() {
		   JavascriptExecutor js3 = (JavascriptExecutor) driver;
		   
		    }
	   
	   //Action class
	   //Mouse action
	   
	   
	   //1. To enter text
	   public static void enter_text(WebElement Webelement, String text) {
		   Actions act = new Actions(driver);
		   
		   act.moveToElement(Webelement).click().sendKeys(text).build().perform();
		   
	   }
	   
	   //2. To right click
	   
	   public static void right_click(WebElement element) {
		   act.contextClick(element).build().perform();
	   }
	   
	   //3. For double click
	   
	   public static void double_click(WebElement element1) {
		   act.doubleClick(element1).build().perform();
	   }
	   
	   //4. Drag and drop
	   public static void dd (WebElement dragdrop) {
		   act.dragAndDrop(dragdrop, dragdrop).build().perform();
	   }
	   
	   //5. code for moving slider by offset
	   public static void drag_n_drop_by_offsets(WebElement element2,int x, int y) {
		   act.moveToElement(element2).dragAndDropBy(element2, x, y).build().perform();
	   }
	   
	   //6. Switch to frame
	   public static void Switch_to_frame(WebElement element3) {
		   driver.switchTo().frame(element3);
	   }
	   
	   //To get back to window
	   public static void Back_to_window() {
		   driver.switchTo().defaultContent();
		   
	   }
	   
	   //keyboard action
	   
	   //1. To select copy and paste
	   
	   public static void SelectandCopyText() {
		   act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		   act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	   }
	   
	   public static void Tab() {
		   act.keyDown(Keys.TAB).build().perform();
	   }
	   
	   public static void PasteText() {
		   act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	   }
	   
	   //2. Page down
	   
	   public static void Pagedown() {
		   act.keyDown(Keys.PAGE_DOWN).build().perform();
	   }
	   
	   //3. Page Up
	   
	   public static void Pageup() {
		   act.keyDown(Keys.PAGE_UP).build().perform();
	   }
}




















