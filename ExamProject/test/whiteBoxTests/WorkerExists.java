package whiteBoxTests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import app.App;
import app.OperationNotAllowedException;

public class WorkerExists {
	
	private App app = new App();
	
	@Test
	public void WorkerExistsTestInputDataSetA() {
		assertFalse(app.workerExists("JOHN"));
	}
	
	@Test
	public void WorkerExistsTestInputDataSetB() throws OperationNotAllowedException{
		app.addWorker("JOHN");
		assertTrue(app.workerExists("JOHN"));
	}

	@Test
	public void WorkerExistsTestInputDataSetC() {
		try {
			app.addWorker("FISK");
		} catch (OperationNotAllowedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertFalse(app.workerExists("JOHN"));
	}
}
