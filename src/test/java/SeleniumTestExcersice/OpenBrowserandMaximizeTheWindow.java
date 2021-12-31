package SeleniumTestExcersice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class OpenBrowserandMaximizeTheWindow {
	
	WebDriver driver = null;
  @Test
  public void f() {
	  
	Reporter.log("The Page launched successfully" + driver.getCurrentUrl());
	Reporter.log("The Page launched successfully" + driver.getTitle());
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.godaddy.com/");
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
