package app;

import java.util.List;
import java.util.Scanner;

// Adam 
public class UI {

	private App app;
	Scanner sc = new Scanner(System.in);

	// Adam
	public UI(App application) {
		this.app = application;
	}

	/* Main Menu */
	// Adam
	public void run() {
		char choice = 0;
		do {
			printMenu();
			choice = getChar(sc);
			switch (choice) {
			case '1':
				projectMenu();
				break;
			case '2':
				workerMenu();
				break;
			case 'q':
				println("K. Thanks Bye!");
				return;
			}
			choice = 0;
		} while (choice == 0);
		sc.close();
	}

	// Adam
	public void printMenu() {
		println("Welcome to the planner tool!");
		println("What do you want to do now?");
		println("1) Enter the project menu");
		println("2) Manage workers");
		println("q) Quit");
		println("At any input promt you can type cancel to cancel");
	}

	// Adam
	private char getChar(Scanner sc) {
		return sc.next().charAt(0);
	}

	// Adam
	private void println(String str) {
		System.out.println(str);
	}

	// Andreas
	private boolean cancelCheck(String str) {
		return str.trim().toLowerCase().equals("cancel");
	}

	/* PROJECT MENU FUNCTIONS */
	// Adam
	public void projectMenu() {
		char choice = 0;
		do {
			printProjectMenu();
			choice = getChar(sc);
			switch (choice) {
			case '1':
				createProject();
				break;
			case '2':
				printProjects();
				break;
			case '3':
				selectedProjectMenu();
				break;
			case '4':
				projectSearch();
				break;
			case 'b':
				return;
			}
			choice = 0;
		} while (choice == 0);
	}

	// Adam
	private void projectSearch() {
		println("Type a seach term, can be entirety or parts of the project name or ID");
		String input = sc.next();
		if (cancelCheck(input)) {
			return;
		}
		try {
			String[][] str = app.searchForProjects(input);
			System.out.println("Projects found: \n");
			if (!(str.length == 0)) {
				for (int i = 0; i <= str.length - 1; i++) {
					System.out.println(str[i][0] + " - " + str[i][1]);
				}
			}
		} catch (OperationNotAllowedException e) {
			System.out.println(e.getMessage());
		}
	}

	// Adam
	public void printProjectMenu() {
		println("\nProject menu");
		println("What do you want to do now?");
		println("1) Create Project");
		println("2) List projects");
		println("3) Select/edit project");
		println("4) Search for a project");
		println("b) Back");
		println("At any input promt you can type cancel to cancel");
	}

	// Adam
	private void createProject() {
		int newProj;
		try {
			newProj = app.createNewProject();
			System.out.println("Project with ID " + newProj + " has been created!");
		} catch (OperationNotAllowedException e) {
			System.out.println(e.getMessage());
		}
	}

	// Adam
	public void printProjects() {
		println("\nContained projects:");
		for (Project p : app.getProjects()) {
			System.out.println("Project: " + p.getProjectID() + " - " + (p.getName() == null ? "" : p.getName()));
		}
	}

	/* EDIT PROJECT MENU */
	// Adam
	public void selectedProjectMenu() {
		char choice = 0;
		int ID = selectProject();
		if (ID == -1) {
			return;
		}
		do {
			printSelectedProjectMenu(ID);
			choice = getChar(sc);
			switch (choice) {
			case '1':
				editProjectInfo(1, ID);
				break;
			case '2':
				editProjectInfo(2, ID);
				break;
			case '3':
				editProjectInfo(3, ID);
				break;
			case '4':
				editProjectInfo(4, ID);
				break;
			case '5':
				editProjectInfo(5, ID);
				break;
			case '6':
				editProjectInfo(6, ID);
				break;
			case '7':
				createActivity(ID);
				break;
			case '8':
				selectedActivityMenu(ID);
				break;
			case 'D':
				deleteProject(ID);
				return;
			case 'b':
				return;
			}
			choice = 0;
		} while (choice == 0);
	}

