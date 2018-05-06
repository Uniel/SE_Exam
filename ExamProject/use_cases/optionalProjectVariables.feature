Feature: Set optional project variables
	Description: The user sets project variables which are not required
	Actors: User
	
Scenario: User assigns project leader
	Given the project with ID 184321 has been created
	And I have the worker "GRLT"
	And I add the worker "GRLT"
	And the worker "GRLT" exists
	When I set the project leader of the project with ID 184321 to worker "GRLT"
	Then the project leader of the project with ID 184321 is worker "GRLT"
	
Scenario: User assigns project name
	Given the project with ID 184321 has been created
	When I set the name of the project with ID 184321 to "CD Projekt Red"
	Then the name of the project with ID 184321 is "CD Projekt Red"
	
Scenario: User sets project type to internal
	Given the project with ID 184321 has been created
	When I set the project type of the project with ID 184321 to be "Internal"
	Then the project type of the project with ID 184321 is "Internal"
	
Scenario: User sets project type to internal
	Given the project with ID 184321 has been created
	When I set the project type of the project with ID 184321 to be "eXterNal"
	Then the project type of the project with ID 184321 is "External"
	
Scenario: User sets project type to something invalid
	Given the project with ID 184321 has been created
	When I set the project type of the project with ID 184321 to be "John"
	Then I get the error message "That is not a valid project type" 
	
Scenario: User sets the customer
	Given the project with ID 184321 has been created
	When I set the customer of the project with ID 184321 to be "Shinra Electric Power Company"
	Then the customer of the project with ID 184321 is "Shinra Electric Power Company"
	
Scenario: User sets project start
 	Given the project with ID 184321 has been created
	When I set project start of the project with ID 184321 to be week 5 of 2020
	Then the project start of the project with ID 184321 is week 5 of 2020
	
Scenario: User sets project end
	Given the project with ID 184321 has been created
	When I set project end of the project with ID 184321 to be week 5 of 2020
	Then the project end of the project with ID 184321 is week 5 of 2020
	
Scenario: User sets project end to be before project start
	Given the project with ID 184321 has been created
	And I set project start of the project with ID 184321 to be week 8 of 2020
	When I set project end of the project with ID 184321 to be week 7 of 2020
	Then I get the error message "Project end must be after project start"
	
Scenario: User sets project end to be before project start
	Given the project with ID 184321 has been created
	And I set project end of the project with ID 184321 to be week 8 of 2020
	When I set project start of the project with ID 184321 to be week 9 of 2020
	Then I get the error message "Project start must be before project end"

Scenario: User sets project end to be before the end of an activity in the project
	Given the project with ID 184321 has been created
	And the activity "Final Countdown" has already been added to the project with ID 184321
	And I set the start of the activity "Final Countdown" in the project with ID 184321 to week 5 of 2020
	And I set the end of the activity "Final Countdown" in the project with ID 184321 to week 8 of 2020
	When I set project end of the project with ID 184321 to be week 7 of 2020
	Then I get the error message "There are activities in this project which end after this time"
	
Scenario: User sets project start to be after the start of an activity in the project
	Given the project with ID 184321 has been created
	And the activity "Final Countdown" has already been added to the project with ID 184321
	And I set the start of the activity "Final Countdown" in the project with ID 184321 to week 5 of 2020
	And I set the end of the activity "Final Countdown" in the project with ID 184321 to week 8 of 2020
	When I set project start of the project with ID 184321 to be week 7 of 2020
	Then I get the error message "There are activities in this project which start before this time"