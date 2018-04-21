package app;

import java.util.*;

import app.Project;
import app.ProjectService;

public class App {

	private boolean TEST_MODE = true;
	
	private Project project;
	public ProjectService projectService = new ProjectService(this);
	
	private List<Project> projects = new ArrayList<>();
	private List<Worker> workers = new ArrayList<>();
	private List<Date> dates = new ArrayList<>();	
	
	
	public List<Project> getProjects(){
		return projects;
	}
	
	public List<Worker> getWorkers(){
		return workers;
	}
	
	public List<Date> getDates(){
		return dates;
	}
	
	public void createProject() {
		projects.add(new Project(projectService));
	}
	public void createProject(int ID) {
		projects.add(new Project(ID));
	}
	
	public Project findProjectWithID(int ID) {
		if(projects.isEmpty()) {return null;}
		for(Project p : projects) {
			if(p.getProjectID() == ID) {return p;}
		}
		return null;
	}
	
	public boolean idExists(int ID) {
		if(projects.isEmpty()) {return false;}
		for(Project p : projects) {
			if(p.getProjectID() == ID) {return true;}
		}
		return false;
	}
	
	public int lastIdGenerated(){
		//if (projects.isEmpty()) {return -1;	}
		int lstID = 0;
		for(Project p : projects) {
			if(p.getProjectID() > lstID) {lstID = p.getProjectID();}
		}
		return lstID;
//		if(TEST_MODE){System.out.println("App: lastIdGen " + projects.get(projects.lastIndexOf(project)).getProjectID());}
//		return projects.get(projects.lastIndexOf(project)).getProjectID();
	}
	
	public void removeProject(int projectID) {
		//Unfinished
	}
	
	public void /*List<Worker>*/ findAvailableWorkers(Project project, Activity activity) {
		//Unfinished
	}
	
	public void createWorker(Worker worker) throws OperationNotAllowedException{
		String initials = worker.getInitials().replaceAll("\\s+","").toUpperCase();
		worker.setInitials(initials);
		if (worker.getInitials().length() > 4) {
			throw new OperationNotAllowedException("Too many initials");
		} else if (worker.getInitials().length() < 1) {
			throw new OperationNotAllowedException("Worker must have initials");
		}
		else if (workers.contains(worker)) {
			throw new OperationNotAllowedException("This worker already exists");
		}
		else {
			workers.add(worker);
		}
	}
	
	public void /*Project*/ findProject(String projectID) {
		//Unfinished
	}
	
	public void /*List<Worker>*/ assignedWorkers(Project project, Activity activity) {
		//Unfinished
	}
	
	public void assign(Worker worker, Project project, Activity activity) {
		//Unfinished
	}
	
	public void /*List<Activity>*/ listActivities(Project project){
		//Unfinished
	}
	
	public void removeFromActivity(Worker worker, Project project, Activity activity){
		//Unfinished
	}
	
	public void addActivity(Project project, String name) {
		//Unfinished
	}
	
	public void renameActivity(Project project, Activity activity, String newName) {
		//Unfinished
	}
	
	public void registerTime(Date date, Worker worker, Double hours, Project project, Activity activity) {
		//Unfinished
	}
}
