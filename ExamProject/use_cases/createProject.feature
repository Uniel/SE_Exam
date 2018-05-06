Feature: Create a project
	Description: A user creates a project
	Actor: User
	
Scenario: Successfully create a project
	Given the year is 2019
	And the serial number is 0001
	When I create a project
	Then the project with ID 190001 exists
	And the serial number is now 0002
	
	# EDITERET - Selvom det ikke er plausibelt at det sker, så genererer vi blot et nyt ID, hvis det allerede generede findes
Scenario: Conflict in project ID
	Given the year is 2018
	And the serial number is 0001
	And the project with ID 180001 has been created
	And the project with ID 180002 does not exist
	When I create a project
	Then the project with ID 180002 exists
	
Scenario: It is a new year
	Given the year is 2018
	Given the project with ID 180100 has been created
	And the serial number is 0101
	And the ID of the last project created does not start with 19
	When it is the next year
	And I create a project
	Then the project with ID 190001 exists
	And the serial number is now 0002
	
Scenario: Remove a project
	Given the project with ID 180001 has been created
	When I remove the project with ID 180001
	Then the project with ID 180001 does not exist

Scenario: Remove a non existing activity
	Given the project with ID 180001 does not exist
	When I remove the project with ID 180001
	Then I get the error message "A project with that ID does not exist"
	
Scenario: No more available IDs
	Given there have been created 9999 projects this year
	When I create a project
	Then I get the error message "The amount of projects generated this year is too damn high!"
