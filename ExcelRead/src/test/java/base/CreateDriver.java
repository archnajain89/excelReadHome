package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;

public class CreateDriver 
{

	public WebDriver driver;
	public ExtentReports r;
	@BeforeSuite
	public void StartBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://sso.godaddy.com/?realm=idp&path=%2F&app=mya");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		 r=new ExtentReports("./reports/report.html");
	}
	
	
	@AfterSuite
	public void EndBrowser()
	{
		//driver.quit();
		r.flush();
	}
	
}