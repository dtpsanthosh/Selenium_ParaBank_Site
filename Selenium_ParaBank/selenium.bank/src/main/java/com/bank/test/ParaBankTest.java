package com.bank.test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class ParaBankTest extends ParaBankBrowserSetup {

	@Test(priority = 0, enabled = true)
	public void register() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.getTitle();
		System.out.println(driver);
		webElements.getregister().click();
		webElements.getfirstName().sendKeys("Santhosh Kumar");
		webElements.getlastName().sendKeys("Gummani");
		webElements.getStreet().sendKeys("R and R Colony");
		webElements.getcity().sendKeys("Kadapa");
		webElements.getstate().sendKeys("Andhra Pradesh");
		webElements.getzipcode().sendKeys("516431");
		webElements.getphoneNumber().sendKeys("7780111125");
		webElements.getssn().sendKeys("12345");
		webElements.getusername().sendKeys("santhoshkumar");
		webElements.getpassword().sendKeys("123");
		webElements.getconfirmPassword().sendKeys("123");
		webElements.getregistrationButton().click();
	}
	@Test(priority = 1,enabled = true)
	public void login() {
		webElements.getloginusername().sendKeys("santhoshkumar");
		webElements.getloginPassword().sendKeys("123");
		webElements.getlogin().click();
	}
}
