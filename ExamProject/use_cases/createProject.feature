Feature: Create a project
	Description: A user creates a project
	Actor: User
	
Scenario: Successfully create a project
	Given the year is 2018
	And the serial number is 0001
	When I create a project
	Then the project with ID 180001 exists
	And the serial number is now 0002
	
#Scenario: Unsuccessfully create a project
#	Given the year is 2018
#	And the serial number is 0001
#	And I have the project with ID 180001
#	And the project with ID 180001 exists
#	When I add the project with ID 180001
#	Then I get the error message "A project with that ID already exists"
#	
#Scenario: It is a new year
#	Given the year is 2019
#	And the serial number is 0100
#	And the ID of the last project created does not start with 19
#	When I create the project
#	Then the project with ID 190000 exists
#	And the serial number is 0001 