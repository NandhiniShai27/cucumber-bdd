Feature: Booking hotel using adactin application

Scenario Outline: Login Functionality

Given launch the url

When User enter the "<username>" in user field

And User enter the "<password>" in password field

Then User click the login button and it navigate to search page

Examples:

       
       |   username        |    password    |
       |  Nandhini         |   Shai@87890   | 
       |  Manikandan       |   Nandhini@27  |
       |NandhiniManikandan |   jason@7899   |
       |NandhiniManikandan |   Nandhini@27  |