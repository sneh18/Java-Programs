
import java.io.*;

class ThreadExample
{
	public static void main(String[] args) throws Exception
	{
		File myFile = new File("myFile.txt");
		
		ThreadPrime tp = new ThreadPrime(1, 100, myFile);
		ThreadEven  te = new ThreadEven(1, 100, myFile);
		
		
		te.start();
		tp.start();
		
		tp.join();
		te.join();
		
		System.out.println("Main Ended...");
	}
}