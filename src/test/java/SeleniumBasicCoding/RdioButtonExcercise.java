package SeleniumBasicCoding;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class RdioButtonExcercise {
	
	WebDriver driver=null;
	
  @Test
  public void radioButtonValidation() throws InterruptedException {
	  
	  
	  //IsEnabled
	   Reporter.log("Validate the RadioButton Field is Enabled : " + driver.findElement(By.xpath("//input[@value='Male']")).isEnabled()); 
	  
	//To select the specific radio button  
	   driver.findElement(By.xpath("//input[@value='Male']")).click();
	   Reporter.log("Radio button is selected successfully");   
	   Thread.sleep(500);
	  
	   driver.findElement(By.xpath("//input[@value='FeMale']")).click();
	   Reporter.log("Radio button is selected successfully");   
	   Thread.sleep(500);
	   
	   
  }
  
  
  
  @BeforeTest
  public void beforeTest() throws InterruptedException  {
	  

	  
		//Setting the Chrome driver version 90 path
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		  
		  driver = new ChromeDriver();
		  driver.navigate().to("http://demo.automationtesting.in/Register.html");  

		  
		  Reporter.log("Page is launched successsfully");
		  
		  //To get the page title
		  Reporter.log("Page Title : " + driver.getTitle());
		  
		  //To get the page url
		  Reporter.log("Page Current Url : " + driver.getCurrentUrl());
		  
		  //To maximize the browser
		  driver.manage().window().maximize();
		  Reporter.log("Page is scrolled by pixel");
		  
		  //Implicit wait
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		     Thread.sleep(2000);
  }

  @AfterTest
  public void afterTest()throws Exception  {
	  
		//To close the current browser
		  driver.close();
		  
		  //To exit the browser instance
		  driver.quit();
  }

}
