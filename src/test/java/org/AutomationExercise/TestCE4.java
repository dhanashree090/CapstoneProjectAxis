package org.AutomationExercise;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import AutomationExercise.manipalCP.BaseConfig;
import PageObject.TestC3;
import PageObject.TestC4;

public class TestCE4 extends BaseConfig{
	
	public TestC4 testc4;

	WebDriver driver;
		
		@BeforeClass
	    public void setup() throws IOException{

	        driver = getDriver();
	        testc4 = new TestC4(driver);
	        
	        
		}
		
		@Test
	    public void Scenarios() throws IOException, InterruptedException{
	        
			testc4.Test4();



	}

}
