package app;

import java.util.*;

public class Project {
	
	protected List<Activity> activities = new ArrayList<Activity>();

	protected int projectID;
	private Worker leader;
	private String name;
	private String type;
	private String customer;
	private Calendar start;
	private Calendar end;
	
	public Project(int ID) {
		projectID = ID;
	}
	
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
	
	public String[] getInfo() {
		String[] str = new String[6];
		str[0] = "Name: " + (this.name != null ? this.name : "");
		str[1] = "Type: " + (this.type != null ? this.type : "");
		str[2] = "Customer: " + (this.customer != null ? this.customer : "");
		str[3] = "Leader: " + (this.leader != null ? this.leader.getInitials() : "");
		str[4] = "Start: " + (this.start != null ? "Week " + this.start.get(Calendar.WEEK_OF_YEAR) + " Year: " + this.start.get(Calendar.YEAR) : "");
		str[5] = "End: " + (this.end != null ? "Week " + this.end.get(Calendar.WEEK_OF_YEAR) + " Year:" + this.end.get(Calendar.YEAR) : "");
		return str;
	}
	
	public String[] getActInfo(String act) {
		return findActivityWithName(act).getInfo(this.projectID);
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
	
	public void setType(String t) throws OperationNotAllowedException{
		if (t.toLowerCase().equals("internal")) {
			type = "Internal";
		}
		else if (t.toLowerCase().equals("external")) {
			type = "External";
		}
		else {
			throw new OperationNotAllowedException("That is not a valid project type");
		}
	}
	
	public String getCustomer() {
		return customer;
	}
	
	public void setCustomer(String c) {
		customer = c;
	}
	
	public void setStart(int week, int year) throws OperationNotAllowedException {
		Calendar calendar = new GregorianCalendar();
		calendar.set(Calendar.WEEK_OF_YEAR, week);
		calendar.set(Calendar.YEAR, year);
		if (end != null && end.before(calendar)) {
			throw new OperationNotAllowedException("Project start must be before project end");
		}
		else {
			boolean flag = false;
			for (Activity activity : activities) {
				if (activity.getStart().before(calendar)) {
					flag = true;
					throw new OperationNotAllowedException("There are activities in this project which start before this time");
				}
			}
			if (flag == false) {
				start = calendar;
			}
		}
	}
	
	public Calendar getStart() {
		return start;
	}
	
	public void setEnd(int week, int year) throws OperationNotAllowedException {
		Calendar calendar = new GregorianCalendar();
		calendar.set(Calendar.WEEK_OF_YEAR, week);
		calendar.set(Calendar.YEAR, year);
		if (start != null && start.after(calendar)) {
			throw new OperationNotAllowedException("Project end must be after project start");
		} else {
			boolean flag = false;
			for (Activity activity : activities) {
				if (activity.getEnd().after(calendar)) {
					flag = true;
					throw new OperationNotAllowedException("There are activities in this project which end after this time");
				}
			}
			if (flag == false) {
				end = calendar;
			}
		}
	}
	
	public Calendar getEnd() {
		return end;
	}
	
	/*
	 * Activity functions
	 */
	
	public List<Activity> getActivities(){
		return activities;
	}
	// First argument of type Activity have been changed to String
	public void renameActivity(String activity, String newName) throws OperationNotAllowedException{
		if(!activityExists(activity)){
			throw new OperationNotAllowedException("That activity does not exist");
		} else if(activityExists(newName)) {
			throw new OperationNotAllowedException("That activity name already exists");
		} else {
			findActivityWithName(activity).setName(newName);
		}
	}
	
	public void setActivityStart(String activity, int week, int year) throws OperationNotAllowedException {
		if(!activityExists(activity)){
			throw new OperationNotAllowedException("That activity does not exist");
		} else {
			findActivityWithName(activity).setStart(week, year);
		}
	}
	
	public void setActivityEnd(String activity, int week, int year) throws OperationNotAllowedException {
		if(!activityExists(activity)){
			throw new OperationNotAllowedException("That activity does not exist");
		} else {
			findActivityWithName(activity).setEnd(week, year);
		}
	}
	
	public void addActivity(String name) throws OperationNotAllowedException{
		if(emptyName(name)) {
			throw new OperationNotAllowedException("An activity must have a name");
		} else if(activityExists(name)) {
			throw new OperationNotAllowedException("That activity already exists");
		} else if (invalidName(name)){
			throw new OperationNotAllowedException("That's an invalid or protected name");
		} else {
			activities.add(new Activity(name, this.projectID));
		}
	}

	private boolean emptyName(String name) {
		return name.trim() == null || name.trim().isEmpty() || name.trim() == "";
	}
	
	private boolean invalidName(String name) {
		return (name.trim().toLowerCase().equals("cancel"));
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
	
	public Activity findActivityWithName(String name) {
		if(activities.isEmpty()) {return null;}
		for(Activity a : activities) {
			if(a.getName().trim().equals(name.trim())) {return activities.get(activities.indexOf(a));}
		}
		return null;
	}
	
	private int indexOfActivity(String name) {
		return (findActivityWithName(name) == null ? -1 : activities.indexOf(findActivityWithName(name)));
	}
	
	public void assignWorker(Worker worker, String activity) throws OperationNotAllowedException {
		findActivityWithName(activity).assignWorker(worker);
	}
	
	
	public void removeWorker(Worker worker, String activity) {
		findActivityWithName(activity).removeWorker(worker);
	}
	
	public boolean activityDuration(String activity) {
		return (findActivityWithName(activity).getStart() != null || findActivityWithName(activity).getStart() != null);
	}
	
	public String getActivityList() {
		String str = "";
		for(Activity a : activities) {
			str += "> " + a.getName() + "\n";
		}
		return str;
	}

	
	public boolean activityContainsWorker(String activity, Worker worker) throws OperationNotAllowedException {
		return findActivityWithName(activity).listWorkers().contains(worker);
	}

	public List<Worker> getWorkersOfActivity(String ACT) throws OperationNotAllowedException {
		return findActivityWithName(ACT).listWorkers();
	}

	public boolean activityHaveNoWorkers(String activity) throws OperationNotAllowedException {
		return findActivityWithName(activity).listWorkers().isEmpty();
	}
	
	public String getLastActivity() {
		return activities.get(activities.size() - 1).getName();
	}

	public void setDurationOfActivity(String name, int startWeek, int startYear, int endWeek, int endYear) throws OperationNotAllowedException {
		findActivityWithName(name).setStart(startWeek, startYear);
		findActivityWithName(name).setEnd(endWeek, endYear);
	}
} // class