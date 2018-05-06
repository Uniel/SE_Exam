package app;

import java.util.*;

import app.Project;
import app.ProjectService;

public class App {

	public ProjectService projectService = new ProjectService(this);
	
	private List<Project> projects = new ArrayList<>();
	private List<Worker> workers = new ArrayList<>();
	private List<Date> dates = new ArrayList<>();	
	
	public List<Project> getProjects(){return projects;}
	public List<Worker> getWorkers(){return workers;}
	public List<Date> getDates(){return dates;}
	

	
	/*	 UI Interactions	 */
	
	public int getIdOfProject(int ID) throws OperationNotAllowedException{
		return selectProject(ID).getProjectID();
	}
	public String[] getInfoOfProject(int ID) {
		return findProjectWithID(ID).getInfo();
	}
	public void editProjectName(int ID, String name) {
		findProjectWithID(ID).setName(name);
	}
	public void editProjectType(int ID, String type) throws OperationNotAllowedException{
		findProjectWithID(ID).setType(type);
	}
	public void editProjectCustomer(int ID, String customer) {
		findProjectWithID(ID).setCustomer(customer);
	}
	public void editProjectStart(int ID, int week, int year) throws OperationNotAllowedException {
		findProjectWithID(ID).setStart(week, year);
	}
	public void editProjectEnd(int ID, int week, int year) throws OperationNotAllowedException{
		findProjectWithID(ID).setEnd(week, year);
	}
	public String[] getInfoOfActivity(int ID, String ACT) {
		return findProjectWithID(ID).getActInfo(ACT);
	}
	public String getProjectActivities(int iD) {
		return findProjectWithID(iD).getActivityList();
	}
	public String getActivtyOfProject(int ID, String name) throws OperationNotAllowedException{
		if(!findProjectWithID(ID).activityExists(name)) {
			throw new OperationNotAllowedException("That activity does not exist");
		} else {
			return name;
		}
	}
	public void createActivityInProject(int ID, String name) throws OperationNotAllowedException{
		findProjectWithID(ID).addActivity(name);
	}
	public String[][] searchForProjects(String name) throws OperationNotAllowedException{
		List<Project> results = projectSearch(name);
		String[][] str = new String[results.size()][2];
		if(!results.isEmpty()) {
			for(Project p : results) {
				int i = 0;
				str[i][0] = String.valueOf(p.getProjectID());
				str[i][1] = (p.getName() != null ? p.getName() : "");
				i++;
			}
		}
		return str;
	}
	public List<Worker> listWorkers() {
		return workers;
	}
	public String findWorker(String initials) throws OperationNotAllowedException {
		if (workerExists(initials)) {
			return initials;
		} else {
			throw new OperationNotAllowedException("This worker does not exist");
		}
	}
	public void addWorker(String initials) throws OperationNotAllowedException {
		Worker newWorker = new Worker(initials);
		createWorker(newWorker);
	}
	public void assignToActivity(int ID, String activity, String initials) throws OperationNotAllowedException {
		assignWorker(selectWorker(initials.toUpperCase()), ID, activity);
	}
	public String[][] listWorkerActivities(String initials) throws OperationNotAllowedException {
		List<Activity> activities = selectWorker(initials.toUpperCase()).getAssignedActivities();
		String[][] str = new String[activities.size()][2];
		for(Activity a : activities) {
			int i = 0;
			str[i][0] = a.getName();
			str[i][1] = String.valueOf(a.getParent());
			i++;
		}
		return str;
	}
	public void vacationAssign(String initials, int startWeek, int endWeek, int startYear, int endYear) throws OperationNotAllowedException {
		assignVacation(selectWorker(initials), startWeek, endWeek, startYear, endYear);
	}
	public int createNewProject() {
		createProject();
		return lastIdGenerated();
	}
	public String renameActivityOfProject(int ID, String ACT, String newName) throws OperationNotAllowedException {
		findProjectWithID(ID).renameActivity(ACT, newName);
		return newName;
	}
	public void setBudgetTimeOfProjectActivity(int ID, String ACT, double time) {
		findProjectWithID(ID).findActivityWithName(ACT).setBudgetTime(time);
	}
	public double getBudgetTimeOfProjectActivity(int ID, String ACT) {
		return findProjectWithID(ID).findActivityWithName(ACT).getBudgetTime();
	}
	public void editActivityofProjectStart(int ID, String ACT, int week, int year) throws OperationNotAllowedException {
		findProjectWithID(ID).findActivityWithName(ACT).setStart(week, year);
	}
	public void editActivityofProjectEnd(int ID, String ACT, int week, int year) throws OperationNotAllowedException {
		findProjectWithID(ID).findActivityWithName(ACT).setEnd(week, year);
	}
	public boolean toggleFullTimeForActOfProj(int ID, String ACT) {
		findProjectWithID(ID).findActivityWithName(ACT).setFulltime(!findProjectWithID(ID).findActivityWithName(ACT).getFulltime());
		return findProjectWithID(ID).findActivityWithName(ACT).getFulltime();
	}
	public void deleteActivityInProject(int ID, String ACT) throws OperationNotAllowedException {
		findProjectWithID(ID).removeActivity(ACT);
	}
	public void setProjectLeader(int ID, String worker) throws OperationNotAllowedException{
		findProjectWithID(ID).setLeader(selectWorker(worker));
	}
	public List<Worker> returnAvailableWorkers(int ID, String ACT) throws OperationNotAllowedException{
		return findAvailableWorkers(ID,ACT);
	}
	public List<Worker> returnWorkersOfActivity(int ID, String ACT) throws OperationNotAllowedException {
		 return findProjectWithID(ID).getWorkersOfActivity(ACT);
	}	
	public void deleteWorker(String initials) throws OperationNotAllowedException {
		deleteWorker(selectWorker(initials));
	}
	
