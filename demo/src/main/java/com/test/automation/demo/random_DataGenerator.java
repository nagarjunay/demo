package com.test.automation.demo;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class random_DataGenerator {

	static ChromeDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\E drive\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://itlfmsv12.infotracktelematics.com/meiko/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void logintoapp() 
	{
		String random_username = randomGenerator();
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(random_username);
		String random_password = randomGenerator();
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(random_password);
	}
	
	public String randomGenerator() 
	{
		String character = "abcdefghijklmnopqrstuvwxyz@!#$%^&*1234567890";
		String random_username = "";
		int length = 6;
		Random r = new Random();
		
		char[] text = new char[length];
		for(int i=0; i<length; i++) 
		{
			text[i] = character.charAt(r.nextInt(character.length()));
		}
		
		for(int i=0; i<text.length; i++) 
		{
			random_username += text[i];	
		}
		return random_username;
	}
}


