package hust.soict.ictglobal;

public class MemoryDaemon implements Runnable
{
	// Keep track of memory usage in the system. 
	long memoryUsed = 0;
	
	@Override
	public void run()
	{
		Runtime rt = Runtime.getRuntime();
		long used;
		
		while ( true )
		{
			used = rt.totalMemory() - rt.freeMemory();
			
			if ( used != memoryUsed )
			{
				System.out.println("\tMemory used = " + used);
				
				memoryUsed = used;
			}
		}
		
	}

}
