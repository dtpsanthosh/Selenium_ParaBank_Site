package com.bank.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ParaBankTest extends ParaBankBrowserSetup {

	@Test(priority = 0, enabled = false)
	public void register() {
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
		webElements.getusername().sendKeys("santhoshkumar3");
		webElements.getpassword().sendKeys("123");
		webElements.getconfirmPassword().sendKeys("123");
		webElements.getregistrationButton().click();
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		webElements.getloginuserName().sendKeys("santhoshkumar2");
		webElements.getloginpassword().sendKeys("123");
		webElements.getloginBtn().click();
	}

	@Test(priority = 2, enabled = true)
	public void operations() throws InterruptedException {
		SoftAssert softassertion = new SoftAssert();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*
		 * webElements.getopenNewAccount().click(); Select selecttypeOfAccount = new
		 * Select(webElements.gettypeOfAccount()); selecttypeOfAccount.selectByIndex(1);
		 * 
		 * Select selectfromAccountID = new Select(webElements.getfromAccountId());
		 * selectfromAccountID.selectByIndex(0);
		 * 
		 * webElements.getopenNewAccount1initial().click(); Thread.sleep(2000); // if we
		 * put thread.sleep it will override webElements.getnewAccountID().click();
		 * Select month = new Select(webElements.getmonth());
		 * month.selectByValue("April"); Select transactionType = new
		 * Select(webElements.gettransactionType());
		 * transactionType.selectByValue("Credit"); webElements.getGo().click();
		 */
		System.out.println("================Accounts OverView===================");
		String actuallink = webElements.getaccountOverviewlink().getText();
		String expectedlink = "Accounts Overview";
		softassertion.assertEquals(actuallink, expectedlink);
		webElements.getaccountOverviewlink().click();
		System.out.println("Accounts Overview Title:" + webElements.getaccOverviewTitle().getText());
		String balance = webElements.getbalance().getText();
		String availableAmount = webElements.getavailableAmount().getText();
		System.out.println("Balance:" + balance + "Available Amount:" + availableAmount);

		System.out.println("=================Transfer Funds=====================");
		String actualtransferfundslink = webElements.gettransferFundsLink().getText();
		String expectedtransferfundslink = "Transfer Funds";
		softassertion.assertEquals(actualtransferfundslink, expectedtransferfundslink);
		webElements.gettransferFundsLink().click();
		String transferFundstitle = webElements.gettransferFundsTitle().getText();
		System.out.println("Transfer Funds Title:" + transferFundstitle);
		Thread.sleep(1000);
		webElements.getamount().sendKeys("123.50");
		Thread.sleep(1000);
		Select fromAccount = new Select(webElements.getfromAccountId1());
		fromAccount.getFirstSelectedOption();
		Thread.sleep(1000);
		Select toAccount = new Select(webElements.gettoAccountId1());
		toAccount.getFirstSelectedOption();
		webElements.gettransferAmount().click();
		String transfercompletemsgTitle = webElements.gettransferCompleteMsgTitle().getText();
		System.out.println("Transfer Complete Message Title:" + transfercompletemsgTitle);
		String actualAmount = webElements.getverifyAmount().getText();
		String expectedAMount = "123.50";
		softassertion.assertEquals(actualAmount, expectedAMount);
		String transferedAmountDisplay = webElements.gettransferedAmountDisplay().getText();
		System.out.println("Transfer Amount Display:" + transferedAmountDisplay);
		
		System.out.println("==================Find Transactions==============");
		String actualfindtransactionlink = webElements.getfindTransactionslink().getText();
		String expectedfindTransactionslink = "Find Transactions";
		softassertion.assertEquals(actualfindtransactionlink, expectedfindTransactionslink);
		webElements.getfindTransactionslink().click();
		String actualfindTransactionTitle = webElements.getfindTransactionTitle().getText();
		String expectedFindTransactionsTitle = "Find Transactions";
		softassertion.assertEquals(actualfindTransactionTitle, expectedFindTransactionsTitle);
		webElements.getfindByAmount().sendKeys("123.50");
		webElements.getfindTransactionsBtn().click();
		String actualresultstitle = webElements.gettransactionResultsTitle().getText();
		System.out.println("Transaction Results Title" + actualresultstitle);
		String debitAmount = webElements.getdebitAmount().getText();
		System.out.println("Debit Amount" + debitAmount);
		String creditAmount = webElements.getcreditAmount().getText();
		
		System.out.println("Credit Amount "+ creditAmount);
		softassertion.assertAll();
	}
}