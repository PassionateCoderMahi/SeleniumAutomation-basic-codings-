package SeleniumBasicCoding;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class FireFox {

	WebDriver driver=null;
  @Test
  public void Setuptest() {
	  
	  Reporter.log("Browser Title : " + driver.getTitle());
	    
	    //To get the url of the page
	    Reporter.log("Browser Url : " + driver.getCurrentUrl());
	    
	    //To get the page source
	    Reporter.log("Browser Page Source : " + driver.getPageSource());
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	//Setting the Firefox driver version 90 path  
	  
System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\SeleniumDriver\\chromedriver_win32\\geckodriver.exe");
	  
//FF Browser
driver = new FirefoxDriver();

//To launch the url
driver.get("https://www.google.com");

//To maximize the browser
driver.manage().window().maximize();
  }
  
  

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
	   driver.quit();
  }

}
