package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotel {

	public static WebDriver driver;

	public BookAHotel(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "first_name")
	private WebElement firstname;

	@FindBy(id = "last_name")
	private WebElement lastname;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "cc_num")
	private WebElement credit_card_no;

	@FindBy(id = "cc_type")
	private WebElement credit_card_type;

	@FindBy(id = "cc_exp_month")
	private WebElement expiry_month;

	@FindBy(id = "cc_exp_year")
	private WebElement expiry_year;

	@FindBy(id = "cc_cvv")
	private WebElement cvv_number;

	@FindBy(xpath = "//input[@type='button']")
	private WebElement book_now;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCredit_card_no() {
		return credit_card_no;
	}

	public WebElement getCredit_card_type() {
		return credit_card_type;
	}

	public WebElement getExpiry_month() {
		return expiry_month;
	}

	public WebElement getExpiry_year() {
		return expiry_year;
	}

	public WebElement getCvv_number() {
		return cvv_number;
	}

	public WebElement getBook_now() {
		return book_now;
	}

}
