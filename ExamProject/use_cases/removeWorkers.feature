Feature: Remove Workers
	Description: The user removes workers from an activity
	Actors: User

#Scenario: User removes worker from an activity
#    Given I have the project with ID 180420
#    And the project with ID 180420 exists
#	And I have the activity "Smoke Weed"
#	And the activity "Smoke Weed" exists in the project with ID 180420
#	And I have the worker "BOBM"
#	And the worker "BOBM" exists
#	And the worker "BOBM" is assigned to the activity "Smoke Weed" in the project with ID 180420
#	When I remove the worker "BOBM" from the activity "Smoke Weed" in the project with ID 180420
#	Then the worker "BOBM" is not assigned to the activity "Smoke Weed" in the project with ID 180420
	
#Scenario: User removes worker from an activity which does not exist
#    Given I have the project with ID 180420
#    And the project with ID 180420 exists
#	And I have the activity "Smoke Weed"
#	And the activity "Smoke Weed" does not exist in the project with ID 180420
#	And I have the worker "BOBM"
#	And the worker "BOBM" exists
#	When I remove the worker "BOBM" from the activity "Smoke Weed" in the project with ID 180420
#	Then I get the error message "That activity does not exist in that project"
#    
#Scenario: User removes worker from an activity in a project which does not exist
#    Given I have the project with ID 180420
#    And the project with ID 180420 does not exist
#	And I have the activity "Smoke Weed"
#	And I have the worker "BOBM"
#	And the worker "BOBM" exists
#	When I remove the worker "BOBM" from the activity "Smoke Weed" in the project with ID 180420
#	Then I get the error message "That activity does not exist in that project"
#    
#Scenario: User removes non-existing worker from an activity
#    Given I have the project with ID 180420
#    And the project with ID 180420 exists
#	And I have the activity "Smoke Weed"
#	And the activity "Smoke Weed" exists in the project with ID 180420
#	And I have the worker "BOBM"
#	And the worker "BOBM" does not exist
#	When I remove the worker "BOBM" from the activity "Smoke Weed" in the project with ID 180420
#	Then I get the error message "That worker does not exist"
#    
#Scenario: User removes worker from an activity which the worker is not assigned to
#    Given I have the project with ID 180420
#    And the project with ID 180420 exists
#	And I have the activity "Smoke Weed"
#	And the activity "Smoke Weed" exists in the project with ID 180420
#	And I have the worker "BOBM"
#	And the worker "BOBM" exists
#	And the worker "BOBM" is not assigned to the activity "Smoke Weed" in the project with ID 180420
#	When I remove the worker "BOBM" from the activity "Smoke Weed" in the project with ID 180420
#	Then I get the error message "That worker is not assigned to that activity"