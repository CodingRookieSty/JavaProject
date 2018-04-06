
public class StopWatch {
	private long startTime;
	private long endTime;
	
	public StopWatch()
	{
		startTime = new java.util.Date().getTime();
	}
	
	public void start()
	{
		startTime = new java.util.Date().getTime();
	}
	
	public void stop()
	{
		endTime = new java.util.Date().getTime();
	}
	
	public long getElapsedTime()
	{
		return this.endTime - this.startTime;
	}
	
	public static void main(String[] args)
	{
		long time = 0L;
		
		StopWatch stopwatch = new StopWatch();
		
		stopwatch.start();
		
		//—°‘Ò≈≈–Ú£ª
        /*try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
		
		stopwatch.stop();
		
		time = stopwatch.getElapsedTime();
		
		System.out.println("time spent " + time);
	}
}
