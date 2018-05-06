package whiteBoxTests;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import app.App;
import app.OperationNotAllowedException;
import app.Project;

public class ProjectSearch {
	private App app = new App();
	
	@Test
	public void projectSearchTestInputDataSetA() throws OperationNotAllowedException{
		app.createProject(180001);
		app.createProject(180002);
		List<Project> projects = app.projectSearch("*");
		assertTrue(projects.size() == 2);
		assertTrue(projects.get(0).getProjectID() == (180001) && projects.get(1).getProjectID() == (180002));
	}

	@Test (expected = app.OperationNotAllowedException.class)
	public void projectSearchTestInputDataSetB() throws OperationNotAllowedException{
		app.projectSearch(" ");
	}
	
	@Test (expected = app.OperationNotAllowedException.class)
	public void projectSearchTestInputDataSetC() throws OperationNotAllowedException{
		app.projectSearch("KURT");
	}
	
	@Test
	public void projectSearchTestInputDataSetD() throws OperationNotAllowedException{
		app.createProject(180001);
		List<Project> projects = app.projectSearch("18");
		assertTrue(projects.size() == 1);
		assertTrue(projects.get(0).getProjectID() == (180001));
	}
	
	@Test (expected = app.OperationNotAllowedException.class)
	public void projectSearchTestInputDataSetE() throws OperationNotAllowedException{
		app.createProject(190001);
		app.projectSearch("18");
	}
	
	@Test
	public void projectSearchTestInputDataSetF() throws OperationNotAllowedException{
		app.createProject(180001);
		app.createProject(180002);
		List<Project> projects = app.projectSearch("18");
		assertTrue(projects.size() == 2);
		assertTrue(projects.get(0).getProjectID() == (180001) && projects.get(1).getProjectID() == (180002));
	}
	
	@Test
	public void projectSearchTestInputDataSetG() throws OperationNotAllowedException{
		app.createProject(180001);
		app.createProject(190001);
		List<Project> projects = app.projectSearch("18");
		assertTrue(projects.size() == 1);
		assertTrue(projects.get(0).getProjectID() == (180001));
	}
	
	@Test (expected = app.OperationNotAllowedException.class)
	public void projectSearchTestInputDataSetH() throws OperationNotAllowedException{
		app.createProject(190001);
		app.createProject(190002);
		app.projectSearch("18");
	}
	
}
