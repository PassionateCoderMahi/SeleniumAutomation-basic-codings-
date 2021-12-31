package SeleniumBasicCoding;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class CheckBoxExcersise {
	
	WebDriver driver=null;
	@Test
	public void ToCheckParticularBox() {
	//To select the particular Checkbox
	 driver.findElement(By.id("checkbox1")).click();
	 
	 //isSelected
	 Reporter.log("After Checkbox Status : " + driver.findElement(By.id("checkbox1")).isSelected());

	}

@Test
  //To select all the Checkbox using Dynamically
  public void selectallcheckbox() throws InterruptedException
  {   
   //Java Collections - List
   //Java for...each loop   
   
   //Select all the checkbox 
   List<WebElement> checkboxcount = driver.findElements(By.xpath("//input[@type='checkbox']"));
   checkboxcount.size(); 
 
   Reporter.log("Dynamically Number of Checkbox is : " + checkboxcount.size()); //Count of checkbox
   
   //using for...each loop
   for(WebElement chkboxvalue : checkboxcount) //directly assigning it to the webelement reads the checkboxes one after the other
   {
    chkboxvalue.click(); //Select the checkbox
    
    Reporter.log("Selected Checkbox ID : " + chkboxvalue.getAttribute("id"));
    
    Reporter.log("Selected Checkbox Value :  " + chkboxvalue.getAttribute("value"));    
    
   }   
   Thread.sleep(5000);   
  }

@Test
  //To select specific checkbox dynamically
  public void SelectSpecificCheckbox() throws InterruptedException 
  {
   List<WebElement> checkboxcount = driver.findElements(By.xpath("//input[@type='checkbox']"));
   Reporter.log("Number of Checkbox is : " + checkboxcount.size());
   
   //using for...each loop   
   for(WebElement chkboxvalue : checkboxcount) //directly assigning it to the webelement reads the checkboxes one after the other
   {
    
    String chkboxname = chkboxvalue.getAttribute("id");
    if(chkboxname.equals("checkbox2") || chkboxname.equals("checkbox3"))
    {
     chkboxvalue.click();
    }
   }   
   Thread.sleep(5000);
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
