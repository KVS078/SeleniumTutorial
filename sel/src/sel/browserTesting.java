/*package sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class browserTesting {

	public static void main(String[] args) throws InterruptedException {

	System.out.println("Hello Automation Testing");
	
	System.setProperty("webdriver.chrome.driver", "E:\\Yoloshy_Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver wd = new ChromeDriver();
	
	wd.get("http://www.airindia.in/");
	
	//wd.quit();
	
 WebElement way = wd.findElement(By.className("iCheck-helper"));
 way.click();
 
 WebElement depature = wd.findElement(By.id("from"));
depature.sendKeys("c");

Thread.sleep(3000);
 
List <WebElement> airports =  wd.findElements(By.className("ui-menu-item"));





for (WebElement travel : airports)
{
	if (travel.getText().equals("Chennai"))
	{
		travel.click();
		break;
	}
}*/

/* WebElement fly = wd.findElement(By.xpath("//*[@id=\'ui-id-429\']"));
 fly.click();*/
 

 

 
	
	
	
	
	
			
	
	


