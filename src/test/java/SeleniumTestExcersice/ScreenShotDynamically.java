package SeleniumTestExcersice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ScreenShotDynamically {
	static WebDriver driver = null;
  @Test
  public void f() throws Exception
  {
	  String ActualTitle = driver.getTitle();
	  String ExpectedTitle = "times";
	  
	  if (ActualTitle.contains(ExpectedTitle))
	  {
		  System.out.println("Title Verified" + driver.getTitle());
	  }
	  else
	  {
		  takeSnapShot();
		  System.out.println("Title is not Verified");
	  }
   
  }
  
  public static void takeSnapShot() throws Exception{

      //Convert web driver object to TakeScreenshot

      TakesScreenshot scrShot =((TakesScreenshot)driver);
     
      
      //Call getScreenshotAs method to create image file

              File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

          //Move image file to new destination

             // File DestFile=new File("C:\\Users\\mahiv\\OneDrive\\Desktop\\seleniumScreenshots\\"+timestamp()+".png");
              //Move image file to new destination
              File DestFile=new File(".\\ScreenShots\\"+timestamp()+".png");
              
              //Copy file at destination
              FileUtils.copyFile(SrcFile, DestFile);
              Thread.sleep(200);

  }
  
  // to create the screenshot file name dynamically we are using timestamp
  
  public static String timestamp() 
  {
	  return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
  }
  
  
  @BeforeTest
  public void beforeTest() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com/"+ "");
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
  }

  @AfterTest
  public void afterTest()
  {
	  driver.close();
	  driver.quit();
  }

}
