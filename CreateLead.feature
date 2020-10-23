Feature: Checking the CreateLead Functionality of LeafTap application

#Background:
#Given open the browser
#And load the application url

Scenario Outline: create Lead only Mandatory field
Given Click on CreateLink 
And enter the company name as TestLeaf
And enter the Forename as <Forename>
And enter the sureName as <sureName> 
And select the Source as Employee
And select the Marketing Campaign as CATRQ_CAMPAIGNS
And select the Industry as Telecommunications
And select the Ownership as Corporation
And select the Country as India
Then click on Submit button for CreateLead

Examples:
|Forename||sureName|
|Avin||Praveen|