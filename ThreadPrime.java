
import java.io.*;

class ThreadPrime extends Thread
{
	int start;
	int end;
	File myFile;
	
	ThreadPrime(int start, int end, File myFile)
	{
		this.start  = start;
		this.end    = end;
		this.myFile = myFile;
	}
	
	public void run()
	{
		findPrime();
		
	}
	
	public void findPrime()
	{
		int flag = 0;
		PrintWriter pw = null;
		
		try
		{
		
		pw = new PrintWriter(myFile);
		
		for(int i = start; i <= end; i++)
		{
			for(int j = 2; j < i; j++)
			{
					if(i % j == 0)
					{
						flag = 1;
						break;
					}
			}
		
			if(flag != 1)
			{
				pw.println("Prime Number :: " + i);
			}
			
			flag = 0;
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