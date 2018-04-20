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
});