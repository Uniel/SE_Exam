Feature: Activity editing for a project
	Description: A user edits activities in a project
	Actors: User

Scenario: Add a non existing activity to existing project
	Given the project with ID 180001 has been created
	And the activity "Programming" does not exist in the project with ID 180001
	When I add the activity "Programming" to the project with ID 180001
	Then the activity "Programming" exists in the project with ID 180001

Scenario: Add an activity with no name to existing project
	Given the project with ID 180001 has been created
	When I add the activity " " to the project with ID 180001
	Then I get the error message "An activity must have a name"
	
Scenario: Add an already existing activity to existing project
	Given the project with ID 180001 has been created
	And the activity "Programming" has already been added to the project with ID 180001
	When I add the activity "Programming" to the project with ID 180001
	Then I get the error message "That activity already exists"
	
Scenario: Remove an existing activity from a project
	Given the project with ID 180001 has been created
	And the activity "Programming" has already been added to the project with ID 180001
	When I remove the activity "Programming" from the project with ID 180001
	Then the activity "Programming" does not exist in the project with ID 180001
	
Scenario: Remove an non existing activity from a project
	Given the project with ID 180001 has been created
	And the activity "Programming" does not exist in the project with ID 180001
	When I remove the activity "Programming" from the project with ID 180001
	Then I get the error message "That activity does not exist"

Scenario: Edit non-existing project
	Given the project with ID 180001 does not exist
	When I select the project with ID 180001
	Then I get the error message "A project with that ID does not exist"

Scenario: Rename activity to non existing name
	Given the project with ID 180001 has been created
	And the activity "Programming" has already been added to the project with ID 180001
	And the activity "Coffee break" does not exist in the project with ID 180001
	When I rename the activity "Programming" in the project with ID 180001 to "Coffee break"
	Then the activity "Coffee break" exists in the project with ID 180001
	And the activity "Programming" does not exist in the project with ID 180001

Scenario: Rename activity to existing name
	Given the project with ID 180001 has been created
	And the activity "Programming" has already been added to the project with ID 180001
	And the activity "Coffee break" has already been added to the project with ID 180001
	When I rename the activity "Programming" in the project with ID 180001 to "Coffee break"
	Then I get the error message "That activity name already exists"
	
Scenario: Rename non existing activity
	Given the project with ID 180001 has been created
	And the activity "Programming" does not exist in the project with ID 180001
	When I rename the activity "Programming" in the project with ID 180001 to "Coffee break"
	Then I get the error message "That activity does not exist"
	
Scenario: Set start and end time of activity
	Given the project with ID 180001 has been created
	And the activity "Programming" has already been added to the project with ID 180001
	When I set the start of the activity "Programming" in the project with ID 180001 to week 4 of 2130
	And I set the end of the activity "Programming" in the project with ID 180001 to week 7 of 2130
	Then the start of the activity "Programming" in the project with ID 180001 is week 4 of 2130
	And the end of the activity "Programming" in the project with ID 180001 is week 7 of 2130
	
Scenario: Set start time of activity after end time
	Given the project with ID 180001 has been created
	And the activity "Programming" has already been added to the project with ID 180001
	And I set the end of the activity "Programming" in the project with ID 180001 to week 4 of 2130
	When I set the start of the activity "Programming" in the project with ID 180001 to week 7 of 2130
	Then I get the error message "Activity start must be before activity end"
	
Scenario: Set end time of activity after start time
	Given the project with ID 180001 has been created
	And the activity "Programming" has already been added to the project with ID 180001
	And I set the start of the activity "Programming" in the project with ID 180001 to week 4 of 2130
	When I set the end of the activity "Programming" in the project with ID 180001 to week 2 of 2130
	Then I get the error message "Activity end must be after activity start"
	
Scenario: Set budget time of activity
	Given the project with ID 180001 has been created
	And the activity "Programming" has already been added to the project with ID 180001
	When I set the budget time of the activity "Programming" in the project with ID 180001 to 8.5 hours
	Then the budget time of the actvity "Programming" in the project with ID 180001 is 8.5 hours
	
Scenario: Set budget time of activity - round down
	Given the project with ID 180001 has been created
	And the activity "Programming" has already been added to the project with ID 180001
	When I set the budget time of the activity "Programming" in the project with ID 180001 to 8.2 hours
	Then the budget time of the actvity "Programming" in the project with ID 180001 is 8 hours
	
Scenario: Set budget time of activity - round up
	Given the project with ID 180001 has been created
	And the activity "Programming" has already been added to the project with ID 180001
	When I set the budget time of the activity "Programming" in the project with ID 180001 to 8.8 hours
	Then the budget time of the actvity "Programming" in the project with ID 180001 is 9 hours
	
Scenario: Finding parent project of activity
	Given the project with ID 180001 has been created
	And the activity "Programming" has already been added to the project with ID 180001
	Then the activity "Programming" in in the project with ID 180001 has the parent project 180001