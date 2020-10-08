Feature: Create step definitions to open the Google homepage in a browser, search for ‘Accolite’ and do an assertion on the number of links returned on the results page

Scenario: Assignment3
Given  Open the browser
When   User is navigating google homepage in a browser 
And    User will search for ‘Accolite’ text
Then   User will count the number of links ‘Accolite’ returned on the results page
Then   Close the browser
