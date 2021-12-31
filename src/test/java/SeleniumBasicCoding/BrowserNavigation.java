package SeleniumBasicCoding;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class BrowserNavigation {
	
	WebDriver driver=null;
  @Test
  public void f() throws InterruptedException {
	  
	  driver.navigate().to("https://www.facebook.com/");
	  Reporter.log("Navigated to Facebook");
	  Thread.sleep(3000);
	  
	  driver.navigate().back();
	  System.out.println("goes back to Google");

	  Thread.sleep(3000);

	  driver.navigate().forward();
	  System.out.println("goes forward");
	  Thread.sleep(3000);
	 
	 
	  driver.navigate().refresh();
	  Thread.sleep(3000);
	  Reporter.log("browsertitle" + driver.getTitle());
	  Reporter.log(" browser current URL " + driver.getCurrentUrl());
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  
  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
	  
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
	   
	  Thread.sleep(2000);
	   
	  System.out.println(driver.getTitle());
	  
	
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
	   driver.quit();
  }

}
