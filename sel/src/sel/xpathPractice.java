package sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathPractice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Yoloshy_Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver wd = new ChromeDriver();		
		
		wd.manage().window().maximize();
		
		wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		wd.navigate().to("https://www.thomascook.in/");
		
		WebElement xpath1 = wd.findElement(By.xpath("//*[@id='holidayPlace']"));
		
		xpath1.sendKeys("London"+Keys.TAB+Keys.ENTER);
		
	//Thread.sleep(3000);
	
	wd.switchTo().defaultContent();
	
	
		WebElement cross = wd.findElement(By.xpath("//button[@type='button'][@class='close']"));
		cross.click();
		
		
		
		/*WebElement noneed = wd.findElement(By.xpath("//*[text()='Book Now']"));
		noneed.click();*/

		
		

	}

}
