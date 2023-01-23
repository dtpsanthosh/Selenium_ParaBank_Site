package com.bank.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ParaBankTest extends ParaBankBrowserSetup {

	@Test(priority = 0, enabled = false)
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

	@Test(priority = 1, enabled = true)
	public void login() {
		webElements.getloginusername().sendKeys("22");
		webElements.getloginPassword().sendKeys("22");
		webElements.getlogin().click();
	}

	@Test(priority = 2, enabled = true)
	public void operations() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		webElements.getopenNewAccount().click();
		Select selecttypeOfAccount = new Select(webElements.gettypeOfAccount());
		selecttypeOfAccount.selectByIndex(0);
		/*
		 * Select selectfromAccountID = new Select(webElements.getfromAccountId());
		 * selectfromAccountID.selectByIndex(0);
		 */
		webElements.getopenNewAccount1initial().click();
		Thread.sleep(2000); // if we put thread.sleep it will override
		webElements.getnewAccountID().click();
		Select month = new Select(webElements.getmonth());
		month.selectByValue("April");
		Select transactionType = new Select(webElements.gettransactionType());
		transactionType.selectByValue("Credit");
		webElements.getGo().click();
	}
}