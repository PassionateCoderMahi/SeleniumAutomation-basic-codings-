package SeleniumTestExcersice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class AutomateUserRegistration {
	
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
	UserEmail.sendKeys("f7800489FG1@gmail.com");
	Thread.sleep(1000);
	
	//click on create Account after the email is entered successfully
	
	driver.findElement(By.cssSelector("button#SubmitCreate.btn.btn-default.button.button-medium.exclusive")).click();
	Thread.sleep(2000);
	
	//Personal Information
	//Choosing radio button 
	driver.findElement(By.xpath("//input[@id=\"id_gender2\"]")).click();
	
	
	//Entering firstname
	WebElement FirstName = driver.findElement(By.xpath("//input[@id=\"customer_firstname\"]"));
	FirstName.sendKeys("Mahi");
	
	//Entering Lastname
	
	WebElement LastName = driver.findElement(By.xpath("//input[@id=\"customer_lastname\"]"));
	LastName.sendKeys("velu");
	
	//To scroll the page
    JavascriptExecutor js = (JavascriptExecutor) driver;  //Interface cast
    js.executeScript("window.scrollBy(0,300)");
    Reporter.log("Page is scrolled by pixel");  
    
    //Entering Email
    
   // WebElement UserEmailAgain = driver.findElement(By.xpath("//input[@id=\"email\"]"));
	
	//UserEmailAgain.sendKeys("201671@gmail.com");
	
   //Entering Password
    
    WebElement password = driver.findElement(By.xpath("//input[@id=\"passwd\"]"));
	
	password.sendKeys("abcde");
	
	Thread.sleep(2000);
	
	//Selecting Date of birth
	//day
	  WebElement dropdownlistdays = driver.findElement(By.xpath("//select[@id=\"days\"]"));
	  Select dropdownvalue = new Select(dropdownlistdays);
	  dropdownvalue.selectByValue("14");
	  
	  //month
	  WebElement dropdownlistmonth = driver.findElement(By.xpath("//select[@id='months']"));
	  Select dropdownvalue1 = new Select(dropdownlistmonth);
	  dropdownvalue1.selectByIndex(4);
	  
	  //year
	  WebElement dropdownlistyear = driver.findElement(By.xpath("//select[@id='years']"));
	  Select dropdownvalue2 = new Select(dropdownlistyear);
	  dropdownvalue2.selectByValue("2016");
	  
	  Thread.sleep(5000);
	  
	  
	  //Selecting checkList box
	  List<WebElement> checkboxcount = driver.findElements(By.xpath("//input[@type='checkbox']"));
	   
	   //using for...each loop
	   for(WebElement chkboxvalue : checkboxcount) //directly assigning it to the webelement reads the checkboxes one after the other
	   {
	    chkboxvalue.click(); //Select the checkbox
	    
	    Reporter.log("Selected Checkbox ID : " + chkboxvalue.getAttribute("id"));
	    
	    Reporter.log("Selected Checkbox Value :  " + chkboxvalue.getAttribute("value"));    
	    
	   }   
	  
	    Thread.sleep(2000);
	    
	    
	  //To scroll the page
	    js.executeScript("window.scrollBy(0,300)"); 
	    
	    Thread.sleep(2000);
	    
	   //Entering address 
	    
	 WebElement addrs = driver.findElement(By.xpath("//input[@id='address1']")) ;
			 addrs.sendKeys("125,La Street,LA");
			 
			 //entering city
			 WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
			 city.sendKeys("Los Angeles");
			 
			 //entering the state name using dropdown list
			 
			 WebElement stateName = driver.findElement(By.xpath("//select[@id='id_state']"));
			 Select StateNameDropdown = new Select(stateName);
			 StateNameDropdown.selectByIndex(4);
			 
			 
			 //Scroll down
			 js.executeScript("window.scrollBy(0,300)"); 
			    
			    Thread.sleep(2000);
	  //Entering Postcode
			 
			 WebElement postcode = driver.findElement(By.xpath("//input[@id='postcode']"));
			 postcode.sendKeys("90001");
			 
			 //Select country from dropdown list
			 
			 WebElement country = driver.findElement(By.xpath("//select[@id='id_country']"));
			 Select countryDropdown = new Select(country);
			 countryDropdown.selectByIndex(1);
			  Thread.sleep(2000);
			 
			 //Mobile Phone
			 
			 
			 WebElement mobilePhone = driver.findElement(By.xpath("//input[@id='phone_mobile']"));
			 mobilePhone.sendKeys("1111000000");
			 
			 //Another Address
			 
			 WebElement address2 = driver.findElement(By.xpath("//input[@id='alias']"));
			 address2.sendKeys("129,countryhills,SFO");
			  Thread.sleep(5000);
			 
			 //Register the account
			 
			 driver.findElement(By.cssSelector("button#submitAccount.btn.btn-default.button.button-medium")).click();
			 
			 takeSnapShot();
			 
			 //After registering navigate to my account page
			 
			 driver.findElement(By.xpath("//a[@title='Return to Home']")).click();
			 Thread.sleep(5000);
			 
			 System.out.println("account Registerd successfully");
	         Reporter.log("account Registerd successfully");
	  
	 
	  }
  
  
  public static void takeSnapShot() throws Exception{

      //Convert web driver object to TakeScreenshot

      TakesScreenshot scrShot =((TakesScreenshot)driver);
     
      
      //Call getScreenshotAs method to create image file

              File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

          //Move image file to new destination

              File DestFile=new File("C:\\Users\\mahiv\\OneDrive\\Desktop\\seleniumScreenshots\\"+timestamp()+".png");

              //Copy file at destination
              FileUtils.copyFile(SrcFile, DestFile);
              Thread.sleep(200);

  }
  
  // to create the screenshot file name dynamically we are using timestamp
  
  public static String timestamp() 
  {
	  return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
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
