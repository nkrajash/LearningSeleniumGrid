package SeleniumGrid_Session16;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestingwithGrid {

	WebDriver driver;
	
	@Test
	public void invokeBrowser() throws MalformedURLException{
		//The selenium - standalone JAR(3.141.59) contains everything, including the remote Selenium server and the 
		//client-side bindings if anybody wants to run the selenium grid, has to download the jar file.
		//In testng.xml file, parallel='tests' , parallel='classes', parallel = 'methods' run parallel
		// the tests, methods or classes
		//Note that run cmd.exe and run ipconfig to get the IPV4 address.Here its 192.168.0.104:4455 where
		//port number is 4455.
		URL remoteURL = new URL("http://192.168.0.104:4455/wd/hub");
		//same execution with the below URL also
		//URL remoteURL = new URL("http://localhost:4455/wd/hub");
		
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);

		//For interacting with Selenium Grid --> Interface used is RemoteWebDriver.
		//Cross Browser Testing
		//Parallel execution of tests
		driver = new RemoteWebDriver(remoteURL,dc);
		//ChromeOptions chromeOptions = new ChromeOptions();
		//driver = new RemoteWebDriver(remoteURL,chromeOptions);
		//EdgeOptions edgeOptions = new EdgeOptions();
		//driver = new RemoteWebDriver(remoteURL,edgeOptions);
				
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://test.qatechhub.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.quit();
	}

}
