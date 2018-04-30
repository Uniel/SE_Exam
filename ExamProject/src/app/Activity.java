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
	private int budgetTime;
	
	public Activity(String newName) {
		this.name = newName;
	} // constructor

	public List<Worker> listWorkers() throws Exception {
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
	
	public void setStart(int week, int year) throws Exception {
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
	
	public void setEnd(int week, int year) throws Exception {
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
	
	public int getBudgetTime() {
		return budgetTime;
	}
	
	public void setBudgetTime(int hours) {
		budgetTime = hours;
	}
	
	public boolean overlaps(Activity activity) {
		if (activity.getStart().before(end) && activity.getEnd().after(start)) {
			return true;
		} else {
			return false;
		}
	}
	
	public void assignWorker(Worker worker) throws Exception {
		//This method should NOT be called directly!
		//Use the assign method in App instead.
		if (worker.isAvailable(this)) {
			assignedWorkers.add(worker);
		} else {
			throw new OperationNotAllowedException("This worker is unavailable during that time");
		}
	}
} // class