Feature: Verifying the Alert popup
@smoke
Scenario: Handling the ALert
When Alert is  dispayed 
Then Handle the popup

@sanity
Scenario: Verifying the color
Then Verify the font size and color of the text

@table
Scenario: Fetching the cricket table values 
Then  Fetch the table rows and cloumns