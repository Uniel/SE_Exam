package app;

import java.util.*;

//Andreas
public class Worker {

	private List<Activity> assignedActivities = new ArrayList<Activity>();
	
	private String initials;
	private int maxActivities = 20;

	// Christian
	public Worker(String initials) {
		this.initials = initials;
	}

	// Christian
	public String getInitials() {
		return initials;
	}
	
	// Christian
	public void setInitials(String i) {
		initials = i;
	}
	
	// Christian
	public List<Activity> getAssignedActivities(){
		return assignedActivities;
	}
	
	// Andreas
	public void addActivity(Activity activity) throws OperationNotAllowedException {
		//This method should NOT be called directly unless it is for testing purposes!
		//Use the method assign in App instead.
		if (activity.getStart() == null || activity.getEnd() == null) {
			throw new OperationNotAllowedException("Must set activity duration before assigning workers");
		}
		if (isAvailable(activity)) {
		assignedActivities.add(activity);
		} else {
			throw new OperationNotAllowedException("This worker is unavailable during that time");
		}
	}

	// Christian
	public void removeActivity(Activity activity) {
		assignedActivities.remove(activity);
	}
	
	// Andreas
	public boolean isAvailable(Activity activity) {
		int n = 0;
		for (Activity a : assignedActivities) {
			if (a.overlaps(activity)) {
				if (a.getFulltime() || activity.getFulltime()) {
					return false;
				} else {
					n++;
				}
			}
		}
		if (n < maxActivities) {
			return true;
		} else {
			return false;
		}
	}
}
