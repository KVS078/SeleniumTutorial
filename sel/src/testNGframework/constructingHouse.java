package testNGframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class constructingHouse {
	
	
	WebDriver wd;
	
	@BeforeSuite
	public void builder() 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Yoloshy_Selenium\\chromedriver_win32\\chromedriver.exe");
		
		wd = new ChromeDriver();
		
		wd.get("https://www.bashyamgroup.com/");
		
	}
	
	@Test(priority = 1)
	public void price()
	{
		System.out.println("Construction cost");
	}
	
	@Test(priority = 2)
	public void foundation()
	{
		System.out.println("Construction has been started");
	}
	

	@Test(priority = 3)
	public void compoundWall()
	{
		System.out.println("Compund Wall has been raised");
		
	}
	
	@Test(priority = 4)
	public void parking()
	{
		System.out.println("Parking is under construction");
		
	}
	
	@Test(priority = 5)
	public void firstFloor()
	{
		System.out.println("First floor is under construction");
		
	}
	
	@AfterSuite	
	public void endOfConstruction() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("Construction over.Building hand over...");
		wd.quit();
		
	}
	
		
}

