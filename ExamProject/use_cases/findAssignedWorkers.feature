Feature: Find assigned workers of a given activity
    Description: The user searches for assigned workers of a activity
    Actors: User / project leader
    
#Scenario: User searches for assigned workers of the activity "G.O.A.T." successfully (1 worker)
#    Given I have the project with ID 180666
#    And the project with ID 180666 exists
#    And I have the activity "G.O.A.T."
#    And the activity "G.O.A.T." exists in the project with ID 180666
#    And I have the worker "JONH"
#    And the worker "JONH" exists
#    And the worker "JONH" is assigned to the activity "G.O.A.T." in the project with ID 180666
#    When I search for assigned workers of the activity "G.O.A.T." in the project with ID 180666
#    Then I get a list of length 1 which contains the workers "JONH"
    
#Scenario: User searches for assigned workers of the activity "G.O.A.T." successfully (>1 workers)
#    Given I have the project with ID 180666
#    And the project with ID 180666 exists
#    And I have the activity "G.O.A.T."
#    And the activity "G.O.A.T." exists in the project with ID 180666
#    And I have the worker "JONH"
#    And the worker "JONH" exists
#    And the worker "JONH" is assigned to the activity "G.O.A.T." in the project with ID 180666
#    And I have the worker "MICK"
#    And the worker "MICK" exists
#    And the worker "MICK" is assigned to the activity "G.O.A.T." in the project with ID 180666
#    When I search for assigned workers of the activity "G.O.A.T." in the project with ID 180666
#    Then I get a list of length 2 which contains the workers "JONH", "MICK"
#    
#Scenario: Activity does not exist
#    Given I have the activity "Sexual harassment"
#    And I have the project with ID 180069
#    And the project with ID 180069 exists
#    And the activity "Sexual harassment" does not exist in the project with ID 180069
#    When I search for assigned workers of the activity "Sexual harassment" in the project with ID 180069
#    Then I get the error message "Activity does not exist in that project"
#
#Scenario: No workers assigned to the activity "G.O.A.T." 
#    Given I have the activity "G.O.A.T."
#    And I have the project with ID 180666
#    And the project with ID 180666 exists
#    And the activity "G.O.A.T." exists in the project with ID 180666
#    And there are no assigned workers to the activity "G.O.A.T." in the project with ID 180666
#    When I search for assigned workers of the activity "G.O.A.T." in the project with ID 180666
#    Then I get the error message "No workers assigned to the activity"
#    
#Scenario: Project does not exist
#    Given I have the activity "Sexual harassment"
#    And I have the project with ID 180069
#    And the project with ID 180069 does not exist
#    When I search for assigned workers of the activity "Sexual harassment" in the project with ID 180069
#    Then I get the error message "Project does not exist"
#    
#Scenario: Searching for blank project
#    Given I have the activity "G.O.A.T."
#    When I search for assigned workers of the activity "G.O.A.T." without specifying project ID
#    Then I get the error message "You have to specify a project ID"
#    
#Scenario: Searching for blank activity
#    Given I have the project with ID 180666
#    When I search for assigned workers of the project with ID 180666 without specifying activity name
#    Then I get the error message "You have to specify an activity"