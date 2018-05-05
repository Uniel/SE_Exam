$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("use_cases/assignWorkers.feature");
formatter.feature({
  "name": "Assign Workers",
  "description": "\tDescription: The user assigns workers to an activity\n\tActors: User",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User assigns a worker to an activity",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project with ID 180000 has been created",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity \"Kick ass and chew bubblegum\" has already been added to the project with ID 180000",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.theActivityHasAlreadyBeenCreatedInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the start of the activity \"Kick ass and chew bubblegum\" in the project with ID 180000 to week 5 of 2020",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.iSetTheStartOfTheActivityInTheProjectWithIDToWeekOf(String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the end of the activity \"Kick ass and chew bubblegum\" in the project with ID 180000 to week 7 of 2020",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.iSetTheEndOfTheActivityInTheProjectWithIDToWeekOf(String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have the worker \"BJBL\"",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iHaveTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add the worker \"BJBL\"",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iAddTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I assign the worker \"BJBL\" to the activity \"Kick ass and chew bubblegum\" in the project with ID 180000",
  "keyword": "When "
});
formatter.match({
  "location": "WorkerSteps.iAssignTheWorkerToTheActivityInTheProjectWithID(String,String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker \"BJBL\" is assigned to the activity \"Kick ass and chew bubblegum\" in the project with ID 180000",
  "keyword": "Then "
});
formatter.match({
  "location": "WorkerSteps.theWorkerIsAssignedToTheActivityInTheProjectWithID(String,String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User assigns worker to an activity which the worker is already assigned to",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project with ID 180000 has been created",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity \"Kick ass and chew bubblegum\" has already been added to the project with ID 180000",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.theActivityHasAlreadyBeenCreatedInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the start of the activity \"Kick ass and chew bubblegum\" in the project with ID 180000 to week 5 of 2020",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.iSetTheStartOfTheActivityInTheProjectWithIDToWeekOf(String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the end of the activity \"Kick ass and chew bubblegum\" in the project with ID 180000 to week 7 of 2020",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.iSetTheEndOfTheActivityInTheProjectWithIDToWeekOf(String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have the worker \"BJBL\"",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iHaveTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add the worker \"BJBL\"",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iAddTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I assign the worker \"BJBL\" to the activity \"Kick ass and chew bubblegum\" in the project with ID 180000",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iAssignTheWorkerToTheActivityInTheProjectWithID(String,String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I assign the worker \"BJBL\" to the activity \"Kick ass and chew bubblegum\" in the project with ID 180000",
  "keyword": "When "
});
formatter.match({
  "location": "WorkerSteps.iAssignTheWorkerToTheActivityInTheProjectWithID(String,String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the error message \"This worker is already assigned to that activity\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MiscSteps.iGetTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User assigns worker to an activity , but the worker already has 20 activities at that time",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project with ID 180000 has been created",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity \"Jump\" has already been added to the project with ID 180000",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.theActivityHasAlreadyBeenCreatedInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the start of the activity \"Jump\" in the project with ID 180000 to week 5 of 2020",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.iSetTheStartOfTheActivityInTheProjectWithIDToWeekOf(String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the end of the activity \"Jump\" in the project with ID 180000 to week 7 of 2020",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.iSetTheEndOfTheActivityInTheProjectWithIDToWeekOf(String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have the worker \"BJBL\"",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iHaveTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add the worker \"BJBL\"",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iAddTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker \"BJBL\" is assigned to 20 activities which start on week 6 of 2020 and end on week 6 of 2020",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.theWorkerIsAssignedToActivitiesWhichStartOnWeekOfAndEndOnWeekOf(String,int,int,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I assign the worker \"BJBL\" to the activity \"Jump\" in the project with ID 180000",
  "keyword": "When "
});
formatter.match({
  "location": "WorkerSteps.iAssignTheWorkerToTheActivityInTheProjectWithID(String,String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker \"BJBL\" is not assigned to the activity \"Jump\" in the project with ID 180000",
  "keyword": "Then "
});
formatter.match({
  "location": "WorkerSteps.theWorkerIsNotAssignedToTheActivityInTheProjectWithID(String,String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the error message \"This worker is unavailable during that time\"",
  "keyword": "And "
});
formatter.match({
  "location": "MiscSteps.iGetTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User assigns worker to an activity , but the worker is on vacation at that time",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project with ID 180001 has been created",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity \"Kick ass and chew bubblegum\" has already been added to the project with ID 180001",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.theActivityHasAlreadyBeenCreatedInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the start of the activity \"Kick ass and chew bubblegum\" in the project with ID 180001 to week 5 of 2020",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.iSetTheStartOfTheActivityInTheProjectWithIDToWeekOf(String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the end of the activity \"Kick ass and chew bubblegum\" in the project with ID 180001 to week 7 of 2020",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.iSetTheEndOfTheActivityInTheProjectWithIDToWeekOf(String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have the worker \"BJBL\"",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iHaveTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add the worker \"BJBL\"",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iAddTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker \"BJBL\" is on vacation from week 5 to week 9 of 2020",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.theWorkerIsOnVacationFromWeekToWeekOf(String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I assign the worker \"BJBL\" to the activity \"Kick ass and chew bubblegum\" in the project with ID 180001",
  "keyword": "When "
});
formatter.match({
  "location": "WorkerSteps.iAssignTheWorkerToTheActivityInTheProjectWithID(String,String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker \"BJBL\" is not assigned to the activity \"Kick ass and chew bubblegum\" in the project with ID 180001",
  "keyword": "Then "
});
formatter.match({
  "location": "WorkerSteps.theWorkerIsNotAssignedToTheActivityInTheProjectWithID(String,String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the error message \"This worker is unavailable during that time\"",
  "keyword": "And "
});
formatter.match({
  "location": "MiscSteps.iGetTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User tries to assign worker to non-existing activity",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have the worker \"BJBL\"",
  "keyword": "Given "
});
formatter.match({
  "location": "WorkerSteps.iHaveTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add the worker \"BJBL\"",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iAddTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with ID 180001 has been created",
  "keyword": "And "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity \"Kick ass and chew bubblegum\" does not exist in the project with ID 180001",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.theActivityDoesNotExistInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I assign the worker \"BJBL\" to the activity \"Kick ass and chew bubblegum\" in the project with ID 180001",
  "keyword": "When "
});
formatter.match({
  "location": "WorkerSteps.iAssignTheWorkerToTheActivityInTheProjectWithID(String,String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the error message \"This activity does not exist in that project\"",
  "keyword": "And "
});
formatter.match({
  "location": "MiscSteps.iGetTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User tries to assign non-existing worker to activity",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have the worker \"BJBL\"",
  "keyword": "Given "
});
formatter.match({
  "location": "WorkerSteps.iHaveTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker \"BJBL\" does not exist",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.theWorkerDoesNotExist(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with ID 180001 has been created",
  "keyword": "And "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity \"Kick ass and chew bubblegum\" has already been added to the project with ID 180001",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.theActivityHasAlreadyBeenCreatedInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I assign the worker \"BJBL\" to the activity \"Kick ass and chew bubblegum\" in the project with ID 180001",
  "keyword": "When "
});
formatter.match({
  "location": "WorkerSteps.iAssignTheWorkerToTheActivityInTheProjectWithID(String,String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker \"BJBL\" is not assigned to the activity \"Kick ass and chew bubblegum\" in the project with ID 180001",
  "keyword": "Then "
});
formatter.match({
  "location": "WorkerSteps.theWorkerIsNotAssignedToTheActivityInTheProjectWithID(String,String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the error message \"This worker does not exist\"",
  "keyword": "And "
});
formatter.match({
  "location": "MiscSteps.iGetTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User tries to assign a worker to an activity in a non-existing project",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have the worker \"BJBL\"",
  "keyword": "Given "
});
formatter.match({
  "location": "WorkerSteps.iHaveTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add the worker \"BJBL\"",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iAddTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with ID 180001 has been created",
  "keyword": "And "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with ID 180002 does not exist",
  "keyword": "And "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDDoesNotExist(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity \"Kick ass and chew bubblegum\" has already been added to the project with ID 180001",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.theActivityHasAlreadyBeenCreatedInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity \"Kick ass and chew bubblegum\" exists in the project with ID 180001",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.theActivityExistsInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I assign the worker \"BJBL\" to the activity \"Kick ass and chew bubblegum\" in the project with ID 180002",
  "keyword": "When "
});
formatter.match({
  "location": "WorkerSteps.iAssignTheWorkerToTheActivityInTheProjectWithID(String,String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the error message \"A project with that ID does not exist\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MiscSteps.iGetTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User tries to assign a worker to an activity which has no duration",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have the worker \"BJBL\"",
  "keyword": "Given "
});
formatter.match({
  "location": "WorkerSteps.iHaveTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add the worker \"BJBL\"",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iAddTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with ID 180001 has been created",
  "keyword": "And "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity \"Kick ass and chew bubblegum\" has already been added to the project with ID 180001",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.theActivityHasAlreadyBeenCreatedInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I assign the worker \"BJBL\" to the activity \"Kick ass and chew bubblegum\" in the project with ID 180001",
  "keyword": "When "
});
formatter.match({
  "location": "WorkerSteps.iAssignTheWorkerToTheActivityInTheProjectWithID(String,String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the error message \"Must set activity duration before assigning workers\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MiscSteps.iGetTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("use_cases/createProject.feature");
formatter.feature({
  "name": "Create a project",
  "description": "\tDescription: A user creates a project\n\tActor: User",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successfully create a project",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the year is 2019",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theYearIs(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the serial number is 0001",
  "keyword": "And "
});
formatter.match({
  "location": "ProjectSteps.theSerialNumberIs(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I create a project",
  "keyword": "When "
});
formatter.match({
  "location": "ProjectSteps.iCreateAProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with ID 190001 exists",
  "keyword": "Then "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDExists(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the serial number is now 0002",
  "keyword": "And "
});
formatter.match({
  "location": "ProjectSteps.theSerialNumberIsNow(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Conflict in project ID",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the year is 2018",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theYearIs(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the serial number is 0001",
  "keyword": "And "
});
formatter.match({
  "location": "ProjectSteps.theSerialNumberIs(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with ID 180001 has been created",
  "keyword": "And "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with ID 180002 does not exist",
  "keyword": "And "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDDoesNotExist(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I create a project",
  "keyword": "When "
});
formatter.match({
  "location": "ProjectSteps.iCreateAProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with ID 180002 exists",
  "keyword": "Then "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDExists(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "It is a new year",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the year is 2018",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theYearIs(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with ID 180100 has been created",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the serial number is 0101",
  "keyword": "And "
});
formatter.match({
  "location": "ProjectSteps.theSerialNumberIs(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the ID of the last project created does not start with 19",
  "keyword": "And "
});
formatter.match({
  "location": "ProjectSteps.theIDOfTheLastProjectCreatedDoesNotStartWith(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "it is the next year",
  "keyword": "When "
});
formatter.match({
  "location": "ProjectSteps.itIsTheNextYear()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I create a project",
  "keyword": "And "
});
formatter.match({
  "location": "ProjectSteps.iCreateAProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with ID 190001 exists",
  "keyword": "Then "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDExists(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the serial number is now 0002",
  "keyword": "And "
});
formatter.match({
  "location": "ProjectSteps.theSerialNumberIsNow(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Remove a project",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project with ID 180001 has been created",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I remove the project with ID 180001",
  "keyword": "When "
});
formatter.match({
  "location": "ProjectSteps.iRemoveTheProjectWithID(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with ID 180001 does not exist",
  "keyword": "Then "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDDoesNotExist(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Remove a non existing activity",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project with ID 180001 does not exist",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDDoesNotExist(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I remove the project with ID 180001",
  "keyword": "When "
});
formatter.match({
  "location": "ProjectSteps.iRemoveTheProjectWithID(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the error message \"A project with that ID does not exist\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MiscSteps.iGetTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("use_cases/createWorker.feature");
formatter.feature({
  "name": "Create worker",
  "description": "\tDescription: The user creates a worker (max 4 initials).\n\tActors: User",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User creates a valid worker successfully",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have the worker \"DANK\"",
  "keyword": "Given "
});
formatter.match({
  "location": "WorkerSteps.iHaveTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker \"DANK\" does not exist",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.theWorkerDoesNotExist(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add the worker \"DANK\"",
  "keyword": "When "
});
formatter.match({
  "location": "WorkerSteps.iAddTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker \"DANK\" exists",
  "keyword": "Then "
});
formatter.match({
  "location": "WorkerSteps.theWorkerExists(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User creates a worker with too many initials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have the worker \"DANKMEMES\"",
  "keyword": "Given "
});
formatter.match({
  "location": "WorkerSteps.iHaveTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add the worker \"DANKMEMES\"",
  "keyword": "When "
});
formatter.match({
  "location": "WorkerSteps.iAddTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker \"DANKMEMES\" does not exist",
  "keyword": "Then "
});
formatter.match({
  "location": "WorkerSteps.theWorkerDoesNotExist(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the error message \"Too many initials\"",
  "keyword": "And "
});
formatter.match({
  "location": "MiscSteps.iGetTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User creates an existing worker",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have the worker \"DANK\"",
  "keyword": "Given "
});
formatter.match({
  "location": "WorkerSteps.iHaveTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add the worker \"DANK\"",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iAddTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add the worker \"DANK\"",
  "keyword": "When "
});
formatter.match({
  "location": "WorkerSteps.iAddTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the error message \"This worker already exists\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MiscSteps.iGetTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Creating a worker with blank name",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have the worker \"\"",
  "keyword": "Given "
});
formatter.match({
  "location": "WorkerSteps.iHaveTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add the worker \"\"",
  "keyword": "When "
});
formatter.match({
  "location": "WorkerSteps.iAddTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker \"\" does not exist",
  "keyword": "Then "
});
formatter.match({
  "location": "WorkerSteps.theWorkerDoesNotExist(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the error message \"Worker must have initials\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MiscSteps.iGetTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Creating a worker with spaces in the initials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have the worker \"GJ\"",
  "keyword": "Given "
});
formatter.match({
  "location": "WorkerSteps.iHaveTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker \"GJ\" does not exist",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.theWorkerDoesNotExist(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have the worker \" g j\"",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iHaveTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add the worker \" g j\"",
  "keyword": "When "
});
formatter.match({
  "location": "WorkerSteps.iAddTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker \"GJ\" exists",
  "keyword": "Then "
});
formatter.match({
  "location": "WorkerSteps.theWorkerExists(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Creating a worker with spaces in the initials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have the worker \"GJ\"",
  "keyword": "Given "
});
formatter.match({
  "location": "WorkerSteps.iHaveTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker \"GJ\" does not exist",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.theWorkerDoesNotExist(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have the worker \".g.j......\"",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iHaveTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add the worker \".g.j......\"",
  "keyword": "When "
});
formatter.match({
  "location": "WorkerSteps.iAddTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker \"GJ\" exists",
  "keyword": "Then "
});
formatter.match({
  "location": "WorkerSteps.theWorkerExists(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Creating a worker with blank name (version 2)",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have the worker \".  \"",
  "keyword": "Given "
});
formatter.match({
  "location": "WorkerSteps.iHaveTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add the worker \".  \"",
  "keyword": "When "
});
formatter.match({
  "location": "WorkerSteps.iAddTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the error message \"Worker must have initials\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MiscSteps.iGetTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("use_cases/deleteWorker.feature");
formatter.feature({
  "name": "Delete Workers",
  "description": "\tDescription: The user removes workers from an activity\n\tActors: User",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User deletes a worker",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have the worker \"DANK\"",
  "keyword": "Given "
});
formatter.match({
  "location": "WorkerSteps.iHaveTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add the worker \"DANK\"",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iAddTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I delete the worker \"DANK\"",
  "keyword": "When "
});
formatter.match({
  "location": "WorkerSteps.iDeleteTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker \"DANK\" does not exist",
  "keyword": "Then "
});
formatter.match({
  "location": "WorkerSteps.theWorkerDoesNotExist(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User delete a worker which does not exist",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have the worker \"DANK\"",
  "keyword": "Given "
});
formatter.match({
  "location": "WorkerSteps.iHaveTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker \"DANK\" does not exist",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.theWorkerDoesNotExist(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I delete the worker \"DANK\"",
  "keyword": "When "
});
formatter.match({
  "location": "WorkerSteps.iDeleteTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the error message \"This worker does not exist\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MiscSteps.iGetTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("use_cases/editActivity.feature");
formatter.feature({
  "name": "Activity editing for a project",
  "description": "\tDescription: A user edits activities in a project\n\tActors: User",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add a non existing activity to existing project",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project with ID 180001 has been created",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity \"Programming\" does not exist in the project with ID 180001",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.theActivityDoesNotExistInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add the activity \"Programming\" to the project with ID 180001",
  "keyword": "When "
});
formatter.match({
  "location": "ActivitySteps.iAddTheActivityToTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity \"Programming\" exists in the project with ID 180001",
  "keyword": "Then "
});
formatter.match({
  "location": "ActivitySteps.theActivityExistsInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add an activity with no name to existing project",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project with ID 180001 has been created",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add the activity \" \" to the project with ID 180001",
  "keyword": "When "
});
formatter.match({
  "location": "ActivitySteps.iAddTheActivityToTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the error message \"An activity must have a name\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MiscSteps.iGetTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add an already existing activity to existing project",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project with ID 180001 has been created",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity \"Programming\" has already been added to the project with ID 180001",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.theActivityHasAlreadyBeenCreatedInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add the activity \"Programming\" to the project with ID 180001",
  "keyword": "When "
});
formatter.match({
  "location": "ActivitySteps.iAddTheActivityToTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the error message \"That activity already exists\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MiscSteps.iGetTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Remove an existing activity from a project",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project with ID 180001 has been created",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity \"Programming\" has already been added to the project with ID 180001",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.theActivityHasAlreadyBeenCreatedInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I remove the activity \"Programming\" from the project with ID 180001",
  "keyword": "When "
});
formatter.match({
  "location": "ActivitySteps.iRemoveTheActivityFromTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity \"Programming\" does not exist in the project with ID 180001",
  "keyword": "Then "
});
formatter.match({
  "location": "ActivitySteps.theActivityDoesNotExistInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Remove an non existing activity from a project",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project with ID 180001 has been created",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity \"Programming\" does not exist in the project with ID 180001",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.theActivityDoesNotExistInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I remove the activity \"Programming\" from the project with ID 180001",
  "keyword": "When "
});
formatter.match({
  "location": "ActivitySteps.iRemoveTheActivityFromTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the error message \"That activity does not exist\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MiscSteps.iGetTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Edit non-existing project",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project with ID 180001 does not exist",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDDoesNotExist(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select the project with ID 180001",
  "keyword": "When "
});
formatter.match({
  "location": "ProjectSteps.iSelectTheProjectWithID(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the error message \"A project with that ID does not exist\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MiscSteps.iGetTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Rename activity to non existing name",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project with ID 180001 has been created",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity \"Programming\" has already been added to the project with ID 180001",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.theActivityHasAlreadyBeenCreatedInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity \"Coffee break\" does not exist in the project with ID 180001",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.theActivityDoesNotExistInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I rename the activity \"Programming\" in the project with ID 180001 to \"Coffee break\"",
  "keyword": "When "
});
formatter.match({
  "location": "ActivitySteps.iRenameTheActivityInTheProjectWithIDTo(String,int,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity \"Coffee break\" exists in the project with ID 180001",
  "keyword": "Then "
});
formatter.match({
  "location": "ActivitySteps.theActivityExistsInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity \"Programming\" does not exist in the project with ID 180001",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.theActivityDoesNotExistInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Rename activity to existing name",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project with ID 180001 has been created",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity \"Programming\" has already been added to the project with ID 180001",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.theActivityHasAlreadyBeenCreatedInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity \"Coffee break\" has already been added to the project with ID 180001",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.theActivityHasAlreadyBeenCreatedInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I rename the activity \"Programming\" in the project with ID 180001 to \"Coffee break\"",
  "keyword": "When "
});
formatter.match({
  "location": "ActivitySteps.iRenameTheActivityInTheProjectWithIDTo(String,int,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the error message \"That activity name already exists\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MiscSteps.iGetTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Rename non existing activity",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project with ID 180001 has been created",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity \"Programming\" does not exist in the project with ID 180001",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.theActivityDoesNotExistInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I rename the activity \"Programming\" in the project with ID 180001 to \"Coffee break\"",
  "keyword": "When "
});
formatter.match({
  "location": "ActivitySteps.iRenameTheActivityInTheProjectWithIDTo(String,int,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the error message \"That activity does not exist\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MiscSteps.iGetTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Set start and end time of activity",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project with ID 180001 has been created",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity \"Programming\" has already been added to the project with ID 180001",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.theActivityHasAlreadyBeenCreatedInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the start of the activity \"Programming\" in the project with ID 180001 to week 4 of 2130",
  "keyword": "When "
});
formatter.match({
  "location": "ActivitySteps.iSetTheStartOfTheActivityInTheProjectWithIDToWeekOf(String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the end of the activity \"Programming\" in the project with ID 180001 to week 7 of 2130",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.iSetTheEndOfTheActivityInTheProjectWithIDToWeekOf(String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the start of the activity \"Programming\" in the project with ID 180001 is week 4 of 2130",
  "keyword": "Then "
});
formatter.match({
  "location": "ActivitySteps.theStartOfTheActivityInTheProjectWithIDIsWeekOf(String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the end of the activity \"Programming\" in the project with ID 180001 is week 7 of 2130",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.theEndOfTheActivityInTheProjectWithIDIsWeekOf(String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Set start time of activity after end time",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project with ID 180001 has been created",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity \"Programming\" has already been added to the project with ID 180001",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.theActivityHasAlreadyBeenCreatedInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the end of the activity \"Programming\" in the project with ID 180001 to week 4 of 2130",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.iSetTheEndOfTheActivityInTheProjectWithIDToWeekOf(String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the start of the activity \"Programming\" in the project with ID 180001 to week 7 of 2130",
  "keyword": "When "
});
formatter.match({
  "location": "ActivitySteps.iSetTheStartOfTheActivityInTheProjectWithIDToWeekOf(String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the error message \"Activity start must be before activity end\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MiscSteps.iGetTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("use_cases/findAssignedWorkers.feature");
formatter.feature({
  "name": "Find assigned workers of a given activity",
  "description": "    Description: The user searches for assigned workers of a activity\n    Actors: User / project leader",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User searches for assigned workers of the activity \"G.O.A.T.\" successfully (1 worker)",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project with ID 180666 has been created",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity \"G.O.A.T.\" has already been added to the project with ID 180666",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.theActivityHasAlreadyBeenCreatedInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the end of the activity \"G.O.A.T.\" in the project with ID 180666 to week 7 of 2020",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.iSetTheEndOfTheActivityInTheProjectWithIDToWeekOf(String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the start of the activity \"G.O.A.T.\" in the project with ID 180666 to week 5 of 2020",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.iSetTheStartOfTheActivityInTheProjectWithIDToWeekOf(String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have the worker \"JONH\"",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iHaveTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add the worker \"JONH\"",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iAddTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I assign the worker \"JONH\" to the activity \"G.O.A.T.\" in the project with ID 180666",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iAssignTheWorkerToTheActivityInTheProjectWithID(String,String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for assigned workers of the activity \"G.O.A.T.\" in the project with ID 180666",
  "keyword": "When "
});
formatter.match({
  "location": "WorkerSteps.iSearchForAssignedWorkersOfTheActivityInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get a list of length 1 which contains the workers \"JONH\"",
  "keyword": "Then "
});
formatter.match({
  "location": "WorkerSteps.iGetAListOfLengthWhichContainsTheWorkers(int,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User searches for assigned workers of the activity \"G.O.A.T.\" successfully (\u003e1 workers)",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project with ID 180666 has been created",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity \"G.O.A.T.\" has already been added to the project with ID 180666",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.theActivityHasAlreadyBeenCreatedInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the end of the activity \"G.O.A.T.\" in the project with ID 180666 to week 7 of 2020",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.iSetTheEndOfTheActivityInTheProjectWithIDToWeekOf(String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the start of the activity \"G.O.A.T.\" in the project with ID 180666 to week 5 of 2020",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.iSetTheStartOfTheActivityInTheProjectWithIDToWeekOf(String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have the worker \"JONH\"",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iHaveTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add the worker \"JONH\"",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iAddTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I assign the worker \"JONH\" to the activity \"G.O.A.T.\" in the project with ID 180666",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iAssignTheWorkerToTheActivityInTheProjectWithID(String,String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have the worker \"MICK\"",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iHaveTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add the worker \"MICK\"",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iAddTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I assign the worker \"JONH\" to the activity \"G.O.A.T.\" in the project with ID 180666",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iAssignTheWorkerToTheActivityInTheProjectWithID(String,String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for assigned workers of the activity \"G.O.A.T.\" in the project with ID 180666",
  "keyword": "When "
});
formatter.match({
  "location": "WorkerSteps.iSearchForAssignedWorkersOfTheActivityInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get a list of length 2 which contains the workers \"JONH\" and \"MICK\"",
  "keyword": "Then "
});
formatter.match({
  "location": "WorkerSteps.iGetAListOfLengthWhichContainsTheWorkersAnd(int,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Activity does not exist",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project with ID 180069 has been created",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity \"Sexual harassment\" does not exist in the project with ID 180069",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.theActivityDoesNotExistInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for assigned workers of the activity \"Sexual harassment\" in the project with ID 180069",
  "keyword": "When "
});
formatter.match({
  "location": "WorkerSteps.iSearchForAssignedWorkersOfTheActivityInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the error message \"This activity does not exist in that project\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MiscSteps.iGetTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "No workers assigned to the activity \"G.O.A.T.\"",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project with ID 180666 has been created",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity \"G.O.A.T.\" has already been added to the project with ID 180666",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.theActivityHasAlreadyBeenCreatedInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there are no assigned workers to the activity \"G.O.A.T.\" in the project with ID 180666",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.thereAreNoAssignedWorkersToTheActivityInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for assigned workers of the activity \"G.O.A.T.\" in the project with ID 180666",
  "keyword": "When "
});
formatter.match({
  "location": "WorkerSteps.iSearchForAssignedWorkersOfTheActivityInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the error message \"No workers assigned to the activity\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MiscSteps.iGetTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Project does not exist",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project with ID 180069 does not exist",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDDoesNotExist(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for assigned workers of the activity \"Sexual harassment\" in the project with ID 180069",
  "keyword": "When "
});
formatter.match({
  "location": "WorkerSteps.iSearchForAssignedWorkersOfTheActivityInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the error message \"A project with that ID does not exist\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MiscSteps.iGetTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Searching for blank project",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I search for assigned workers of the activity \"G.O.A.T.\" without specifying project ID",
  "keyword": "When "
});
formatter.match({
  "location": "WorkerSteps.iSearchForAssignedWorkersOfTheActivityWithoutSpecifyingProjectID(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the error message \"You have to specify a project ID\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MiscSteps.iGetTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Searching for blank activity",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I search for assigned workers of the activity \"\" in the project with ID 180666",
  "keyword": "When "
});
formatter.match({
  "location": "WorkerSteps.iSearchForAssignedWorkersOfTheActivityInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the error message \"You have to specify an activity\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MiscSteps.iGetTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("use_cases/findAvailableWorkers.feature");
formatter.feature({
  "name": "Find available workers for given activity",
  "description": "    Description: The user searches for available workers\n    Actors: User / project leader",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User searches for available workers successfully (1 worker)",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have the worker \"HAT\"",
  "keyword": "Given "
});
formatter.match({
  "location": "WorkerSteps.iHaveTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add the worker \"HAT\"",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iAddTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with ID 184444 has been created",
  "keyword": "And "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity \"Free Tibet\" has already been added to the project with ID 184444",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.theActivityHasAlreadyBeenCreatedInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the end of the activity \"Free Tibet\" in the project with ID 184444 to week 7 of 2020",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.iSetTheEndOfTheActivityInTheProjectWithIDToWeekOf(String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the start of the activity \"Free Tibet\" in the project with ID 184444 to week 5 of 2020",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.iSetTheStartOfTheActivityInTheProjectWithIDToWeekOf(String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity \"Bomb the Great Wall\" has already been added to the project with ID 184444",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.theActivityHasAlreadyBeenCreatedInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the end of the activity \"Bomb the Great Wall\" in the project with ID 184444 to week 6 of 2020",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.iSetTheEndOfTheActivityInTheProjectWithIDToWeekOf(String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the start of the activity \"Bomb the Great Wall\" in the project with ID 184444 to week 6 of 2020",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.iSetTheStartOfTheActivityInTheProjectWithIDToWeekOf(String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I assign the worker \"HAT\" to the activity \"Bomb the Great Wall\" in the project with ID 184444",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iAssignTheWorkerToTheActivityInTheProjectWithID(String,String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for available workers for the activity \"Free Tibet\" in the project with ID 184444",
  "keyword": "When "
});
formatter.match({
  "location": "WorkerSteps.iSearchForAvailableWorkersForTheActivityInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get a list of length 1 which contains the workers \"HAT\"",
  "keyword": "Then "
});
formatter.match({
  "location": "WorkerSteps.iGetAListOfLengthWhichContainsTheWorkers(int,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User searches for available workers successfully (1 worker among more workers)",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have the worker \"HAT\"",
  "keyword": "Given "
});
formatter.match({
  "location": "WorkerSteps.iHaveTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add the worker \"HAT\"",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iAddTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have the worker \"FISK\"",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iHaveTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add the worker \"FISK\"",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iAddTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with ID 184444 has been created",
  "keyword": "And "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity \"Free Tibet\" has already been added to the project with ID 184444",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.theActivityHasAlreadyBeenCreatedInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the end of the activity \"Free Tibet\" in the project with ID 184444 to week 7 of 2020",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.iSetTheEndOfTheActivityInTheProjectWithIDToWeekOf(String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the start of the activity \"Free Tibet\" in the project with ID 184444 to week 5 of 2020",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.iSetTheStartOfTheActivityInTheProjectWithIDToWeekOf(String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker \"FISK\" is assigned to 20 activities which start on week 6 of 2020 and end on week 6 of 2020",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.theWorkerIsAssignedToActivitiesWhichStartOnWeekOfAndEndOnWeekOf(String,int,int,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for available workers for the activity \"Free Tibet\" in the project with ID 184444",
  "keyword": "When "
});
formatter.match({
  "location": "WorkerSteps.iSearchForAvailableWorkersForTheActivityInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get a list of length 1 which contains the workers \"HAT\"",
  "keyword": "Then "
});
formatter.match({
  "location": "WorkerSteps.iGetAListOfLengthWhichContainsTheWorkers(int,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "No workers are available",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have the worker \"HAT\"",
  "keyword": "Given "
});
formatter.match({
  "location": "WorkerSteps.iHaveTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add the worker \"HAT\"",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iAddTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with ID 184444 has been created",
  "keyword": "And "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity \"Free Tibet\" has already been added to the project with ID 184444",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.theActivityHasAlreadyBeenCreatedInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the end of the activity \"Free Tibet\" in the project with ID 184444 to week 7 of 2020",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.iSetTheEndOfTheActivityInTheProjectWithIDToWeekOf(String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the start of the activity \"Free Tibet\" in the project with ID 184444 to week 5 of 2020",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.iSetTheStartOfTheActivityInTheProjectWithIDToWeekOf(String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker \"HAT\" is assigned to 20 activities which start on week 6 of 2020 and end on week 6 of 2020",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.theWorkerIsAssignedToActivitiesWhichStartOnWeekOfAndEndOnWeekOf(String,int,int,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for available workers for the activity \"Free Tibet\" in the project with ID 184444",
  "keyword": "When "
});
formatter.match({
  "location": "WorkerSteps.iSearchForAvailableWorkersForTheActivityInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the error message \"No workers available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MiscSteps.iGetTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker is on vacation",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have the worker \"HAT\"",
  "keyword": "Given "
});
formatter.match({
  "location": "WorkerSteps.iHaveTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add the worker \"HAT\"",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iAddTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with ID 184444 has been created",
  "keyword": "And "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity \"Free Tibet\" has already been added to the project with ID 184444",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.theActivityHasAlreadyBeenCreatedInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the end of the activity \"Free Tibet\" in the project with ID 184444 to week 7 of 2020",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.iSetTheEndOfTheActivityInTheProjectWithIDToWeekOf(String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the start of the activity \"Free Tibet\" in the project with ID 184444 to week 5 of 2020",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.iSetTheStartOfTheActivityInTheProjectWithIDToWeekOf(String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker \"HAT\" is on vacation from week 6 to week 6 of 2020",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.theWorkerIsOnVacationFromWeekToWeekOf(String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for available workers for the activity \"Free Tibet\" in the project with ID 184444",
  "keyword": "When "
});
formatter.match({
  "location": "WorkerSteps.iSearchForAvailableWorkersForTheActivityInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the error message \"No workers available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MiscSteps.iGetTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The activity for which available workers are being sought has no duration",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project with ID 184444 has been created",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity \"Free Tibet\" has already been added to the project with ID 184444",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.theActivityHasAlreadyBeenCreatedInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for available workers for the activity \"Free Tibet\" in the project with ID 184444",
  "keyword": "When "
});
formatter.match({
  "location": "WorkerSteps.iSearchForAvailableWorkersForTheActivityInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the error message \"Must set activity duration before searching for available workers\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MiscSteps.iGetTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("use_cases/listProject.feature");
formatter.feature({
  "name": "List projects",
  "description": "\tDescription: A user searches for projects and gets a list\n\tActors: User",
  "keyword": "Feature"
});
formatter.background({
  "name": "The system has a number of projects",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "these project IDs with names exist in the system",
  "rows": [
    {
      "cells": [
        "180001",
        "Project 2018 1"
      ]
    },
    {
      "cells": [
        "160021",
        "The Number 21"
      ]
    },
    {
      "cells": [
        "170404",
        "Damned difficult to find"
      ]
    },
    {
      "cells": [
        "180042",
        "The meaning"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theseIDsWithNamesExistsInTheSystem(String\u003e\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Searching for all projects",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I search for \"*\"",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.iSearchFor(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I find projects with ID 180001, 160021, 170404 and 180042",
  "keyword": "Then "
});
formatter.match({
  "location": "ProjectSteps.iFindProjectsWithIDAnd(int,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "The system has a number of projects",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "these project IDs with names exist in the system",
  "rows": [
    {
      "cells": [
        "180001",
        "Project 2018 1"
      ]
    },
    {
      "cells": [
        "160021",
        "The Number 21"
      ]
    },
    {
      "cells": [
        "170404",
        "Damned difficult to find"
      ]
    },
    {
      "cells": [
        "180042",
        "The meaning"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theseIDsWithNamesExistsInTheSystem(String\u003e\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Finding exact match by ID search",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I search for \"180001\"",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.iSearchFor(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I find projects with ID 180001",
  "keyword": "Then "
});
formatter.match({
  "location": "ProjectSteps.iFindProjectsWithID(int)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "The system has a number of projects",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "these project IDs with names exist in the system",
  "rows": [
    {
      "cells": [
        "180001",
        "Project 2018 1"
      ]
    },
    {
      "cells": [
        "160021",
        "The Number 21"
      ]
    },
    {
      "cells": [
        "170404",
        "Damned difficult to find"
      ]
    },
    {
      "cells": [
        "180042",
        "The meaning"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theseIDsWithNamesExistsInTheSystem(String\u003e\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Find multiple projects by searching for part of ID",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I search for \"18\"",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.iSearchFor(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I find projects with ID 180001 and 180042",
  "keyword": "Then "
});
formatter.match({
  "location": "ProjectSteps.iFindProjectsWithIDAnd(int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "The system has a number of projects",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "these project IDs with names exist in the system",
  "rows": [
    {
      "cells": [
        "180001",
        "Project 2018 1"
      ]
    },
    {
      "cells": [
        "160021",
        "The Number 21"
      ]
    },
    {
      "cells": [
        "170404",
        "Damned difficult to find"
      ]
    },
    {
      "cells": [
        "180042",
        "The meaning"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theseIDsWithNamesExistsInTheSystem(String\u003e\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Find one project by name search",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I search for \"The Number 21\"",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.iSearchFor(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I find projects with ID 160021",
  "keyword": "Then "
});
formatter.match({
  "location": "ProjectSteps.iFindProjectsWithID(int)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "The system has a number of projects",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "these project IDs with names exist in the system",
  "rows": [
    {
      "cells": [
        "180001",
        "Project 2018 1"
      ]
    },
    {
      "cells": [
        "160021",
        "The Number 21"
      ]
    },
    {
      "cells": [
        "170404",
        "Damned difficult to find"
      ]
    },
    {
      "cells": [
        "180042",
        "The meaning"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theseIDsWithNamesExistsInTheSystem(String\u003e\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Find multiple projects by part name search",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I search for \"The\"",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.iSearchFor(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I find projects with ID 160021 and 180042",
  "keyword": "Then "
});
formatter.match({
  "location": "ProjectSteps.iFindProjectsWithIDAnd(int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "The system has a number of projects",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "these project IDs with names exist in the system",
  "rows": [
    {
      "cells": [
        "180001",
        "Project 2018 1"
      ]
    },
    {
      "cells": [
        "160021",
        "The Number 21"
      ]
    },
    {
      "cells": [
        "170404",
        "Damned difficult to find"
      ]
    },
    {
      "cells": [
        "180042",
        "The meaning"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theseIDsWithNamesExistsInTheSystem(String\u003e\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "No projects found",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I search for \"haha\"",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.iSearchFor(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the error message \"No projects containing that string found\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MiscSteps.iGetTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "The system has a number of projects",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "these project IDs with names exist in the system",
  "rows": [
    {
      "cells": [
        "180001",
        "Project 2018 1"
      ]
    },
    {
      "cells": [
        "160021",
        "The Number 21"
      ]
    },
    {
      "cells": [
        "170404",
        "Damned difficult to find"
      ]
    },
    {
      "cells": [
        "180042",
        "The meaning"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theseIDsWithNamesExistsInTheSystem(String\u003e\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search for empty string",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I search for \" \"",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.iSearchFor(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the error message \"Must specify search term\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MiscSteps.iGetTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("use_cases/optionalProjectVariables.feature");
formatter.feature({
  "name": "Set optional project variables",
  "description": "\tDescription: The user sets project variables which are not required\n\tActors: User",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User assigns project leader",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project with ID 184321 has been created",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have the worker \"GRLT\"",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iHaveTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add the worker \"GRLT\"",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iAddTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker \"GRLT\" exists",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.theWorkerExists(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the project leader of the project with ID 184321 to worker \"GRLT\"",
  "keyword": "When "
});
formatter.match({
  "location": "ProjectSteps.iSetTheProjectLeaderOfTheProjectWithIDToWorker(int,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project leader of the project with ID 184321 is worker \"GRLT\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ProjectSteps.theProjectLeaderOfTheProjectWithIDIsWorker(int,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User assigns project name",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project with ID 184321 has been created",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the name of the project with ID 184321 to \"CD Projekt Red\"",
  "keyword": "When "
});
formatter.match({
  "location": "ProjectSteps.iSetTheNameOfTheProjectWithIDTo(int,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the name of the project with ID 184321 is \"CD Projekt Red\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ProjectSteps.theNameOfTheProjectWithIDIs(int,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User sets project type to internal",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project with ID 184321 has been created",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the project type of the project with ID 184321 to be \"Internal\"",
  "keyword": "When "
});
formatter.match({
  "location": "ProjectSteps.iSetTheProjectTypeOfTheProjectWithIDToBe(int,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project type of the project with ID 184321 is \"Internal\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ProjectSteps.theProjectTypeOfTheProjectWithIDIs(int,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User sets project type to something invalid",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project with ID 184321 has been created",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the project type of the project with ID 184321 to be \"John\"",
  "keyword": "When "
});
formatter.match({
  "location": "ProjectSteps.iSetTheProjectTypeOfTheProjectWithIDToBe(int,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the error message \"That is not a valid project type\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MiscSteps.iGetTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User sets the customer",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project with ID 184321 has been created",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the customer of the project with ID 184321 to be \"Shinra Electric Power Company\"",
  "keyword": "When "
});
formatter.match({
  "location": "ProjectSteps.iSetTheCustomerOfTheProjectWithIDToBe(int,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the customer of the project with ID 184321 is \"Shinra Electric Power Company\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ProjectSteps.theCustomerOfTheProjectWithIDIs(int,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User sets project start",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project with ID 184321 has been created",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set project start of the project with ID 184321 to be week 5 of 2020",
  "keyword": "When "
});
formatter.match({
  "location": "ProjectSteps.iSetProjectStartOfTheProjectWithIDToBeWeekOf(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project start of the project with ID 184321 is week 5 of 2020",
  "keyword": "Then "
});
formatter.match({
  "location": "ProjectSteps.theProjectStartOfTheProjectWithIDIsWeekOf(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User sets project end",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project with ID 184321 has been created",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set project end of the project with ID 184321 to be week 5 of 2020",
  "keyword": "When "
});
formatter.match({
  "location": "ProjectSteps.iSetProjectEndOfTheProjectWithIDToBeWeekOf(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project end of the project with ID 184321 is week 5 of 2020",
  "keyword": "Then "
});
formatter.match({
  "location": "ProjectSteps.theProjectEndOfTheProjectWithIDIsWeekOf(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User sets project end to be before project start",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project with ID 184321 has been created",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set project start of the project with ID 184321 to be week 8 of 2020",
  "keyword": "And "
});
formatter.match({
  "location": "ProjectSteps.iSetProjectStartOfTheProjectWithIDToBeWeekOf(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set project end of the project with ID 184321 to be week 7 of 2020",
  "keyword": "When "
});
formatter.match({
  "location": "ProjectSteps.iSetProjectEndOfTheProjectWithIDToBeWeekOf(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the error message \"Project end must be after project start\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MiscSteps.iGetTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User sets project end to be before the end of an activity in the project",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project with ID 184321 has been created",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity \"Final Countdown\" has already been added to the project with ID 184321",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.theActivityHasAlreadyBeenCreatedInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the start of the activity \"Final Countdown\" in the project with ID 184321 to week 5 of 2020",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.iSetTheStartOfTheActivityInTheProjectWithIDToWeekOf(String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the end of the activity \"Final Countdown\" in the project with ID 184321 to week 8 of 2020",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.iSetTheEndOfTheActivityInTheProjectWithIDToWeekOf(String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set project end of the project with ID 184321 to be week 7 of 2020",
  "keyword": "When "
});
formatter.match({
  "location": "ProjectSteps.iSetProjectEndOfTheProjectWithIDToBeWeekOf(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the error message \"There are activities in this project which end after this time\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MiscSteps.iGetTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("use_cases/removeWorkers.feature");
formatter.feature({
  "name": "Remove Workers",
  "description": "\tDescription: The user removes workers from an activity\n\tActors: User",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User removes worker from an activity",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project with ID 180420 has been created",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity \"Smoke Weed\" has already been added to the project with ID 180420",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.theActivityHasAlreadyBeenCreatedInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the start of the activity \"Smoke Weed\" in the project with ID 180420 to week 5 of 2020",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.iSetTheStartOfTheActivityInTheProjectWithIDToWeekOf(String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the end of the activity \"Smoke Weed\" in the project with ID 180420 to week 7 of 2020",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.iSetTheEndOfTheActivityInTheProjectWithIDToWeekOf(String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have the worker \"BOBM\"",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iHaveTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add the worker \"BOBM\"",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iAddTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I assign the worker \"BOBM\" to the activity \"Smoke Weed\" in the project with ID 180420",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iAssignTheWorkerToTheActivityInTheProjectWithID(String,String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I remove the worker \"BOBM\" from the activity \"Smoke Weed\" in the project with ID 180420",
  "keyword": "When "
});
formatter.match({
  "location": "WorkerSteps.iRemoveTheWorkerFromTheActivityInTheProjectWithID(String,String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker \"BOBM\" is not assigned to the activity \"Smoke Weed\" in the project with ID 180420",
  "keyword": "Then "
});
formatter.match({
  "location": "WorkerSteps.theWorkerIsNotAssignedToTheActivityInTheProjectWithID(String,String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User removes worker from an activity which does not exist",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project with ID 180420 has been created",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have the worker \"BOBM\"",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iHaveTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add the worker \"BOBM\"",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iAddTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I remove the worker \"BOBM\" from the activity \"Smoke Weed\" in the project with ID 180420",
  "keyword": "When "
});
formatter.match({
  "location": "WorkerSteps.iRemoveTheWorkerFromTheActivityInTheProjectWithID(String,String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the error message \"This activity does not exist in that project\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MiscSteps.iGetTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User removes worker from an activity in a project which does not exist",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project with ID 180420 does not exist",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDDoesNotExist(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have the worker \"BOBM\"",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iHaveTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add the worker \"BOBM\"",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iAddTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I remove the worker \"BOBM\" from the activity \"Smoke Weed\" in the project with ID 180420",
  "keyword": "When "
});
formatter.match({
  "location": "WorkerSteps.iRemoveTheWorkerFromTheActivityInTheProjectWithID(String,String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the error message \"A project with that ID does not exist\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MiscSteps.iGetTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User removes non-existing worker from an activity",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project with ID 180420 has been created",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity \"Smoke Weed\" has already been added to the project with ID 180420",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.theActivityHasAlreadyBeenCreatedInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have the worker \"BOBM\"",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iHaveTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker \"BOBM\" does not exist",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.theWorkerDoesNotExist(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I remove the worker \"BOBM\" from the activity \"Smoke Weed\" in the project with ID 180420",
  "keyword": "When "
});
formatter.match({
  "location": "WorkerSteps.iRemoveTheWorkerFromTheActivityInTheProjectWithID(String,String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the error message \"This worker does not exist\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MiscSteps.iGetTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User removes worker from an activity which the worker is not assigned to",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project with ID 180420 has been created",
  "keyword": "Given "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDHasBeenCreated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity \"Smoke Weed\" has already been added to the project with ID 180420",
  "keyword": "And "
});
formatter.match({
  "location": "ActivitySteps.theActivityHasAlreadyBeenCreatedInTheProjectWithID(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have the worker \"BOBM\"",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iHaveTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add the worker \"BOBM\"",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.iAddTheWorker(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker \"BOBM\" is not assigned to the activity \"Smoke Weed\" in the project with ID 180420",
  "keyword": "And "
});
formatter.match({
  "location": "WorkerSteps.theWorkerIsNotAssignedToTheActivityInTheProjectWithID(String,String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I remove the worker \"BOBM\" from the activity \"Smoke Weed\" in the project with ID 180420",
  "keyword": "When "
});
formatter.match({
  "location": "WorkerSteps.iRemoveTheWorkerFromTheActivityInTheProjectWithID(String,String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the error message \"This worker is not assigned to that activity\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MiscSteps.iGetTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
});