Feature: Count all the links on the application


@smoke
Scenario: verify the total number of links 
Given User is on Home page 
Then Count all the links on the application

@sanity
Scenario:clicking on cart button
Given User is on Home page 
When Click on Cart button
Then verify the page title
