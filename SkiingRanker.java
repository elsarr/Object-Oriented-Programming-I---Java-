// -----------------------------------
// Assignment 3
// Written by: Elsa 
// For Object-Oriented Programming I - Fall 2023 
// -----------------------------------

/* Question 2: Skiing Ranker 
   This program displays the 3 top winners of a ski competition of max 20 people, based on their skiing time. 
 */

import java.util.Scanner;

public class SkiingRanker 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Mont-Halloween Skiing Contest Ranker."); 
		System.out.println("Whenever a skier makes it to the finish line, enter their name and skiing time.");
		
		int NbOfEntries = -1;
		int MaxEntries = 20;
		
		String aName = "";
		double aTime = 0;
		
		String[] names = new String[20];
		double[] times = new double[20]; //initialize arrays for skier names and times
		
		String repeat = "yes";
		
		while (NbOfEntries < MaxEntries	&& repeat.equals("yes")) //while there is no more than 20 skiers and the user wants to continue entering inputs
		{
	
			 System.out.print("Please input the skier's name: ");
			 NbOfEntries=NbOfEntries+1;
			 aName = in.nextLine(); //save the values entered in variables
						
			 System.out.print("Please input the skier's time: ");
			 aTime = in.nextDouble(); 
			
			
			
			// insert in table
			for (int i =0;i<times.length;i++) //go through the times array 
			{
				if(times[i]<aTime) //if the time at index is smaller than the time entered
				{
					//insert
					for (int j=MaxEntries-2;j>=i;j--) //pushes each entry and ands the new entry in order
					{
						times[j+1]=times[j];
						names[j+1]=names[j];
					}
					times[i]=aTime;
					names[i]=aName;
					break;
				}
				else if(times[i]==aTime) //make sure times are unique and no 2 times are equal 
				{
					System.out.print("Sorry, 2 skiers cannot have the same time.");
					System.exit(0);
				}
					
			}
			
			int firstPodiumIndex = NbOfEntries; //initialize podium indexes
			int secondPodiumIndex = NbOfEntries-1;
			int thirdPodiumIndex = NbOfEntries-2;
			
			if(NbOfEntries>=0) //print scores according to how many skiers were entered
				System.out.println("First podium goes to " + names[firstPodiumIndex] + " who made it in " + times[firstPodiumIndex] + " second(s)");
			if(NbOfEntries>=1)
				System.out.println("Second podium goes to " + names[secondPodiumIndex] + " who made it in " + times[secondPodiumIndex] + " second(s)");
			if(NbOfEntries>=2)
				System.out.println("third podium goes to " + names[thirdPodiumIndex] + " who made it in " + times[thirdPodiumIndex] + " second(s)");
			
			System.out.print("Do you want to add another skier? y/yes: ");
			repeat = in.next();
			
			if (repeat.equals("y") || repeat.equals("yes")) //checks validity 
			{
			repeat = "yes";
			}
			else 
			{
			repeat = "";
			System.out.println("Congratualations to all hree winners!");
			System.out.print("Goodbye!");
			System.exit(0);
			}
			
			if(NbOfEntries == MaxEntries)
			{
				System.out.print("Sorry I cannot support this amount of players.");
				System.exit(0);
			}
				 
				 
			in.nextLine();
		}
		
		in.close();
	}
}
