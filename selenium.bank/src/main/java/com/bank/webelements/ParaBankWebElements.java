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

	@FindBy(name = "username")
	WebElement loginusername;

	public WebElement getloginusername() {
		return loginusername;
	}

	@FindBy(name = "password")
	WebElement loginPassword;

	public WebElement getloginPassword() {
		return loginPassword;
	}

	@FindBy(xpath = "//input[@type = 'submit']")
	WebElement login;

	public WebElement getlogin() {
		return login;
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

	@FindBy(xpath = "//input[@value='Open New Account']")
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
}
