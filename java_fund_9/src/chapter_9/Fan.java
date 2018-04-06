package chapter_9;

public class Fan {
	final static int SLOW = 1;
	final static int MEDIUM = 2;
	final static int FAST = 3;
	
	private int speed;	//∑Á…»ÀŸ∂»
	private boolean on;
	private double radius;
	String color;
	
	public Fan()
	{
		this.speed = SLOW;
		this.on = false;
		this.radius = 5;
		this.color = "true";
	}
	
	public int getspeed()
	{
		return this.speed;
	}
	
	public boolean geton()
	{
		return this.on;
	}
	
	public double getRadius()
	{
		return this.radius;
	}
	
	public String getColor()
	{
		return this.color;
	}
	
	public void setSpeed(int speed)
	{
		this.speed = speed;
	}
	
	public void setOn(boolean on)
	{
		this.on = on;
	}
	
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public String tostring()
	{
		String s;
		
		if (this.on == true)
		{
			s = "speed"  + this.speed + " " + "color " + this.color + " radius " + this.radius; 
		}
		else
		{
			s = "fan is off " + "color is " + this.color + "radius is " + this.radius;
		}
		
		return s;
	}
	
	
	public static void main(String[] args)
	{
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();
		
		fan1.setSpeed(FAST);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setOn(true);
		
		System.out.println(fan1.tostring());
		
		fan2.setSpeed(MEDIUM);
		fan2.setColor("blue");
	
		System.out.println(fan2.tostring());
	}
	
}
