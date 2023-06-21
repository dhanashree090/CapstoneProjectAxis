package AutomationExercise.manipalCP;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BaseConfig {
//Webdriver.driver
	
	public WebDriver getDriver() throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shind\\Downloads\\browserdriver\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://automationexercise.com/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
	
	return driver;
	
}

}
