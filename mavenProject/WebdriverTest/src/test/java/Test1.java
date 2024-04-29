//import org.openqa.selenium.By;		
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;		
//import org.testng.Assert;		
//import org.testng.annotations.Test;	
//import org.testng.annotations.BeforeTest;	
//import org.testng.annotations.AfterTest;		
//public class Test1 {		
//	    private WebDriver driver;		
//		@Test				
//		public void testEasy() {
//			WebDriver driver;
//
//	        // TODO Auto-generated method stub
//	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\khdta\\Desktop\\DevOps\\chromedriver-win64\\chromedriver.exe");
//
//	        driver = new ChromeDriver();
//
//			driver.get("http://demo.guru99.com/test/guru99home/");  
//			String title = driver.getTitle();				 
//			Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
//		}	
//		@BeforeTest
//		public void beforeTest() {	
//		    driver = new FirefoxDriver();  
//		}		
//		@AfterTest
//		public void afterTest() {
//			driver.quit();			
//		}		
//}

import org.testng.annotations.Test;

public class Test1{
	@Test
	public void testeasy(){
		System.out.println("Hello World");
	}
}