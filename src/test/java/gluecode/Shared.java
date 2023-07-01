package gluecode;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pages.LoginPage;
import utilities.SiteUtility;

public class Shared 
{
	public RemoteWebDriver driver;
	public LoginPage login;
	public FluentWait<RemoteWebDriver> wait;
	public SiteUtility utiltiy;
	public Scenario s;
	
	@Before
	public void method(Scenario x)
	{
		this.s=x;
	}

}
