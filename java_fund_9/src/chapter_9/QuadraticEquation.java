package chapter_9;

import java.util.Scanner;

//9.10
public class QuadraticEquation {
	private double a;
	private double b;
	private double c;
	
	public QuadraticEquation(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getA()
	{
		return this.a;
	}
	
	public double getB()
	{
		return this.b;
	}
	
	public double getC()
	{
		return this.c;
	}
	
	public double getDiscriminant()
	{
		return Math.pow(b, 2) - 4 * a * c;
	}
	
	public double getRoot1()
	{
		double result;
		
		if (this.getDiscriminant() < 0)
		{
			return 0;
		}
		
		result = (this.b * (-1) + Math.pow(this.getDiscriminant(), 1/2)) / (2 * this.a);
		
		return result;
	}
	
	public double getRoot2()
	{
		double result;
		
		if (this.getDiscriminant() < 0)
		{
			return 0;
		}
		
		result = (this.b * (-1) - Math.pow(this.getDiscriminant(), 1/2)) / (2 * this.a);
		
		return result;
	}
	
	public static void main(String[] args)
	{
		double a, b, c;
		Scanner input = new Scanner(System.in);
		
		System.out.println("please input three numbers");
		
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		QuadraticEquation q1 = new QuadraticEquation(a, b, c);
		
		if (q1.getDiscriminant() < 0)
		{
			System.out.println("this equation has no root");
		}
		else if (q1.getDiscriminant() == 0)
		{
			System.out.println("this equation has one root " + q1.getRoot1());
		}
		else
		{
			System.out.println("this equation has two root" + q1.getRoot1() + " " + q1.getRoot2());
		}
	}
}
