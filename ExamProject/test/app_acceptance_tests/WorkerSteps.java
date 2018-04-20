package app_acceptance_tests;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.List;

import app.App;
import app.Worker;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WorkerSteps {

	private App app = new App();
	private Worker worker;
		
	private List<Worker> workers;
	
	
	public WorkerSteps(App app) {
		this.app = app;
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
		app.createWorker(worker);
	}
	
	@Then("^the worker \"([^\"]*)\" exists$")
	public void theWorkerExists(String initials) throws Exception {
		if (worker.getInitials() != initials) {
			worker = new Worker(initials);
		}
		assertTrue(app.getWorkers().contains(worker));
	}

	
}
