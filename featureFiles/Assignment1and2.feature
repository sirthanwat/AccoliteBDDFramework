Feature: Create an automation test framework that checks the number of links returned on the search results page, when a simple Google search is performed using the keyword ‘Accolite’

Scenario: Assignment1
Given  Open the browser
When   User is navigating google homepage in a browser 
And    User will search for ‘Accolite’ text
Then   User will return the number of links ‘Accolite’ returned on the results page
Then   Close the browser
