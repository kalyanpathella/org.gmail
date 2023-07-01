package utilities;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SiteUtility 
{
	public RemoteWebDriver openBrowser(String browsername)
	{
		RemoteWebDriver driver;
		if(browsername.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}else if(browsername.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		else 
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		}
		return(driver);
	}
	public FluentWait<RemoteWebDriver> defaultwait(RemoteWebDriver driver,int max, long interval)
	{
		FluentWait<RemoteWebDriver> wait = new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(max));
		wait.pollingEvery(Duration.ofMillis(interval));
		return(wait);
	}
	public void launchSite(RemoteWebDriver driver, String env)
	{
		String url;
		switch(env)
		{
		case"QA":
			url="https://www.gmail.com";
			break;
		case"STG":
			url="https://www.gmail.com";
			break;
		case"DEV":
			url="https://www.gmail.com";
			break;
		}
	}
	public void closeSite(RemoteWebDriver driver)
	{
		driver.close();
		
	}

}
