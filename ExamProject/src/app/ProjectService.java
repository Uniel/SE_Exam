package app;

//import java.util.*;

public class ProjectService {
	private App application;
	private boolean TEST_MODE = false;
	private int serialNumber = 1;
	private int thisYear = 0;
	private int nextYear = -10;
	
	public ProjectService(App app){
		this.application = app;
	}
	
	public void setYear(int newYear) {
		nextYear = newYear;
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

	
	private int calcProjectID() {
		while(true) {
			if(TEST_MODE) {System.out.println("PS: Generating ID from year and serial "+ thisYear + " : " + serialNumber);}
			int ID = ((thisYear%100) * 10000) + (serialNumber%10000);
			updateSerialNumber();
			if(!application.idExists(ID)) {
				return ID;				
			}
		}
	}
	
	private void updateSerialNumber() {
		serialNumber++;
	}
	
	private void updateProjectNumber() {
		if(TEST_MODE){System.out.println("PS.updPno: Checking if date is after the saved year of " + thisYear);}
		if(TEST_MODE){System.out.println("PS.updPno: Gets calendar with year: " + nextYear);}
		if(nextYear != thisYear) {
			thisYear = nextYear;
			serialNumber = 0;
		}
	}
		
	public int getId() {
		updateProjectNumber();
		return calcProjectID();
	}
}
