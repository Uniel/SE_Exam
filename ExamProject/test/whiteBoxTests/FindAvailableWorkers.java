package whiteBoxTests;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import app.App;
import app.OperationNotAllowedException;
import app.Worker;

public class FindAvailableWorkers {
	private App app = new App();
	
	@Test (expected = app.OperationNotAllowedException.class)
	public void findAvailableWorkersTestInputDataSetA() throws OperationNotAllowedException{
		app.getAvailableWorkers(0, "Coffee run");
	}
	
	@Test (expected = app.OperationNotAllowedException.class)
	public void findAvailableWorkersTestInputDataSetB() throws OperationNotAllowedException{
		app.getAvailableWorkers(180001, "");
	}
	
	@Test (expected = app.OperationNotAllowedException.class)
	public void findAvailableWorkersTestInputDataSetC() throws OperationNotAllowedException{
		app.getAvailableWorkers(180001, "Coffee Run");
	}
	
	@Test (expected = app.OperationNotAllowedException.class)
	public void findAvailableWorkersTestInputDataSetD() throws OperationNotAllowedException{
		app.createProject(180001);
		app.getAvailableWorkers(180001, "Coffee Run");
	}
	
	@Test (expected = app.OperationNotAllowedException.class)
	public void findAvailableWorkersTestInputDataSetE() throws OperationNotAllowedException{
		app.createProject(180001);
		app.selectProject(180001).addActivity("Coffee Run");
		app.getAvailableWorkers(180001, "Coffee Run");
	}
	
	@Test
	public void findAvailableWorkersTestInputDataSetF() throws OperationNotAllowedException{
		app.createProject(180001);
		app.selectProject(180001).addActivity("Coffee Run");
		app.selectProject(180001).setDurationOfActivity("Coffee Run", 8, 1999, 9, 2000);;
		List<Worker> workers = app.getAvailableWorkers(180001, "Coffee Run");
		assertTrue(workers.size() == 0);
	}
	
	@Test
	public void findAvailableWorkersTestInputDataSetG() throws OperationNotAllowedException{
		app.createProject(180001);
		app.selectProject(180001).addActivity("Coffee Run");
		app.addWorker("JOHN");
		app.selectProject(180001).setDurationOfActivity("Coffee Run", 8, 1999, 9, 2000);
		List<Worker> workers = app.getAvailableWorkers(180001, "Coffee Run");
		assertTrue(workers.size() == 1);
		assertTrue(workers.get(0).getInitials().equals("JOHN"));
	}
	
	@Test
	public void findAvailableWorkersTestInputDataSetH() throws OperationNotAllowedException{
		app.createProject(180001);
		app.selectProject(180001).addActivity("Coffee Run");
		app.addWorker("JOHN");
		app.assignVacation(app.selectWorker("JOHN"), 7, 100, 5, 2000);
		app.selectProject(180001).setDurationOfActivity("Coffee Run", 8, 1999, 9, 2000);
		List<Worker> workers =  app.getAvailableWorkers(180001, "Coffee Run");
		assertTrue(workers.size() == 0);
	}
	
	@Test
	public void findAvailableWorkersTestInputDataSetI() throws OperationNotAllowedException{
		app.createProject(180001);
		app.selectProject(180001).addActivity("Coffee Run");
		app.addWorker("JOHN");
		app.addWorker("FISK");
		app.selectProject(180001).setDurationOfActivity("Coffee Run", 8, 1999, 9, 2000);
		List<Worker> workers = app.getAvailableWorkers(180001, "Coffee Run");
		assertTrue(workers.size() == 2);
		assertTrue(workers.get(0).getInitials().equals("JOHN") && workers.get(1).getInitials().equals("FISK"));
	}
	
	@Test
	public void findAvailableWorkersTestInputDataSetJ() throws OperationNotAllowedException{
		app.createProject(180001);
		app.selectProject(180001).addActivity("Coffee Run");
		app.addWorker("JOHN");
		app.addWorker("FISK");
		app.selectProject(180001).setDurationOfActivity("Coffee Run", 8, 1999, 9, 2000);
		app.assignVacation(app.selectWorker("FISK"), 7, 100, 5, 2000);
		List<Worker> workers = app.getAvailableWorkers(180001, "Coffee Run");
		assertTrue(workers.size() == 1);
		assertTrue(workers.get(0).getInitials().equals("JOHN"));
	}
	
	@Test
	public void findAvailableWorkersTestInputDataSetK() throws OperationNotAllowedException{
		app.createProject(180001);
		app.selectProject(180001).addActivity("Coffee Run");
		app.addWorker("JOHN");
		app.addWorker("FISK");
		app.selectProject(180001).setDurationOfActivity("Coffee Run", 8, 1999, 9, 2000);
		app.assignVacation(app.selectWorker("FISK"), 7, 100, 5, 2000);
		app.assignVacation(app.selectWorker("JOHN"), 7, 100, 5, 2000);
		List<Worker> workers =  app.getAvailableWorkers(180001, "Coffee Run");
		assertTrue(workers.size() == 0);
	}

}
