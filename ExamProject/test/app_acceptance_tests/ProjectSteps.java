package app_acceptance_tests;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.List;

import app.App;
import app.Project;
import app.ProjectService;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProjectSteps {

	private App app = new App();
	private Project project;
	
	//private ProjectService projServ = new ProjectService();
	
	private List<Project> projects;
	
	
	public ProjectSteps(App app, Project project) {
		this.app = app;
		this.project = project;
	}

//	@Given("^the project with ID (\\d+) exists$")
//	public void theProjectWithIDExists(int arg1) throws Exception {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Given("^the activity \"([^\"]*)\" exists in the project with ID (\\d+)$")
//	public void theActivityExistsInTheProjectWithID(String arg1, int arg2) throws Exception {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Given("^I have the worker \"([^\"]*)\"$")
//	public void iHaveTheWorker(String arg1) throws Exception {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Given("^the worker \"([^\"]*)\" exists$")
//	public void theWorkerExists(String arg1) throws Exception {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I assign the worker \"([^\"]*)\" to the activity \"([^\"]*)\" in the project with ID (\\d+)$")
//	public void iAssignTheWorkerToTheActivityInTheProjectWithID(String arg1, String arg2, int arg3) throws Exception {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^the worker \"([^\"]*)\" is assigned to the activity \"([^\"]*)\" in the project with ID (\\d+)$")
//	public void theWorkerIsAssignedToTheActivityInTheProjectWithID(String arg1, String arg2, int arg3) throws Exception {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
	@Given("^the year is (\\d+)$")
	public void theYearIs(int thisYear) throws Exception {
	    app.projectService.setYear(thisYear);
	    assertTrue(app.projectService.getYear() == thisYear);
//	    projServ.setYear(thisYear);
//	    assertTrue(projServ.getYear() == thisYear);
	}

	@Given("^the serial number is (\\d+)$")
	public void theSerialNumberIs(int thisSerial) throws Exception {
	    app.projectService.setSerial(thisSerial);
//	    projServ.setSerial(thisSerial);
	}

	@Given("^the project with ID (\\d+) does not exist$")
	public void theProjectWithIDDoesNotExist(int ID) throws Exception {
	    assertThat(app.getProjects(), not(hasItem(project)));
	}

	@When("^I create a project$")
	public void iCreateAProject() throws Exception {
		app.createProject();
	}

	@Then("^the project with ID (\\d+) exists$")
	public void theProjectWithIDExists(int ID) throws Exception {
		//projects = app.getProjects();
	    //assertThat(app.getProjects(), hasItem(project));
		assertTrue(app.findProjectWithID(ID).getProjectID() == ID);
	}

	@Then("^the serial number is now (\\d+)$")
	public void theSerialNumberIsNow(int thisSerial) throws Exception {
	    assertThat(app.projectService.getSerial(), is(thisSerial));
	}
//
//	@Given("^the worker \"([^\"]*)\" does not exist$")
//	public void theWorkerDoesNotExist(String arg1) throws Exception {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I add the worker \"([^\"]*)\"$")
//	public void iAddTheWorker(String arg1) throws Exception {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^the worker \"([^\"]*)\" exists$")
//	public void theWorkerExists(String arg1) throws Exception {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Given("^I have the activity \"([^\"]*)\"$")
//	public void iHaveTheActivity(String arg1) throws Exception {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Given("^the activity \"([^\"]*)\" does not exist in the project with ID (\\d+)$")
//	public void theActivityDoesNotExistInTheProjectWithID(String arg1, int arg2) throws Exception {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I add the activity \"([^\"]*)\" to the project with ID (\\d+)$")
//	public void iAddTheActivityToTheProjectWithID(String arg1, int arg2) throws Exception {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^the activity \"([^\"]*)\" exists in the project with ID (\\d+)$")
//	public void theActivityExistsInTheProjectWithID(String arg1, int arg2) throws Exception {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Given("^the worker \"([^\"]*)\" is assigned to the activity \"([^\"]*)\" in the project with ID (\\d+)$")
//	public void theWorkerIsAssignedToTheActivityInTheProjectWithID(String arg1, String arg2, int arg3) throws Exception {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I search for assigned workers of the activity \"([^\"]*)\" in the project with ID (\\d+)$")
//	public void iSearchForAssignedWorkersOfTheActivityInTheProjectWithID(String arg1, int arg2) throws Exception {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I get a list of length (\\d+) which contains the workers \"([^\"]*)\"$")
//	public void iGetAListOfLengthWhichContainsTheWorkers(int arg1, String arg2) throws Exception {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Given("^the activity \"([^\"]*)\" in the project with ID (\\d+) starts on week (\\d+) of (\\d+) and ends on week (\\d+) of (\\d+)$")
//	public void theActivityInTheProjectWithIDStartsOnWeekOfAndEndsOnWeekOf(String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) throws Exception {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I search for available workers for the activity \"([^\"]*)\" in the project with ID (\\d+)$")
//	public void iSearchForAvailableWorkersForTheActivityInTheProjectWithID(String arg1, int arg2) throws Exception {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I set the project leader of the project with ID (\\d+) to worker \"([^\"]*)\"$")
//	public void iSetTheProjectLeaderOfTheProjectWithIDToWorker(int arg1, String arg2) throws Exception {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^the project leader of the project with ID (\\d+) is worker \"([^\"]*)\"$")
//	public void theProjectLeaderOfTheProjectWithIDIsWorker(int arg1, String arg2) throws Exception {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I register (\\d+) hours to activity \"([^\"]*)\" in the project with ID (\\d+) on the date (\\d+) (\\d+) (\\d+) to worker \"([^\"]*)\"$")
//	public void iRegisterHoursToActivityInTheProjectWithIDOnTheDateToWorker(int arg1, String arg2, int arg3, int arg4, int arg5, int arg6, String arg7) throws Exception {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^(\\d+) hours are registered to worker \"([^\"]*)\" for the activity \"([^\"]*)\" in the project with ID (\\d+) on the date (\\d+) (\\d+) (\\d+)$")
//	public void hoursAreRegisteredToWorkerForTheActivityInTheProjectWithIDOnTheDate(int arg1, String arg2, String arg3, int arg4, int arg5, int arg6, int arg7) throws Exception {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I remove the worker \"([^\"]*)\" from the activity \"([^\"]*)\" in the project with ID (\\d+)$")
//	public void iRemoveTheWorkerFromTheActivityInTheProjectWithID(String arg1, String arg2, int arg3) throws Exception {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^the worker \"([^\"]*)\" is not assigned to the activity \"([^\"]*)\" in the project with ID (\\d+)$")
//	public void theWorkerIsNotAssignedToTheActivityInTheProjectWithID(String arg1, String arg2, int arg3) throws Exception {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
	
}
