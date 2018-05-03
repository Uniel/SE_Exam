package app;

import java.util.Scanner;

public class UI {

	private App app;
	Scanner sc = new Scanner(System.in);
	public UI(App application) {this.app = application;}
	
	
	/*Main Menu*/
	public void run() {
		char choice = 0;
		do {
			printMenu();
			choice = getChar(sc);
			switch(choice) {
				case '1': projectMenu(); break;
				case '2': workerMenu(); break;
				case 'q': println("K. Bye!"); return;
			}
			choice = 0;
		} while (choice == 0);
		sc.close();
	}
	public void printMenu() {
		println("Welcome to the planner tool!");
		println("What do you want to do now?");
		println("1) Enter the project menu");
		println("2) Manage workers");
		println("q) Quit");
	}
	
	private char getChar(Scanner sc) {return sc.next().charAt(0);}
	private String getString(Scanner sc) {return sc.next();}
	private void println(String str) {System.out.println(str);}
	
	/*PROJECT MENU FUNCTIONS*/
	public void projectMenu() {
		char choice = 0;
		do {
			printProjectMenu();
			choice = getChar(sc);
			switch(choice) {
				case '1': createProject(); break;
				case '2': printProjects(); break;
				case '3': selectedProjectMenu(); break;
				case '4': projectSearch(); break;
				case 'b': return;
			}
			choice = 0;
		} while (choice == 0);
	}
	private void projectSearch() {
		println("Type a seach term, can be entirety or parts of the project name or ID");
		try {System.out.println(app.searchForProjects(sc.next()));} 
		catch (OperationNotAllowedException e) {System.out.println(e);}
	}
	public void printProjectMenu() {
		println("\nProject menu");
		println("What do you want to do now?");
		println("1) Create Project");
		println("2) List projects");
		println("3) Select/edit project");
		println("4) Search for a project");
		println("b) Back");
	}
	
	private void createProject() {
		int newProj = app.createNewProject();
		System.out.println("Project with ID " + newProj + " has been created!");
	}
	public void printProjects() {
		println("\nContained projects:");
		for(Project p : app.getProjects()) {
			System.out.println("Project: " + p.getProjectID() + " - " + (p.getName() == null ? "" : p.getName()) );
		}
	}
	
