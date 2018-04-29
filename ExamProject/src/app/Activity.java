package app;

import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Activity {

	private List<Worker> assignedWorkers = new ArrayList<Worker>();
	
	private String name;
	private boolean fulltime;
	private Calendar start;
	private Calendar end;
	private int budgetTime;
	
	public Activity(String newName) {
		this.name = newName;
	} // constructor

	public List<Worker> listWorkers() {
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
	
	public boolean overlaps(int sWeek, int eWeek, int sYear, int eYear) {
		return false;
	}
	
	public void assignWorker(Worker worker) {
		//This method should NOT be called directly!
		//Use the assign method in App instead.
		assignedWorkers.add(worker);
	}
} // class