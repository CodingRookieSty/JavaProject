package chapter_9;

public class RegularPolygon {
	private int n;
	private double side;
	private double x;
	private double y;
	
	public RegularPolygon()
	{
		n = 3;
		side = 1;
		x = 0;
		y = 0;
	}
	
	public RegularPolygon(int n, double side)
	{
		this.n = n;
		this.side = side;
		this.x = 0;
		this.y = 0;
	}
	
	public RegularPolygon(int n, double side, double x, double y)
	{
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	
	public void setn(int n)
	{
		this.n = n;
	}
	
	public void setSide(double side)
	{
		this.side = side;
	}
	
	public void setX(double x)
	{
		this.x = x;
	}
	
	public void setY(double y)
	{
		this.y = y;
	}
	
	public int getn()
	{
		return this.n;
	}
	
	public double getSide()
	{
		return this.side;
	}
	
	public double getX()
	{
		return this.x;
	}
	
	public double getY()
	{
		return this.y;
	}
	
	public double getPerimeter()
	{
		return n * side;
	}
	
	public double getArea()
	{
		double area;
		
		area = n * (Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
		
		return area;
	}
	
	public static void main(String[] args)
	{
		RegularPolygon r1 = new RegularPolygon();
		RegularPolygon r2 = new RegularPolygon(6,4);
		RegularPolygon r3 = new RegularPolygon(10,4,5.6,7.8);
		
		System.out.println(r1.getPerimeter() + " " + r1.getArea());
		System.out.println(r2.getPerimeter() + " " + r2.getArea());
		System.out.println(r3.getPerimeter() + " " + r3.getArea());
	}
}
