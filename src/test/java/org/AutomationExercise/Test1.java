package org.AutomationExercise;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import AutomationExercise.manipalCP.BaseConfig;
import PageObject.TC1;

public class Test1 extends BaseConfig {
	public TC1 testc1obj;

WebDriver driver;
	
	@BeforeClass
    public void setup() throws IOException{

        driver = getDriver();
        testc1obj = new TC1(driver);
        
        
	}
	
	@Test
    public void Scenarios() throws IOException, InterruptedException{
        
		testc1obj.Teccase1();

}
}