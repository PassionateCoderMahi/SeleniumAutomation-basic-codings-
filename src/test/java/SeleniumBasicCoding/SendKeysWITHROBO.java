package SeleniumBasicCoding;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class SendKeysWITHROBO {
	
	WebDriver driver=null;
	
	@Test
	public void sendkeyexercise() throws InterruptedException

	{
	Thread.sleep(8000);

	//Selenium cannot identify Windows based application
	//Using SendKeys methods

	WebElement button = driver.findElement(By.cssSelector("input#file-upload"));

	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();",button); //Click action on the button


	//click on ‘Choose file’ to upload the desired file
	button.sendKeys("C:\\Users\\mahiv\\OneDrive\\Desktop\\SeleniumRoboFile\\Hello1.txt"); //Uploading the file using sendKeys
	System.out.println("File is Uploaded Successfully");

	Reporter.log("Successfully executed using Sendkeys");

	Thread.sleep(8000);
	}
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().deleteAllCookies();
	  
	  //Navigate to the url
	  driver.navigate().to("https://www.monsterindia.com/seeker/registration");

	  Reporter.log("Page is launched successsfully");
  }

@AfterTest
  public void afterTest() {
	  
	  driver.close();
	  driver.quit();
  }
}