package app;

import java.util.Calendar;
import java.util.GregorianCalendar;

// Hubert
public class DateServer {
	
	// Hubert
	public Calendar getDate() {
		Calendar calendar = new GregorianCalendar();
		Calendar c = new GregorianCalendar(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH));
		return c;
	}
}
