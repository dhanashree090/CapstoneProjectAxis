package GridTest;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Grid.Base;
import PageObject.TestC5;

public class TestGrid5 extends Base{
	TestC5 tc5obj;
	WebDriver driver;
	@Parameters({"Port"})
	@BeforeMethod
	public void inisetup(String Port) throws MalformedURLException {
		driver = setup(Port);
		tc5obj=new TestC5(driver);
		
	}
	@Test
	public void Test1() throws InterruptedException {
		tc5obj.Test5();
	}

}
