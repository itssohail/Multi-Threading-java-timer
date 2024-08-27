package multithreading;

import java.util.Scanner;

public class Timer extends Thread
{
	Scanner sc = new Scanner(System.in);
	public void run()
	{
		int count = 0;
		boolean countReached = false;
		System.out.println("Enter the Task name: ");
		String taskName = sc.next();
		System.out.println("Enter the end time to complete the task in seconds");
		int timeInSeconds = sc.nextInt();
		System.out.println("Goodluck, timer begins in 1, 2, 3..");
		while(!countReached)
		{
			if(timeInSeconds>0)
			{
				
				if(count<=timeInSeconds)
				System.out.println(count++);
				else
				{
					System.out.println();
					System.out.println("FOR THE TASK "+taskName+" TIME OUT..");
					countReached=true;
				}
				
				try {
					Thread.sleep(1000);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else
			{
				System.out.println("Time cannot be negative, please enter valid time");
				countReached=true;
			}
			
		}
	}
	public static void main(String[] args) {
	Timer time = new Timer();
	time.start();
	}
}
