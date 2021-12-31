package SeleniumBasicCoding;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class SelectListBox {
	WebDriver driver=null;
	 // @Test
	  public void ASelectDropdownExample() throws InterruptedException {
	   //To scroll the page
	      JavascriptExecutor js = (JavascriptExecutor) driver;  //Interface cast
	      js.executeScript("window.scrollBy(0,300)");
	      Reporter.log("Page is scrolled by pixel");  
	      
	      //Define the Webelement first
	      WebElement dropdownskills = driver.findElement(By.id("Skills"));
	      
	      //Inbuilt Select class
	      Select dropdownvalue = new Select(dropdownskills);
	     
	      
	    //SelectByVisibleText()
	      dropdownvalue.selectByVisibleText("Adobe InDesign");
	      Reporter.log("Selected using VisibleText : Adobe InDesign " );
	      
	      Thread.sleep(2000);
	      
	      //SelectByValue using Value Attribute
	      
	      dropdownvalue.selectByValue("Android"); //Android
	      Reporter.log("Selected using value : Android ");
	      Thread.sleep(2000);
	       
	      //SelectByIndex
	      dropdownvalue.selectByIndex(3);
	      Reporter.log("Selected using index : 3 ");
	      Thread.sleep(2000);    
	      
	  }
	  
	  @Test
	  public void SelectDropdownDynamically() throws InterruptedException
	  {
	   //To scroll the page
	      JavascriptExecutor js = (JavascriptExecutor) driver;  //Interface cast
	      js.executeScript("window.scrollBy(0,300)");
	      Reporter.log("Page is scrolled by pixel");  
	      
	   WebElement dropdownskills = driver.findElement(By.id("Skills"));
	   //Without using select By using getOptions
	    selectoption(dropdownskills,"Art Design");
	    Thread.sleep(5000);
	    
	    Reporter.log("Select drop down");
	    
	 //Define the Webelement first
	    WebElement dropdownskills1 = driver.findElement(By.id("countries"));
	    selectoption(dropdownskills1,"Algeria");
	    Thread.sleep(2000);
	   
	  }
	  
	  //Reusable function 
	  //Parameters : Dropdown name and Value
	  //Dynamically without the select methods
	  public static void selectoption(WebElement ele, String value)
	  {
	   
	   Select dropdownvalue = new Select(ele);
	   
	//  List<WebElement> optiontotlcount = dropdownvalue.getOptions();
	  
	   List<WebElement> optionscount = dropdownvalue.getOptions();
	   
	  //using for...each  loop
	   for(WebElement option:optionscount)
	   {
	     if(option.getText().equals(value)) //Condition
	     {
	     option.click();  
	     Reporter.log("Without Select method by using get options count :  " + value);
	     break;
	     }
	   }
	  }

  
  
  
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://demo.automationtesting.in/Register.html\n"+ "");
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
