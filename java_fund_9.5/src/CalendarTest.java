import java.util.*;
public class CalendarTest {
	public static void main(String[] args)
	{
		GregorianCalendar calendar = new GregorianCalendar();
		
		System.out.println(calendar.get(GregorianCalendar.YEAR) + "/" + calendar.get(GregorianCalendar.MONTH) + "/" + calendar.get(GregorianCalendar.DAY_OF_MONTH));
		
		calendar.setTimeInMillis(123456789876L);
		System.out.println(calendar.get(GregorianCalendar.YEAR) + "/" + calendar.get(GregorianCalendar.MONTH) + "/" + calendar.get(GregorianCalendar.DAY_OF_MONTH));
		
	}
}
