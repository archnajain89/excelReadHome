package Utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class Screenshot 
{
	
	public static String GetScreenShot(WebDriver driver) throws IOException
	{
	//Save screenshot
		try
		{
			File f1 =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    
			String filename =  new SimpleDateFormat("yyyyMMddhhmmss'.txt'").format(new Date());

			File f2=new File("D://mysoftware//bhavna//Tasks13062017//Screenshot//"+filename+".png");
			
	
			//To create folder for saving screenshot
			if (!f2.exists()) 
			{
				System.out.println("File created " + f2);
				f2.mkdir();
			}
	
			FileUtils.copyFile(f1, f2);
			System.out.println(filename+".png"+" ScreenShot saved successfully!!!!!!!");
			return filename;
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		return null;
	}
		
}