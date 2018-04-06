package java_fund_10;

import java.util.Date;

public class Time {
	private int hour;
	private int min;
	private int sec;
	
	public Time()
	{
		Date date = new Date();
		this.hour = date.getHours();
		this.min = date.getMinutes();
		this.sec = date.getSeconds();
	}
	
	
	public Time(long elapseTime)
	{
		long allsec = elapseTime / 1000;
		long allmin = allsec / 60;
		long allhour = allmin / 60;
		
		this.sec = (int) (allsec % 60);
		this.min = (int) (allmin %  60);
		this.hour = (int) (allhour % 24);
	}
	
	public int getHour()  
	{
		return this.hour;
	}
	
	public int getMin()
	{
		return this.min;
	}
	
	public int getSec()
	{
		return this.sec;
	}
	
	public static void main(String[] args)
	{
		Time time1 = new Time();
		Time time2 = new Time(555550000);
		
		System.out.println("hour is " + time1.getHour() + "min is " + time1.getMin() + "seconds is " + time1.getSec());
		
		System.out.println("hour is " + time2.getHour() + "min is " + time2.getMin() + "seconds is " + time2.getSec());
	}
}