	/* Business Logic	 */
	
	/* Project functions */
	
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
		int lastID = 0;
		for(Project p : projects) {
			if(p.getProjectID() > lastID) {lastID = p.getProjectID();}
		}
		return lastID;
	}
	
	public void removeProject(int projectID) throws OperationNotAllowedException{
		if(idExists(projectID)) {
			projects.remove(indexOfProjectWithID(projectID));
		} else {
			throw new OperationNotAllowedException("A project with that ID does not exist");
		}
	}
	
	public List<Project> projectSearch(String search) throws OperationNotAllowedException{
		List<Project> results = searchForProject(search);		
		if(results.isEmpty()) {
			throw new OperationNotAllowedException("No projects containing that string found");
		} else {
			return results;
		}
	}
	
	public List<Project> searchForProject(String search) throws OperationNotAllowedException{
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
		return results;
	}

	private boolean nameOrIDMatch(String search, Project p) {
		return (Integer.toString(p.getProjectID()).toLowerCase().contains(search.toLowerCase())) || (p.getName()== null ? false : p.getName().toLowerCase().contains(search.toLowerCase()));		
	}
	
	/*Worker functions*/
	
	public List<Worker> findAvailableWorkers(int ID, String activity) throws OperationNotAllowedException {																					
		List<Worker> availableWorkers = getAvailableWorkers(ID, activity); 
		if (availableWorkers.isEmpty()) {
			throw new OperationNotAllowedException("No workers available");
		} else {
			return availableWorkers;
		}
	}
	
	public List<Worker> getAvailableWorkers(int ID, String activity) throws OperationNotAllowedException{
		if (ID == 0) {																						// 1
			throw new OperationNotAllowedException("You have to specify a project ID");
		} else if (activity.equals("")) {																	// 2
			throw new OperationNotAllowedException("You have to specify an activity");
		} else if (!selectProject(ID).activityExists(activity)) {											// 3
			throw new OperationNotAllowedException("This activity does not exist in that project");
		} else if (!selectProject(ID).activityDuration(activity)) {											// 4
			throw new OperationNotAllowedException("Must set activity duration before searching for available workers");
		} else {																							
			List<Worker> availableWorkers = new ArrayList<Worker>(); 
			for (Worker w : workers) {																		// 5
				if (w.isAvailable(selectProject(ID).findActivityWithName(activity))) {						// 6
					availableWorkers.add(w);
				}
			}
			return availableWorkers;
		}
	}
	
	public void createWorker(Worker worker) throws OperationNotAllowedException{
		String initials = worker.getInitials().replaceAll("\\s+","").replace(".","").toUpperCase();
		worker.setInitials(initials);
		if (worker.getInitials().length() > 4) {
			throw new OperationNotAllowedException("Too many initials");
		} else if (worker.getInitials().length() < 1) {
			throw new OperationNotAllowedException("Worker must have initials");
		} else if (workerExists(initials)) {
			throw new OperationNotAllowedException("This worker already exists");
		} else {
			workers.add(worker);
		}
	}
	
	public boolean workerExists(String initials) {
		for(Worker w : workers) {
			if(w.getInitials().equals(initials.toUpperCase()) ) {
				return true;
			}
		}
		return false;
	}
	
	public List<Worker> getAssignedWorkers(int ID, String activity) throws OperationNotAllowedException {
		if (ID == 0) {
			throw new OperationNotAllowedException("You have to specify a project ID");
		} else if (activity.equals("")) {
			throw new OperationNotAllowedException("You have to specify an activity");
		} else if (!selectProject(ID).activityExists(activity)) {
			throw new OperationNotAllowedException("This activity does not exist in that project");
		} else if (selectProject(ID).activityHaveNoWorkers(activity)) {
			throw new OperationNotAllowedException("No workers assigned to the activity");
		} else {
			return selectProject(ID).getWorkersOfActivity(activity);
		}
	}
	
	public void assignWorker(Worker worker, int ID, String activity) throws OperationNotAllowedException {
		if (!workers.contains(worker)) {
			throw new OperationNotAllowedException("This worker does not exist");
		} else if (!selectProject(ID).activityExists(activity)) {
			throw new OperationNotAllowedException("This activity does not exist in that project");
		} else if (selectProject(ID).activityContainsWorker(activity, worker)) {
			throw new OperationNotAllowedException("This worker is already assigned to that activity");
		} else if (!selectProject(ID).activityDuration(activity)) {
			throw new OperationNotAllowedException("Must set activity duration before assigning workers");
		} 
		  else {
			selectProject(ID).assignWorker(worker, activity);
			worker.addActivity(selectProject(ID).findActivityWithName(activity));
		}
	}
	
	public void assignVacation(Worker worker, int startWeek, int endWeek, int startYear, int endYear) throws OperationNotAllowedException {
		int ID = ((startYear%100) * 10000) + (0%10000);
		if (!workers.contains(worker)) {
			throw new OperationNotAllowedException("This worker does not exist");
		} else {
			if (findProjectWithID(ID) == null) {
				createOngoingProject(ID);
			}
			selectProject(ID).addActivity(worker.getInitials() + " Vacation");
			String name = selectProject(ID).getLastActivity(); 
			selectProject(ID).setDurationOfActivity(name, startWeek, startYear, endWeek, endYear);
			assignWorker(worker, ID, name);
		}
	}
	
	public void removeFromActivity(Worker worker, int ID, String activity) throws OperationNotAllowedException {
		if (!workers.contains(worker)) {
			throw new OperationNotAllowedException("This worker does not exist");
		} else if (!selectProject(ID).activityExists(activity)) {
			throw new OperationNotAllowedException("This activity does not exist in that project");
		} else if (!selectProject(ID).activityContainsWorker(activity, worker)) {
			throw new OperationNotAllowedException("This worker is not assigned to that activity");
		} else {
			selectProject(ID).removeWorker(worker, activity);
			worker.removeActivity(selectProject(ID).findActivityWithName(activity));
		}
	}
	
	public Worker selectWorker(String initials) throws OperationNotAllowedException {
		workerExists(initials);
		for(Worker w : workers) {
			if(w.getInitials().equals(initials)) {return workers.get(workers.indexOf(w));}
		}
		return null;
	}
	
	public void deleteWorker(Worker worker) throws OperationNotAllowedException{
		if (!workers.contains(worker)) {
			throw new OperationNotAllowedException("This worker does not exist");
		}
		for(Activity aa : worker.getAssignedActivities()) {
			aa.removeWorker(worker);
		}
		workers.remove(worker);
	}

}
