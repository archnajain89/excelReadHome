package pages;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility.ExcelUtility;
import base.CreateDriver;

public class LoginPage extends CreateDriver
{

	//This test method declares that its data should be supplied by the Data Provider
		// "getdata" is the function name which is passing the data
	       // Number of columns should match the number of input parameters
	
	@Test(dataProvider="DP1")
	public void setData(String username, String password) throws InterruptedException
	{
	
		System.out.println("you have provided username as::"+username);
		System.out.println("you have provided password as::"+password);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='username']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		Thread.sleep(2000);
	}
	
	@DataProvider(name="DP1")
	public Object[][] getData() throws Exception
	{
		
		        Object[][] retObjArr=ExcelUtility.getTableArray("D:\\data","testdata.xlsx","Sheet1");
		        return(retObjArr);
		 

	}
	
	
		
		
	}
	

