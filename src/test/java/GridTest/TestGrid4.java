package GridTest;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Grid.Base;
import PageObject.TestC4;

public class TestGrid4 extends Base{
	TestC4 tc4obj;
	WebDriver driver;
	@Parameters({"Port"})
	@BeforeMethod
	public void inisetup(String Port) throws MalformedURLException {
		driver = setup(Port);
		tc4obj=new TestC4(driver);
		
	}
	@Test
	public void Test1() throws InterruptedException {
		tc4obj.Test4();
	}

}
