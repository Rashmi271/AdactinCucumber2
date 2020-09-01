$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Testing of Booking functionality in Adactin Application",
  "description": "",
  "id": "testing-of-booking-functionality-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verify the User is able to login the application",
  "description": "",
  "id": "testing-of-booking-functionality-in-adactin-application;verify-the-user-is-able-to-login-the-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters the Valid username in Username field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters the Valid password in Password field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User clicks on the Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User verify the Homepage navigates to the Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launch_the_application()"
});
formatter.result({
  "duration": 6793479300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_Valid_username_in_Username_field()"
});
formatter.result({
  "duration": 755953000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_Valid_password_in_Password_field()"
});
formatter.result({
  "duration": 110572400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_the_Login_Button()"
});
formatter.result({
  "duration": 10413400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verify_the_Homepage_navigates_to_the_Search_Hotel_Page()"
});
formatter.result({
  "duration": 50700,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Verify the User is able to fill all the fields in Search Hotel page",
  "description": "",
  "id": "testing-of-booking-functionality-in-adactin-application;verify-the-user-is-able-to-fill-all-the-fields-in-search-hotel-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "User selects the Location from a dropdown list",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User selects the Hotel from a dropdown list",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User selects the Roomtype from a dropdown list",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User selects Number of fields from a dropdown list",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User enters the valid date in Check In Date field",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User enters the valid date in Check Out Date field",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User selects Adults per Room from a dropdown list",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User selects Child per Room from a dropdown list",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User clicks on the Search Button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User verify the Search Hotel page navigates to the Select Hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_selects_the_Location_from_a_dropdown_list()"
});
formatter.result({
  "duration": 12703700,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.getTagName(Unknown Source)\r\n\tat org.openqa.selenium.support.ui.Select.\u003cinit\u003e(Select.java:45)\r\n\tat com.adactin.baseclass.BaseClass.selectDropDown(BaseClass.java:86)\r\n\tat com.adactin.stepdefinition.StepDefinition.user_selects_the_Location_from_a_dropdown_list(StepDefinition.java:59)\r\n\tat ✽.When User selects the Location from a dropdown list(src/test/java/com/adactin/feature/Adactin.feature:12)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.user_selects_the_Hotel_from_a_dropdown_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_selects_the_Roomtype_from_a_dropdown_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_selects_Number_of_fields_from_a_dropdown_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_valid_date_in_Check_In_Date_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_valid_date_in_Check_Out_Date_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_selects_Adults_per_Room_from_a_dropdown_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_selects_Child_per_Room_from_a_dropdown_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_the_Search_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_verify_the_Search_Hotel_page_navigates_to_the_Select_Hotel_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 23,
  "name": "Verify the User is able to select the hotel in Select Hotel Page",
  "description": "",
  "id": "testing-of-booking-functionality-in-adactin-application;verify-the-user-is-able-to-select-the-hotel-in-select-hotel-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "User selects the hotel from Select Hotel Page",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User clicks on the Continue Button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User verify the Select Hotel page navigates to the Book A Hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_selects_the_hotel_from_Select_Hotel_Page()"
});
formatter.result({
  "duration": 4715100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_the_Continue_Button()"
});
formatter.result({
  "duration": 14624900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verify_the_Select_Hotel_page_navigates_to_the_Book_A_Hotel_page()"
});
formatter.result({
  "duration": 58400,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Verify the User is able to fill all the fields in Book A Hotel page",
  "description": "",
  "id": "testing-of-booking-functionality-in-adactin-application;verify-the-user-is-able-to-fill-all-the-fields-in-book-a-hotel-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 29,
  "name": "User enters the Valid firstname in First Name field",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "User enters the Valid lastname in Last Name field",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User enters the Valid billing address in Billing Address field",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User enters the Valid Credit card number in Credit Card No. field",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User selects the Credit Card Type from a dropdown list",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User selects the Expiry Month from a dropdown list",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User selects the Expiry Year from a dropdown list",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User enters the Valid CVV number in CVV Number field",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "User clicks on the Book Now Button",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "User verify the Book A Hotel page navigates to the Booking Confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_enters_the_Valid_firstname_in_First_Name_field()"
});
formatter.result({
  "duration": 27118400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_Valid_lastname_in_Last_Name_field()"
});
formatter.result({
  "duration": 63514600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_Valid_billing_address_in_Billing_Address_field()"
});
formatter.result({
  "duration": 58719300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_Valid_Credit_card_number_in_Credit_Card_No_field()"
});
formatter.result({
  "duration": 11790000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_the_Credit_Card_Type_from_a_dropdown_list()"
});
formatter.result({
  "duration": 1526200,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.getTagName(Unknown Source)\r\n\tat org.openqa.selenium.support.ui.Select.\u003cinit\u003e(Select.java:45)\r\n\tat com.adactin.baseclass.BaseClass.selectDropDown(BaseClass.java:86)\r\n\tat com.adactin.stepdefinition.StepDefinition.user_selects_the_Credit_Card_Type_from_a_dropdown_list(StepDefinition.java:178)\r\n\tat ✽.And User selects the Credit Card Type from a dropdown list(src/test/java/com/adactin/feature/Adactin.feature:33)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.user_selects_the_Expiry_Month_from_a_dropdown_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_selects_the_Expiry_Year_from_a_dropdown_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_Valid_CVV_number_in_CVV_Number_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_the_Book_Now_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_verify_the_Book_A_Hotel_page_navigates_to_the_Booking_Confirmation_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 40,
  "name": "Verify the User is able to logout the application",
  "description": "",
  "id": "testing-of-booking-functionality-in-adactin-application;verify-the-user-is-able-to-logout-the-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 41,
  "name": "User clicks on Logout Button in the Booking Confirmation page",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "User verify the Booking Confirmation page navigates to the Home page again",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_Logout_Button_in_the_Booking_Confirmation_page()"
});
formatter.result({
  "duration": 10229800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verify_the_Booking_Confirmation_page_navigates_to_the_Home_page_again()"
});
formatter.result({
  "duration": 44100,
  "status": "passed"
});
});