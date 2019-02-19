package org.somejavaprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_CountLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARCHANA\\ArchNewWorkspace\\SomeJavaProg\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.protechtraining.com/content/selenium_tutorial-locators");
		int linksCount = 0;
		List<WebElement> li = driver.findElements(By.tagName("a"));
		linksCount = li.size();
		System.out.println("Listing all links on this page...");
		
		for (WebElement webLinks : li) {
			System.out.println(webLinks.getAttribute("href"));
		}
		
		System.out.println("No.of Links on this page: "+linksCount);
		driver.quit();
	}

}
