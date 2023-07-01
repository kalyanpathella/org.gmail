package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;


public class LoginPage 
{
	// Locators of element as properties in page class
	@FindBy(xpath="//span[text()='Sign in']")private WebElement login;
	@FindBy(id="identifierId")private WebElement email;
	@FindBy(xpath="//span[text()='Next']/parent::button")private WebElement next1;
	@FindBy(xpath="//input[@type='password']")private WebElement password;
	@FindBy(xpath="//span[text()='Next']/parent::button")private WebElement next2;
	@FindBy(xpath="//div[contains(text(),'find your Google Account')]")private WebElement wrongmailerror;
	@FindBy(xpath="//div[text()='Enter an email or phone number']")private WebElement emptymailerror;
	@FindBy(xpath="(//div[@aria-live='polite'])[1]")private WebElement wrongpassworderror;
	@FindBy(xpath="//span[text()='Enter a password']")private WebElement emptypassworderror;
	@FindBy(id="headingText")private WebElement passwordpage;
	
	
	public LoginPage(RemoteWebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	// operations and observations methods 
	public void isLoginPageDisplayed()
	{
		if(login.isDisplayed())
		{
			Assert.assertTrue(true);
			System.out.println("Signin page is Displayed"); 
		}													
		else
		{
			Assert.assertTrue(false);
			System.out.println("Signin page is not Displayed");
		}
	}

	public void enterEmailId(String mail,FluentWait<RemoteWebDriver> wait)
	{
		if(email.isDisplayed())
		{
			Assert.assertTrue(true);
			wait.until(ExpectedConditions.visibilityOf(email)).sendKeys(mail);
			System.out.println("Email Text Box Test passed");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("Email Text Box Test failed");
		}
	}
	public void clickOnNext1(FluentWait<RemoteWebDriver> wait)
	{
		if(next1.isEnabled())
		{
			Assert.assertTrue(true);
			wait.until(ExpectedConditions.elementToBeClickable(next1)).click();
			System.out.println("Next button Test Passed");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("Next button test Failed");
		}
	}
	public void enterPassword(String pass,FluentWait<RemoteWebDriver> wait)
	{
		if(password.isEnabled())
		{
			Assert.assertTrue(true);
			wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(pass);
			System.out.println("Password Text Box Test passed");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("Password Text Box Test Failed");
		}
	}
	public void clickOnNext2(FluentWait<RemoteWebDriver> wait)
	{
		if(next2.isEnabled())
		{
			Assert.assertTrue(true);
			wait.until(ExpectedConditions.elementToBeClickable(next2)).click();
			System.out.println("Next Button Test passed");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("Next Button Test failed");
		}
	}
	public void wrongemailerrormessage()throws Exception
	{
		Thread.sleep(3000);
		if(wrongmailerror.isDisplayed())
		{
			Assert.assertTrue(true);
			String x=wrongmailerror.getText();
			System.out.println(x);
			
		}
		else
		{
			Assert.assertTrue(false);
		}		
	}
	public void emptyemailerrormessage()throws Exception
	{
		Thread.sleep(3000);
		if(emptymailerror.isDisplayed())
		{
			Assert.assertTrue(true);
			String x=emptymailerror.getText();
			System.out.println(x);
			
		}
		else
		{
			Assert.assertTrue(false);
		}

	}
	public void wrongPasswordErrormessage()throws Exception
	{
		Thread.sleep(3000);
		if(wrongpassworderror.isDisplayed())
		{
			Assert.assertTrue(true);
			String x=wrongpassworderror.getText();
			System.out.println(x);
			
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	public void emptyPasswordErrormessage()throws Exception
	{
		Thread.sleep(3000);
		if(emptypassworderror.isDisplayed())
		{
			Assert.assertTrue(true);
			String x=emptypassworderror.getText();
			System.out.println(x);
			
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	public void passwordPageDisplayedOrNot()
	{
		if(passwordpage.isDisplayed())
		{
			Assert.assertTrue(true);
			String x=passwordpage.getText();
			System.out.println(x);
			
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
}
