package SeleniumBasicCoding;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;


public class ScreenShot {
	
	//private static final String FileUtils = null;
	
	static WebDriver driver=null;
	  @Test
	public void f() throws Exception {
	   takeSnapShot("GoogleHome1");
	  
	   driver.get("http://demo.automationtesting.in/Register.html");
	   takeSnapShot("DemoPage1");
	  }
	  

	  @Test
	public static void takeSnapShot(String fileName) throws Exception{

	      //Convert web driver object to TakeScreenshot

	      TakesScreenshot scrShot =((TakesScreenshot)driver);
	      
	      //Call getScreenshotAs method to create image file

	              File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	          //Move image file to new destination

	              File DestFile=new File("C:\\Users\\mahiv\\OneDrive\\Desktop\\seleniumScreenshots\\"+fileName+".png");

	              //Copy file at destination
	              FileUtils.copyFile(SrcFile,DestFile);

	  }

  
  
  
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://demo.automationtesting.in/Register.html\n"+ "");
		  Thread.sleep(2000);
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  
	  
	  
  }

  @AfterTest
  public void afterTest() throws Exception  {
	  
	//To close the current browser
	  driver.close();
	  
	  //To exit the browser instance
	  driver.quit();
  }
}
