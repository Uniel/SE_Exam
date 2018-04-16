package app;

import java.util.*;

public class Activity {

	private List<Worker> assignedWorkers = new ArrayList<Worker>();
	
	private String name;
	private boolean fulltime;
	private int startWeek;
	private int endWeek;
	private int startYear;
	private int endYear;
	private int budgetTime;
	
	public Activity() {
		
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
	
	public int getBudgetTime() {
		return budgetTime;
	}
	
	public void setBudgetTime(int hours) {
		budgetTime = hours;
	}
	
	public boolean overlaps(int sWeek, int eWeek, int sYear, int eYear) {
		return false;
	}
} // class