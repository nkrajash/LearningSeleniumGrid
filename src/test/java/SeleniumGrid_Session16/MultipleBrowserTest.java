package SeleniumGrid_Session16;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultipleBrowserTest {
	WebDriver driver;
	
	@Parameters("browserType")
	@Test
	public void invokeBrowser(String browserType) throws MalformedURLException{
		//The selenium - standalone JAR(3.141.59) contains everything, including the remote Selenium server and the 
		//client-side bindings if anybody wants to run the selenium grid, has to download the jar file.
		//In testng.xml file, parallel='tests' , parallel='classes', parallel = 'methods' run parallel
		// the tests, methods or classes
		//Initially, run cmd.exe and run ipconfig to get the IPV4 address.Here its 192.168.0.104:4455 where
		//port number is 4455.
		//Then run 3 cmd line prompts:
		//run on separate cmd prompt for running hub
		//run on separate cmd prompt for chrome driver 
		//run on separate cmd prompt for edge driver

		
		URL remoteURL = new URL("http://192.168.0.104:4455/wd/hub");
		if(browserType.equals("chrome")) {
			ChromeOptions chromeOptions = new ChromeOptions();
			//Chrome driver is 90.0.4430.24
			//Java SE 1.8
			//Selenium 3.141.59
			driver = new RemoteWebDriver(remoteURL,chromeOptions);
		}
		else if (browserType.equals("edge")) {
			EdgeOptions edgeOptions = new EdgeOptions();
			driver = new RemoteWebDriver(remoteURL,edgeOptions);
				//Edge driver is 90.0.818.62
				//Java SE 1.8
				//Selenium 3.141.59
		}
				
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://test.qatechhub.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Here both the browsers will open and show the website  https://test.qatechhub.com
		driver.quit();
	}
}
