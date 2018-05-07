package app;

import java.util.*;

// Adam
public class Project {

	protected List<Activity> activities = new ArrayList<Activity>();

	protected int projectID;
	private Worker leader;
	private String name;
	private String type;
	private String customer;
	private Calendar start;
	private Calendar end;

	// Christian
	public Project(int ID) {
		projectID = ID;
	}

	// Adam
	public Project(ProjectService projServ) throws OperationNotAllowedException {
		projectID = projServ.getId();
	} // constructor

	// Christian
	public int getProjectID() {
		return projectID;
	}

	// Christian
	public Worker getLeader() {
		return leader;
	}

	// Christian
	public void setLeader(Worker worker) {
		leader = worker;
	}

	// Adam
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

	// Adam
	public String[] getActInfo(String act) {
		return findActivityWithName(act).getInfo(this.projectID);
	}

	// Christian
	public String getName() {
		return name;
	}

	// Christian
	public void setName(String n) {
		name = n;
	}

	// Christian
	public String getType() {
		return type;
	}

	// Andreas
	public void setType(String t) throws OperationNotAllowedException {
		if (t.toLowerCase().equals("internal")) {
			type = "Internal";
		} else if (t.toLowerCase().equals("external")) {
			type = "External";
		} else {
			throw new OperationNotAllowedException("That is not a valid project type");
		}
	}

	// Christian
	public String getCustomer() {
		return customer;
	}

	// Christian
	public void setCustomer(String c) {
		customer = c;
	}

	// Andreas ( & Adam)
	public void setStart(int week, int year) throws OperationNotAllowedException {
		Calendar calendar = new GregorianCalendar();
		calendar.set(Calendar.WEEK_OF_YEAR, week);
		calendar.set(Calendar.YEAR, year);
		if (end != null && end.before(calendar)) {
			throw new OperationNotAllowedException("Project start must be before project end");
		} else {
			boolean flag = false;
			for (Activity activity : activities) {
				if (activity.getStart().before(calendar)) {
					flag = true;
					throw new OperationNotAllowedException(
							"There are activities in this project which start before this time");
				}
			}
			if (flag == false) {
				start = calendar;
			}
		}
	}
	
	// Christian
	public Calendar getStart() {
		return start;
	}

	// Andreas ( & Adam)
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
					throw new OperationNotAllowedException(
							"There are activities in this project which end after this time");
				}
			}
			if (flag == false) {
				end = calendar;
			}
		}
	}

	// Christian
	public Calendar getEnd() {
		return end;
	}

	/*
	 * Activity functions
	 */

	// Christian
	public List<Activity> getActivities() {
		return activities;
	}

	// Adam
	public void renameActivity(String activity, String newName) throws OperationNotAllowedException {
		if (!activityExists(activity)) {
			throw new OperationNotAllowedException("That activity does not exist");
		} else if (activityExists(newName)) {
			throw new OperationNotAllowedException("That activity name already exists");
		} else {
			findActivityWithName(activity).setName(newName);
		}
	}

	// Adam
	public void setActivityStart(String activity, int week, int year) throws OperationNotAllowedException {
		if (!activityExists(activity)) {
			throw new OperationNotAllowedException("That activity does not exist");
		} else {
			findActivityWithName(activity).setStart(week, year);
		}
	}

	// Adam
	public void setActivityEnd(String activity, int week, int year) throws OperationNotAllowedException {
		if (!activityExists(activity)) {
			throw new OperationNotAllowedException("That activity does not exist");
		} else {
			findActivityWithName(activity).setEnd(week, year);
		}
	}

	// Adam
	public void addActivity(String name) throws OperationNotAllowedException {
		if (emptyName(name)) {
			throw new OperationNotAllowedException("An activity must have a name");
		} else if (activityExists(name)) {
			throw new OperationNotAllowedException("That activity already exists");
		} else if (invalidName(name)) {
			throw new OperationNotAllowedException("That's an invalid or protected name");
		} else {
			activities.add(new Activity(name, this.projectID));
		}
	}

	// Adam
	private boolean emptyName(String name) {
		return name.trim() == null || name.trim().isEmpty() || name.trim() == "";
	}

	// Adam
	private boolean invalidName(String name) {
		return (name.trim().toLowerCase().equals("cancel"));
	}

	// Adam
	public void removeActivity(String name) throws OperationNotAllowedException {
		if (activityExists(name)) {
			activities.remove(indexOfActivity(name));
		} else {
			throw new OperationNotAllowedException("That activity does not exist");
		}
	}

	// Adam
	public boolean activityExists(String name) {
		return (indexOfActivity(name) == -1 ? false : true);
	}

	// Adam
	public Activity findActivityWithName(String name) {
		if (activities.isEmpty()) {
			return null;
		}
		for (Activity a : activities) {
			if (a.getName().trim().equals(name.trim())) {
				return activities.get(activities.indexOf(a));
			}
		}
		return null;
	}

	// Adam
	private int indexOfActivity(String name) {
		return (findActivityWithName(name) == null ? -1 : activities.indexOf(findActivityWithName(name)));
	}

	// Andreas
	public void assignWorker(Worker worker, String activity) throws OperationNotAllowedException {
		findActivityWithName(activity).assignWorker(worker);
	}

	// Andreas
	public void removeWorker(Worker worker, String activity) {
		findActivityWithName(activity).removeWorker(worker);
	}
	
	// Adam 
	public boolean activityDuration(String activity) {
		return (findActivityWithName(activity).getStart() != null || findActivityWithName(activity).getStart() != null);
	}

	// Adam
	public String[] getActivityList() {
		String[] str = new String[activities.size()];
		int i = 0;
		for (Activity a : activities) {
			str[i] = a.getName();
			i++;
		}
		return str;
	}

	// Andreas
	public boolean activityContainsWorker(String activity, Worker worker) throws OperationNotAllowedException {
		return findActivityWithName(activity).listWorkers().contains(worker);
	}

	// Andreas
	public List<Worker> getWorkersOfActivity(String ACT) throws OperationNotAllowedException {
		return findActivityWithName(ACT).listWorkers();
	}

	// Adam
	public boolean activityHaveNoWorkers(String activity) throws OperationNotAllowedException {
		return findActivityWithName(activity).listWorkers().isEmpty();
	}

	// Adam
	public String getLastActivity() {
		return activities.get(activities.size() - 1).getName();
	}

	// Adam
	public void setDurationOfActivity(String name, int startWeek, int startYear, int endWeek, int endYear)
			throws OperationNotAllowedException {
		findActivityWithName(name).setStart(startWeek, startYear);
		findActivityWithName(name).setEnd(endWeek, endYear);
	}
} // class