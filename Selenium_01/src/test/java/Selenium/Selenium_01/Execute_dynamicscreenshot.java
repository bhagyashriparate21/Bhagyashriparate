package Selenium.Selenium_01;

public class Execute_dynamicscreenshot extends Dynamic_code{

	public static void main(String[] args) throws Throwable {
		launch_browser("Chrome");
		takescreenshot("browser_chrome");

		hiturl("https://www.amazon.in/");
		takescreenshot("Amazon webpage");
		
	}

}
