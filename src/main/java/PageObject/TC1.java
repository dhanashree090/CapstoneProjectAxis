package PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;

public class TC1 {


		WebDriver driver;
	    public TC1(WebDriver driver){
	        this.driver=driver;
	        PageFactory.initElements(driver,this);
	        
	        
	    }
 
	    @FindBy(xpath = "//a[text()=' Home']")
	    WebElement Homepage;
	    
	    @FindBy(xpath="//a[text()=' Signup / Login']")
	    WebElement SignupLogin;
	    
	    @FindBy(xpath=("//h2[text()='New User Signup!']"))
	    WebElement NewUserSignup;
	    
	    @FindBy(xpath=("//input[@name=\'name\']"))
	    WebElement Name;
	    
	    @FindBy(xpath=("(//input[@name='email'])[2]"))
	    WebElement email;
	    
	    @FindBy(xpath=("//button[text()='Signup']"))
	    WebElement signup;
	    
	    @FindBy(xpath=("//b[text()='Enter Account Information']"))
	    WebElement EnterInfo;		
	    		
	    @FindBy(xpath=("//label[text()='Title']"))
	    WebElement title;
	    
	    @FindBy(xpath=("//input[@id='password']"))
	    WebElement Password;
	    
	    @FindBy(xpath=("//select[@id='days']"))
	    WebElement day;
	    
	    @FindBy(xpath=("//select[@id='months']"))
	    WebElement month;
	    
	    @FindBy(xpath=("//select[@id='years']"))
	    WebElement year;
	    
	    @FindBy(xpath=("//input[@id='newsletter']"))
	    WebElement checkbox1;
	    
	    @FindBy(xpath=("//input[@id='optin']"))
	    WebElement checkbox2;
	    
	    @FindBy(xpath=("//input[@id='first_name']"))
	    WebElement firstname;
	    
	    @FindBy(xpath=("//input[@id='last_name']"))
	    WebElement lastname;
	    
	    @FindBy(xpath=("//input[@id='company']"))
	    WebElement company;
	    
	    @FindBy(xpath=("//input[@id='address1']"))
	    WebElement address1;
	    
	    @FindBy(xpath=("//input[@id='address2']"))
	    WebElement address2;
	    
	    @FindBy(xpath=("//select[@id='country']"))
	    WebElement country;
	    
	    @FindBy(xpath=("//input[@id='state']"))
	    WebElement state;
	    @FindBy(xpath=("//input[@id='city']"))
	    WebElement city;
	    
	    @FindBy(xpath=("//input[@id='zipcode']"))
	    WebElement zipcode;
	    
	    @FindBy(xpath=("//input[@id='mobile_number']"))
	    WebElement mobilenumber;
	    
	    @FindBy(xpath=("//button[text()='Create Account']"))
	    WebElement createaccount;
	    
	    @FindBy(xpath=("//a[text()='Continue']"))
	    WebElement continue1;
	    
	    @FindBy(xpath=("//a[text()=' Delete Account']"))
	    WebElement deleteaccount;
	    
	    @FindBy(xpath=("//a[text()='Continue'] "))
	    WebElement continue2;
	  
	    
	    public void Teccase1() {
	    	Assert.assertTrue(Homepage.isDisplayed());
	    	SignupLogin.click();
	    	Assert.assertTrue(NewUserSignup.isDisplayed());
	    	Name.sendKeys("Nma");
	    	email.sendKeys("nam38129412@gmail.com");
	    	signup.click();
	    	Assert.assertTrue(EnterInfo.isDisplayed());
	    	title.click();
	    	Password.sendKeys("12345");
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,250)", "");
	    	Select days = new Select(day);
	    	days.selectByVisibleText("1");
	    	
	    	Select months = new Select(month);
	    	months.selectByVisibleText("March");
	    	
	    	Select years = new Select(year);
	    	years.selectByVisibleText("1999");
	    	
	    	checkbox1.click();
	    	checkbox2.click();
	    	firstname.sendKeys("Dhanashree");
	    	lastname.sendKeys("Shinde");
	    	company.sendKeys("Abc pvt.ltd");
	    	address1.sendKeys("xyz street");
	    	address2.sendKeys("");
	    	//scrolldown
	    	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	        js1.executeScript("window.scrollBy(0,500)", "");
	    	Select countrys = new Select(country);
	    	countrys.selectByVisibleText("India");
	    	
	    	state.sendKeys("Maharashtra");
	    	city.sendKeys("Satara");
	    	zipcode.sendKeys("123456");
	    	mobilenumber.sendKeys("1234567890");
	    	createaccount.click();
	    	continue1.click();
	    	//add
	    	JavascriptExecutor js5 = (JavascriptExecutor) driver;
	        js5.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
	        continue1.click();
	    	deleteaccount.click();
	    	continue2.click();
	    	
	    	
	    	
	    }
}
