package app;

import java.util.*;

import app.Project;
import app.ProjectService;

public class App {

	private Project project;
	public ProjectService projectService = new ProjectService();
	
	
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
	
//	public Project returnNewProject() {
//		return new Project(projectService);
//	}
	
	public void createProject() {
		projects.add(new Project(projectService));
	}
	
	public void getProjectWithID(int ID) {
		
	}
	
//	public void addProject(Project proj) {
//		projects.add(proj);
//	}
	
	public void removeProject(int projectID) {
		//Unfinished
	}
	
	public void /*List<Worker>*/ findAvailableWorkers(Project project, Activity activity) {
		//Unfinished
	}
	
	public void createWorker(String initials){
		//Unfinished
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
