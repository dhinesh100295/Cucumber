Feature: User has to Book the hotel Room
Scenario: User has to login the webPage
Given user is in login page
When user has to enter the correct login credential for login
Then click login button

Scenario: User has to select the Hotel Requirements
Given user is in Search hotel page
When user has to select the hotel location
and user has to select the hotel name
and user has to select the room type
and user has to select the number of rooms
and user has to select the check in date
and user has to select the check out date
and user has to select the adult per room
and user has to select the child per room
Then user has to click search button

Scenario: User has to confirm the selected hotel Requirement
Given user is in Select hotel page
when user has to click on select button
Then user has to click continue button

Scenario: User has to fill the personal & Payment details
Given user is in book a hotel page
When user has to enter the first name
And user has to enter the last name
And user has to enter the billing address
And user has to enter the credit card number
And user has to select the credit card type
And user has to select the expiry month
And user has to select the expiry year
And user has to enter the cvv number
Then user has to click book now button

Scenario: User has to check book conformation
Given user in Booking conformation page
And user has to take the screenshot
When user has to click my ltinerary 
And user has to select the booking check box
And user has to click cancel selected
And user has to click logout








