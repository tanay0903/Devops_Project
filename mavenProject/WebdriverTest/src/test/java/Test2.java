import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;	
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class Test2 {		
	    private WebDriver driver;		
		@Test		
		public void testEasy() {
			WebDriver driver;

	        // TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\khdta\\Desktop\\SEM 6\\DevOps\\chromedriver-win64\\chromedriver.exe"); 
			driver = new ChromeDriver();

			driver.get("http://demo.guru99.com/test/guru99home/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
		}	
		@BeforeTest
		public void beforeTest() {	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\khdta\\Desktop\\SEM 6\\DevOps\\chromedriver-win64\\chromedriver.exe"); 
			driver = new ChromeDriver();
			  
		   
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}

