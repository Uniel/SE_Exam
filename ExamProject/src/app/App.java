package app;

import java.util.*;

import app.Project;
import app.ProjectService;

public class App {

	private boolean TEST_MODE = false;
	
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
	
	/*
	 *  Project functions
	 */
	
	public void createProject() {
		projects.add(new Project(projectService));
	}
	
	public void createProject(int ID) {
		projects.add(new Project(ID));
	} // For testing purposes only
	
	public void createOngoingProject(int ID) {
		projects.add(new OngoingProject(ID));
	}
	
	public Project selectProject(int ID) throws OperationNotAllowedException{
		if(findProjectWithID(ID) == null) {
			throw new OperationNotAllowedException("A project with that ID does not exist");
		} else {
			return findProjectWithID(ID);
		}
	}
	
	/*
	 * Returns of project info
	 */
	public String getNameOfProject(int ID) {
		if(findProjectWithID(ID).getName() == null) {
			return "";
		} else {
			return findProjectWithID(ID).getName();
		}
	}
	public String getTypeOfProject(int ID) {
		if(findProjectWithID(ID).getType() == null) {
			return "";
		} else {
			return findProjectWithID(ID).getType();
		}
	}
	public String getCustomerOfProject(int ID) {return findProjectWithID(ID).getCustomer();}
	public int getIdOfProject(int ID) throws OperationNotAllowedException{return selectProject(ID).getProjectID();}
	public Calendar getStartOfProject(int ID) {return findProjectWithID(ID).getStart();}
	public Calendar getEndOfProject(int ID) {return findProjectWithID(ID).getEnd();}
	
	public String getInfoOfProject(int ID) {
		String str = "Name: " + getNameOfProject(ID) + "\nType: " + getTypeOfProject(ID) + 
				"\nCustomer: " + getCustomerOfProject(ID) + "\nStarts: " + getStartOfProject(ID).toString() + "\nEnds: " + getEndOfProject(ID).toString();
		return str;
	}
	
	public int indexOfProjectWithID(int ID) {
		return projects.indexOf(findProjectWithID(ID));
	}
	
	public boolean idExists(int ID) {
		return (findProjectWithID(ID) == null ? false : true);
	}
	
	private Project findProjectWithID(int ID) {
		if(projects.isEmpty()) {return null;}
		for(Project p : projects) {
			if(p.getProjectID() == ID) {return projects.get(projects.indexOf(p));}
		}
		return null;
	}
	
	public int lastIdGenerated(){
		int lstID = 0;
		for(Project p : projects) {
			if(p.getProjectID() > lstID) {lstID = p.getProjectID();}
		}
		return lstID;
	}
	
	public void removeProject(int projectID) throws OperationNotAllowedException{
		if(idExists(projectID)) {
			projects.remove(indexOfProjectWithID(projectID));
		} else {
			throw new OperationNotAllowedException("A project with that ID does not exist");
		}
	}
	
	public List<Project> projectSearch(String search) throws OperationNotAllowedException{
		List<Project> results = new ArrayList<>();		
		if(search.trim().equals("*")) {
			return getProjects();
		} else if (search.trim().isEmpty()) {
			throw new OperationNotAllowedException("Must specify search term");
		} else {
			for(Project p : projects) {
				if(nameOrIDMatch(search, p)){
					results.add(p);
				}
			}
		}
		if(results.isEmpty()) {
			throw new OperationNotAllowedException("No projects containing that string found");
		} else {
			return results;
		}
	}

	private boolean nameOrIDMatch(String search, Project p) {
		return (Integer.toString(p.getProjectID()).contains(search)) || p.getName().contains(search);		
	}
	
	/*
	 * Worker functions
	 */
	
	public void /*List<Worker>*/ findAvailableWorkers(Project project, Activity activity) {
		//Unfinished
	}
	
	public void createWorker(Worker worker) throws OperationNotAllowedException{
		String initials = worker.getInitials().replaceAll("\\s+","").replace(".","").toUpperCase();
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
	
	public List<Worker> assignedWorkers(int ID, String activity) throws Exception {
		if (!selectProject(ID).activityExists(activity)) {
			throw new OperationNotAllowedException("This activity does not exist in that project");
		} else {
			return selectProject(ID).findProjectWithID(activity).listWorkers();
		}
	}
	
	public void assign(Worker worker, int ID, String activity) throws Exception {
		if (!workers.contains(worker)) {
			throw new OperationNotAllowedException("This worker does not exist");
		} else if (!selectProject(ID).activityExists(activity)) {
			throw new OperationNotAllowedException("This activity does not exist in that project");
		} else if (selectProject(ID).findProjectWithID(activity).listWorkers().contains(worker)) {
			throw new OperationNotAllowedException("This worker is already assigned to that activity");
		} else {
			selectProject(ID).findProjectWithID(activity).assignWorker(worker);
			worker.addActivity(selectProject(ID).findProjectWithID(activity));
		}
	}
	
	public void assignVacation(Worker worker, int startWeek, int endWeek, int startYear, int endYear) throws Exception {
		int ID = ((startYear%100) * 10000) + (0%10000);
		if (!workers.contains(worker)) {
			throw new OperationNotAllowedException("This worker does not exist");
		} else {
			if (findProjectWithID(ID) == null) {
				createOngoingProject(ID);
			}
			selectProject(ID).addActivity(worker.getInitials() + "Vacation");
			String name = selectProject(ID).activities.get(selectProject(ID).activities.size() - 1).getName();
			selectProject(ID).findProjectWithID(name).setStart(startWeek, startYear);
			selectProject(ID).findProjectWithID(name).setEnd(endWeek, endYear);
			selectProject(ID).findProjectWithID(name).setFulltime(true);
			assign(worker, ID, name);
		}
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
