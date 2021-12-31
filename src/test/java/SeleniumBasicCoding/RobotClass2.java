package SeleniumBasicCoding;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


public class RobotClass2 {
	// RobotClass with robot
	WebDriver driver=null;
	
  @Test
  
  public void robotclass() throws AWTException, InterruptedException
  { 
   //Selenium cannot identify Windows based application
   //Robot Class methods   

   WebElement button = driver.findElement(By.cssSelector("input#file-upload"));
   
   JavascriptExecutor js = (JavascriptExecutor) driver;  
   js.executeScript("arguments[0].click();",button); //Click action on the button
   
   Thread.sleep(2000);
   
      // copying File path to Clipboard
      StringSelection str = new StringSelection("C:\\Users\\mahiv\\OneDrive\\Desktop\\SeleniumRoboFile\\Hello1.txt");
      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
      Reporter.log("Copied the file content");
      
   // creating object of Robot class
      Robot rb = new Robot();
      
    //  rb.keyPress(KeyEvent.VK_);
    
       // press Control+V for pasting
       rb.keyPress(KeyEvent.VK_CONTROL);
       rb.keyPress(KeyEvent.VK_V);
   
      // release Control+V for pasting
      rb.keyRelease(KeyEvent.VK_CONTROL);
      rb.keyRelease(KeyEvent.VK_V);
      Thread.sleep(2000);
      
      // for pressing and releasing Enter
      rb.keyPress(KeyEvent.VK_ENTER);
      rb.keyRelease(KeyEvent.VK_ENTER);
      
      Thread.sleep(2000);
      Reporter.log("Successfully executed using Robot Class ");
     
    }
  
  
  
  @BeforeTest
  public void beforeTest()throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
	  driver.manage().deleteAllCookies();

	//Navigate to the url
	  driver.navigate().to("https://www.monsterindia.com/seeker/registration");
	     
      Reporter.log("Page is launched successsfully");


	   
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
