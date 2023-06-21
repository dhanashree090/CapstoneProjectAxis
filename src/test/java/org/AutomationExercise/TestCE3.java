package org.AutomationExercise;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import AutomationExercise.manipalCP.BaseConfig;
import PageObject.TestC2;
import PageObject.TestC3;

public class TestCE3 extends BaseConfig{
	public TestC3 testc3;

	WebDriver driver;
		
		@BeforeClass
	    public void setup() throws IOException{

	        driver = getDriver();
	        testc3 = new TestC3(driver);
	        
	        
		}
		
		@Test
	    public void Scenarios() throws IOException, InterruptedException{
	        
			testc3.Test3();



	}
	
	

}
