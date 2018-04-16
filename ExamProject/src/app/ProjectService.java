package app;

//import java.util.*;

public class ProjectService {
	
	private int serialNumber = 1;
	private int thisYear = 0;
	
	public ProjectService(){

	}
	
	public void setYear(int newYear) {
		this.thisYear = newYear;
	}
	public int getYear() {
		return thisYear;
	}
	
	public void setSerial(int newSerial) {
		this.serialNumber = newSerial;
	}

	public int getSerial() {
		return serialNumber;
	}

	
	private int calcProjectID() {
		System.out.println("ThisYear ps " + thisYear);
		int ID = ((thisYear%100) * 10000) + (serialNumber%100000);
		updateSerialNumber();
		System.out.println("ID " + ID);
		return ID;
	}
	
	private void updateSerialNumber() {
		serialNumber++;
	}
	
	private void updateProjectNumber() {
	}
		
	public int getId() {
		return calcProjectID();
	}
}
