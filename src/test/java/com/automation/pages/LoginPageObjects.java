package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;


public class LoginPageObjects {
  
	WebDriver driver;
	 
	 //Constructor
	 public LoginPageObjects(WebDriver driver)
	 {
	  this.driver = driver;
	 }
	 
	 //First Step : Defining WebElements
	 @FindBy(id = "txtUsername" ) WebElement usernameEdit;
	 @FindBy(id = "txtPassword" ) WebElement passwordEdit;
	 @FindBy(id = "btnLogin" ) WebElement loginButton;
	 
	 
	 
	 
	 
	 
	 //Step 2: Perform actions
	 public void loginvalidation(String username, String password)
	 {
	  //Enter the value for Username
	  usernameEdit.sendKeys(username);
	  Reporter.log("Username value is entered");
	  
	  //Enter the value for Password
	  passwordEdit.sendKeys(password);
	  Reporter.log("Password value is entered");  
	  
	  //Select the Login button
	  loginButton.click();
	  Reporter.log("Submit button is entered");  
	 }
}
