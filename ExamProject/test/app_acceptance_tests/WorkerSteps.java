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

import app.Activity;
import app.App;
import app.Worker;
import app.Project;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WorkerSteps {

	private App app = new App();
	private Project project;
	private Worker worker;
	private Activity activity;
	private ErrorMessageHolder errorMessage;
	
	private List<Worker> workers;
	
	
	public WorkerSteps(App app, ErrorMessageHolder errorMessage) {
		this.app = app;
		this.errorMessage = errorMessage;
	}

	// First Create Worker Scenario
	
	@Given("^I have the worker \"([^\"]*)\"$")
	public void iHaveTheWorker(String initials) throws Exception {
		worker = new Worker(initials);
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

	@Given("^the activity \"([^\"]*)\" has already been added to the project wih ID (\\d+)$")
	public void theActivityHasAlreadyBeenAddedToTheProjectWihID(String act, int ID) throws Exception {
		app.selectProject(ID).addActivity(act);
	}

	@Given("^the worker \"([^\"]*)\" is assigned to the activity \"([^\"]*)\" in the project with ID (\\d+)$")
	public void theWorkerIsAssignedToTheActivityInTheProjectWithID(String initials, String act, int ID) throws Exception {
		try {
			app.assign(worker, project, activity);
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}

	@When("^I search for assigned workers of the activity \"([^\"]*)\" in the project with ID (\\d+)$")
	public void iSearchForAssignedWorkersOfTheActivityInTheProjectWithID(String act, int ID) throws Exception {
		 try {
				app.assignedWorkers(project, activity);
			} catch (Exception e) {
				errorMessage.setErrorMessage(e.getMessage());
			}
		}

	@Then("^I get a list which contains the worker \"([^\"]*)\"$")
	public void iGetAListOfLengthWhichContainsTheWorker(String initials) throws Exception {
		assertThat(activity.assignedWorkers.get(0), is(initials));
	}
	
}
