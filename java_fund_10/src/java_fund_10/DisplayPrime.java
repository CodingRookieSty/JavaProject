package java_fund_10;

//10.6
public class DisplayPrime {
	public static boolean isPrime(int value)
	{
		int i = 0;
		
		for (i = value -1; i >= 2; i--)
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
		int i = 0;
		MyStack stack = new MyStack();
		int stacksize = 0;
		
		for (i = 120; i >= 2; i--)
		{
			if (isPrime(i))
			{
				stack.push(i);
			}
		}
		
		stacksize = stack.getSize();
		
		for ( i = 0; i < stacksize; i++)
		{
			System.out.print(stack.pop() + " ");
		}
		
		System.out.println("\n");
	}
}
