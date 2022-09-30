package Homework20;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseClass {

		WebDriver driver;
		@BeforeTest
		public void openingURL() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\faria\\eclipse-workspace\\gov.potal.cms\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://dor.georgia.gov/");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
		}
			@AfterTest
			public void quit() {
				driver.quit();
			}		
}
			

