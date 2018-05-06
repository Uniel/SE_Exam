Feature: Delete Workers
	Description: The user removes workers from an activity
	Actors: User

Scenario: User deletes a worker
    Given I have the worker "DANK"
    And I add the worker "DANK"
	When I delete the worker "DANK"
	Then the worker "DANK" does not exist
	
Scenario: User deletes a worker which does not exist
    Given I have the worker "DANK"
	And the worker "DANK" does not exist
	When I delete the worker "DANK"
	Then I get the error message "This worker does not exist"
	
Scenario: User deletes a worker who is assigned to an activity
    Given I have the worker "DANK"
	And I add the worker "DANK"
	And the project with ID 180000 has been created
	And the activity "Kick ass and chew bubblegum" has already been added to the project with ID 180000
	And I set the start of the activity "Kick ass and chew bubblegum" in the project with ID 180000 to week 5 of 2020
	And I set the end of the activity "Kick ass and chew bubblegum" in the project with ID 180000 to week 7 of 2020
	And I assign the worker "DANK" to the activity "Kick ass and chew bubblegum" in the project with ID 180000
	When I delete the worker "DANK"
	Then the worker "DANK" does not exist
	And the worker "DANK" is not assigned to the activity "Kick ass and chew bubblegum" in the project with ID 180000