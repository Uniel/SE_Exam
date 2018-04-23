Feature: List projects
	Description: A user searches for projects and gets a list
	Actors: User
	
Background: The system has a number of projects
	Given these project IDs with names exist in the system
	| 180001 | Project 2018 1 |
	| 160021 | The Number 21 |
	| 170404 | Damned difficult to find |
	| 180042 | The meaning |
	
Scenario: Searching for all projects
	Given I search for "*"
	Then I find projects with ID 180001, 160021, 170404 and 180042

Scenario: Finding exact match by ID search
	Given I search for "180001"
	Then I find projects with ID 180001

Scenario: Find multiple projects by searching for part of ID
	Given I search for "18"
	Then I find projects with ID 180001 and 180042

Scenario: Find one project by name search
	Given I search for "The Number 21"
	Then I find projects with ID 160021

Scenario: Find multiple projects by part name search
	Given I search for "The"
	Then I find projects with ID 160021 and 180042

Scenario: No projects found
	Given I search for "haha"
	Then I get the error message "No projects containing that string found"

Scenario: Search for empty string
	Given I search for " "
	Then I get the error message "Must specify search term"

