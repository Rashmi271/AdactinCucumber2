Feature: Testing of Booking functionality in Adactin Application 

Background: 
	Given User Launch the adactin application 
	When User log into the application 
	
@SmokeTest
Scenario Outline: : Verify the User is able to login the application 
	Given User launch the application 
	When User enters the Valid "<username>" in Username field 
	And User enters the Valid "<password>" in Password field 
	And User clicks on the Login Button 
	Then User verify the Homepage navigates to the Search Hotel Page 
	
Examples:
|username|password|
|AAAA|1111|
|BBBB|2222|
|RashmiAishwarya|Rashmi@1992|
	
	
@RegressionTest
Scenario: Verify the User is in Search Hotel page 
	When User selects the Location "Sydney"  as "visibletext" in the Select location field 
	And User selects the Hotel "Hotel Hervey" as "visibletext" in the Select Hotel field 
	And User selects the Roomtype "Deluxe" as "visibletext" in the Select Room type field 
	And User selects Number of rooms "3 - Three" as "visibletext" 
	And User enters the valid date "11/08/2020" in Check In Date field 
	And User enters the valid date "13/08/2020" in Check Out Date field 
	And User selects Adults per Room "2 - Two" as "visibletext" 
	And User selects Child per Room "4 - Four" as "visibletext" 
	And User clicks on the Search Button to search for the details 
	Then User verify the Search Hotel page navigates to the Select Hotel page 
	
 
Scenario: Verify the User is in Select Hotel Page 
	When User selects the hotel from Select Hotel Page 
	And User clicks on the Continue Button 
	Then User verify the Select Hotel page navigates to the Book A Hotel page 
	

Scenario: Verify the User is in Book A Hotel page 
	When User enters the Valid "Rashmi" in First Name field 
	And User enters the Valid "G" in Last Name field 
	And User enters the Valid "abc nagar" in Billing Address field 
	And User enters the Valid "1234567812345678" in Credit Card No. field 
	And User selects the Credit Card Type "American Express" as "visibletext" in the Credit card type field 
	And User selects the Expiry Month "4" as "value" 
	And User selects the Expiry Year "2014" as "value" 
	And User enters the Valid "123" in CVV Number field 
	And User clicks on the Book Now Button 
	Then User verify the Book A Hotel page navigates to the Booking Confirmation page 
	
 
Scenario: Verify the User is able to logout the application 
	When User clicks on Logout Button in the Booking Confirmation page 
	Then User verify the Booking Confirmation page navigates to the Home page again