	// Adam
	private void createActivity(int iD) {
		println("What should the activity be named?");
		sc.nextLine();
		String input = sc.nextLine();
		if (cancelCheck(input)) {
			return;
		}
		try {
			app.createActivityInProject(iD, input);
		} catch (OperationNotAllowedException e) {
			System.out.println(e.getMessage());
		}
	}

	// Adam
	private int selectProject() {
		int IDchoice = -1;
		String input;
		do {
			do {
				println("Which project ID?");
				input = sc.next();
				if (cancelCheck(input)) {
					return -1;
				}
				input = input.replaceAll("[^0-9]", "");
			} while (input.trim().isEmpty());
			try {
				IDchoice = app.getIdOfProject(Integer.parseInt(input));
			} catch (NumberFormatException e) {
				System.out.println("Please write numbers");
			} catch (OperationNotAllowedException e) {
				System.out.println(e.getMessage());
			}
		} while (IDchoice < 0);
		return IDchoice;
	}

	// Adam
	public void printSelectedProjectMenu(int ID) {
		println("\nSelected Project menu");
		println("You've selected project " + ID + ", what now?");
		String[] projInfo = app.getInfoOfProject(ID);
		for (int i = 0; i <= projInfo.length - 1; i++) {
			System.out.println(projInfo[i]);
		}
		printActivitiesOfProject(ID);
		println("\nEdit: 1) Name, 2) Type, 3) Customer");
		println("Set new 4) Leader, 5) Start, 6) End");
		println("7) Create activity");
		println("8) Edit acitivity");
		println("D) Delete");
		println("b) Back");
		println("At any input promt you can type cancel to cancel");
	}

	// Adam
	private void printActivitiesOfProject(int iD) {
		String[] str = app.getProjectActivities(iD);
		System.out.println("Activities in project:");
		for (int i = 0; i <= str.length - 1; i++) {
			System.out.println("> " + str[i]);
		}
	}

