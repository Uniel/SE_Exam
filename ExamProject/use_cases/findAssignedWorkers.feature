Feature: Find assigned workers of a given activity
    Description: The user searches for assigned workers of a activity
    Actors: User / project leader
    
Scenario: User searches for assigned workers of the activity "G.O.A.T." successfully (1 worker)
    Given I have the project with ID 180666
    And the project with ID 180666 exists
	And the activity "G.O.A.T." has already been added to the project with ID 180666
    And I have the worker "JONH"
    And I add the worker "JONH"
    And I assign the worker "JONH" to the activity "G.O.A.T." in the project with ID 180666
    When I search for assigned workers of the activity "G.O.A.T." in the project with ID 180666
    Then I get a list of length 1 which contains the workers "JONH"
    
Scenario: User searches for assigned workers of the activity "G.O.A.T." successfully (>1 workers)
    Given I have the project with ID 180666
    And the project with ID 180666 exists
    And the activity "G.O.A.T." has already been added to the project with ID 180666
    And I have the worker "JONH"
    And I add the worker "JONH"
	And I assign the worker "JONH" to the activity "G.O.A.T." in the project with ID 180666
    And I have the worker "MICK"
    And I add the worker "MICK"
    And I assign the worker "JONH" to the activity "G.O.A.T." in the project with ID 180666
    When I search for assigned workers of the activity "G.O.A.T." in the project with ID 180666
    Then I get a list of length 2 which contains the workers "JONH" and "MICK"
        
Scenario: Activity does not exist
    Given I have the project with ID 180069
    And the project with ID 180069 exists
    And the activity "Sexual harassment" does not exist in the project with ID 180069
    When I search for assigned workers of the activity "Sexual harassment" in the project with ID 180069
    Then I get the error message "This activity does not exist in that project"

Scenario: No workers assigned to the activity "G.O.A.T." 
    Given I have the project with ID 180666
    And the project with ID 180666 exists
    And the activity "G.O.A.T." has already been added to the project with ID 180666
    And there are no assigned workers to the activity "G.O.A.T." in the project with ID 180666
    When I search for assigned workers of the activity "G.O.A.T." in the project with ID 180666
    Then I get the error message "No workers assigned to the activity"
    
Scenario: Project does not exist
    Given the project with ID 180069 does not exist
    When I search for assigned workers of the activity "Sexual harassment" in the project with ID 180069
    Then I get the error message "A project with that ID does not exist"
    
Scenario: Searching for blank project
    When I search for assigned workers of the activity "G.O.A.T." without specifying project ID
    Then I get the error message "You have to specify a project ID"
 
Scenario: Searching for blank activity
    When I search for assigned workers of the activity "" in the project with ID 180666
    Then I get the error message "You have to specify an activity"