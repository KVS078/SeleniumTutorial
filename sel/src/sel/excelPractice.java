/*				package sel;
				
		import java.io.FileInputStream;
		import java.io.IOException;	
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.testng.annotations.AfterTest;
		import org.testng.annotations.BeforeTest;
		import org.testng.annotations.DataProvider;
		import org.testng.annotations.Test;
		
		import jxl.Sheet;
		import jxl.Workbook;
		import jxl.read.biff.BiffException;
				
				public class excelPractice {
				
					public WebDriver wd;
					
					String[][] data = null;
					
					
					public String[][] fetching() throws BiffException, IOException
					{
						data = getExcelData();
						return data;
								
					}
					@DataProvider(name="logindata")
					public String[][] getExcelData() throws BiffException, IOException
					{
						FileInputStream e1 = new FileInputStream("E:\\Venkat_Selenium\\workspace\\testdata.xls");
						Workbook w1 = Workbook.getWorkbook(e1);
						Sheet s1 = w1.getSheet(0);
						
						int r1 = s1.getRows();
						int c1 = s1.getColumns();
						
						String testData[][] = new String[r1][c1];
						
						for(int i=1;i<r1;i++)
						{
							for(int j=0;j<c1;j++)
						{
								Cell c = s1.getCell(j,i);
								testData[i][j] = c.getContents();
						}
						}
						return testData;
						
					}
					
					@BeforeTest
					public void opening()
					{
						System.setProperty("webdriver.chrome.driver","E:\\Yoloshy_Selenium\\chromedriver_win32\\chromedriver.exe");
						 wd = new ChromeDriver();
						
					}
					
					@AfterTest
					public void closing()
					{
						wd.quit();
					}
					
					@Test(dataProvider = "logindata")
					public void LoginCredentials(String uname, String pword) throws InterruptedException
					{
					  wd.get("https://voterportal.eci.gov.in/");	
					  
					  WebElement un = wd.findElement(By.name("user"));
					  un.sendKeys(uname);
					  
					  WebElement pd = wd.findElement(By.name("password"));
					  pd.sendKeys(pword);
					  
					  Thread.sleep(3000);
					  
					  WebElement bt = wd.findElement(By.xpath("//*[@class=\'pull-right btn btn-orange\'][@type=\'submit\']"));
					  bt.click();
					  
					}
					
					
				
				}
*/