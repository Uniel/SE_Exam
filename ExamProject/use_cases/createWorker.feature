Feature: Create worker
	Description: The user creates a worker (max 4 initials).
	Actors: User
	
Scenario: User creates a valid worker successfully
	Given I have the worker "DANK"
	And the worker "DANK" does not exist
	When I add the worker "DANK"
	Then the worker "DANK" exists

#Scenario: User creates a worker with too many initials
#	Given I have the worker "DANKMEMES" 
#	When I add the worker "DANKMEMES"
#    Then the worker "DANKMEMES" does not exist
#    And I get the error message "Too many initials"
#
#Scenario: User creates an existing worker
#    Given I have the worker "DANK"
#    And the worker "DANK" exists
#	When I add the worker "DANK"
#    Then I get the error message "The worker DANK already exists"
#    
#Scenario: Creating a worker with blank name
#    Given I have the worker ""
#    When I add the worker ""
#    Then the worker "" does not exist
#    Then I get the error message "Worker must have initials"
#    
#Scenario: Creating a worker with spaces in the initials
#    Given I have the worker "GJ"
#    And the worker "GJ" does not exist
#    And I have the worker " g j"
#    When I add the worker " g j"
#    Then the worker "GJ" exists
#    
#Scenario: Creating a worker with spaces in the initials
#    Given I have the worker "GJ"
#    And the worker "GJ" does not exist
#    And I have the worker ".g.j......"
#    When I add the worker ".g.j......"
#    Then the worker "GJ" exists
#
#Scenario: Creating a worker with blank name (version 2)
#    Given I have the worker ".  "
#    When I add the worker ".  "
#    Then I get the error message "Worker must have initials"