package SeleniumBasicCoding;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class Sampletest1 {
	
	  @BeforeTest
	  public void beforeTest() {
		  
		  System.out.println("Welecome to before Test");
		  Reporter.log("Welecome to before Test");
	  }

	
	
  @Test
  public void a1() {
	  
	  System.out.println("Welecome to Testing framework a1");
	  Reporter.log("Welecome to Testing framework a1");
	  
  }
  
  @Test
  public void b1() {
	  
	  System.out.println("Welecome to Testing framework b1");
	  Reporter.log("Welecome to Testing framework b1");
  }
  

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("Welecome to After Test");
	  Reporter.log("Welecome to After Test");
  }

}
