package app;

import java.util.*;

public class Project {
	
	private List<Activity> activities = new ArrayList<Activity>();

	private int projectID;
	private Worker leader;
	private String name;
	private String type;
	private String customer;
	private int startWeek;
	private int endWeek;
	private int startYear;
	private int endYear;
	
	public Project(int ID) {
		projectID = ID;
	} // TEST construction
	
	public Project(ProjectService projServ) {
		projectID = projServ.getId();
	} // constructor
	
	public int getProjectID() {
		return projectID;
	}
	
	public Worker getLeader() {
		return leader;
	}
	
	public void setLeader(Worker worker) {
		leader = worker;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String t) {
		type = t;
	}
	
	public String getCustomer() {
		return customer;
	}
	
	public void setCustomer(String c) {
		customer = c;
	}
	
	public int getStartWeek() {
		return startWeek;
	}
	
	public void setStartWeek(int week) {
		startWeek = week;
	}
	
	public int getEndWeek() {
		return endWeek;
	}
	
	public void setEndWeek(int week) {
		endWeek = week;
	}
	
	public int getStartYear() {
		return startYear;
	}
	
	public void setStartYear(int year) {
		startYear = year;
	}
	
	public int getEndYear() {
		return endYear;
	}
	
	public void setEndYear(int year) {
		endYear = year;
	}
	//	ACTIVITIES
	public List<Activity> getActivities(){
		return activities;
	}
	// First argument of type Activity have been changed to String
	public void renameActivity(String activity, String newName) throws OperationNotAllowedException{
		if(!activityExists(activity)){
			throw new OperationNotAllowedException("That activity does not exist");
		}else if(activityExists(newName)) {
			throw new OperationNotAllowedException("That activity name already exists");
		} else {
			findProjectWithID(activity).setName(newName);
		}
	}
	
	public int remainingBudgetTime() {
		//Unfinished
		return 0;
	}
	
	public void addActivity(String name) throws OperationNotAllowedException{
		if(inValidName(name)) {
			throw new OperationNotAllowedException("An activity must have a name");
		} else if(activityExists(name)) {
			throw new OperationNotAllowedException("That activity already exists");
		} else {
			activities.add(new Activity(name));
		}
	}

	private boolean inValidName(String name) {
		return name.trim() == null || name.trim().isEmpty() || name.trim() == "";
	}
	
	public void removeActivity(String name) throws OperationNotAllowedException{
		if(activityExists(name)) {
			activities.remove(indexOfActivity(name));
		} else {
			throw new OperationNotAllowedException("That activity does not exist");
		}
	}
	
	public boolean activityExists(String name) {
		return (indexOfActivity(name) == -1 ? false : true);
	}
	
	public Activity findProjectWithID(String name) {
		if(activities.isEmpty()) {return null;}
		for(Activity a : activities) {
			if(a.getName() == name) {return activities.get(activities.indexOf(a));}
		}
		return null;
	}
	
	private int indexOfActivity(String name) {
		return (findProjectWithID(name) == null ? -1 : activities.indexOf(findProjectWithID(name)));
	}
	
	public void showTimeUse() {
	}
	
	public void generateReport() {	
	}
	
	public void assign(Worker worker, Activity activity) {
	}
	
	public void assignedWorkers(Activity activity) {
	}
	
	public void removeWorker(Worker worker, Activity activity) {
	}
	
	public void findAvailableWorkers(Activity activity) {
	}
} // class