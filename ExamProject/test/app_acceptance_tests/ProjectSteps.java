package app_acceptance_tests;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.List;

import app.App;
import app.Project;
//import app.ProjectService;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProjectSteps {

	private App app = new App();
	private Project project;
		
	private List<Project> projects;
	
	
	public ProjectSteps(App app) {
		this.app = app;
	}

	// First Create Project Scenario
	@Given("^the year is (\\d+)$")
	public void theYearIs(int thisYear) throws Exception {
	    app.projectService.setYear(thisYear);
	    assertTrue(app.projectService.getYear() == thisYear);
	}

	@Given("^the serial number is (\\d+)$")
	public void theSerialNumberIs(int thisSerial) throws Exception {
	    app.projectService.setSerial(thisSerial);
	    assertTrue(app.projectService.getSerial() == thisSerial);
	}

	@When("^I create a project$")
	public void iCreateAProject() throws Exception {
		app.createProject();
	}

	@Then("^the project with ID (\\d+) exists$")
	public void theProjectWithIDExists(int ID) throws Exception {
		assertTrue(app.findProjectWithID(ID).getProjectID() == ID);
	}

	@Then("^the serial number is now (\\d+)$")
	public void theSerialNumberIsNow(int thisSerial) throws Exception {
	    assertThat(app.projectService.getSerial(), is(thisSerial));
	}
	
	// Second Create project Scenario
	@Given("^the project with ID (\\d+) has been created$")
	public void theProjectWithIDHasBeenCreated(int ID) throws Exception {
	    app.createProject(ID);
		assertTrue(app.findProjectWithID(ID).getProjectID() == ID);
	}
	
	@Given("^the project with ID (\\d+) does not exist$")
	public void theProjectWithIDDoesNotExist(int ID) throws Exception {
		assertFalse(app.idExists(ID));
	}
 
	// Third Create Project Scenario
	@Given("^the ID of the last project created does not start with (\\d+)$")
	public void theIDOfTheLastProjectCreatedDoesNotStartWith(int soughtID) throws Exception {
		assertTrue(app.lastIdGenerated()/10000 != soughtID);	
	}
	
	@When("^it is the next year$")
	public void itIsTheNextYear() throws Exception {
	    app.projectService.setYear(app.projectService.getYear() + 1);
	}



}
