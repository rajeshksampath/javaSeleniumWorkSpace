Feature: Application login

/*Background: For Application login
Given Broweser should be available in desktop
When Click on Browser
Then Brower is opened*/

@RegTest
Scenario: Login to application by providing inputs
Given User is on netbanking landing page
When User log in to application by providing "jin" and "1234"
Then User is able to login to home page and its populated correctly
And Cards displayed are "true"

@SmokeTest
Scenario: Login to application by providing inputs
Given User is on netbanking landing page
When User log in to application by providing "bin" and "4567"
Then User is able to login to home page and its populated correctly
And Cards displayed are "false"

@RegTest
Scenario: Login to application by providing inputs
Given User is on netbanking landing page
When User sign up with following details
| Rajesh | abcd | rajesh.abcd@abcd.com | Australia | 123456 |
Then User is able to login to home page and its populated correctly
And Cards displayed are "false"

@MobileTest
Scenario Outline: Login to application by providing inputs
Given User is on netbanking landing page
When User log in to application with <Username> and <Password>
Then User is able to login to home page and its populated correctly
And Cards displayed are "false"

Examples:
|Username|Password|
|user1   |pass1   |
|User2   |pass2   |
|Usre3   |pass3   |
|user4   |pass4   |
