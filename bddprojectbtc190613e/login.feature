Feature:login validation
Background:
Given open browser
|firefox|
|chrome|
And navigate to the facebook.com

@Smoke
Scenario: as a user I should be able to login using valid credential
When user type userid in email text box
And user type password in password type box
And user click in login button
Then user should be in his/her profile page

@Regression 
Scenario Outline: as a user I should not be able to login using invalid credential
When user type "<userid>" in email text box
And user type "<password>" in password type box
And user click in login button
Then user should not be in his/her profile page

Examples: 
|userid|password|
|user1|1234|
|user2|5678|
|user3|9876|


