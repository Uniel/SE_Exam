package app;

public class OngoingProject extends Project {
	
	public OngoingProject(int ID) {
		super(ID);
	}
	
	@Override
	public void addActivity(String initials) {
		int n = 1;
		String name = initials;
		boolean flag = true;
		while(flag) {
			if (activityExists(name)) {
				name = initials + n++;
			} else {
				this.activities.add(new Activity(name));
				flag = false;
			}
		}
	}
}