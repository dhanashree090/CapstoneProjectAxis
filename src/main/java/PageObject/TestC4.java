package PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.openqa.selenium.interactions.Actions;
public class TestC4 {
	WebDriver driver;
    public TestC4(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

}
    
    @FindBy(xpath = "//a[text()=' Home']")
    WebElement Homepage;
    
    
    @FindBy(xpath = "(//a[text()='Add to cart'])[1]")
    WebElement AddCart1;
    
    @FindBy(xpath = "(//a[text()='Add to cart'])[3]")
    WebElement AddCart2;
    
    @FindBy(xpath = "(//a[text()='Add to cart'])[5]")
    WebElement AddCart3;
    
    @FindBy(xpath = "(//a[text()='Add to cart'])[7]")
    WebElement AddCart4;
    
    @FindBy(xpath = "(//a[text()='Add to cart'])[9]")
    WebElement AddCart5;
    
    @FindBy(xpath = "//button[text()='Continue Shopping']")
    WebElement Continueshopping;
    
    @FindBy(xpath = "//a[text()=' Cart']")
    WebElement Cart;
    
    
    @FindBy(xpath = "//i[@class='fa fa-times'][1]")
    WebElement X1;
    
    @FindBy(xpath = "(//i[@class='fa fa-times'])[1]")
    WebElement X2;
    
    @FindBy(xpath = "(//a[@class='cart_quantity_delete'])[1]")
    WebElement X3;
    
    @FindBy(xpath = "(//a[@class='cart_quantity_delete'])[1]")
    WebElement X4;
    
    @FindBy(xpath = "//a[@class='cart_quantity_delete']")
    WebElement X5;
    
    @FindBy(xpath = "//b[text()='Cart is empty!']")
    WebElement CartEmpty;
    
    public void Test4() throws InterruptedException {
    	
    	Assert.assertTrue(Homepage.isDisplayed());
    	//srollDown
    	JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,500)", "");
    	Actions p1=new Actions(driver);
    	p1.moveToElement(AddCart1).click().build().perform();
    	Thread.sleep(1000);
    	Continueshopping.click();
    	p1.moveToElement(AddCart2).click().build().perform();
    	Thread.sleep(1000);
    	Continueshopping.click();
    	p1.moveToElement(AddCart3).click().build().perform();
    	Thread.sleep(1000);
    	//srollDown
    	JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,500)", "");
    	Thread.sleep(1000);
    	Continueshopping.click();
    	p1.moveToElement(AddCart4).click().build().perform();
    	Thread.sleep(1000);
    	Continueshopping.click();
    	p1.moveToElement(AddCart5).click().build().perform();
    	Thread.sleep(1000);
    	//srollDown
    	JavascriptExecutor js7 = (JavascriptExecutor) driver;
        js7.executeScript("window.scrollBy(0,-1000)", "");
    	Continueshopping.click();
    	Cart.click();
    	X1.click();
    	Thread.sleep(2000);
    	X2.click();
    	Thread.sleep(2000);
    	X3.click();
    	Thread.sleep(2000);
    	X4.click();
    	Thread.sleep(2000);
    	X5.click();
    	Thread.sleep(2000);
    	Assert.assertTrue(CartEmpty.isDisplayed());
    	
    }
}