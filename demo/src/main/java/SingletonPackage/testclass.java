package SingletonPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testclass {
	
	
	@BeforeClass 
	public void setUp(){
        BaseClass.initialize();

	}

	@Test
	public void testMethod() {
		String title = BaseClass.driver.getTitle(); 
		System.out.println("Page Title:- " + title);

	}
	
	@AfterClass
	public void tearDown() {
		BaseClass.quit();
	}

}
