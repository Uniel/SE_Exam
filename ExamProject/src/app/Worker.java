package app;

import java.util.*;

public class Worker {

	private List<Activity> assignedActivities = new ArrayList<Activity>();
	
	private String initials;
	private int maxActivities = 20;

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
	
	public void addActivity(Activity activity) {
		//Unfinished
	}
	
	public void removeActivity(Activity activity) {
		//Unfinished
	}
	
	public boolean isAvailable(int startWeek, int endWeek, int startYear, int endYear) {
		//Unfinished
		return false;
	}
}
