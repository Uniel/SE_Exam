package whiteBoxTests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import app.Activity;
import app.App;
import app.OperationNotAllowedException;
import app_acceptance_tests.WorkerSteps;
import cucumber.api.java.en.Given;

public class IsAvailable {
	
	private App app = new App();
	
	@Test
	public void isAvailableTestInputDataSetA() throws OperationNotAllowedException{
		app.addWorker("FISK");
		app.createProject(180001);
		app.selectProject(180001).addActivity("Coding");
		app.selectProject(180001).setDurationOfActivity("Coding", 4, 2020, 5, 9000);
		assertTrue(app.selectWorker("FISK").isAvailable(app.selectProject(180001).findActivityWithName("Coding")));
	}

	@Test
	public void isAvailableTestInputDataSetB() throws OperationNotAllowedException{
		app.addWorker("FISK");
		app.createProject(180001);
		app.selectProject(180001).addActivity("Coding");
		app.selectProject(180001).addActivity("FISKE");
		app.selectProject(180001).setDurationOfActivity("Coding", 4, 2020, 5, 9000);
		app.selectProject(180001).setDurationOfActivity("FISKE", 4, 9001, 5, 9002);
		app.assignToActivity(180001, "FISKE", "FISK");
		assertTrue(app.selectWorker("FISK").isAvailable(app.selectProject(180001).findActivityWithName("Coding")));
	}

	@Test
	public void isAvailableTestInputDataSetC() throws OperationNotAllowedException{
		app.addWorker("FISK");
		app.createProject(180001);
		app.selectProject(180001).addActivity("Coding");
		app.selectProject(180001).addActivity("FISKE");
		app.selectProject(180001).setDurationOfActivity("Coding", 4, 2020, 5, 9000);
		app.selectProject(180001).setDurationOfActivity("FISKE", 4, 2020, 5, 9002);
		app.assignToActivity(180001, "FISKE", "FISK");
		assertTrue(app.selectWorker("FISK").isAvailable(app.selectProject(180001).findActivityWithName("Coding")));
	}

	@Test
	public void isAvailableTestInputDataSetD() throws OperationNotAllowedException{
		app.addWorker("FISK");
		app.createProject(180001);
		app.selectProject(180001).addActivity("Coding");
		app.selectProject(180001).addActivity("FISKE");
		app.selectProject(180001).setDurationOfActivity("Coding", 4, 2020, 5, 9000);
		app.selectProject(180001).findActivityWithName("Coding").setFulltime(true);
		app.selectProject(180001).setDurationOfActivity("FISKE", 4, 2020, 5, 9002);
		app.assignToActivity(180001, "FISKE", "FISK");
		assertFalse(app.selectWorker("FISK").isAvailable(app.selectProject(180001).findActivityWithName("Coding")));
	}

	@Test
	public void isAvailableTestInputDataSetE() throws OperationNotAllowedException{
		app.addWorker("FISK");
		app.createProject(180001);
		app.selectProject(180001).addActivity("Coding");
		app.selectProject(180001).setDurationOfActivity("Coding", 8, 2020, 5, 9000);
		theWorkerIsAssignedToActivitiesWhichStartOnWeekOfAndEndOnWeekOf("FISK", 20, 8, 2020, 9, 3030);
		assertFalse(app.selectWorker("FISK").isAvailable(app.selectProject(180001).findActivityWithName("Coding")));
	}
	
	public void theWorkerIsAssignedToActivitiesWhichStartOnWeekOfAndEndOnWeekOf(String initials, int n, int startWeek, int startYear, int endWeek, int endYear) throws OperationNotAllowedException {
	    List<Activity> exampleActivities = getExampleActivities(n, startWeek, endWeek, startYear, endYear);
	    for (Activity a : exampleActivities) {
	    	app.selectWorker("FISK").addActivity(a);
	    }
	}
	private List<Activity> getExampleActivities(int n, int startWeek, int endWeek, int startYear, int endYear) throws OperationNotAllowedException{
		List<Activity> activities = new ArrayList<>();
		for (int i = 1; i<= n; i++) {
			Activity a = new Activity("name"+i, 0);
			a.setStart(startWeek, startYear);
			a.setEnd(endWeek, endYear);
			activities.add(a);
		}
		return activities;
	}
}

