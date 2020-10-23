Feature: check the Merge Lead Functionality  of Leaftaps application

Scenario Outline: check the MergeLead

When click on Merge_Lead Tap
Then click on first window icon
Given goto the windows and select the First Name as <firstname>   
When You click on Find Lead Button
And select the first cell in row
Then Click on second Window icon 
Given goto the windows and select the Second Name as <secName>  
When you click on Find_lead
Then Select the First_Cell in row
When you click on Merge Button
And click ok on Alert Box
Given click on findLead
And Enter Lead id
When click on FindLead to check

Examples:
|firstname||secName|
|gopi||babu|
 
 