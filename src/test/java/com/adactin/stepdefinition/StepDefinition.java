package com.adactin.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.BookAHotel;
import com.adactin.pom.HomePage;
import com.adactin.pom.LogoutPage;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;
import com.adactin.runner.TestRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {

	public static WebDriver driver = TestRunner.driver;
	PageObjectManager pom = new PageObjectManager(driver);

	@Given("^User Launch the adactin application$")
	public void user_Launch_the_adactin_application() throws Throwable {
		System.out.println("\t Launch the adactin application");
	}

	@When("^User log into the application$")
	public void user_log_into_the_application() throws Throwable {
		System.out.println("\t log into the application");
	}

	@Given("^User launch the application$")
	public void user_launch_the_application() throws Throwable {
		// driver = getBrowser("chrome");
		// getUrl("http://adactinhotelapp.com/");
		String url = FileReaderManager.getInstance().getCrInstance().getUrl();
		getUrl(url);
	}

	/*
	 * @When("^User enters the Valid username in Username field$") public void
	 * user_enters_the_Valid_username_in_Username_field() throws Throwable {
	 * 
	 * // HomePage hp = new HomePage(driver);
	 * inputValuestoElement(pom.getHp().getUsername(), "RashmiAishwarya"); }
	 * 
	 * @When("^User enters the Valid password in Password field$") public void
	 * user_enters_the_Valid_password_in_Password_field() throws Throwable {
	 * 
	 * // HomePage hp = new HomePage(driver);
	 * inputValuestoElement(pom.getHp().getPassword(), "Rashmi@1992");
	 * 
	 * }
	 */

	@When("^User enters the Valid \"([^\"]*)\" in Username field$")
	public void user_enters_the_Valid_in_Username_field(String username) throws Throwable {
		inputValuestoElement(pom.getHp().getUsername(), username);
	}

	@When("^User enters the Valid \"([^\"]*)\" in Password field$")
	public void user_enters_the_Valid_in_Password_field(String password) throws Throwable {
		inputValuestoElement(pom.getHp().getPassword(), password);
	}

	@When("^User clicks on the Login Button$")
	public void user_clicks_on_the_Login_Button() throws Throwable {

		// HomePage hp = new HomePage(driver);
		clickonElement(pom.getHp().getLogin());
	}

	@Then("^User verify the Homepage navigates to the Search Hotel Page$")
	public void user_verify_the_Homepage_navigates_to_the_Search_Hotel_Page() throws Throwable {
		Assert.assertEquals("RashmiAishwarya", "RashmiAishwarya");
	}

	/*
	 * @When("^User selects the Location from a dropdown list$") public void
	 * user_selects_the_Location_from_a_dropdown_list() throws Throwable {
	 * 
	 * // SearchHotel sh = new SearchHotel(driver);
	 * selectDropDown(pom.getSh().getLocation(), "Sydney", "visibletext");
	 * 
	 * }
	 * 
	 * @When("^User selects the Hotel from a dropdown list$") public void
	 * user_selects_the_Hotel_from_a_dropdown_list() throws Throwable { //
	 * SearchHotel sh = new SearchHotel(driver);
	 * selectDropDown(pom.getSh().getHotels(), "Hotel Hervey", "visibletext");
	 * 
	 * }
	 * 
	 * @When("^User selects the Roomtype from a dropdown list$") public void
	 * user_selects_the_Roomtype_from_a_dropdown_list() throws Throwable { //
	 * SearchHotel sh = new SearchHotel(driver);
	 * selectDropDown(pom.getSh().getRoom_type(), "Deluxe", "visibletext");
	 * 
	 * }
	 * 
	 * @When("^User selects Number of fields from a dropdown list$") public void
	 * user_selects_Number_of_fields_from_a_dropdown_list() throws Throwable {
	 * 
	 * // SearchHotel sh = new SearchHotel(driver);
	 * selectDropDown(pom.getSh().getRoom_nos(), "3 - Three", "visibletext");
	 * 
	 * }
	 * 
	 * @When("^User enters the valid date in Check In Date field$") public void
	 * user_enters_the_valid_date_in_Check_In_Date_field() throws Throwable {
	 * 
	 * // SearchHotel sh = new SearchHotel(driver);
	 * inputValuestoElement(pom.getSh().getDatepick_in(), "11/08/2020");
	 * 
	 * }
	 * 
	 * @When("^User enters the valid date in Check Out Date field$") public void
	 * user_enters_the_valid_date_in_Check_Out_Date_field() throws Throwable {
	 * 
	 * // SearchHotel sh = new SearchHotel(driver);
	 * inputValuestoElement(pom.getSh().getDatepick_out(), "13/08/2020");
	 * 
	 * }
	 * 
	 * @When("^User selects Adults per Room from a dropdown list$") public void
	 * user_selects_Adults_per_Room_from_a_dropdown_list() throws Throwable { //
	 * SearchHotel sh = new SearchHotel(driver);
	 * selectDropDown(pom.getSh().getAdult_room(), "2 - Two", "visibletext");
	 * 
	 * }
	 * 
	 * @When("^User selects Child per Room from a dropdown list$") public void
	 * user_selects_Child_per_Room_from_a_dropdown_list() throws Throwable { //
	 * SearchHotel sh = new SearchHotel(driver);
	 * selectDropDown(pom.getSh().getChild_room(), "4 - Four", "visibletext");
	 * 
	 * }
	 */

	@When("^User selects the Location \"([^\"]*)\"  as \"([^\"]*)\" in the Select location field$")
	public void user_selects_the_Location_as_in_the_Select_location_field(String location, String option)
			throws Throwable {
		selectDropDown(pom.getSh().getLocation(), location, option);
	}

	@When("^User selects the Hotel \"([^\"]*)\" as \"([^\"]*)\" in the Select Hotel field$")
	public void user_selects_the_Hotel_as_in_the_Select_Hotel_field(String hotel, String option) throws Throwable {
		selectDropDown(pom.getSh().getHotels(), hotel, option);
	}

	@When("^User selects the Roomtype \"([^\"]*)\" as \"([^\"]*)\" in the Select Room type field$")
	public void user_selects_the_Roomtype_as_in_the_Select_Room_type_field(String roomtype, String option)
			throws Throwable {
		selectDropDown(pom.getSh().getRoom_type(), roomtype, option);
	}

	@When("^User selects Number of rooms \"([^\"]*)\" as \"([^\"]*)\"$")
	public void user_selects_Number_of_rooms_as(String no_of_rooms, String option) throws Throwable {
		selectDropDown(pom.getSh().getRoom_nos(), no_of_rooms, option);
	}

	@When("^User enters the valid date \"([^\"]*)\" in Check In Date field$")
	public void user_enters_the_valid_date_in_Check_In_Date_field(String Indate) throws Throwable {
		inputValuestoElement(pom.getSh().getDatepick_in(), Indate);
	}

	@When("^User enters the valid date \"([^\"]*)\" in Check Out Date field$")
	public void user_enters_the_valid_date_in_Check_Out_Date_field(String Outdate) throws Throwable {
		inputValuestoElement(pom.getSh().getDatepick_out(), Outdate);
	}

	@When("^User selects Adults per Room \"([^\"]*)\" as \"([^\"]*)\"$")
	public void user_selects_Adults_per_Room_as(String adultsperroom, String option) throws Throwable {
		selectDropDown(pom.getSh().getAdult_room(), adultsperroom, option);
	}

	@When("^User selects Child per Room \"([^\"]*)\" as \"([^\"]*)\"$")
	public void user_selects_Child_per_Room_as(String childperroom, String option) throws Throwable {
		selectDropDown(pom.getSh().getChild_room(), childperroom, option);
	}

	@When("^User clicks on the Search Button to search for the details$")
	public void user_clicks_on_the_Search_Button_to_search_for_the_details() throws Throwable {
		clickonElement(pom.getSh().getSubmit());
	}

	/*
	 * @When("^User clicks on the Search Button$") public void
	 * user_clicks_on_the_Search_Button() throws Throwable { // SearchHotel sh = new
	 * SearchHotel(driver); clickonElement(pom.getSh().getSubmit()); }
	 */

	@Then("^User verify the Search Hotel page navigates to the Select Hotel page$")
	public void user_verify_the_Search_Hotel_page_navigates_to_the_Select_Hotel_page() throws Throwable {
		Assert.assertEquals("Sydney", "Sydney");
	}

	@When("^User selects the hotel from Select Hotel Page$")
	public void user_selects_the_hotel_from_Select_Hotel_Page() throws Throwable {

		// SelectHotel seh = new SelectHotel(driver);
		SelectRadioButton(pom.getSeh().getRadiobutton());

	}

	@When("^User clicks on the Continue Button$")
	public void user_clicks_on_the_Continue_Button() throws Throwable {

		// SelectHotel seh = new SelectHotel(driver);
		SelectRadioButton(pom.getSeh().getSubmit());

	}

	@Then("^User verify the Select Hotel page navigates to the Book A Hotel page$")
	public void user_verify_the_Select_Hotel_page_navigates_to_the_Book_A_Hotel_page() throws Throwable {
		Assert.assertEquals("Hotel Hervey", "Hotel Hervey");

	}

	/*
	 * @When("^User enters the Valid firstname in First Name field$") public void
	 * user_enters_the_Valid_firstname_in_First_Name_field() throws Throwable { //
	 * BookAHotel bh = new BookAHotel(driver);
	 * inputValuestoElement(pom.getBh().getFirstname(), "Rashmi"); }
	 * 
	 * @When("^User enters the Valid lastname in Last Name field$") public void
	 * user_enters_the_Valid_lastname_in_Last_Name_field() throws Throwable {
	 * 
	 * // BookAHotel bh = new BookAHotel(driver);
	 * inputValuestoElement(pom.getBh().getLastname(), "G");
	 * 
	 * }
	 * 
	 * @When("^User enters the Valid billing address in Billing Address field$")
	 * public void user_enters_the_Valid_billing_address_in_Billing_Address_field()
	 * throws Throwable {
	 * 
	 * // BookAHotel bh = new BookAHotel(driver);
	 * inputValuestoElement(pom.getBh().getAddress(), "abc nagar");
	 * 
	 * }
	 * 
	 * @When("^User enters the Valid Credit card number in Credit Card No\\. field$"
	 * ) public void
	 * user_enters_the_Valid_Credit_card_number_in_Credit_Card_No_field() throws
	 * Throwable {
	 * 
	 * // BookAHotel bh = new BookAHotel(driver);
	 * inputValuestoElement(pom.getBh().getCredit_card_no(), "1234567812345678");
	 * 
	 * }
	 * 
	 * @When("^User selects the Credit Card Type from a dropdown list$") public void
	 * user_selects_the_Credit_Card_Type_from_a_dropdown_list() throws Throwable {
	 * 
	 * // BookAHotel bh = new BookAHotel(driver);
	 * selectDropDown(pom.getBh().getCredit_card_type(), "American Express",
	 * "visibletext");
	 * 
	 * }
	 * 
	 * @When("^User selects the Expiry Month from a dropdown list$") public void
	 * user_selects_the_Expiry_Month_from_a_dropdown_list() throws Throwable {
	 * 
	 * // BookAHotel bh = new BookAHotel(driver);
	 * selectDropDown(pom.getBh().getExpiry_month(), "4", "value");
	 * 
	 * }
	 * 
	 * @When("^User selects the Expiry Year from a dropdown list$") public void
	 * user_selects_the_Expiry_Year_from_a_dropdown_list() throws Throwable {
	 * 
	 * // BookAHotel bh = new BookAHotel(driver);
	 * selectDropDown(pom.getBh().getExpiry_year(), "2014", "value");
	 * 
	 * }
	 * 
	 * @When("^User enters the Valid CVV number in CVV Number field$") public void
	 * user_enters_the_Valid_CVV_number_in_CVV_Number_field() throws Throwable {
	 * 
	 * // BookAHotel bh = new BookAHotel(driver);
	 * inputValuestoElement(pom.getBh().getCvv_number(), "123");
	 * 
	 * }
	 */

	@When("^User enters the Valid \"([^\"]*)\" in First Name field$")
	public void user_enters_the_Valid_in_First_Name_field(String firstname) throws Throwable {
		inputValuestoElement(pom.getBh().getFirstname(), firstname);
	}

	@When("^User enters the Valid \"([^\"]*)\" in Last Name field$")
	public void user_enters_the_Valid_in_Last_Name_field(String lastname) throws Throwable {
		inputValuestoElement(pom.getBh().getLastname(), lastname);
	}

	@When("^User enters the Valid \"([^\"]*)\" in Billing Address field$")
	public void user_enters_the_Valid_in_Billing_Address_field(String BillingAddress ) throws Throwable {
		inputValuestoElement(pom.getBh().getAddress(), BillingAddress);
	}

	@When("^User enters the Valid \"([^\"]*)\" in Credit Card No\\. field$")
	public void user_enters_the_Valid_in_Credit_Card_No_field(String creditcardno) throws Throwable {
		inputValuestoElement(pom.getBh().getCredit_card_no(), creditcardno);
	}

	@When("^User selects the Credit Card Type \"([^\"]*)\" as \"([^\"]*)\" in the Credit card type field$")
	public void user_selects_the_Credit_Card_Type_as_in_the_Credit_card_type_field(String creditcardtype, String option)
			throws Throwable {
		selectDropDown(pom.getBh().getCredit_card_type(), creditcardtype, option);
	}

	@When("^User selects the Expiry Month \"([^\"]*)\" as \"([^\"]*)\"$")
	public void user_selects_the_Expiry_Month_as(String month, String option) throws Throwable {
		selectDropDown(pom.getBh().getExpiry_month(), month, option);
	}

	@When("^User selects the Expiry Year \"([^\"]*)\" as \"([^\"]*)\"$")
	public void user_selects_the_Expiry_Year_as(String year, String option) throws Throwable {
		selectDropDown(pom.getBh().getExpiry_year(), year, option);
	}

	@When("^User enters the Valid \"([^\"]*)\" in CVV Number field$")
	public void user_enters_the_Valid_in_CVV_Number_field(String cvvnumber) throws Throwable {
		inputValuestoElement(pom.getBh().getCvv_number(), cvvnumber);
	}

	@When("^User clicks on the Book Now Button$")
	public void user_clicks_on_the_Book_Now_Button() throws Throwable {

		// BookAHotel bh = new BookAHotel(driver);
		clickonElement(pom.getBh().getBook_now());

	}

	@Then("^User verify the Book A Hotel page navigates to the Booking Confirmation page$")
	public void user_verify_the_Book_A_Hotel_page_navigates_to_the_Booking_Confirmation_page() throws Throwable {
		Assert.assertEquals("Hotel Hervey", "Hotel Hervey");

	}

	@When("^User clicks on Logout Button in the Booking Confirmation page$")
	public void user_clicks_on_Logout_Button_in_the_Booking_Confirmation_page() throws Throwable {

		// LogoutPage lp = new LogoutPage(driver);
		clickonElement(pom.getLp().getLogout());

	}

	@Then("^User verify the Booking Confirmation page navigates to the Home page again$")
	public void user_verify_the_Booking_Confirmation_page_navigates_to_the_Home_page_again() throws Throwable {
		Assert.assertEquals("Rashmi", "Rashmi");

	}

}
