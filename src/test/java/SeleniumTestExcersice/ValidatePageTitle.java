package SeleniumTestExcersice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class ValidatePageTitle {
	
	WebDriver driver=null;
  @Test
  public void TitleUrlPageSource() {
	  
	  
	  String ActualTitle = driver.getTitle();
	  String ExpectedTitle = "Google";
	  //String ExpectedTitle = "Domain Names,Website";
	  if (ActualTitle.contains(ExpectedTitle))
	  {
		  System.out.println("Title Verified" + driver.getTitle());
	  }
	  else
	  {
		  System.out.println("Title is not Verified");
	  }
	  
			  
	  String ActualURL= driver.getCurrentUrl();
	  String ExpectedURL="https://www.google.com/";
	  //String ExpectedURL="https://www.godaddy.com/";
	  if(ActualURL.equals(ExpectedURL))
	  {
		  System.out.println("URL Verified" + driver.getCurrentUrl());
	  }
	  else
	  {
		  System.out.println("URl is not Verified");
	  }
	  
			  
			  
	  String ActualPagesource = driver.getPageSource();
	  //System.out.println("Page source is" + driver.getPageSource());
	  
	  if(ActualPagesource.contains(ExpectedTitle))
	  {
		  System.out.println("Expected Title is Present in the Page Source");
	  }
	  else
	  {
		  System.out.println("Expected Title is NOT Present in the Page Source");
	  }
			  
	  
	  
  }
  @Test
  public void a() {
	  Reporter.log("sucessfully got the PAge Title  "  + driver.getTitle());
	  Reporter.log("sucessfully got the PAge URL  "  + driver.getCurrentUrl());
	  Reporter.log("sucessfully got Page Source  "  + driver.getPageSource());
  }
  
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  
	  //driver.get("https://www.godaddy.com/");
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
	 
	 	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  driver.quit();
	  
  }

}
