Feature: Remove Workers
	Description: The user removes workers from an activity
	Actors: User

Scenario: User removes worker from an activity
    Given I have the project with ID 180420
    And the project with ID 180420 exists
    And the activity "Smoke Weed" has already been added to the project with ID 180420
	And I set the start of the activity "Smoke Weed" in the project with ID 180420 to week 5 of 2020
	And I set the end of the activity "Smoke Weed" in the project with ID 180420 to week 7 of 2020
	And I have the worker "BOBM"
	And I add the worker "BOBM"
	And I assign the worker "BOBM" to the activity "Smoke Weed" in the project with ID 180420
	When I remove the worker "BOBM" from the activity "Smoke Weed" in the project with ID 180420
	Then the worker "BOBM" is not assigned to the activity "Smoke Weed" in the project with ID 180420
	
Scenario: User removes worker from an activity which does not exist
	Given I have the project with ID 180420
	And the project with ID 180420 exists
	And I have the worker "BOBM"
	And I add the worker "BOBM"
	When I remove the worker "BOBM" from the activity "Smoke Weed" in the project with ID 180420
	Then I get the error message "This activity does not exist in that project"
    
Scenario: User removes worker from an activity in a project which does not exist
	Given the project with ID 180420 does not exist
	And I have the worker "BOBM"
	And I add the worker "BOBM"
	When I remove the worker "BOBM" from the activity "Smoke Weed" in the project with ID 180420
	Then I get the error message "A project with that ID does not exist"
    
Scenario: User removes non-existing worker from an activity
   	Given I have the project with ID 180420
	And the project with ID 180420 exists
	And the activity "Smoke Weed" has already been added to the project with ID 180420
	And I have the worker "BOBM"
	And the worker "BOBM" does not exist
	When I remove the worker "BOBM" from the activity "Smoke Weed" in the project with ID 180420
	Then I get the error message "This worker does not exist"
    
Scenario: User removes worker from an activity which the worker is not assigned to
   	Given I have the project with ID 180420
   	And the project with ID 180420 exists
	And the activity "Smoke Weed" has already been added to the project with ID 180420
	And I have the worker "BOBM"
	And I add the worker "BOBM"
	And the worker "BOBM" is not assigned to the activity "Smoke Weed" in the project with ID 180420
	When I remove the worker "BOBM" from the activity "Smoke Weed" in the project with ID 180420
	Then I get the error message "This worker is not assigned to that activity"