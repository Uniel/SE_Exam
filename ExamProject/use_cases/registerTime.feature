Feature: Register time spent on an activity
	Description: The user registers worker's time spent on an activity.
	Actors: user
	
#Scenario: Worker registers time spent on an activity in a project
#	Given I have the project with ID 180000
#	And the project with ID 180000 exists
#	And I have the activity "Programming"
#	And the activity "Programming" exists in the project with ID 18000
#	And I have the worker "DANK"
#	And the worker "DANK" exists
#	When I register 4 hours to activity "Programming" in the project with ID 180000 on the date 01 01 2018 to worker "DANK"
#	Then 4 hours are registered to worker "DANK" for the activity "Programming" in the project with ID 180000 on the date 01 01 2018

#Scenario: Worker registers time spent on an activity in a project which does not exist
#	Given I have the project with ID 180001
#	And the project with ID 180000 does not exist
#	And I have the activity "Programming"
#	And I have the worker "DANK"
#	And the worker "DANK" exists
#	When I register 4 hours to activity "Programming" in the project with ID 180000 on the date 01 01 2018 to worker "DANK"
#	Then I get the error message "This project does not exist"
#	
#Scenario: Worker registers time spent on an activity which does not exist
#	Given I have the project with ID 180001
#	And the project with ID 180000 exists
#	And I have the activity "Programming"
#	And the activity "Programming" does not exist in the project with ID 180000
#	And I have the worker "DANK"
#	And the worker "DANK" exists
#	When I register 4 hours to activity "Programming" in the project with ID 180000 on the date 01 01 2018 to worker "DANK"
#	Then I get the error message "This activity does not exist in that project"
#	
#Scenario: User registers time spent to a worker which does not exist
#	Given I have the project with ID 180001
#	And the project with ID 180000 exists
#	And I have the activity "Programming"
#	And the activity "Programming" exists in the project with ID 180000
#	And I have the worker "DANK"
#	And the worker "DANK" does not exist
#	When I register 4 hours to activity "Programming" in the project with ID 180000 on the date 01 01 2018 to worker "DANK"
#	Then I get the error message "This worker does not exist"
#	
#Scenario: Worker edits time spent on an activity in a project
#	Given I have the project with ID 180000
#	And the project with ID 180000 exists
#	And I have the activity "Programming"
#	And the activity "Programming" exists in the project with ID 18000
#	And I have the worker "DANK"
#	And the worker "DANK" exists
#	And 4 hours are registered to activity "Programming" in the project with ID 180000 on the date 01 01 2018 to worker "DANK"
#	When I register 8.5 hours to activity "Programming" in the project with ID 180000 on the date 01 01 2018 to worker "DANK"
#	Then 8.5 hours are registered to worker "DANK" for the activity "Programming" in the project with ID 180000 on the date 01 01 2018
#	
#Scenario: Worker registers time spent on an activity in a project to an existing date
#	Given I have the project with ID 180000
#	And the project with ID 180000 exists
#	And I have the activity "Programming"
#	And the activity "Programming" exists in the project with ID 18000
#	And I have the worker "DANK"
#	And the worker "DANK" exists
#	Given that the date 01 01 2018 exists
#	When I register 4 hours to activity "Programming" in the project with ID 180000 on the date 01 01 2018 to worker "DANK"
#	Then 4 hours are registered to worker "DANK" for the activity "Programming" in the project with ID 180000 on the already existing date 01 01 2018