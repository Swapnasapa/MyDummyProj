package Dummy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("Test is running");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test is running");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test is running");
  }

}
