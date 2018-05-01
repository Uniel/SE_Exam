Feature: Find available workers for given activity
    Description: The user searches for available workers
    Actors: User / project leader
                
Scenario: User searches for available workers successfully (1 worker)
    Given I have the worker "HAT"
    And I add the worker "HAT"
    And the project with ID 184444 has been created
    And the activity "Free Tibet" has already been added to the project with ID 184444
	And I set the end of the activity "Free Tibet" in the project with ID 184444 to week 7 of 2020
	And I set the start of the activity "Free Tibet" in the project with ID 184444 to week 5 of 2020
	And the activity "Bomb the Great Wall" has already been added to the project with ID 184444
	And I set the end of the activity "Bomb the Great Wall" in the project with ID 184444 to week 6 of 2020
	And I set the start of the activity "Bomb the Great Wall" in the project with ID 184444 to week 6 of 2020
	And I assign the worker "HAT" to the activity "Bomb the Great Wall" in the project with ID 184444
    When I search for available workers for the activity "Free Tibet" in the project with ID 184444
    Then I get a list of length 1 which contains the workers "HAT"
    
Scenario: User searches for available workers successfully (1 worker among more workers)
    Given I have the worker "HAT"
	And I add the worker "HAT"
    And I have the worker "FISK"
    And I add the worker "FISK"
    And the project with ID 184444 has been created
	And the activity "Free Tibet" has already been added to the project with ID 184444
	And I set the end of the activity "Free Tibet" in the project with ID 184444 to week 7 of 2020
	And I set the start of the activity "Free Tibet" in the project with ID 184444 to week 5 of 2020
    And the worker "FISK" is assigned to 20 activities which start on week 6 of 2020 and end on week 6 of 2020
    When I search for available workers for the activity "Free Tibet" in the project with ID 184444
    Then I get a list of length 1 which contains the workers "HAT"

Scenario: No workers are available
    Given I have the worker "HAT"
    And I add the worker "HAT"
    And the project with ID 184444 has been created
    And the activity "Free Tibet" has already been added to the project with ID 184444
	And I set the end of the activity "Free Tibet" in the project with ID 184444 to week 7 of 2020
	And I set the start of the activity "Free Tibet" in the project with ID 184444 to week 5 of 2020
    And the worker "HAT" is assigned to 20 activities which start on week 6 of 2020 and end on week 6 of 2020
    When I search for available workers for the activity "Free Tibet" in the project with ID 184444
    Then I get the error message "No workers available"

Scenario: Worker is on vacation
    Given I have the worker "HAT"
	And I add the worker "HAT"
    And the project with ID 184444 has been created
    And the activity "Free Tibet" has already been added to the project with ID 184444
	And I set the end of the activity "Free Tibet" in the project with ID 184444 to week 7 of 2020
	And I set the start of the activity "Free Tibet" in the project with ID 184444 to week 5 of 2020
    And the worker "HAT" is on vacation from week 6 to week 6 of 2020
    When I search for available workers for the activity "Free Tibet" in the project with ID 184444
    Then I get the error message "No workers available"

Scenario: The activity for which available workers are being sought has no duration
	Given the project with ID 184444 has been created
    And the activity "Free Tibet" has already been added to the project with ID 184444
    When I search for available workers for the activity "Free Tibet" in the project with ID 184444
    Then I get the error message "Must set activity duration before searching for available workers"