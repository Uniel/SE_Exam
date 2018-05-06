package app_acceptance_tests;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

import app.Activity;
import app.App;
import app.Project;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProjectSteps {

	private App app = new App();
	private ErrorMessageHolder errorMessage;
	private WorkerHelper workerHelper;
	private List<Project> projects = new ArrayList<>();
	MockDateHolder dateHolder;
	private List<Activity> activities = new ArrayList<Activity>();
	
	public ProjectSteps(App app, ErrorMessageHolder errorMessage, MockDateHolder dateHolder, WorkerHelper workerHelper) {
		this.app = app;
		this.errorMessage = errorMessage;
		this.dateHolder = dateHolder;
		this.workerHelper = workerHelper;
	}

	// First Create Project Scenario
	@Given("^the year is (\\d+)$")
	public void theYearIs(int thisYear) throws Exception {
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
		theProjectWithIDExists(ID);
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
	
	@When("^I select the project with ID (\\d+)$")
	public void iSelectTheProjectWithID(int ID) throws Exception {
	    try {
			app.selectProject(ID);
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
	    assertTrue(projects.get(0).getProjectID() == ID);
	}
	
	@Then("^I find projects with ID (\\d+) and (\\d+)$")
	public void iFindProjectsWithIDAnd(int ID1, int ID2) throws Exception {
	    assertTrue(projects.get(0).getProjectID() == ID1);
	    assertTrue(projects.get(1).getProjectID() == ID2);
	}
	
	/*
	 * Setting project variables
	 */
	
	@When("^I set the project leader of the project with ID (\\d+) to worker \"([^\"]*)\"$")
	public void iSetTheProjectLeaderOfTheProjectWithIDToWorker(int ID, String initials) throws Exception {
		assertTrue(workerHelper.getWorker().getInitials() == initials);
		app.selectProject(ID).setLeader(workerHelper.getWorker());
	}
	
	@Then("^the project leader of the project with ID (\\d+) is worker \"([^\"]*)\"$")
	public void theProjectLeaderOfTheProjectWithIDIsWorker(int ID, String initials) throws Exception {
	    assertTrue(app.selectProject(ID).getLeader().getInitials() == initials);
	    assertTrue(app.selectProject(ID).getLeader() == workerHelper.getWorker());
	}
	
	@When("^I set the name of the project with ID (\\d+) to \"([^\"]*)\"$")
	public void iSetTheNameOfTheProjectWithIDTo(int ID, String name) throws Exception {
	    app.selectProject(ID).setName(name);
	}
	
	@Then("^the name of the project with ID (\\d+) is \"([^\"]*)\"$")
	public void theNameOfTheProjectWithIDIs(int ID, String name) throws Exception {
	    assertTrue(app.selectProject(ID).getName().equals(name));
	}
	
	@When("^I set the project type of the project with ID (\\d+) to be \"([^\"]*)\"$")
	public void iSetTheProjectTypeOfTheProjectWithIDToBe(int ID, String type) throws Exception {
	    try {
		app.selectProject(ID).setType(type);
	    } catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@Then("^the project type of the project with ID (\\d+) is \"([^\"]*)\"$")
	public void theProjectTypeOfTheProjectWithIDIs(int ID, String type) throws Exception {
	    assertThat(app.selectProject(ID).getType(),is(equalTo(type)));
	}
	
	@When("^I set the customer of the project with ID (\\d+) to be \"([^\"]*)\"$")
	public void iSetTheCustomerOfTheProjectWithIDToBe(int ID, String customer) throws Exception {
		app.selectProject(ID).setCustomer(customer);
	}
	
	@Then("^the customer of the project with ID (\\d+) is \"([^\"]*)\"$")
	public void theCustomerOfTheProjectWithIDIs(int ID, String customer) throws Exception {
		assertTrue(app.selectProject(ID).getCustomer().equals(customer));
	}
	
	@When("^I set project start of the project with ID (\\d+) to be week (\\d+) of (\\d+)$")
	public void iSetProjectStartOfTheProjectWithIDToBeWeekOf(int ID, int week, int year) throws Exception {
	    try {
		app.selectProject(ID).setStart(week, year);
	    } catch (Exception e) {
	    	errorMessage.setErrorMessage(e.getMessage());
	    }
	}
	
	@Then("^the project start of the project with ID (\\d+) is week (\\d+) of (\\d+)$")
	public void theProjectStartOfTheProjectWithIDIsWeekOf(int ID, int week, int year) throws Exception {
	    assertTrue(app.selectProject(ID).getStart().get(Calendar.WEEK_OF_YEAR) == week);
	    assertTrue(app.selectProject(ID).getStart().get(Calendar.YEAR) == year);
	}
	
	@When("^I set project end of the project with ID (\\d+) to be week (\\d+) of (\\d+)$")
	public void iSetProjectEndOfTheProjectWithIDToBeWeekOf(int ID, int week, int year) throws Exception {
	    try {
		app.selectProject(ID).setEnd(week, year);
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@Then("^the project end of the project with ID (\\d+) is week (\\d+) of (\\d+)$")
	public void theProjectEndOfTheProjectWithIDIsWeekOf(int ID, int week, int year) throws Exception {
	    assertTrue(app.selectProject(ID).getEnd().get(Calendar.WEEK_OF_YEAR) == week);
	    assertTrue(app.selectProject(ID).getEnd().get(Calendar.YEAR) == year);
	}

	@When("^I ask for the list of activities in the project with ID (\\d+)$")
	public void iAskForTheListOfActivitiesInTheProjectWithID(int ID) throws Exception {
	    activities = app.selectProject(ID).getActivities();
	}

	@Then("^I get a list of activities of length (\\d+) containing the activity \"([^\"]*)\"$")
	public void iGetAListOfActivitiesOfLengthContainingTheActivity(int n, String activity) throws Exception {
	    assertTrue(activities.size() == n);
	    assertTrue(activities.get(0).getName().equals(activity));
	}
}