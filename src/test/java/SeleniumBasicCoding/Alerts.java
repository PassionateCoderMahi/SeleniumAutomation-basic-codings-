package SeleniumBasicCoding;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class Alerts {
	WebDriver driver=null;
	  @Test
	  public void f() {
		  
		  Reporter.log("operation Sucess");
	  }
	  
	  
	  @Test
	  public void AlertsexercisewithAccept() throws InterruptedException
	  {
	   
	   Reporter.log("Inside the Alerts with Accept method");        
	   
	   //driver.findElement(By.xpath("//a[@href='#OKTab']")).click();
	   
	   
	   driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	   Thread.sleep(2000);
	   
	   //driver.switchTo().
	         Alert alert = driver.switchTo().alert();
	         Thread.sleep(2000);
	         
	         alert.accept(); //To select OK button
	         Thread.sleep(5000);
	         
	         Reporter.log("Alert OK button is selected using the Accept method successsfully");     
	         
	         driver.switchTo().defaultContent();
	         
	         
	         
	         //Calling the dismiss method
	       //  AlertsexercisewithDismiss();
	   }
	  
	 // @Test
	  
	  public void AlertsexercisewithDismiss() throws InterruptedException
	  {
	  
	         Reporter.log("Inside the Alerts with Dismiss method");
	         
	   driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
	     
	   driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	   Thread.sleep(2000);
	   
	         Alert alert = driver.switchTo().alert();
	         Thread.sleep(2000);
	         
	         alert.dismiss();
	         
	         Reporter.log("Cancel button is selected using Dismiss method successfully");
	         Thread.sleep(5000);
	         
	         
	         driver.switchTo().defaultContent();      
	    
	         //driver.switchTo().alert().accept();
	         
	         //To get the value in the Alert box
	        // String alertvalue = alert.getText();
	        // Reporter.log("Value of the Alert Box: " + alertvalue);
	         
	  }
	  
	  
	  
	  
  @BeforeTest
  public void beforeTest()throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	//Navigate to the url
	   driver.navigate().to("http://demo.automationtesting.in/Alerts.html");  
	   
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
