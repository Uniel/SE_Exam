Feature: Assign Workers
	Description: The user assigns workers to an activity
	Actors: User
	
Scenario: User assigns a worker to an activity
	Given the project with ID 180000 has been created
	And the activity "Kick ass and chew bubblegum" has already been added to the project with ID 180000
	And I set the start of the activity "Kick ass and chew bubblegum" in the project with ID 180000 to week 5 of 2020
	And I set the end of the activity "Kick ass and chew bubblegum" in the project with ID 180000 to week 7 of 2020
	And I have the worker "BJBL"
	And I add the worker "BJBL"
	When I assign the worker "BJBL" to the activity "Kick ass and chew bubblegum" in the project with ID 180000
	Then the worker "BJBL" is assigned to the activity "Kick ass and chew bubblegum" in the project with ID 180000

Scenario: User assigns worker to an activity which the worker is already assigned to
	Given the project with ID 180000 has been created
	And the activity "Kick ass and chew bubblegum" has already been added to the project with ID 180000
	And I set the start of the activity "Kick ass and chew bubblegum" in the project with ID 180000 to week 5 of 2020
	And I set the end of the activity "Kick ass and chew bubblegum" in the project with ID 180000 to week 7 of 2020
	And I have the worker "BJBL"
	And I add the worker "BJBL"
	And I assign the worker "BJBL" to the activity "Kick ass and chew bubblegum" in the project with ID 180000
	When I assign the worker "BJBL" to the activity "Kick ass and chew bubblegum" in the project with ID 180000
	Then I get the error message "This worker is already assigned to that activity"
	
Scenario: User assigns worker to an activity , but the worker already has 20 activities at that time
	Given the project with ID 180000 has been created
	And the activity "Jump" has already been added to the project with ID 180000
	And I set the start of the activity "Jump" in the project with ID 180000 to week 5 of 2020
	And I set the end of the activity "Jump" in the project with ID 180000 to week 7 of 2020
	And I have the worker "BJBL"
	And I add the worker "BJBL"
	And the worker "BJBL" is assigned to 20 activities which start on week 6 of 2020 and end on week 6 of 2020
	When I assign the worker "BJBL" to the activity "Jump" in the project with ID 180000
	Then the worker "BJBL" is not assigned to the activity "Jump" in the project with ID 180000
	And I get the error message "This worker is unavailable during that time"
	
Scenario: User assigns worker to an activity , but the worker is on vacation at that time
	Given the project with ID 180001 has been created
	And the activity "Kick ass and chew bubblegum" has already been added to the project with ID 180001
	And I set the start of the activity "Kick ass and chew bubblegum" in the project with ID 180001 to week 5 of 2020
	And I set the end of the activity "Kick ass and chew bubblegum" in the project with ID 180001 to week 7 of 2020
	And I have the worker "BJBL"
	And I add the worker "BJBL"
	And the worker "BJBL" is on vacation from week 5 to week 9 of 2020
	When I assign the worker "BJBL" to the activity "Kick ass and chew bubblegum" in the project with ID 180001
	Then the worker "BJBL" is not assigned to the activity "Kick ass and chew bubblegum" in the project with ID 180001
	And I get the error message "This worker is unavailable during that time"
	
Scenario: Worker is assigned vacation 2 times in a year
	Given I have the worker "BJBL"
	And I add the worker "BJBL"
	And the worker "BJBL" is on vacation from week 5 to week 9 of 2020
	When the worker "BJBL" is on vacation from week 20 to week 21 of 2020
	Then the activity "BJBL Vacation 1" exists in the project with ID 200000

Scenario: User tries to assign worker to non-existing activity
	Given I have the worker "BJBL"
	And I add the worker "BJBL"
	And the project with ID 180001 has been created
	And the activity "Kick ass and chew bubblegum" does not exist in the project with ID 180001
	When I assign the worker "BJBL" to the activity "Kick ass and chew bubblegum" in the project with ID 180001
	And I get the error message "This activity does not exist in that project"
	
Scenario: User tries to assign non-existing worker to activity
	Given I have the worker "BJBL"
	And the worker "BJBL" does not exist
	And the project with ID 180001 has been created
	And the activity "Kick ass and chew bubblegum" has already been added to the project with ID 180001
	When I assign the worker "BJBL" to the activity "Kick ass and chew bubblegum" in the project with ID 180001
	Then the worker "BJBL" is not assigned to the activity "Kick ass and chew bubblegum" in the project with ID 180001
	And I get the error message "This worker does not exist"
	
Scenario: User tries to assign a worker to an activity in a non-existing project
	Given I have the worker "BJBL"
	And I add the worker "BJBL"
	And the project with ID 180001 has been created
	And the project with ID 180002 does not exist
	And the activity "Kick ass and chew bubblegum" has already been added to the project with ID 180001
	And the activity "Kick ass and chew bubblegum" exists in the project with ID 180001
	When I assign the worker "BJBL" to the activity "Kick ass and chew bubblegum" in the project with ID 180002
	Then I get the error message "A project with that ID does not exist"
	
Scenario: User tries to assign a worker to an activity which has no duration
	Given I have the worker "BJBL"
	And I add the worker "BJBL"
	And the project with ID 180001 has been created
	And the activity "Kick ass and chew bubblegum" has already been added to the project with ID 180001
	When I assign the worker "BJBL" to the activity "Kick ass and chew bubblegum" in the project with ID 180001
	Then I get the error message "Must set activity duration before assigning workers"
	
#The next two scenarios are only for code coverage of some defensive programming checks
Scenario: Sneaky assign activity to worker - No duration
	Given I have the worker "BJBL"
	And I add the worker "BJBL"
	And the project with ID 180001 has been created
	And the activity "Kick ass and chew bubblegum" has already been added to the project with ID 180001
	When I sneaky assign the worker "BJBL" to the activity "Kick ass and chew bubblegum" in the project with ID 180001
	Then I get the error message "Must set activity duration before assigning workers"
	
Scenario: Sneaky assign activity to worker - Worker unavailable
	Given I have the worker "BJBL"
	And I add the worker "BJBL"
	And the project with ID 180001 has been created
	And the activity "Kick ass and chew bubblegum" has already been added to the project with ID 180001
	And I set the start of the activity "Kick ass and chew bubblegum" in the project with ID 180001 to week 5 of 2020
	And I set the end of the activity "Kick ass and chew bubblegum" in the project with ID 180001 to week 7 of 2020
	And the worker "BJBL" is on vacation from week 5 to week 9 of 2020
	When I sneaky assign the worker "BJBL" to the activity "Kick ass and chew bubblegum" in the project with ID 180001
	Then I get the error message "This worker is unavailable during that time"
	