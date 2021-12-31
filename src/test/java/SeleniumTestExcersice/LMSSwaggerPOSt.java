package SeleniumTestExcersice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class LMSSwaggerPOSt {
	WebDriver driver=null;
	
  @Test
  public void f() throws InterruptedException
  {
	
	  
  }
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
	   driver = new ChromeDriver();
	   //To handle login pop up for the URL
	   //Sytanx: https://username:password@the-site.com
	   //username= admin
	   //password = password
	   //actual URL https://lms-admin-rest-service.herokuapp.com/swagger-ui/"
	   //passing url ""https://"+"username"+":"+"password"+"@"+"lms-admin-rest-service.herokuapp.com/swagger-ui/"
	   //driver.get("https://lms-admin-rest-service.herokuapp.com/swagger-ui/");
	   driver.get("https://"+"admin"+":"+"password"+"@"+"lms-admin-rest-service.herokuapp.com/swagger-ui/");
	   driver.manage().window().maximize();
	   Thread.sleep(3000);
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  driver.quit();
	  
  }

}
