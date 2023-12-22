Feature: Application login

@RegTest
Scenario: Login to application by providing inputs
Given User is on netbanking landing page
When User log in to application by providing "jin" and "1234"
Then User is able to login to home page and its populated correctly
And Cards displayed are "true"
