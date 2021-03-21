	package sel;
	
	import java.util.Set;
	import java.util.concurrent.TimeUnit;
	
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	import java.util.List;
	
	public class traintrip {
	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver", "E:\\Yoloshy_Selenium\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver wd = new ChromeDriver();		
			
			wd.manage().window().maximize();
			
			wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			wd.navigate().to("https://www.irctc.co.in");
			
			
			
			Set <String> childwindow = wd.getWindowHandles() ;
		 
			 for (String fresh : childwindow)
			 {
				 wd.switchTo().window(fresh);
				 break;
			 }
						
			WebElement covidAlertMessageOkButton = wd.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button"));
			
			covidAlertMessageOkButton.click();
			
						
			WebElement dep = wd.findElement(By.xpath("//*[@id=\'origin\']/span/input"));
			dep.sendKeys("C"+Keys.ARROW_DOWN+Keys.ARROW_UP);
			
			
			//Thread.sleep(3000);
							
			List <WebElement> cities = wd.findElements(By.xpath("//*[@id=\'pr_id_1_list\']/li[7]/span"));
			
			for (WebElement v : cities)
			{
			
				if (v.getText().equals("Chennai"))
				{
					v.click();
					break;
				}
		}
	
		
		
		}	
	}