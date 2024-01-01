Feature: Adding employee details by using orangehrm application

Scenario: Login Functionality
Given User launch the url
When User enter the username in username field
And User enter the password in password field
Then User click the login button and it navigate to Dashboard page

Scenario: Adding employee personal details in My Info tab functionality
When User enter the Firstname in firstname field
And User enter the middlename in middlename field
And User enter the lastname in lastname field
And User enter the nickname in nickname field
And User enter the id in employeeid field
And User enter the other id in other id field
And User enter the license no in Driver's License no field
And User select the expiry date of license expiry date
And User enter the SSN no in SSN Number field
And User enter the SIN no in SIN number field
And User select the nationality in nationality dropdown
And User select the status in Marital Status field
And User select the DOB in Date of Birth field
And User click the gender in gender checkbox
And User enter the Service in Military service field
And User click the radiobutton in smoker field  
And User click the save button.
And User select the bloodgroup in BloodType field
Then User click the save button and it show the Successfully Updated message

Scenario: Adding employee contact details in My Info tab functionality
When User click the contact detail tab and we have to fill the details
And User enter the halfstreet address in street1 field
And User enter the street address in street2 field
And User enter the city in city field
And User enter the state in State/Province field
And User enter the zipcode in Zip/Postal Code field
And User select the country in Country field
And User enter the home phone no in Home field
And User enter the mobile no in Mobile field
And User enter the work phoneno in Work field
And User enter the work mail in WorkEmail field
And User enter the extra mail in OtherEmail field
Then User click the save button and it show the Successfully Updated message

Scenario: Adding employee emergency details in My Info tab functionality
When User click the emergency detail tab and we have to fill the details
And User click the add in Assigned Emergency Contacts field
And User enter the name in Name field
And User enter the relationship of the name in relationship field
And User enter the phone no in Home Telephone field
And User enter the emergency details tab mobile no in Mobile field
And User enter the work phoneno in Work Telephone field
And User click the emergency details Save button and it show the Successfully Updated message
