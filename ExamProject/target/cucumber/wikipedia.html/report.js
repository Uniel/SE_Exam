$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("use_cases/createProject.feature");
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
  "name": "the project with ID 180001 exists",
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
  "name": "the project with ID 190000 exists",
  "keyword": "Then "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDExists(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the serial number is now 0001",
  "keyword": "And "
});
formatter.match({
  "location": "ProjectSteps.theSerialNumberIsNow(int)"
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
  "name": "I have the project with ID 180001",
  "keyword": "Given "
});
formatter.match({
  "location": "ActivitySteps.iHaveTheProjectWithID(int)"
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
  "name": "I have the project with ID 180001",
  "keyword": "Given "
});
formatter.match({
  "location": "ActivitySteps.iHaveTheProjectWithID(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with ID 180001 exists",
  "keyword": "And "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDExists(int)"
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
  "name": "I have the project with ID 180001",
  "keyword": "Given "
});
formatter.match({
  "location": "ActivitySteps.iHaveTheProjectWithID(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with ID 180001 exists",
  "keyword": "And "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDExists(int)"
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
  "name": "I have the project with ID 180001",
  "keyword": "Given "
});
formatter.match({
  "location": "ActivitySteps.iHaveTheProjectWithID(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with ID 180001 exists",
  "keyword": "And "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDExists(int)"
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
  "name": "I have the project with ID 180001",
  "keyword": "Given "
});
formatter.match({
  "location": "ActivitySteps.iHaveTheProjectWithID(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with ID 180001 exists",
  "keyword": "And "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDExists(int)"
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
  "location": "ActivitySteps.iSelectTheProjectWithID(int)"
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
  "name": "I have the project with ID 180001",
  "keyword": "Given "
});
formatter.match({
  "location": "ActivitySteps.iHaveTheProjectWithID(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with ID 180001 exists",
  "keyword": "And "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDExists(int)"
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
  "name": "I have the project with ID 180001",
  "keyword": "Given "
});
formatter.match({
  "location": "ActivitySteps.iHaveTheProjectWithID(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with ID 180001 exists",
  "keyword": "And "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDExists(int)"
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
});