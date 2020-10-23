Feature: Checking the Login Functionality

Scenario Outline: Test the Login with Positive Credentials 
#Given open the chrome browser 
#And load the application Url
Given enter the username as <username>
And enter the password as <password> 
When Click on Login Button
Then homepage will appear
Examples:
|username||password|
|demosalesmanager||crmsfa|
|demoCSR||crmsfa|

