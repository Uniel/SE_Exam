package app_acceptance_tests;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import app.App;
import app.Worker;
import app.Activity;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WorkerSteps {

	private App app = new App();
	private Worker worker;
	private ErrorMessageHolder errorMessage;
	private WorkerHelper workerHelper;
		
	private List<Worker> workers;
	
	
	public WorkerSteps(App app, ErrorMessageHolder errorMessage, WorkerHelper workerHelper) {
		this.app = app;
		this.errorMessage = errorMessage;
		this.workerHelper = workerHelper;
	}

	// First Create Worker Scenario
	
	@Given("^I have the worker \"([^\"]*)\"$")
	public void iHaveTheWorker(String initials) throws Exception {
		worker = new Worker(initials);
		workerHelper.setWorker(worker);
	    assertThat(worker.getInitials(),is(equalTo(initials)));
	}

	@Given("^the worker \"([^\"]*)\" does not exist$")
	public void theWorkerDoesNotExist(String initials) throws Exception {
		if (worker.getInitials() != initials) {
			worker = new Worker(initials);
		}
		assertFalse(app.getWorkers().contains(worker));
	}
	
	@When("^I add the worker \"([^\"]*)\"$")
	public void iAddTheWorker(String initials) throws Exception {
		if (worker.getInitials() != initials) {
			worker = new Worker(initials);
		}
		try {
			app.createWorker(worker);
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@Then("^the worker \"([^\"]*)\" exists$")
	public void theWorkerExists(String initials) throws Exception {
		assertTrue(app.getWorkers().contains(worker));
	}
	
	@When("^I assign the worker \"([^\"]*)\" to the activity \"([^\"]*)\" in the project with ID (\\d+)$")
	public void iAssignTheWorkerToTheActivityInTheProjectWithID(String initials, String activity, int ID) throws Exception {
		try {
			app.assign(worker, ID, activity);
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}

	@Then("^the worker \"([^\"]*)\" is assigned to the activity \"([^\"]*)\" in the project with ID (\\d+)$")
	public void theWorkerIsAssignedToTheActivityInTheProjectWithID(String initials, String activity, int ID) throws Exception {
	    assertTrue(app.selectProject(ID).findActivityWithName(activity).listWorkers().contains(worker));
	    assertTrue(worker.getAssignedActivities().contains(app.selectProject(ID).findActivityWithName(activity)));
	}
	
	@Then("^the worker \"([^\"]*)\" is not assigned to the activity \"([^\"]*)\" in the project with ID (\\d+)$")
	public void theWorkerIsNotAssignedToTheActivityInTheProjectWithID(String initials, String activity, int ID) throws Exception {
		assertFalse(app.selectProject(ID).findActivityWithName(activity).listWorkers().contains(worker));
	    assertFalse(worker.getAssignedActivities().contains(app.selectProject(ID).findActivityWithName(activity)));
	}
	
	@Given("^the worker \"([^\"]*)\" is assigned to (\\d+) activities which start on week (\\d+) of (\\d+) and end on week (\\d+) of (\\d+)$")
	public void theWorkerIsAssignedToActivitiesWhichStartOnWeekOfAndEndOnWeekOf(String initials, int n, int startWeek, int startYear, int endWeek, int endYear) throws Exception {
	    List<Activity> exampleActivities = getExampleActivities(n, startWeek, endWeek, startYear, endYear);
	    for (Activity a : exampleActivities) {
	    	worker.addActivity(a);
	    }
	}
	
	private List<Activity> getExampleActivities(int n, int startWeek, int endWeek, int startYear, int endYear) throws Exception{
		List<Activity> activities = new ArrayList<>();
		for (int i = 1; i<= n; i++) {
			Activity a = new Activity("name"+i);
			a.setStart(startWeek, startYear);
			a.setEnd(endWeek, endYear);
			activities.add(a);
		}
		return activities;
	}
	
	@Given("^the worker \"([^\"]*)\" is on vacation from week (\\d+) to week (\\d+) of (\\d+)$")
	public void theWorkerIsOnVacationFromWeekToWeekOf(String initials, int startWeek, int endWeek, int year) throws Exception {
	    app.assignVacation(worker, startWeek, endWeek, year, year);
	}
}
