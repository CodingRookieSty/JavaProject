package java_fund_10;

import java.util.Scanner;

public class DisplayPrimeFactor {
	
	public static boolean isPrime(int value)
	{
		int i = 0;
		
		for (i = value -1; i > 2; i--)
		{
			if (value % i == 0)
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args)
	{
		int testNum = 0;
		int i = 2;
		int j = 0;
		boolean testEmp = false;
		Scanner input = new Scanner(System.in);
		System.out.print("please input an integer:");
		MyStack stack = new MyStack();
		int size = 0;
		
		while(input.hasNext())
		{
			testNum = input.nextInt();
			
			while(testNum != 1)
			{
				if (testNum % i == 0 && isPrime(i))
				{
					stack.push(i);
					testNum /= i;
					i = 2;
				}
				else
				{
					i++;
				}
			}
			
			size = stack.getSize();
			for (j = 0; j < size; j++)
			{
				System.out.print(stack.pop() + " ");
			}
		
			System.out.println("\n");
			
			i = 2;
			System.out.print("please input an integer:");
		}
	}
}
