package GridTest;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Grid.Base;
import PageObject.TC1;

public class TestGrid1 extends Base{
	TC1 tc1obj;
	WebDriver driver;
	@Parameters({"Port"})
	@BeforeMethod
	public void Gridsetup(String Port) throws MalformedURLException {
		driver = setup(Port);
		tc1obj=new TC1(driver);
		
	}
	@Test
	public void Test1() {
		tc1obj.Teccase1();
	}
 
}
