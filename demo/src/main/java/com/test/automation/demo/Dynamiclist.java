/**
 * 
 */
package com.test.automation.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author nagarjuna
 *
 */
public class Dynamiclist {

	WebDriver driver = new ChromeDriver();

	public void Verifying_TotalNum_Of_Col_Rows() throws Exception {

		List<WebElement> col = driver.findElements(By.xpath(
				"//table[@class='table table-striped table-hover table-coluredheader dataTable']/thead/tr/th[string-length(text()) > 0] "));
		int colCount = col.size();

		List<WebElement> row = driver.findElements(By.xpath("//tbody[@id='lstBody']/tr"));
		int rowCount = row.size();

		String Before_xpath = "//tbody[@id='lstBody']/tr[";
		String After_xpath = "]/td[1]";

		for (int i = 1; i <= rowCount; i++) {
			String name = driver.findElement(By.xpath(Before_xpath + i + After_xpath)).getText();
			if (name.contains("RSR1904010000002")) {
				// tbody[@id="lstBody"]/tr[1]/td[1]/input
				driver.findElement(By.xpath("//tbody[@id='lstBody']/tr[" + i + "]/td[1]/input")).click();
			}
		}
	}

	public void Method2_Verifying_TotalNum_Of_Col_Rows() {
		driver.findElement(By.xpath(
				"//a[contains(text(),'RSA1903270000008')]/parent::td//preceding-sibling::td[2]/input[@type='checkbox']"))
				.click();
	}

}
