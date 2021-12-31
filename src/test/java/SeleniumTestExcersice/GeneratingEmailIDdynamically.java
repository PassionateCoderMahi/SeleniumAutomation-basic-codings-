package SeleniumTestExcersice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class GeneratingEmailIDdynamically {
	static WebDriver driver = null;
	
	  @Test
	  public void UserRegistration() throws Exception {
		  
		  //click on sign in
		  driver.findElement(By.xpath("//a[@class=\"login\"]")).click();
		  Reporter.log("Sign page clicked on Sucessfully");
		  Thread.sleep(2000);
		  
		  //click on email under create account
		  
		WebElement UserEmail = driver.findElement(By.xpath("//input[@id=\"email_create\"]"));
		
		//Pass userEmail
		
	
		
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000);  
		UserEmail.sendKeys("pranitha12"+ randomInt +"@gmail.com");
		
	
		//UserEmail.sendKeys("f17800489@gmail.com");
		Thread.sleep(5000);
		
		//click on create Account after the email is entered successfully
		
		driver.findElement(By.cssSelector("button#SubmitCreate.btn.btn-default.button.button-medium.exclusive")).click();
		Thread.sleep(2000);
		
		//Personal Information
		//Choosing radio button 
		driver.findElement(By.xpath("//input[@id=\"id_gender2\"]")).click();
		
		Thread.sleep(5000);
	  }
  
  
  
  
  
  
	@BeforeTest
	  public void beforeTest()throws InterruptedException 
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get(" http://automationpractice.com/index.php");
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
