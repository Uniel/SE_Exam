package app;

import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Activity {

	private List<Worker> assignedWorkers = new ArrayList<Worker>();

	private String name;
	private boolean fulltime = false;
	private Calendar start;
	private Calendar end;
	private double budgetTime = -1;
	private int belongsToProject;

	public Activity(String newName, int ID) {
		this.name = newName;
		this.belongsToProject = ID;
	} // constructor

	public int getParent() {
		return this.belongsToProject;
	}

	public String[] getInfo(int ID) {
		String[] str = new String[6];
		str[0] = "Activity: " + (this.name != null ? this.name : "");
		str[1] = "Project: " + (ID);
		str[2] = "Budget Time: " + (this.budgetTime != -1 ? this.budgetTime : "");
		str[3] = "Start: " + (this.start != null
				? "Week " + this.start.get(Calendar.WEEK_OF_YEAR) + " Year: " + this.start.get(Calendar.YEAR)
				: "");
		str[4] = "End: " + (this.end != null
				? "Week " + this.end.get(Calendar.WEEK_OF_YEAR) + " Year: " + this.end.get(Calendar.YEAR)
				: "");
		str[5] = "Full Time: " + (this.fulltime == true ? "true" : "false");
		return str;
	}

	public List<Worker> listWorkers() throws OperationNotAllowedException {
		return assignedWorkers;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public boolean getFulltime() {
		return fulltime;
	}

	public void setFulltime(boolean f) {
		fulltime = f;
	}

	public void setStart(int week, int year) throws OperationNotAllowedException {
		Calendar calendar = new GregorianCalendar();
		calendar.set(Calendar.WEEK_OF_YEAR, week);
		calendar.set(Calendar.YEAR, year);
		if (end != null && end.before(calendar)) {
			throw new OperationNotAllowedException("Activity start must be before activity end");
		} else {
			start = calendar;
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
			throw new OperationNotAllowedException("Activity end must be after activity start");
		} else {
			end = calendar;
		}
	}

	public Calendar getEnd() {
		return end;
	}

	public double getBudgetTime() {
		return budgetTime;
	}

	public void setBudgetTime(double hours) {
		double time = -1;
		if (hours % 1 < 0.5) {
			time = ((int) hours / 1);
		} else if (hours % 1 > 0.5) {
			time = ((int) (hours + 1) / 1);
		} else if (hours % 1 == 0.5) {
			time = hours;
		}
		budgetTime = time;
	}

	public boolean overlaps(Activity activity) {
		if (activity.getStart().before(end) && activity.getEnd().after(start)) {
			return true;
		} else {
			return false;
		}
	}

	public void assignWorker(Worker worker) throws OperationNotAllowedException {
		// This method should NOT be called directly!
		// Use the assign method in App instead.
		if (worker.isAvailable(this)) {
			assignedWorkers.add(worker);
		} else {
			throw new OperationNotAllowedException("This worker is unavailable during that time");
		}
	}

	public void removeWorker(Worker worker) {
		assignedWorkers.remove(worker);
	}
}