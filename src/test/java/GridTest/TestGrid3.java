package GridTest;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Grid.Base;
import PageObject.TestC3;

public class TestGrid3 extends Base{
	TestC3 tc3obj;
	WebDriver driver;
	@Parameters({"Port"})
	@BeforeMethod
	public void inisetup(String Port) throws MalformedURLException {
		driver = setup(Port);
		tc3obj=new TestC3(driver);
		
	}
	@Test
	public void Test1() {
		tc3obj.Test3();
	}

}
