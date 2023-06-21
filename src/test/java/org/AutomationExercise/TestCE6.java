package org.AutomationExercise;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import AutomationExercise.manipalCP.BaseConfig;
import PageObject.TestC5;
import PageObject.TestC6;

public class TestCE6 extends BaseConfig{
	public TestC6 testc6;

	WebDriver driver;
		
		@BeforeClass
	    public void setup() throws IOException{

	        driver = getDriver();
	        testc6 = new TestC6(driver);
	        
	        
		}
		
		@Test
	    public void Scenarios() throws IOException, InterruptedException{
	        
			testc6.Test6();;



	}
	
	

}
