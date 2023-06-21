package org.AutomationExercise;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import AutomationExercise.manipalCP.BaseConfig;
import PageObject.TestC5;

public class TestCE5 extends BaseConfig{
	public TestC5 testc5;

	WebDriver driver;
		
		@BeforeClass
	    public void setup() throws IOException{

	        driver = getDriver();
	        testc5 = new TestC5(driver);
	        
	        
		}
		
		@Test
	    public void Scenarios() throws IOException, InterruptedException{
	        
			testc5.Test5();



	}
	
	
	

}
