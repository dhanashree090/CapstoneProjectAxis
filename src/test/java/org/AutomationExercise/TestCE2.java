package org.AutomationExercise;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import AutomationExercise.manipalCP.BaseConfig;
import PageObject.TC1;
import PageObject.TestC2;

public class TestCE2 extends BaseConfig{
	public TestC2 testc2;

WebDriver driver;
	
	@BeforeClass
    public void setup() throws IOException{

        driver = getDriver();
        testc2 = new TestC2(driver);
        
        
	}
	
	@Test
    public void Scenarios() throws IOException, InterruptedException{
        
		testc2.Test2();



}
}