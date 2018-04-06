import java.util.Random;

public class RandomTest {
	public static void main(String[] args)
	{
		int i = 0;
		
		Random random = new Random(1000);
		
		for (i = 0; i < 50; i++)
		{
			System.out.print(random.nextInt(100) + " ");
		}
	}
}
