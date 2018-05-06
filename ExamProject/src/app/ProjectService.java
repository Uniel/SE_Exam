package app;

import java.util.Calendar;

//import java.util.*;

public class ProjectService {
	private App application;
	private DateServer dateServer = new DateServer();
	
	//private boolean TEST_MODE = false;
	private int serialNumber = 1;
	private int thisYear = 1;

	private int nextYear = -10;
	
	public ProjectService(App app){
		this.application = app;
	}
	
	public void setDateServer(DateServer dateServer) {
		this.dateServer = dateServer;
	}
	
	public int getYear() {
		updateProjectNumber();
		return thisYear;
	}
	
	public void setSerial(int newSerial) {
		serialNumber = newSerial;
	}

	public int getSerial() {
		return serialNumber;
	}

	
	private int calcProjectID() throws OperationNotAllowedException {
		while(true) {
			//if(TEST_MODE) {System.out.println("PS: Generating ID from year and serial "+ thisYear + " : " + serialNumber);}
			int ID = ((thisYear%100) * 10000) + (serialNumber%10000);
			updateSerialNumber();
			if(serialNumber > 9999) {
				throw new OperationNotAllowedException("The amount of projects generated this year is too damn high!");
			}
			if(!application.idExists(ID)) {
				return ID;				
			}
		}
	}
	
	private void updateSerialNumber() {
		serialNumber++;
	}
	
	private void updateProjectNumber() {
		Calendar date = dateServer.getDate();
		nextYear = date.get(Calendar.YEAR);
		//if(TEST_MODE){System.out.println("PS.updPno: Checking if date is after the saved year of " + thisYear);}
		//if(TEST_MODE){System.out.println("PS.updPno: Gets calendar with year: " + nextYear);}
		if(nextYear != thisYear) {
			thisYear = nextYear;
			serialNumber = 1;
		}
	}
		
	public int getId() throws OperationNotAllowedException {
		updateProjectNumber();
		return calcProjectID();
	}
}
