Feature: Assign Workers
	Description: The user assigns workers to an activity
	Actors: User
	
#Scenario: User assigns a worker to an activity
#	Given I have the project with ID 180000
#	And the project with ID 180000 exists
#	And the activity "Kick ass and chew bubblegum" exists in the project with ID 180000
#	And I have the worker "BJBL"
#	And the worker "BJBL" exists
#	When I assign the worker "BJBL" to the activity "Kick ass and chew bubblegum" in the project with ID 180000
#	Then the worker "BJBL" is assigned to the activity "Kick ass and chew bubblegum" in the project with ID 180000

#Scenario: User assigns worker to an activity which the worker is already assigned to
#	Given I have the project with ID 180000
#	And the project with ID 180000 exists
#	And the activity "Kick ass and chew bubblegum" exists in the project with ID 180000
#	And I have the worker "BJBL"
#	And the worker "BJBL" exists
#	And the worker "BJBL" is assigned to the activity "Kick ass and chew bubblegum" in the project with ID 180000
#	When I assign the worker "BJBL" to the activity "Kick ass and chew bubblegum" in the project with ID 180000
#	Then I get the error message "This worker is already assigned to that activity"
#	
#Scenario: User assigns worker to an activity , but the worker already has 20 activities at that time
#	Given I have the project with ID 180000
#	And the project with ID 180000 exists
#	And the activity "Kick ass and chew bubblegum" exists in the project with ID 180000
#	And the activity "Kick ass and chew bubblegum" in the project with ID 180000 starts on week 5 of 2020 and ends on week 7 of 2020
#	And I have the worker "BJBL"
#	And the worker "BJBL" exists
#	And the worker "BJBL" is assigned to 20 activities which start on week 6 of 2020 and end on week 6 of 2020
#	When I assign the worker "BJBL" to the activity "Kick ass and chew bubblegum" in the project with ID 180000
#	Then the worker "BJBL" is not assigned to the activity "Kick ass and chew bubblegum" in the project with ID 180000
#	And I get the error message "This worker is unavailable during that time"
#	
#Scenario: User assigns worker to an activity , but the worker is on vacation at that time
#	Given I have the project with ID 180000
#	And the project with ID 180000 exists
#	And the activity "Kick ass and chew bubblegum" exists in the project with ID 180000
#	And the activity "Kick ass and chew bubblegum" in the project with ID 180000 starts on week 5 of 2020 and ends on week 7 of 2020
#	And I have the worker "BJBL"
#	And the worker "BJBL" exists
#	And the worker "BJBL" is on vacation from week 5 to week 9 of 2020
#	When I assign the worker "BJBL" to the activity "Kick ass and chew bubblegum" in the project with ID 180000
#	Then the worker "BJBL" is not assigned to the activity "Kick ass and chew bubblegum" in the project with ID 180000
#	And I get the error message "This worker is unavailable during that time"
#	
#Scenario: User tries to assign worker to non-existing activity
#	Given I have the worker "BJBL"
#	And the worker "BJBL" exists
#	And I have the worker "BJBL"
#	And the project with ID 180000 exists
#	And I have the activity "Kick ass and chew bubblegum"
#	And the activity "Kick ass and chew bubblegum" does not exist in the project with ID 180000
#	When I assign the worker "BJBL" to the activity "Kick ass and chew bubblegum" in the project with ID 180000
#	Then the worker "BJBL" is not assigned to the activity "Kick ass and chew bubblegum" in the project with ID 180000
#	And I get the error message "This activity does not exist in that project"
#	
#Scenario: User tries to assign non-existing worker to activity
#	Given I have the worker "BJBL"
#	And the worker "BJBL" does not exist
#	And I have the project with ID 180000
#	And the project with ID 180000 exists
#	And the activity "Kick ass and chew bubblegum" exists in the project with ID 180000
#	When I assign the worker "BJBL" to the activity "Kick ass and chew bubblegum" in the project with ID 180000
#	Then the worker "BJBL" is not assigned to the activity "Kick ass and chew bubblegum" in the project with ID 180000
#	And I get the error message "This worker does not exist"
#	
#Scenario: User tries to assign a worker to an activity in a non-existing project
#	Given I have the worker "BJBL"
#	And the worker "BJBL" exists
#	And I have the project with the ID 180000
#	And the project with ID 180000 exists
#	And I have the project with the ID 180001
#	And the project with ID 180001 does not exist
#	And I have the activity "Kick ass and chew bubblegum"
#	And the activity "Kick ass and chew bubblegum" exists in the project with ID 180000
#	When I assign the worker "BJBL" to the activity "Kick ass and chew bubblegum" in the project with ID 180001
#	Then I get the error message "This project does not exist"
