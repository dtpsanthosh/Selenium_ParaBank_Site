package com.bank.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.bank.webelements.ParaBankWebElements;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParaBankBrowserSetup {
	WebDriver driver;
	ParaBankWebElements webElements;

	
	@BeforeClass
	@Parameters({ "browser", "url" })
	public void setup(String browser, String url) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		webElements = new ParaBankWebElements(driver);
		driver.manage().window().maximize();
		driver.get(url);

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
