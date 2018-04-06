
public class Stock {
	String symbol;	//股票代码
	String name;	//股票名字
	
	double previousClosingPrice;	//前一日股票值
	double currentPrice;		//当前股票值
	
	public Stock(String symbol, String name)
	{
		this.symbol = symbol;
		this.name = name;
	}
	
	public void getChangePercent()
	{
		double percent;
		
		if (currentPrice >= previousClosingPrice)
		{
			percent = (currentPrice - previousClosingPrice) / previousClosingPrice;
			System.out.println("up" + 100 * percent + "%");
		}
		else if (currentPrice < previousClosingPrice)
		{
			percent = (previousClosingPrice - currentPrice) / previousClosingPrice;
			System.out.println("down" + 100 * percent + "%");
		}
	}
	
	public static void main(String[] args)
	{
		Stock s = new Stock("ORCL", "Oracle Corporation");
		
		s.previousClosingPrice = 34.5;
		s.currentPrice = 34.35;
		
		s.getChangePercent();
	}
}
