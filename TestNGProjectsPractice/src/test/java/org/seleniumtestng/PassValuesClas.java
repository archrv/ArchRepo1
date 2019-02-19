package org.seleniumtestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterClass;

public class PassValuesClas {
  @Test
  @Parameters ({"username", "password"})
  public void login(String uname, String pass) {
	  System.out.println(uname + pass);
  }
  @BeforeClass
  public void beforeClass() {
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
