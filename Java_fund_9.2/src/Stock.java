
public class Stock {
	String symbol;	//��Ʊ����
	String name;	//��Ʊ����
	
	double previousClosingPrice;	//ǰһ�չ�Ʊֵ
	double currentPrice;		//��ǰ��Ʊֵ
	
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
