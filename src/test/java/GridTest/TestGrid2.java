package GridTest;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Grid.Base;
import PageObject.TestC2;

public class TestGrid2 extends Base{
	TestC2 tc2obj;
	WebDriver driver;
	@Parameters({"Port"})
	@BeforeMethod
	public void inisetup(String Port) throws MalformedURLException {
		driver =setup(Port);
		tc2obj=new TestC2(driver);
		
	}
	@Test
	public void Test1() {
		tc2obj.Test2();
	}
}
