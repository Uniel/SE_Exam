Feature: Delete Workers
	Description: The user removes workers from an activity
	Actors: User

Scenario: User deletes a worker
    Given I have the worker "DANK"
	When I delete the worker "DANK"
	Then the worker "DANK" does not exist
	
Scenario: User delete a worker which does not exist
    Given I have the worker "DANK"
	And the worker "DANK" does not exist
	When I delete the worker "DANK"
	Then I get the error message "This worker does not exist"