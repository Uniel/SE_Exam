package app;

public class Registration {

	private Worker worker;
	private Activity activity;
	private Project project;
	public double hours;
	
	public Registration() {
		
	} // constructor
	
	public Worker getWorker() {
		return worker;
	}
	
	public void setWorker(Worker w) {
		worker = w;
	}
	
	public Activity getActivity() {
		return activity;
	}
	
	public void setActivity(Activity a) {
		activity = a;
	}
	
	public Project getProject() {
		return project;
	}
	
	public void setProject(Project p) {
		project = p;
	}
	
	public double getHours() {
		return hours;
	}
	
	public void setHours(double h) {
		hours = h;
	}
} // class
