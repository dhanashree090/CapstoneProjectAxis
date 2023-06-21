package GridTest;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Grid.Base;
import PageObject.TestC6;

public class TestGrid6 extends Base{
	TestC6 tc6obj;
	WebDriver driver;
	@Parameters({"Port"})
	@BeforeMethod
	public void inisetup(String Port) throws MalformedURLException {
		driver = setup(Port);
		tc6obj=new TestC6(driver);
		
	}
	@Test
	public void Test1() throws InterruptedException {
		tc6obj.Test6();
	}

}
