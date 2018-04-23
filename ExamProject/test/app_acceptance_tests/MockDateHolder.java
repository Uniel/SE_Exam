package app_acceptance_tests;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import app.DateServer;
import app.ProjectService;

public class MockDateHolder {
	
	DateServer dateServer = mock(DateServer.class);
	
	public MockDateHolder(ProjectService projectService) {
		GregorianCalendar calendar = new GregorianCalendar();
		setDate(calendar);
		projectService.setDateServer(dateServer);
	}
	
	public void setDate(Calendar calendar) {
		//Calendar c = new GregorianCalendar(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH));
		Calendar c = new GregorianCalendar();
		c.setTime(calendar.getTime());
		when(this.dateServer.getDate()).thenReturn(c);
	}
	
	public void advanceDateByYears(int years) {
		Calendar currentDate = dateServer.getDate();
		Calendar nextDate = new GregorianCalendar();
		nextDate.setTime(currentDate.getTime());
		nextDate.add(Calendar.YEAR, years);
		setDate(nextDate);
	}
	
	public void setYear(int year) {
		Calendar currentDate = dateServer.getDate();
		Calendar nextDate = new GregorianCalendar();
		nextDate.setTime(currentDate.getTime());
		nextDate.set(Calendar.YEAR, year);
		setDate(nextDate);
	}
}
