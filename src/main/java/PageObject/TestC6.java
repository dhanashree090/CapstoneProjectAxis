package PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TestC6 {
	WebDriver driver;
    public TestC6(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        
    }
    
    @FindBy(xpath = "//a[text()=' Home']")
    WebElement Homepage;
    
    
    @FindBy(xpath = "//a[text()=' Products']")
    WebElement Product;
    
    @FindBy(xpath = "(//a[text()='View Product'])[1]")
    WebElement ViewProduct;
    
  
    
    @FindBy(xpath = "//a[text()='Write Your Review']")
    WebElement WriteYourReview;
    
    @FindBy(xpath = "//input[@id=\"name\"]")
    WebElement EnterName;
    
    @FindBy(xpath = "//input[@id=\"email\"]")
    WebElement emailaddress;
    
    @FindBy(xpath = "//textarea[@id=\"review\"]")
    WebElement review;
    
    @FindBy(xpath = "//button[@id='button-review']")
    WebElement submit;
    
    @FindBy(xpath = "//span[text()='Thank you for your review.']")
    WebElement success;
    
    public void Test6() throws InterruptedException {
    	
    	Assert.assertTrue(Homepage.isDisplayed());
    	Product.click();
    	//add
    	JavascriptExecutor js5 = (JavascriptExecutor) driver;
        js5.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
    	Product.click();
    	//srollDown
    	JavascriptExecutor js6 = (JavascriptExecutor) driver;
    	js6.executeScript("window.scrollBy(0,450)", "");
    	
    	ViewProduct.click();
    	Thread.sleep(2000);
    	//add
    	JavascriptExecutor js7 = (JavascriptExecutor) driver;
        js7.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
        //ViewProduct.click();
        //srollDown
    	JavascriptExecutor js8 = (JavascriptExecutor) driver;
    	js8.executeScript("window.scrollBy(0,250)", "");
        EnterName.sendKeys("Daulat");
    	emailaddress.sendKeys("daulat@gmail.com");
    	review.sendKeys("Beautiful Product");
    	//srollDown
    	JavascriptExecutor js9 = (JavascriptExecutor) driver;
    	js9.executeScript("window.scrollBy(0,250)", "");
    	submit.click();
    	
    }

    
    
    

}
