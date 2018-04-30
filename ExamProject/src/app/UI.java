package app;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import cucumber.api.java.bs.A;

public class UI {

	private App app;
	Scanner sc = new Scanner(System.in);
	
	public UI(App application) {
		this.app = application;
	}
	
	
	public void run() {
		char choice = 0;
		do {
			printMenu();
			choice = getChar(sc);
			switch(choice) {
			case '1':
				projectMenu(); break;
			case 'q':
				println("K. Bye!");
				return;
			}
			choice = 0;
		} while (choice == 0);
		sc.close();
	}
	
	public void printMenu() {
		println("Welcome to the planner tool!");
		println("What do you want to do now?");
		println("1) Enter the project menu");
		println("");
		println("q) Quit");
	}
	
	private char getChar(Scanner sc) {return sc.next().charAt(0);}
	private String getString(Scanner sc) {return sc.next();}
	private void println(String str) {System.out.println(str);}
	
	/*
	 PROJECT MENU FUNCTIONS
	 */
	
	public void projectMenu() {
		char choice = 0;
		do {
			printProjectMenu();
			choice = getChar(sc);
			switch(choice) {
			case '1':
				createProject(); break;
			case '2':
				printProjects(); break;
			case '3':
				selectedProjectMenu(); break;
			case 'b':
				return;
			}
			choice = 0;
		} while (choice == 0);
	}
	public void printProjectMenu() {
		println("\nProject menu");
		println("What do you want to do now?");
		println("1) Create Project");
		println("2) List projects");
		println("3) Select/edit project");
		println("b) Back");
	}
	
	private void createProject() {app.createProject();}
	public void printProjects() {
		println("\nContained projects:");
		for(Project p : app.getProjects()) {
			System.out.println("Project: " + p.getProjectID() + " - " + p.getName() );
		}
	}
	
	/*
	 SELECT PROJECT MENU
	 */
	
	public void selectedProjectMenu() {
		char choice = 0;
		int ID = selectProject();
		do {
			printSelectedProjectMenu(ID);
			choice = getChar(sc);
			switch(choice) {
			case '1':
				createProject(); break;
			case '2':
				printProjects(); break;
			case '3':
				selectProject(); break;
			case 'b':
				return;
			}
			choice = 0;
		} while (choice == 0);
	}
	private int selectProject() {
		println("Which project ID?");
		int IDchoice = 0;
		do {
			try {
				IDchoice = app.getIdOfProject(sc.nextInt());
			} catch (OperationNotAllowedException e1) {
				System.out.println(e1);
			}
		} while (IDchoice <= 0);
		return IDchoice;
	}
	public void printSelectedProjectMenu(int ID) {
		println("\nSelected Project menu");
		println("You've selected project " + ID + ", what now?");
		System.out.println(app.getInfoOfProject(ID));
		println("1) ");
		
		println("b) Back");
	}
	
//	getNameOfProject(int ID) {return findProjectWithID(ID).getName();}
//	public String getTypeOfProject(int ID) {return findProjectWithID(ID).getType();}
//	public String getCustomerOfProject(int ID) {return findProjectWithID(ID).getCustomer();}
//	public int getIdOfProject(int ID) throws OperationNotAllowedException{return selectProject(ID).getProjectID();}
//	public Calendar getStartOfProject(int ID) {return findProjectWithID(ID).getStart();}
//	public Calendar getEndOfProject
	
}