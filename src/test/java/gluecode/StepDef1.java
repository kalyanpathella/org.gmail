package gluecode;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.LoginPage;
import utilities.SiteUtility;

public class StepDef1
{
	Shared sh;
	public StepDef1(Shared x)
	{
		this.sh=x;	
	}
	
	@Given("open {string} browser")
	public void open_chrome_browser(String bn) 
	{
	   sh.utiltiy= new SiteUtility();
	   sh.driver=sh.utiltiy.openBrowser(bn);
	   sh.wait=sh.utiltiy.defaultwait(sh.driver, 20, 1000);
	}

	@When("launch a site")
	public void launch_a_site()throws Exception
	{
	   sh.driver.get("https://www.gmail.com");
	   Thread.sleep(3000);
	}

	@Then("Login Text is displayed")
	public void login_text_is_displayed() 
	{
	   sh.login = new LoginPage(sh.driver);
	   sh.login.isLoginPageDisplayed();
	   
	}

	@When("enter valid user name {string} in user name field")
	public void enter_valid_user_name_in_user_name_field(String username) 
	{
	    sh.login=new LoginPage(sh.driver);
	    sh.login.enterEmailId(username, sh.wait);
	}

	@Then("click on emailnext button")
	public void click_on_emailnext_button() 
	{
	   sh.login.clickOnNext1(sh.wait);
	}

	@When("enter valid password {string} in password field")
	public void enter_valid_password_in_password_field(String password) 
	{
	    sh.login.enterPassword(password, sh.wait);
	}

	@When("click on passwordnext button")
	public void click_on_passwordnext_button() 
	{
	   sh.login.clickOnNext2(sh.wait);
	}

	@When("enter invalid user name {string} in user name field")
	public void enter_invalid_user_name_in_user_name_field(String username)
	{
	    sh.login.enterEmailId(username, sh.wait);
	}
	@Then("check the user name error message displayed or not")
	public void check_the_user_name_error_message_displayed_or_not()throws Exception
	{
	    sh.login.wrongemailerrormessage();
	}

	@When("enter empty user name {string} in user name field")
	public void enter_empty_user_name_in_user_name_field(String username) 
	{
	   sh.login.enterEmailId(username, sh.wait);
	}

	@Then("check the empty user error message displayed or not")
	public void check_the_empty_user_error_message_displayed_or_not()throws Exception
	{
	    sh.login.emptyemailerrormessage();
	}

	@When("enter invalid password {string} in password field")
	public void enter_invalid_password_in_password_field(String password)
	{
	    sh.login.enterPassword(password, sh.wait);
	}

	@Then("check the password error message")
	public void check_the_password_error_message()throws Exception 
	{
	    sh.login.wrongPasswordErrormessage();
	}

	@When("enter empty password {string} in password field")
	public void enter_empty_password_in_password_field(String password) 
	{
	    sh.login.enterPassword(password, sh.wait);
	}

	@Then("check the empty password error message")
	public void check_the_empty_password_error_message()throws Exception 
	{
	    sh.login.emptyPasswordErrormessage();
	}

	@When("check password page dislpayed or not")
	public void check_the_any_error_message() 
	{
	    sh.login.passwordPageDisplayedOrNot();
	}


}
