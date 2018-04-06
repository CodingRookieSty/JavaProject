import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annuallnterestRate;	//当前利率
	private Date datecreate;
	
	public Account()
	{
		id = 0;
		balance = 0;
		annuallnterestRate = 0;
		datecreate = new Date();
	}
	
	public Account(int id, double balance, double annuallnterestRate)
	{
		this.id = id;
		this.balance = balance;
		this.annuallnterestRate = annuallnterestRate;
		datecreate = new Date();
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public double getBalance()
	{
		return this.balance;
	}
	
	public void setBalance(double Balance)
	{
		this.balance = balance;
	}
	
	public double getAnnualInterestRate()
	{
		return this.annuallnterestRate;
	}
	
	public void setAnnualInterestRate(double rate)
	{
		this.annuallnterestRate = rate;
	}
	
	public Date getDateCreate()
	{
		return this.datecreate;
	}
	
	public double getMonthlyInterestRate()
	{
		return balance * annuallnterestRate / 12 / 100;
	}
	
	public void withDraw(double num)
	{
		this.balance = this.balance - num;
	}
	
	public void deposit(double num)
	{
		this.balance += num;
	}
	
	public static void main(String[] args)
	{
		Account account = new Account(1122, 20000, 4.5);
		
		account.withDraw(2500);
		account.deposit(3000);
		
		System.out.println(account.getBalance() + " " + account.getMonthlyInterestRate() + " " + account.getDateCreate().toString());
	}
}
