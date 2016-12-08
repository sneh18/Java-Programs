
import java.io.*;

class ThreadEven extends Thread
{
	int start;
	int end;
	File myFile;
	
	ThreadEven(int start, int end, File myFile)
	{
		this.start  = start;
		this.end    = end;
		this.myFile = myFile;
	}
	
	public void run()
	{
		findEven();
	}
	
	public void findEven()
	{
		PrintWriter pw = null;
		
		try
		{
			pw = new PrintWriter(myFile);
		
			for(int i = start; i <= end; i++)
			{
				if(i % 2 == 0)
				{
					pw.println("Even Number :: " + i);
				}
			}
		}
		catch(Exception ex)
		{
	
		}
		finally
		{
			pw.close();
		}
	}
}