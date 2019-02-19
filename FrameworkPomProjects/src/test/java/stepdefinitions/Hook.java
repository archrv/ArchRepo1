package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	
	public static WebDriver driver;
	
	@Before
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARCHANA\\ArchNewWorkspace\\FrameworkPomProjects\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public static void browserQuit() {
		driver.quit();
	}
}