	// Adam
	private void editProjectInfo(int i, int ID) {
		String input;
		String input2;
		switch (i) {
		case 1: // Name
			println("What do you want to name the project?");
			input = sc.next();
			if (cancelCheck(input)) {
				return;
			}
			app.editProjectName(ID, input);
			break;
		case 2: // Type
			println("Which type should it have? (internal / external)");
			input = sc.next();
			if (cancelCheck(input)) {
				return;
			}
			try {
				app.editProjectType(ID, input);
			} catch (OperationNotAllowedException e1) {
				System.out.println(e1.getMessage());
			}
			break;
		case 3: // Customer
			println("Which customer does this project belong to?");
			input = sc.next();
			if (cancelCheck(input)) {
				return;
			}
			app.editProjectCustomer(ID, input);
			break;
		case 4: // Leader
			println("Who should be the leader?");
			try {
				app.setProjectLeader(ID, selectWorker());
			} catch (OperationNotAllowedException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 5: // Start
			println("In which week, and year does this project start? (type week and year seperated by line breaks.)");
			input = sc.next();
			if (cancelCheck(input)) {
				return;
			}
			input2 = sc.next();
			if (cancelCheck(input2)) {
				return;
			}
			try {
				app.editProjectStart(ID, Integer.parseInt(input), Integer.parseInt(input2));
			} catch (NumberFormatException e) {
				System.out.println("Please input numbers");
			} catch (OperationNotAllowedException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 6: // End
			println("In which week, and year does this project end? (type week and year seperated by line breaks.)");
			input = sc.next();
			if (cancelCheck(input)) {
				return;
			}
			input2 = sc.next();
			if (cancelCheck(input2)) {
				return;
			}
			try {
				app.editProjectEnd(ID, Integer.parseInt(input), Integer.parseInt(input2));
			} catch (NumberFormatException e) {
				System.out.println("Please input numbers");
			} catch (OperationNotAllowedException e) {
				System.out.println(e.getMessage());
			}
			break;
		}
	}

	// Adam
	private void deleteProject(int ID) {
		println("You sure?  (Y for confirm)");
		if (getChar(sc) == 'Y') {
			try {
				app.removeProject(ID);
			} catch (OperationNotAllowedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	/* EDIT ACTIVITIES */
	// Adam
	public void selectedActivityMenu(int id) {
		char choice = 0;
		int ID = id;
		String ACT = selectActivity(ID);
		String newACT;
		if (cancelCheck(ACT)) {
			return;
		}
		do {
			printSelectedActivityMenu(ID, ACT);
			choice = getChar(sc);
			switch (choice) {
			case '1':
				newACT = renameActivity(ID, ACT);
				if (!cancelCheck(newACT)) {
					ACT = newACT;
				}
				break;
			case '2':
				editActivity(ID, ACT, 2);
				break;
			case '3':
				editActivity(ID, ACT, 3);
				break;
			case '4':
				editActivity(ID, ACT, 4);
				break;
			case '5':
				editActivity(ID, ACT, 5);
				break;
			case '6':
				editActivity(ID, ACT, 6);
				break;
			case '7':
				listWorkers(ID, ACT);
				break;
			case 'D':
				deleteActivity(ID, ACT);
				return;
			case 'b':
				return;
			}
			choice = 0;
		} while (choice == 0);
	}

	// Adam
	public void printSelectedActivityMenu(int ID, String ACT) {
		println("\nSelected activity menu");
		println("You've selected activity " + ACT + ", what now?");
		String[] actInfo = app.getInfoOfActivity(ID, ACT);
		for (int i = 0; i <= actInfo.length - 1; i++) {
			System.out.println(actInfo[i]);
		}
		println("Edit: 1) Name, 2) Budget Time, 3) Start, 4) End");
		println("5) Toggle Full time");
		println("6) Assign Worker");
		println("7) Show assigned workers");
		println("D) Delete");
		println("b) Back");
		println("At any input promt you can type cancel to cancel");
	}

	// Adam
	private void editActivity(int ID, String ACT, int i) {
		String input;
		String input2;
		switch (i) {
		case 2: // Budget time
			println("Set budget time, how many hours? (rounded to half hours, seperated by .)");
			input = sc.next();
			if (cancelCheck(input)) {
				return;
			}
			try {
				app.setBudgetTimeOfProjectActivity(ID, ACT, Double.parseDouble(input));
			} catch (NumberFormatException e1) {
				System.out.println("That's not a valid number");
			}
			println("The activity " + ACT + " now has a budgetet time of "
					+ app.getBudgetTimeOfProjectActivity(ID, ACT));
			break;
		case 3: // Start
			println("In which week, and year does this activity start? (type week and year seperated by line breaks.)");
			input = sc.next();
			if (cancelCheck(input)) {
				return;
			}
			input2 = sc.next();
			if (cancelCheck(input2)) {
				return;
			}
			try {
				app.editActivityofProjectStart(ID, ACT, Integer.parseInt(input), Integer.parseInt(input2));
			} catch (NumberFormatException e) {
				System.out.println("Please input numbers");
			} catch (OperationNotAllowedException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 4: // End
			println("In which week, and year does this activity end? (type week and year seperated by line breaks.)");
			input = sc.next();
			if (cancelCheck(input)) {
				return;
			}
			input2 = sc.next();
			if (cancelCheck(input2)) {
				return;
			}
			try {
				app.editActivityofProjectEnd(ID, ACT, Integer.parseInt(input), Integer.parseInt(input2));
			} catch (NumberFormatException e) {
				System.out.println("Please input numbers");
			} catch (OperationNotAllowedException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 5: // Full time
			System.out.println("The activity is now " + (app.toggleFullTimeForActOfProj(ID, ACT) == false ? "not" : "")
					+ " a full time activity.");
			break;
		case 6: // Assign worker
			workerAssignation(ID, ACT);
			break;
		}
	}

	// Adam
	private String selectActivity(int ID) {
		println("Which activity?");
		String ACTchoice = "";
		sc.nextLine();
		do {
			String input = sc.nextLine();
			if (cancelCheck(input)) {
				return "cancel";
			}
			try {
				ACTchoice = app.getActivtyOfProject(ID, input);
			} catch (OperationNotAllowedException e) {
				System.out.println(e.getMessage());
			}
		} while (ACTchoice.trim().isEmpty());
		return ACTchoice;
	}

	// Adam
	private String renameActivity(int ID, String ACT) {
		println("What do you want to rename the activity to?");
		String newName = "";
		String input = sc.next();
		if (cancelCheck(input)) {
			return "cancel";
		}
		try {
			newName = app.renameActivityOfProject(ID, ACT, input);
			System.out.println(ACT + " renamed to: " + newName);
		} catch (OperationNotAllowedException e) {
			System.out.println(e.getMessage());
		}
		return newName;
	}

	// Adam
	private void deleteActivity(int ID, String ACT) {
		println("You sure?  (Y to confirm)");
		if (getChar(sc) == 'Y') {
			try {
				app.deleteActivityInProject(ID, ACT);
			} catch (OperationNotAllowedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	// Adam
	private void workerAssignation(int ID, String act) {
		String selection = "0";
		do {
			println("Do you wish to (1) specify a worker or (2) see a list of available workers?\n");
			selection = sc.next();
			if(cancelCheck(selection)){
				break;
			}
		} while(! (selection.equals("1") || selection.equals("2")));
		switch (selection) {
		case "2":
			try {
				System.out.println(returnWorkerListString(app.returnAvailableWorkers(ID, act)));
			} catch (OperationNotAllowedException e) {
				System.out.println(e.getMessage());
				break;
			}
		case "1":
			try {
				app.assignToActivity(ID, act, selectWorker());
				System.out.println("Worker added!");
			} catch (OperationNotAllowedException e) {
				System.out.println(e.getMessage());
			}
			break;
		}
	}

	// Adam
	public void assignToActivity(int ID, String act, String initials) {
		try {
			app.assignToActivity(ID, act, initials);
			System.out.println("Worker " + initials + " has been assigned to activity " + act + " in project " + ID);
		} catch (OperationNotAllowedException e) {
			System.out.println(e.getMessage());
		}
	}

	// Adam
	private void listWorkers(int ID, String ACT) {
		println("Workers assigned to this activity is: \n");
		try {
			System.out.println(returnWorkerListString(app.returnWorkersOfActivity(ID, ACT)));
		} catch (OperationNotAllowedException e) {
			System.out.println(e.getMessage());
		}
	}

	/* WORKERS */
	// Andreas
	private void workerMenu() {
		char choice = 0;
		do {
			printWorkerMenu();
			choice = getChar(sc);
			switch (choice) {
			case '1':
				listWorkers();
				break;
			case '2':
				addWorker();
				break;
			case '3':
				selectedWorkerMenu();
				break;
			case 'b':
				return;
			}
			choice = 0;
		} while (choice == 0);
	}

	// Andreas
	public void printWorkerMenu() {
		println("Manage your workers, what now?");
		println("1) List Workers");
		println("2) Add Worker");
		println("3) Select Worker");
		println("b) Back");
		println("At any input promt you can type cancel to cancel");
	}

	// Andreas
	public void listWorkers() {
		System.out.println("Workers found: \n");
		System.out.println(returnWorkerListString(app.listWorkers()));
	}

	// Andreas
	public void addWorker() {
		println("What are the initials for the new worker? (max 4)");
		String input = sc.next();
		if (cancelCheck(input)) {
			return;
		}
		try {
			app.addWorker(input);
		} catch (OperationNotAllowedException e) {
			System.out.println(e.getMessage());
		}
	}

	/* Edit Worker */

	// Andreas
	public void selectedWorkerMenu() {
		char choice = 0;
		String initials = selectWorker();
		if (cancelCheck(initials)) {
			return;
		}
		do {
			printSelectedWorkerMenu(initials);
			choice = getChar(sc);
			switch (choice) {
			case '1':
				assignToActivity(initials);
				break;
			case '2':
				seeActivities(initials);
				break;
			case '3':
				assignVacation(initials);
				break;
			case 'D':
				deleteWorker(initials);
				return;
			case 'b':
				return;
			}
			choice = 0;
		} while (choice == 0);
	}

	// Andreas
	public void printSelectedWorkerMenu(String initials) {
		println("\nSelected Worker menu");
		println("You've selected worker " + initials + ", what now?");
		println("1) Assign to activity");
		println("2) See assigned activities");
		println("3) Assign vacation");
		println("D) Delete");
		println("b) Back");
	}

	// Andreas
	public String selectWorker() {
		println("Worker initials?");
		String workerChoice = null;
		do {
			String input = sc.next();
			if (cancelCheck(input)) {
				return "cancel";
			}
			try {
				workerChoice = app.findWorker(input);
			} catch (OperationNotAllowedException e) {
				System.out.println(e.getMessage());
				return "cancel";
			}
		} while (workerChoice == null);
		return workerChoice.toUpperCase();
	}

	// Andreas
	public void assignToActivity(String initials) {
		String inp = "";
		boolean cont = false;
		println("Want to search for a project? (Y/N)");
		inp = sc.next().trim();
		if (inp.equals("Y")) {
			cont = true;
		} else if (cancelCheck(inp)) {
			return;
		}
		while (cont) {
			projectSearch();
			println("Found what you where looking for? (Y/N).");
			inp = sc.next().trim();
			if (inp.equals("Y")) {
				cont = false;
			}
		}
		int ID = selectProject();
		println("Want to list the activities contained in the project? (Y/N)");
		if (sc.next().trim().equals("Y")) {
			printActivitiesOfProject(ID);
		}
		String act = selectActivity(ID);
		try {
			app.assignToActivity(ID, act, initials);
			System.out.println("Worker " + initials + " has been assigned to activity " + act + " in project " + ID);
		} catch (OperationNotAllowedException e) {
			System.out.println(e.getMessage());
		}
	}

	// Andreas
	public void seeActivities(String initials) {
		try {
			String str[][] = app.listWorkerActivities(initials);
			System.out.println("Activities found: \n");
			for (int i = 0; i < str.length; i++) {
				System.out.println("> " + str[i][0] + " in project " + str[i][1]);
			}
		} catch (OperationNotAllowedException e) {
			System.out.println(e.getMessage());
		}
	}

	// Andreas
	public void assignVacation(String initials) {
		println("In which week, and year does the vacation start? (type week and year seperated by line breaks.)");
		String input = sc.next();
		if (cancelCheck(input)) {
			return;
		}
		String input2 = sc.next();
		if (cancelCheck(input2)) {
			return;
		}
		println("In which week, and year does the vacation end? (type week and year seperated by line breaks.)");
		String input3 = sc.next();
		if (cancelCheck(input3)) {
			return;
		}
		String input4 = sc.next();
		if (cancelCheck(input4)) {
			return;
		}
		try {
			app.vacationAssign(initials, Integer.parseInt(input), Integer.parseInt(input3), Integer.parseInt(input2),
					Integer.parseInt(input4));
		} catch (NumberFormatException e) {
			System.out.println("Please write numbers");
		} catch (OperationNotAllowedException e) {
			System.out.println(e.getMessage());
		}
	}

	// Andreas
	public void deleteWorker(String initials) {
		println("You sure?  (Y to confirm)");
		if (getChar(sc) == 'Y') {
			try {
				app.deleteWorker(initials);
			} catch (OperationNotAllowedException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("The worker " + initials + " has been removed");
		}
	}

	// Andreas
	public String returnWorkerListString(List<Worker> WorkersIN) {
		String str = "";
		for (Worker w : WorkersIN) {
			str += "> " + w.getInitials() + "\n";
		}
		return str;
	}
}