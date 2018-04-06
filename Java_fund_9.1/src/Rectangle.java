
public class Rectangle {
	double width;
	double height;
	
	public Rectangle()
	{
		this.width = 1;
		this.height = 1;
	}
	
	public Rectangle(double width, double height)
	{
		this.width = width;
		this.height = height;
	}
	
	public double getArea()
	{
		return width * height;
	}
	
	public double getPerimeter()
	{
		return 2 * (width + height);
	}
	
	public static void main(String[] args)
	{
		double area1;
		double area2;
		
		double per1;
		double per2;
		Rectangle r1 = new Rectangle(4, 40);
		Rectangle r2 = new Rectangle(3.5 , 35.9);
		
		area1 = r1.getArea();
		area2 = r2.getArea();
		
		per1 = r1.getPerimeter();
		per2 = r2.getPerimeter();
		
		System.out.println("width of r1 is " + r1.width);
		System.out.println("height of r1 is" + r1.height);
		
		System.out.println("area of r1 is " + area1);
		System.out.println("permimeter of r1 is" + per1);

		System.out.println("width of r1 is " + r2.width);
		System.out.println("height of r1 is" + r2.height);
		
		System.out.println("area of r2 is " + area2);
		System.out.println("permimeter of r2 is" + per2);
	}
}
