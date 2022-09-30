package com.portal.cms;



import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	WebDriver driver;
	public HomePage hPage;

	@BeforeTest()
	public void openingURL() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\faria\\eclipse-workspace\\gov.potal.cms\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://dor.georgia.gov/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	hPage=new HomePage(driver);
}
	@AfterTest
	public void quit() {
		driver.quit();
	}		



}
	



			
