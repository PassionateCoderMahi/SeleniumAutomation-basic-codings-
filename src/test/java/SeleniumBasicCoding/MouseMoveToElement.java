package SeleniumBasicCoding;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class MouseMoveToElement {
	
	WebDriver driver=null;
  @Test
  public void f() {
	  
	  Reporter.log("operation Sucess");
  }
  
  
  
  
  @Test
  public void MouseOperation() throws InterruptedException {
	  WebElement mainmenu1 = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
	  WebElement mainsubmenu1 = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
	 
	  Actions actobj = new Actions(driver); 
	  actobj.moveToElement(mainmenu1).moveToElement(mainsubmenu1).click().perform();
	  
	  
	  Reporter.log("Mouse Hover operation performed successfully");
	  
	  Thread.sleep(5000);

	  
  }
  

  
  
  @BeforeTest
  public void beforeTest()throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	//Navigate to the url
	   driver.navigate().to("https://demo.opencart.com/");  
	   
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
