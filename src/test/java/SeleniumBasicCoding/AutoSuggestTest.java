package SeleniumBasicCoding;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class AutoSuggestTest {
WebDriver driver = null;

  @Test
  public void f() throws InterruptedException {
 
 driver.findElement(By.id("yschsp")).click();
 
 driver.findElement(By.id("yschsp")).sendKeys("Selenium");

 /**
 * Example for Visibility of Elements located by
 */

 WebDriverWait wait = new WebDriverWait(driver,60);

 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@role='listbox']//li")));

 List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li"));

 Reporter.log("Auto Suggestion List Box ::" + list.size());

 for(int i = 0 ;i< list.size();i++)
 {
 Reporter.log(list.get(i).getText());

 if(list.get(i).getText().equals("selenium interview questions"))
 {
 Thread.sleep(2000);
 list.get(i).click();
 Thread.sleep(2000);
 Reporter.log("Selected the value successfully from the Auto Suggestion List Box");
 break;
 }
 }
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
 
 driver = new ChromeDriver();

 //Navigate to the url
 driver.get("https://in.yahoo.com/?p=us");
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
  public void afterTest() {
 
 driver.close();
 
 driver.quit();
 
  }

}