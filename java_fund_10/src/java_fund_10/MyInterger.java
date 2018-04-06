package java_fund_10;

public class MyInterger {
	private int value;
	
	public MyInterger(int value)
	{
		this.value = value;
	}
	
	public int getInterger()
	{
		return this.value;
	}
	
	public boolean isEven()
	{
		return this.value % 2 == 0 ? true: false;
	}
	
	public boolean isOdd()
	{
		return !this.isEven();
	}
	
	//判断是否是负数
	public boolean isPrime()
	{
		int i = 0;
		
		for (i = (this.value - 1); i > 2; i--)
		{
			if (this.value % i == 0)
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean isEven(int value)
	{
		return value % 2 == 0 ? true : false;
	}
	
	public static boolean isOdd(int value)
	{
		return !MyInterger.isEven(value);
	}
	
	public static boolean isPrime(int value)
	{
		int i = 0;
		
		for (i = (value - 1); i > 2; i--)
		{
			if (value % i == 0)
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean isEven(Integer integer)
	{
		return MyInterger.isEven(integer.intValue());
	}
	
	public static boolean isOdd(Integer integer)
	{
		return MyInterger.isOdd(integer.intValue());
	}
	
	public static boolean isPrime(Integer integer)
	{
		return MyInterger.isPrime(integer.intValue());
	}
	
	public boolean equal(int value)
	{
		return this.value == value ? true : false;
	}
	
	public boolean equal(Integer integer)
	{
		return this.equal(integer.intValue());
	}
	
	public static int ParseInt(char[] string)
	{
		String s = new String(string);
		return Integer.parseInt(s);
	}
	
	public static int ParseInt(String string)
	{
		return Integer.parseInt(string);
	}
}
