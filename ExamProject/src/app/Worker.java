package app;

import java.util.*;

public class Worker {

	private List<Activity> assignedActivities = new ArrayList<Activity>();
	
	private String initials;
	private int maxActivities = 20;

	public Worker(String initials) {
		this.initials = initials;
	}

	public String getInitials() {
		return initials;
	}
	
	public void setInitials(String i) {
		initials = i;
	}
	
	public int getMaxActivities() {
		return maxActivities;
	}
	
	public List<Activity> getAssignedActivities(){
		return assignedActivities;
	}
	
	public void addActivity(Activity activity) throws OperationNotAllowedException {
		//This method should NOT be called directly unless it is for testing purposes!
		//Use the method assign in App instead.
		if (activity.getStart() == null || activity.getEnd() == null) {
			throw new OperationNotAllowedException("Cannot assign workers to an activity before setting duration of activity");
		}
		if (isAvailable(activity)) {
		assignedActivities.add(activity);
		} else {
			throw new OperationNotAllowedException("This worker is unavailable during that time");
		}
	}

	public void removeActivity(Activity activity) {
		assignedActivities.remove(activity);
	}

	public boolean isAvailable(Activity activity) {
		int n = 0;
		for (Activity a : assignedActivities) {
			if (a.overlaps(activity)) {
				if (a.getFulltime() || activity.getFulltime()) {
					return false;
				} else {
					n = ++n;
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
