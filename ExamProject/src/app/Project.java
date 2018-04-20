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
	
	public List<Activity> getActivities(){
		return activities;
	}

	public void renameActivity(Activity activity, String newName) {
		//Unfinished
	}
	
	public int remainingBudgetTime() {
		//Unfinished
		return 0;
	}
	
	public void addActivity(String name) {
	}
	
	public void removeActivity(String name) {
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