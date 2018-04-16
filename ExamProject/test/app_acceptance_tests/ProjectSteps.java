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
	//private Project project;
		
	private List<Project> projects;
	
	
	public ProjectSteps(App app, Project project) {
		this.app = app;
		//this.project = project;
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
	}

//	@Given("^the project with ID (\\d+) does not exist$")
//	public void theProjectWithIDDoesNotExist(int ID) throws Exception {
//	    assertThat(app.getProjects(), not(hasItem(project)));
//	}

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

	@When("^I add the project with ID (\\d+)$")
	public void iAddTheProjectWithID(int ID) throws Exception {
	    	try {
				app.createProject();
			} catch (Exception e) {
				// TODO: handle exception
			}
	}
 
	// Third Create Project Scenario
	
	@Given("^the ID of the last project created does not start with (\\d+)$")
	public void theIDOfTheLastProjectCreatedDoesNotStartWith(int arg1) throws Exception {
		assertTrue(app.lastIdGenerated()/1000 != arg1);
	}

	@When("^I create the project$")
	public void iCreateTheProject() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