	/*EDIT PROJECT MENU*/
	public void selectedProjectMenu() {
		char choice = 0;
		int ID = selectProject();
		do {
			printSelectedProjectMenu(ID);
			choice = getChar(sc);
			switch(choice) {
			case '1': editProjectInfo(1, ID); break;
			case '2': editProjectInfo(2, ID); break;
			case '3': editProjectInfo(3, ID); break;
			case '4': editProjectInfo(4, ID); break;
			case '5': editProjectInfo(5, ID); break;
			case '6': editProjectInfo(6, ID); break;
			case '7': createActivity(ID); break;
			case '8': selectedActivityMenu(ID); break;
			case 'D': deleteProject(ID); return;
			case 'b': return;
			}
			choice = 0;
		} while (choice == 0);
	}
	private void createActivity(int iD) {
		println("What should the activity be named?");
		try {app.createActivityInProject(iD, sc.next());} 
		catch (OperationNotAllowedException e) {System.out.println(e);}	
	}
	private int selectProject() {
		println("Which project ID?");
		int IDchoice = 0;
		do {
			try {IDchoice = app.getIdOfProject(sc.nextInt());}
			catch (OperationNotAllowedException e) {System.out.println(e);}
		} while (IDchoice <= 0);
		return IDchoice;
	}
	public void printSelectedProjectMenu(int ID) {
		println("\nSelected Project menu");
		println("You've selected project " + ID + ", what now?");
		System.out.println(app.getInfoOfProject(ID));
		printActivitiesOfProject(ID);
		println("\nEdit: 1) Name, 2) Type, 3) Customer");
		println("Set new 4) Leader, 5) Start, 6) End");
		println("7) Create activity");
		println("8) Edit acitivity");
		println("D) Delete");
		println("b) Back");
	}
	private void printActivitiesOfProject(int iD) {
		System.out.println(app.getProjectActivities(iD));
	}
	private void editProjectInfo(int i, int ID) {
		switch(i) {
			case 1: // Name
				println("What do you want to name the project?");
				app.editProjectName(ID, getString(sc));
				break;
			case 2: // Type
				println("Which type should it have? (internal / external)");
				app.editProjectType(ID, getString(sc));
				break;
			case 3: // Customer
				println("Which customer does this project belong to?");
				app.editProjectCustomer(ID, getString(sc));
				break;
			case 4: // Leader
				println("Who should be the leader?");
				//app.editProjectName(ID, getString(sc));
				break;
			case 5: // Start
				println("In which week, and year does this project start? (type week and year seperated by line breaks.)");
				app.editProjectStart(ID, sc.nextInt(), sc.nextInt());
				break;
			case 6: // End
				println("In which week, and year does this project end? (type week and year seperated by line breaks.)");
				app.editProjectEnd(ID, sc.nextInt(), sc.nextInt());
				break;		
		}
	}
	private void deleteProject(int ID) {
		println("You sure?  (Y for confirm)");
		if(getChar(sc) == 'Y') {
			try {
				app.removeProject(ID);
			} catch (OperationNotAllowedException e) {
				System.out.println(e);
			}
		}
	}

	
	/*EDIT ACTIVITIES*/	
	public void selectedActivityMenu(int id) {
		char choice = 0;
		int ID = id;
		String ACT = selectActivity(ID);
		do {
			printSelectedActivityMenu(ID, ACT);
			choice = getChar(sc);
			switch(choice) {
			case '1': ACT=renameActivity(ID, ACT); break;
			case '2': editActivity(ID, ACT, 2); break;
			case '3': editActivity(ID, ACT, 3); break;
			case '4': editActivity(ID, ACT, 4); break;
			case '5': editActivity(ID, ACT, 5); break;
			case 'D': deleteActivity(ID, ACT); return;
			case 'b': return;
			}
			choice = 0;
		} while (choice == 0);
	}
	public void printSelectedActivityMenu(int ID, String ACT) {
		println("\nSelected activity menu");
		println("You've selected project " + ACT + ", what now?");
		System.out.println(app.getInfoOfActivity(ID, ACT));
		println("Edit: 1) Name, 2) Budget Time, 3) Start, 4) End");
		println("Toggle 5) Full time");
		println("*6) Assign Worker");
		println("D) Delete");
		println("b) Back");
	}	
	private void editActivity(int ID, String ACT, int i) {
		switch(i) {
		case 1:
			break;
		case 2: // Budget time
			println("Set budget time, how many hours? (rounded to half hours, seperated by .)");
			app.setBudgetTimeOfProjectActivity(ID, ACT, sc.nextDouble());
			println("The activity " + ACT + " now has a budgetet time of " + app.getBudgetTimeOfProjectActivity(ID, ACT));
			break;
		case 3: // Start
			println("In which week, and year does this activity start? (type week and year seperated by line breaks.)");
			app.editActivityofProjectStart(ID, ACT, sc.nextInt(), sc.nextInt());
			break;
		case 4: // End
			println("In which week, and year does this activity end? (type week and year seperated by line breaks.)");
			app.editActivityofProjectEnd(ID, ACT, sc.nextInt(), sc.nextInt());
			break;	
		case 5: // Full time
			System.out.println("The activity is now " + (app.toggleFullTimeForActOfProj(ID,ACT) == false ? "not" : "") + " a full time activity.");
		case 6: // Assign worker
	
		}
	}
	private String selectActivity(int ID) {
		println("Which activity?");
		String ACTchoice = "";
		do {
			try {ACTchoice = app.getActivtyOfProject(ID, sc.next());} 
			catch (OperationNotAllowedException e) {System.out.println(e);}
		} while (ACTchoice.trim().isEmpty());
		return ACTchoice;
	}
	private String renameActivity(int ID, String ACT) {
		println("What do you want to rename the activity to?");
		String newName = "";
		try {
			newName = app.renameActivityOfProject(ID, ACT, getString(sc));
			System.out.println(ACT + " renamed to: "+ newName);
		} catch (OperationNotAllowedException e) {
			System.out.println(e);
		}
		return newName;
	}
	private void deleteActivity(int ID, String ACT) {
		println("You sure?  (Y to confirm)");
		if(getChar(sc) == 'Y') {
			try {
				app.deleteActivityInProject(ID, ACT);
			} catch (OperationNotAllowedException e) {
				System.out.println(e);
			}
		}
	}
	
	
	/*WORKERS*/
	private void workerMenu() {
		char choice = 0;
		do {
			printWorkerMenu();
			choice = getChar(sc);
			switch(choice) {
				case '1': listWorkers(); break;
				case '2': ; break;
				case '3': addWorker(); break;
				case '4': selectedWorkerMenu(); break;
				case 'b': return;
			}
			choice = 0;
		} while (choice == 0);
	}
	public void printWorkerMenu() {
		println("Manage your workers, what now?");
		println("1) List Workers");
		println("2) Search through workers");
		println("3) Add Worker");
		println("4) Select Worker");
		println("b) Back");
	}
	
	public void listWorkers() {System.out.println(app.listWorkers());}
	public void addWorker() {
		println("What are the initials for the new worker? (max 4");
		try {app.addWorker(sc.next());} 
		catch (OperationNotAllowedException e) {System.out.println(e);}
	}
	
	/* Edit Worker */
	
	public void selectedWorkerMenu() {
		char choice = 0;
		String initials = selectWorker();
		do {
			printSelectedWorkerMenu(initials);
			choice = getChar(sc);
			switch(choice) {
			case '1': assignToActivity(initials); break;
			case '2': seeActivities(initials); break;
			//case 'D': deleteWorker(initials); return;
			case 'b': return;
			}
			choice = 0;
		} while (choice == 0);
	}
	
	public void printSelectedWorkerMenu(String initials) {
		println("\nSelected Worker menu");
		println("You've selected worker " + initials + ", what now?");
		println("1) Assign to activity");
		println("2) See assigned activities");
		println("*D) Delete");
		println("b) Back");
	}
	
	public String selectWorker() {
		println("Worker initials?");
		String workerChoice = null;
		do {
			try {workerChoice = app.findWorker(sc.next());}
			catch (OperationNotAllowedException e) {System.out.println(e);}
		} while (workerChoice == null);
		return workerChoice;
	}
	
	public void assignToActivity(String initials) {
		int ID = selectProject();
		String act = selectActivity(ID);
		try {
			app.assignToActivity(ID, act, initials);
		} catch (Exception e) {
			System.out.println(e);
			}
	}
	
	public void seeActivities(String initials) {
		try {
		System.out.println(app.listWorkerActivities(initials));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	//public void deleteWorker(String initials) {
		
	//}
}