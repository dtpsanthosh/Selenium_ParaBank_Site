package com.bank.webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParaBankWebElements {
	WebDriver driver;

	public ParaBankWebElements(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver1, this);
	}

	@FindBy(linkText = "Register")
	WebElement register;

	public WebElement getregister() {
		return register;
	}

	@FindBy(id = "customer.firstName")
	WebElement firstName;

	public WebElement getfirstName() {
		return firstName;
	}

	@FindBy(id = "customer.lastName")
	WebElement lastName;

	public WebElement getlastName() {
		return lastName;
	}

	@FindBy(id = "customer.address.street")
	WebElement street;

	public WebElement getStreet() {
		return street;
	}

	@FindBy(id = "customer.address.city")
	WebElement city;

	public WebElement getcity() {
		return city;
	}

	@FindBy(id = "customer.address.state")
	WebElement state;

	public WebElement getstate() {
		return state;
	}

	@FindBy(id = "customer.address.zipCode")
	WebElement zipcode;

	public WebElement getzipcode() {
		return zipcode;
	}

	@FindBy(id = "customer.phoneNumber")
	WebElement phoneNumber;

	public WebElement getphoneNumber() {
		return phoneNumber;
	}

	@FindBy(id = "customer.ssn")
	WebElement ssn;

	public WebElement getssn() {
		return ssn;
	}

	@FindBy(id = "customer.username")
	WebElement username;

	public WebElement getusername() {
		return username;
	}

	@FindBy(id = "customer.password")
	WebElement password;

	public WebElement getpassword() {
		return password;
	}

	@FindBy(id = "repeatedPassword")
	WebElement confirmPassword;

	public WebElement getconfirmPassword() {
		return confirmPassword;
	}

	@FindBy(xpath = "//input[@value = 'Register']")
	WebElement registrationButton;

	public WebElement getregistrationButton() {
		return registrationButton;
	}

	@FindBy(xpath = "//input[@name='username']")
	WebElement loginuserName;

	public WebElement getloginuserName() {
		return loginuserName;
	}

	@FindBy(xpath = "//input [@type = 'password']")
	WebElement loginpassword;

	public WebElement getloginpassword() {
		return loginpassword;
	}

	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginBtn;

	public WebElement getloginBtn() {
		return loginBtn;
	}

	// @FindBy (xpath="//p[@class='caption']")

	@FindBy(xpath = "/html/head/title")
	WebElement parabankTitle;

	public WebElement getparabankTitle() {
		return parabankTitle;
	}

	@FindBy(xpath = "//ul[@class='leftmenu']")
	WebElement leftMenu;

	public WebElement getleftMenu() {
		return leftMenu;
	}

	@FindBy(linkText = "Open New Account")
	WebElement openNewAccount;

	public WebElement getopenNewAccount() {
		return openNewAccount;
	}

	@FindBy(xpath = "//*[@id=\"type\"]")
	WebElement typeOfAccount;

	public WebElement gettypeOfAccount() {
		return typeOfAccount;
	}

	@FindBy(id = "fromAccountId")
	WebElement fromAccountId;

	public WebElement getfromAccountId() {
		return fromAccountId;
	}

	@FindBy(xpath = "//input[@value= 'Open New Account']")
	WebElement openNewAccountinitial;

	public WebElement getopenNewAccount1initial() {
		return openNewAccountinitial;
	}

	@FindBy(xpath = "//*[@id=\"newAccountId\"]")
	WebElement newAccountID;

	public WebElement getnewAccountID() {
		return newAccountID;
	}

	@FindBy(id = "month")
	WebElement month;

	public WebElement getmonth() {
		return month;
	}

	@FindBy(id = "transactionType")
	WebElement transactionType;

	public WebElement gettransactionType() {
		return transactionType;
	}

	@FindBy(xpath = "//input[@value='Go']")
	WebElement Go;

	public WebElement getGo() {
		return Go;
	}

	@FindBy(xpath = "//h1[@class='title']")
	WebElement regFormTitle;

	public WebElement getregFormTitle() {
		return regFormTitle;
	}

	@FindBy(xpath = "//*[@id=\"rightPanel\"]/p")
	WebElement regSuccessMessage;

	public WebElement getregSuccessMessage() {
		return regSuccessMessage;
	}

	@FindBy(xpath = "//*[@id=\"rightPanel\"]/h1")
	WebElement welcomeMsg;

	public WebElement getwelcomeMag() {
		return welcomeMsg;
	}

	@FindBy(linkText = "Accounts Overview")
	WebElement accountOverviewlink;

	public WebElement getaccountOverviewlink() {
		return accountOverviewlink;
	}

	@FindBy(xpath = "//*[@id=\"rightPanel\"]/div/div/h1")
	WebElement accOverviewTitle;

	public WebElement getaccOverviewTitle() {
		return accOverviewTitle;
	}

	//@FindBy(xpath = "//*[@id=\"accountTable\"]/tbody/tr[1]/td[2]")
	@FindBy(xpath = "//*[@id=\"accountTable\"]/tbody/tr[1]/td[2]")
	WebElement balance;

	public WebElement getbalance() {
		return balance;
	}

	@FindBy(xpath = "//*[@id=\"accountTable\"]/tbody/tr[1]/td[3]")
	WebElement availableAmount;

	public WebElement getavailableAmount() {
		return availableAmount;
	}

	@FindBy(linkText = "Transfer Funds")
	WebElement transferFundsLink;

	public WebElement gettransferFundsLink() {
		return transferFundsLink;
	}

	@FindBy(xpath = "//*[@id=\"rightPanel\"]/div/div/h1")
	WebElement transferFundsTitle;

	public WebElement gettransferFundsTitle() {
		return transferFundsTitle;
	}

	@FindBy(xpath = "//*[@id=\"amount\"]")
	WebElement amount;

	public WebElement getamount() {
		return amount;
	}

	@FindBy(xpath = "//select[@id='fromAccountId\']")
	WebElement fromAccountId1;

	public WebElement getfromAccountId1() {
		return fromAccountId1;
	}
	@FindBy(xpath = "//select[@id='toAccountId\']")
	WebElement toAccountId1;

	public WebElement gettoAccountId1() {
		return toAccountId1;
	}
	@FindBy(xpath = "//input[@value ='Transfer']")
	WebElement transferAmountBtn;
	public WebElement gettransferAmount() {
		return transferAmountBtn;
	}
	@FindBy(xpath = "//*[@id=\"rightPanel\"]/div/div/h1")
	WebElement transferCompleteMsgTitle;
	public WebElement gettransferCompleteMsgTitle() {
		return transferCompleteMsgTitle;
	}
	@FindBy(xpath = "//*[@id=\"rightPanel\"]/div/div/p[1]")
	WebElement transferedAmountDisplay;
	public WebElement gettransferedAmountDisplay() {
		return transferedAmountDisplay;
	}
	@FindBy(xpath = "//*[@id=\"amount\"]")
	WebElement verifyAmount;
	public WebElement getverifyAmount() {
		return verifyAmount;
	}
	@FindBy(linkText = "Find Transactions")
	WebElement findTransactionslink;
	public WebElement getfindTransactionslink() {
		return findTransactionslink;
	}
	@FindBy(xpath = "//*[@id=\"rightPanel\"]/div/div/h1")
	WebElement findTransactionTitle;
	public WebElement getfindTransactionTitle() {
		return findTransactionTitle;
	}
	@FindBy(id = "criteria.amount")
	WebElement findByAmount;
	public WebElement getfindByAmount() {
		return findByAmount;
	}
	@FindBy(xpath = "//*[@id=\"rightPanel\"]/div/div/form/div[9]/button")
	WebElement findTransactionsBtn;
	public WebElement getfindTransactionsBtn() {
		return findTransactionsBtn;
	}
	@FindBy(xpath = "//*[@id=\"rightPanel\"]/div/div/h1")
	WebElement transactionResultsTitle;
	public WebElement gettransactionResultsTitle() {
		return transactionResultsTitle;
	}
	//@FindBy(xpath = "//*[@id=\"transactionTable\"]/thead/tr/th[3]")
	@FindBy(xpath = "//*[@id=\"transactionTable\"]/tbody/tr[1]/td[3]/span")
	WebElement debitAmount;
	public WebElement getdebitAmount() {
		return debitAmount;
	}
	@FindBy(xpath = "xpath = \"//*[@id=\\\"transactionTable\\\"]/tbody/tr[2]/td[4]/span\"" )
	WebElement creditAmount;
	public WebElement getcreditAmount() {
		return creditAmount;
	}
}
