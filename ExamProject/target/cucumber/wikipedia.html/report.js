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
  "name": "I have the project with ID 180001",
  "keyword": "And "
});
formatter.match({
  "location": "ProjectSteps.iHaveTheProjectWithID(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with ID 180001 does not exist",
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
  "name": "the project with ID 180001 exists",
  "keyword": "Then "
});
formatter.match({
  "location": "ProjectSteps.theProjectWithIDExists(int)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: \nExpected: a collection containing \u003capp.Project@fa4c865\u003e\n     but: was \u003capp.Project@3bd82cf5\u003e\n\tat org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)\n\tat org.junit.Assert.assertThat(Assert.java:956)\n\tat org.junit.Assert.assertThat(Assert.java:923)\n\tat app_acceptance_tests.ProjectSteps.theProjectWithIDExists(ProjectSteps.java:102)\n\tat ✽.the project with ID 180001 exists(use_cases/createProject.feature:11)\n",
  "status": "failed"
});
formatter.step({
  "name": "the serial number is now 0002",
  "keyword": "And "
});
formatter.match({
  "location": "ProjectSteps.theSerialNumberIsNow(int)"
});
formatter.result({
  "status": "skipped"
});
});