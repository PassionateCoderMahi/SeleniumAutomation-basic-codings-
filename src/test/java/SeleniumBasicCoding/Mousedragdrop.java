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

public class Mousedragdrop {
	
	WebDriver driver=null;
	  @Test
	  public void f() {
		  
		  Reporter.log("operation Sucess");
	  }
  @Test
  public void MouseOperation()throws InterruptedException {
	  
	  
	  WebElement dragimage1 = driver.findElement(By.id("box6"));
	  WebElement dropimage1 = driver.findElement(By.id("box106"));
	  
	  //Action Class
	  Actions actobj = new Actions(driver);  
	  actobj.dragAndDrop(dragimage1, dropimage1).perform(); //drag and drop
	  Thread.sleep(2000);

  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	//Navigate to the url
	  driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html"); 

	   
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
