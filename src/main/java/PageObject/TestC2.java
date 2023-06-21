package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TestC2 {
	
	WebDriver driver;
    public TestC2(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        
    }      

    @FindBy(xpath = "//a[text()=' Home']")
  WebElement Homepage;
  
  @FindBy(xpath="//a[text()=' Signup / Login']")
  WebElement SignupLoginpage;
  
  @FindBy(xpath="//h2[text()='Login to your account']")
  WebElement logintoyouraccount;
  
  @FindBy(xpath="(//input[@name='email'])[1]")
  WebElement email;
  
  @FindBy(xpath="//input[@name='password']")
  WebElement password;
  
  @FindBy(xpath="//button[text()='Login']")
  WebElement loginbutton;
  
  @FindBy(xpath="//a[text()=' Logout']")
  WebElement logoutbutton;
  
  

  public void Test2() {
	  
		Assert.assertTrue(Homepage.isDisplayed());
    	SignupLoginpage.click();
  	Assert.assertTrue(logintoyouraccount.isDisplayed());
    	email.sendKeys("daulat@gmail.com");
    	password.sendKeys("12345");
    	loginbutton.click();
    	logoutbutton.click();
    	
  }
    
    
    
}
