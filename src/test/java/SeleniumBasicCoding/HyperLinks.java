package SeleniumBasicCoding;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import java.util.List;

public class HyperLinks {
	WebDriver driver=null;
	
	
	@Test
	  public void hyperlinkselection() throws InterruptedException 
	  {   
	   //implicit wait
	      driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	        //explicit wait
	      Thread.sleep(5000);
	     
	   //Identify the link using LinkText 
	   driver.findElement(By.linkText("Gift Cards")).click();   
	   Reporter.log("Gift Cards link is selected");
	   
	   //explicit wait
	      Thread.sleep(2000);
	      Reporter.log("Navigated url : " + driver.getCurrentUrl());
	       
	   //Selecting the Todays Deal link  
	   driver.findElement(By.linkText("Best Sellers")).click();
	   Reporter.log("Best Sellers link is selected");
	   
	 //explicit wait
	      Thread.sleep(2000);
	      Reporter.log("Navigated url : " + driver.getCurrentUrl());
	      
	   //identify the link using PartialLinkTest
	   driver.findElement(By.partialLinkText("Service")).click();
	   
	 //explicit wait
	      Thread.sleep(2000);
	      Reporter.log("Navigated url : " + driver.getCurrentUrl());    
	  }
	
	@Test
	public void HyperlinkCount()
	  {
	  
	   //TagName Locator
	   List<WebElement> countlists = driver.findElements(By.tagName("a"));
	   
	   for(int i = 0; i<=countlists.size();i++)
	   {
	    //To retrieve the text of that particular link
	    //gettext()
	    Reporter.log(countlists.get(i).getText());
	    
	    //To retrieve the href attribute of that particular link    
	    //getAttribute()
	    Reporter.log(countlists.get(i).getAttribute("href"));
	    
	   // Reporter.log(countlists.get(i).getAttribute("data-csa-c-slot-id"));
	   }
	  } 
	
  @BeforeTest
  public void beforeTest() throws InterruptedException  {
	  

	  
		//Setting the Chrome driver version 90 path
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		  
		  driver = new ChromeDriver();
		  
		  //To launch the url
		  driver.get("https://www.amazon.com/");
		  
		  Reporter.log("Amazon Page is launched successsfully");
		  
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
