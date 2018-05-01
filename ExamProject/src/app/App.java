package app;

import java.util.*;

import app.Project;
import app.ProjectService;

public class App {

	//private boolean TEST_MODE = false;
	
	//private Project project;
	public ProjectService projectService = new ProjectService(this);
	
	private List<Project> projects = new ArrayList<>();
	private List<Worker> workers = new ArrayList<>();
	private List<Date> dates = new ArrayList<>();	
	
	public List<Project> getProjects(){return projects;}
	public List<Worker> getWorkers(){return workers;}
	public List<Date> getDates(){return dates;}
	

	
	/*	 UI Interactions	 */
	
	public int getIdOfProject(int ID) throws OperationNotAllowedException{return selectProject(ID).getProjectID();}
	public String getInfoOfProject(int ID) {return findProjectWithID(ID).getInfo();}
	public void editProjectName(int ID, String name) {findProjectWithID(ID).setName(name);}
	public void editProjectType(int ID, String type) {
		try {
			findProjectWithID(ID).setType(type);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void editProjectCustomer(int ID, String customer) {findProjectWithID(ID).setCustomer(customer);}
	public void editProjectStart(int ID, int week, int year) {
		try {
			findProjectWithID(ID).setStart(week, year);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void editProjectEnd(int ID, int week, int year) {
		try {
			findProjectWithID(ID).setEnd(week, year);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public String getInfoOfActivity(int ID, String ACT) {return findProjectWithID(ID).getActInfo(ACT);}
	public String getProjectActivities(int iD) {
		return "Activities in project:\n" + findProjectWithID(iD).getActivityList();
	}
	public String getActivtyOfProject(int ID, String name) throws OperationNotAllowedException{
		if(!findProjectWithID(ID).activityExists(name)) {
			throw new OperationNotAllowedException("That activity does not exist");
		} else {
			return findProjectWithID(ID).findActivityWithName(name).getName();
		}
	}
	public void createActivityInProject(int ID, String name) throws OperationNotAllowedException{
		if(findProjectWithID(ID).activityExists(name)) {
			System.out.println("Activity "+ name+" exists!");
		} else if (!findProjectWithID(ID).activityExists(name)) {
			System.out.println("Activity "+ name+" does not exist");
		}
		
		findProjectWithID(ID).addActivity(name);
	}
	public String searchForProjects(String name) throws OperationNotAllowedException{
		List<Project> results = projectSearch(name);
		String str = "Projects found: \n";
		if(!results.isEmpty()) {
			for(Project p : results) {
				str += p.getProjectID() + " - " + (p.getName() != null ? p.getName() : "") + "\n";
			}
		}
		return str;
	}
	public String listWorkers() {
		String str = "Workers found: \n";
		for(Worker w : workers) {
			int count = 1;
			str += count + ") " + w.getInitials() +"\n";
			count++;
		}
		return str;
	}
	public void addWorker(String initials) throws OperationNotAllowedException {
		Worker newWorker = new Worker(initials);
		createWorker(newWorker);
	}
	
	/*
	 Business Logic
	 */
	
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
	
	/*Worker functions*/
	
	public List<Worker> findAvailableWorkers(int ID, String activity) throws Exception {
		if (ID == 0) {
			throw new OperationNotAllowedException("You have to specify a project ID");
		} else if (activity.equals("")) {
			throw new OperationNotAllowedException("You have to specify an activity");
		} else if (!selectProject(ID).activityExists(activity)) {
			throw new OperationNotAllowedException("This activity does not exist in that project");
		} else if (selectProject(ID).findActivityWithName(activity).getStart() == null || selectProject(ID).findActivityWithName(activity).getEnd() == null) {
			throw new OperationNotAllowedException("Must set activity duration before searching for available workers");
		} else {
			List<Worker> availableWorkers = new ArrayList<Worker>(); 
			for (Worker w : workers) {
				if (w.isAvailable(selectProject(ID).findActivityWithName(activity))) {
					availableWorkers.add(w);
				}
			}
			if (availableWorkers.isEmpty()) {
				throw new OperationNotAllowedException("No workers available");
			} else {
				return availableWorkers;
			}
		}
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
		if (ID == 0) {
			throw new OperationNotAllowedException("You have to specify a project ID");
		} else if (activity.equals("")) {
			throw new OperationNotAllowedException("You have to specify an activity");
		} else if (!selectProject(ID).activityExists(activity)) {
			throw new OperationNotAllowedException("This activity does not exist in that project");
		} else if (selectProject(ID).findActivityWithName(activity).listWorkers().isEmpty()) {
			throw new OperationNotAllowedException("No workers assigned to the activity");
		} else {
			return selectProject(ID).findActivityWithName(activity).listWorkers();
		}
	}
	
	public void assign(Worker worker, int ID, String activity) throws Exception {
		if (!workers.contains(worker)) {
			throw new OperationNotAllowedException("This worker does not exist");
		} else if (!selectProject(ID).activityExists(activity)) {
			throw new OperationNotAllowedException("This activity does not exist in that project");
		} else if (selectProject(ID).findActivityWithName(activity).listWorkers().contains(worker)) {
			throw new OperationNotAllowedException("This worker is already assigned to that activity");
		} else if (selectProject(ID).findActivityWithName(activity).getStart() == null || selectProject(ID).findActivityWithName(activity).getEnd() == null) {
			throw new OperationNotAllowedException("Must set activity duration assigning workers");
		} else {
			selectProject(ID).findActivityWithName(activity).assignWorker(worker);
			worker.addActivity(selectProject(ID).findActivityWithName(activity));
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
			selectProject(ID).findActivityWithName(name).setStart(startWeek, startYear);
			selectProject(ID).findActivityWithName(name).setEnd(endWeek, endYear);
			selectProject(ID).findActivityWithName(name).setFulltime(true);
			assign(worker, ID, name);
		}
	}
	
	public void removeFromActivity(Worker worker, int ID, String activity) throws Exception {
		if (!workers.contains(worker)) {
			throw new OperationNotAllowedException("This worker does not exist");
		} else if (!selectProject(ID).activityExists(activity)) {
			throw new OperationNotAllowedException("This activity does not exist in that project");
		} else if (!selectProject(ID).findActivityWithName(activity).listWorkers().contains(worker)) {
			throw new OperationNotAllowedException("This worker is not assigned to that activity");
		} else {
			selectProject(ID).findActivityWithName(activity).removeWorker(worker);
			worker.removeActivity(selectProject(ID).findActivityWithName(activity));
		}
	}
	
	
	public void /*List<Activity>*/ listActivities(Project project){
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
