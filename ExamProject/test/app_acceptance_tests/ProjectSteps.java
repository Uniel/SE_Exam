package app_acceptance_tests;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.*;

import app.App;
import app.Project;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProjectSteps {

	private App app = new App();
	private ErrorMessageHolder errorMessage;
	private List<Project> projects = new ArrayList<>();
	MockDateHolder dateHolder;
	
	public ProjectSteps(App app, ErrorMessageHolder errorMessage, MockDateHolder dateHolder) {
		this.app = app;
		this.errorMessage = errorMessage;
		this.dateHolder = dateHolder;
	}

	// First Create Project Scenario
	@Given("^the year is (\\d+)$")
	public void theYearIs(int thisYear) throws Exception {
//	    app.projectService.setYear(thisYear);
//	    assertTrue(app.projectService.getYear() == thisYear);
		app.projectService.setDateServer(dateHolder.dateServer);
		dateHolder.setYear(thisYear);
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
		assertTrue(app.selectProject(ID).getProjectID() == ID);
	}

	@Then("^the serial number is now (\\d+)$")
	public void theSerialNumberIsNow(int thisSerial) throws Exception {
	    assertThat(app.projectService.getSerial(), is(thisSerial));
	}
	
	// Second Create project Scenario
	@Given("^the project with ID (\\d+) has been created$")
	public void theProjectWithIDHasBeenCreated(int ID) throws Exception {
	    app.createProject(ID);
		assertTrue(app.selectProject(ID).getProjectID() == ID);
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
	    int thisYear = app.projectService.getYear();
		dateHolder.advanceDateByYears(1);
	    assertTrue(app.projectService.getYear() == thisYear + 1);
	}
	
	// Fourth scenario
	@When("^I remove the project with ID (\\d+)$")
	public void iRemoveTheProjectWithID(int ID) throws Exception {
	    try {
			app.removeProject(ID);
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	/*
	 * Project searching
	 */
	
	@Given("^these project IDs with names exist in the system$")
	public void theseIDsWithNamesExistsInTheSystem(List<List<String>> projects) throws Exception {
		for (List<String> projectInfo : projects) {
//			libraryApp.addBook(new Book(bookInfo.get(0), bookInfo.get(1), bookInfo.get(2)));
			app.createProject(Integer.parseInt(projectInfo.get(0)));
			app.selectProject(Integer.parseInt(projectInfo.get(0))).setName(projectInfo.get(1));
		}
		for (List<String> projectInfo : projects) {
			assertTrue(app.idExists(Integer.parseInt(projectInfo.get(0))));
		}
	}
	
	@Given("^I search for \"([^\"]*)\"$")
	public void iSearchFor(String searchTerm) throws Exception {
	    try {
			projects = app.projectSearch(searchTerm);
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}

	@Then("^I find projects with ID (\\d+), (\\d+), (\\d+) and (\\d+)$")
	public void iFindProjectsWithIDAnd(int ID1, int ID2, int ID3, int ID4) throws Exception {
	    assertTrue(projects.get(0).getProjectID() == ID1);
	    assertTrue(projects.get(1).getProjectID() == ID2);
	    assertTrue(projects.get(2).getProjectID() == ID3);
	    assertTrue(projects.get(3).getProjectID() == ID4);
	}

	@Then("^I find projects with ID (\\d+)$")
	public void iFindProjectsWithID(int ID) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    assertTrue(projects.get(0).getProjectID() == ID);
	}
	
	@Then("^I find projects with ID (\\d+) and (\\d+)$")
	public void iFindProjectsWithIDAnd(int ID1, int ID2) throws Exception {
	    assertTrue(projects.get(0).getProjectID() == ID1);
	    assertTrue(projects.get(1).getProjectID() == ID2);
	}
	

}
