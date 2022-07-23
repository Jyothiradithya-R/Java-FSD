package practiceprojects2;
import java.util.regex.*;
public class Threads extends Thread
		{
		 	public void run()
		 	{
		  		System.out.println("concurrent thread started running..");
		}
		 	public static void main( String args[] )
		 	{
		 		Threads mt = new  Threads();
		  		mt.start();
		 	}
		}


