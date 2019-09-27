package SingletonPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

public static WebDriver driver = null;
	

	public static void initialize() {
		//singleton pattern
		if(driver == null) {
			if (Constant.browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver( );
		}
			else 
				if (Constant.browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
		}		
		    else 
				if (Constant.browser.equalsIgnoreCase("IE")) {
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
	    }
	}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Constant.url);
	}
	
	public static void quit() {
		driver.quit();
		driver = null;
	}
}