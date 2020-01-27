package demoSikuli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demosikuli {

	WebDriver driver;

	// private String searchTerm = "Selenium";
	@BeforeMethod
	public void setup() {

		System.setProperty("webdriver.chrome.driver",
				"D:\\E drive\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://staging.infotracktelematics.com/meiko");

	}

	@Test
	public void VerifySikuli() throws Exception {

		Screen screen = new Screen();
		// Create object of Pattern class and specify the images path
		Pattern image1 = new Pattern("C:\\Users\\nagarjuna\\git\\demo1\\demo\\Images\\username.png");
		Pattern image2 = new Pattern("C:\\Users\\nagarjuna\\git\\demo1\\demo\\Images\\password.png");
		Pattern image3 = new Pattern("C:\\Users\\nagarjuna\\git\\demo1\\demo\\Images\\loginbutton.png");

		screen.type(image1, "meiko");
		// This will type of password field
		screen.type(image2, "welcome");
		// This will click on login button
		screen.click(image3);
		
		WebElement web= driver.findElement(By.xpath("//*[@id=\"mainpage\"]/div[2]/div[1]/div"));
        String colorCode= web.getCssValue("background-color");
		System.out.println("Color code in RGB" + colorCode);
		String hexacolor = Color.fromString(colorCode).asHex();
		//System.out.println(hexacolor);
		String actual = hexacolor;
		String expected= "#28b779";
		Assert.assertEquals(actual, expected);
		
		
	}

	@AfterMethod
	public void CloseBrowser() {
		driver.quit();
	}

}
