package java_fund_10;

public class MyStack {
	final static int MAX_STACK_LEN = 1024;
	
	private int elements[];
	private int size;
	
	public MyStack()
	{
		elements = new int[MAX_STACK_LEN];
		size = 0;
	}
	
	public MyStack(int size)
	{
		elements = new int[size];
		this.size = 0;
	}
	
	public boolean empty()
	{
		return this.size == 0 ? true : false;
	}
	
	public int getSize()
	{
		return this.size;
	}
	
	public int peek()
	{
		return elements[size - 1];
	}
	
	public int pop()
	{
		int n = 0;
		n = elements[size - 1];
		elements[size - 1] = 0;
		size--;
		return n;
	}
	
	public void push(int value)
	{
		elements[size++] = value;
	}
}
