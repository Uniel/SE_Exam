package app_acceptance_tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;

import app.App;
import app.Project;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ActivitySteps {
	
	private App app = new App();
	private Project project;
	private ErrorMessageHolder errorMessage;
	
	public ActivitySteps(App app, ErrorMessageHolder errorMessage) {
		this.app = app;
		this.errorMessage = errorMessage;
	}
	// First, second scenario

	@Given("^the activity \"([^\"]*)\" does not exist in the project with ID (\\d+)$")
	public void theActivityDoesNotExistInTheProjectWithID(String act, int ID) throws Exception {
	    project = app.selectProject(ID);
	    assertFalse(project.activityExists(act));
	}

	@When("^I add the activity \"([^\"]*)\" to the project with ID (\\d+)$")
	public void iAddTheActivityToTheProjectWithID(String act, int ID) throws Exception {
		try {
			app.selectProject(ID).addActivity(act);
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}	

	@Then("^the activity \"([^\"]*)\" exists in the project with ID (\\d+)$")
	public void theActivityExistsInTheProjectWithID(String act, int ID) throws Exception {
		assertTrue(app.selectProject(ID).activityExists(act));
	}
	
	// Third Scenario
	@Given("^the activity \"([^\"]*)\" has already been added to the project with ID (\\d+)$")
	public void theActivityHasAlreadyBeenCreatedInTheProjectWithID(String act, int ID) throws Exception {
		iAddTheActivityToTheProjectWithID(act, ID);
		theActivityExistsInTheProjectWithID(act, ID);
	}

	// Fourth scenario
	@When("^I remove the activity \"([^\"]*)\" from the project with ID (\\d+)$")
	public void iRemoveTheActivityFromTheProjectWithID(String act, int ID) throws Exception {
		try {
			app.selectProject(ID).removeActivity(act);
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}

	// Seventh scenario
	@When("^I rename the activity \"([^\"]*)\" in the project with ID (\\d+) to \"([^\"]*)\"$")
	public void iRenameTheActivityInTheProjectWithIDTo(String existingAct, int ID, String newActName) throws Exception {
	    try {
			app.selectProject(ID).renameActivity(existingAct, newActName);
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}

	@When("^I set the start of the activity \"([^\"]*)\" in the project with ID (\\d+) to week (\\d+) of (\\d+)$")
	public void iSetTheStartOfTheActivityInTheProjectWithIDToWeekOf(String activity, int ID, int week, int year) throws Exception {
	    try {
	    	app.selectProject(ID).setActivityStart(activity, week, year);
	    } catch (Exception e) {
	    	errorMessage.setErrorMessage(e.getMessage());
	    }
	}

	@When("^I set the end of the activity \"([^\"]*)\" in the project with ID (\\d+) to week (\\d+) of (\\d+)$")
	public void iSetTheEndOfTheActivityInTheProjectWithIDToWeekOf(String activity, int ID, int week, int year) throws Exception {
		try {
	    	app.selectProject(ID).setActivityEnd(activity, week, year);
	    } catch (Exception e) {
	    	errorMessage.setErrorMessage(e.getMessage());
	    }
	}
	
	@Then("^the start of the activity \"([^\"]*)\" in the project with ID (\\d+) is week (\\d+) of (\\d+)$")
	public void theStartOfTheActivityInTheProjectWithIDIsWeekOf(String activity, int ID, int week, int year) throws Exception {
	    assertTrue(app.selectProject(ID).findActivityWithName(activity).getStart().get(Calendar.WEEK_OF_YEAR) == week);
	    assertTrue(app.selectProject(ID).findActivityWithName(activity).getStart().get(Calendar.YEAR) == year);
	}
	
	@Then("^the end of the activity \"([^\"]*)\" in the project with ID (\\d+) is week (\\d+) of (\\d+)$")
	public void theEndOfTheActivityInTheProjectWithIDIsWeekOf(String activity, int ID, int week, int year) throws Exception {
	    assertTrue(app.selectProject(ID).findActivityWithName(activity).getEnd().get(Calendar.WEEK_OF_YEAR) == week);
	    assertTrue(app.selectProject(ID).findActivityWithName(activity).getEnd().get(Calendar.YEAR) == year);
	}
	
	@When("^I set the budget time of the activity \"([^\"]*)\" in the project with ID (\\d+) to (.+) hours$")
	public void iSetTheBudgetTimeOfTheActivityInTheProjectWithIDToHours(String activity, int ID, double hours) throws Exception {
	    app.selectProject(ID).findActivityWithName(activity).setBudgetTime(hours);
	}
	
	@Then("^the budget time of the actvity \"([^\"]*)\" in the project with ID (\\d+) is (.+) hours$")
	public void theBudgetTimeOfTheActvityInTheProjectWithIDIsHours(String activity, int ID, double hours) throws Exception {
	    assertTrue(app.selectProject(ID).findActivityWithName(activity).getBudgetTime() == hours);
	}
	
	@Then("^the activity \"([^\"]*)\" in in the project with ID (\\d+) has the parent project (\\d+)$")
	public void theActivityInInTheProjectWithIDHasTheParentProject(String activity, int ID, int parent) throws Exception {
		    assertTrue(app.selectProject(ID).findActivityWithName(activity).getParent() == parent);
	}
}
