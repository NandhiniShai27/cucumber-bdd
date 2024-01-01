Feature: Booking hotel using adactin application

Scenario: Login Functionality
Given launch the url
When User enter the username in user field
And User enter the password in password field
Then User click the login button and it navigate to search page

Scenario: Search the hotels functionality
When User select the location in location field
And User select the Hotels in hotel field
And User select the required room type in room type field
And User select the number of rooms in number of rooms field
And User enter the Checkin date in checkin date field
And User enter the checkout date in checkout date field
And User select the number of adult room in adult per room field
And User select the number of children per room in children per room field
Then User click the search button and it navigate to select hotel page

Scenario: Select the hotel functionality
When User click the radiobutton in select field
Then User click the continue button and it navigate to Book A Hotel Page

Scenario: Book Hotel functionality
When User enter the firstname in firstname field
And User enter the lastname in lastname field
And User enter the Address in Billing Address field.
And User enter the credit card no in credit card no field
And User select the card type in Credit Card Type filed
And User select the month in Expiry Date Month field
And User select the year in Expiry Date Year Field
And User enter the CVV no in  CVV Field
Then User click the Booknow button and it navigate to booking confirmation page

Scenario: Booking confirmation functionality
Then User click the My Itinerary button and it navigate to  Booked Itinerary page

Scenario: Booked Itinerary functionality
When User click the checkbox in checkbox field
And User click the Cancel Selected button it switch to alert
And User click the OK button to close the alert
Then User click the logout button and it navigate to Homepage of addactin hotelapp 
