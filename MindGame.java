//--------------------------------------------------------------------
//Assignment 3
//Written by: Elsa R
//For Object-Oriented Programming I - Winter 2023
//--------------------------------------------------------------------

//this program displays the simple brilliant mind game jackpot program, which is a game where players test their general knowledge with questions for ten consecutive category topics

import java.util.Scanner;

public class MindGame {

	public static void main(String[] args) 
	{
		System.out.println("____★★★★_______★★★★_______★★★★_______★★★★_______★★★★___");
		System.out.println("  Welcome to the  Simple  Brilliant  Mind  Game  Jackpot!");
		System.out.println("____★★★★_______★★★★_______★★★★_______★★★★_______★★★★___");
		
		System.out.println();
		
		Scanner keyIn = new Scanner(System.in);
		
		System.out.println("How old are you?"); //prompt user for their age
		int age = keyIn.nextInt();
		
		while(age < 15 || age > 125) //make the user re-enter their age as many times until they put the correct age 
			{
			System.out.println("Error: Your input/entry is not a valid integer between 15 to 125. Kindly retry again!");
			System.out.println("How old are you?");
			int newAge = keyIn.nextInt();
			
			if(newAge >= 15 && newAge <= 125)
				break;				
			}
			
		
		System.out.println();
		System.out.println("____★★★★_______★★★★_______★★★★_______★★★★_______★★★★___");
		System.out.println("      Your Jackpot for the Simple Brilliant  Mind  Game  is:");
		System.out.println("____★★★★_______★★★★_______★★★★_______★★★★_______★★★★___");
		System.out.println();
		System.out.println();
		System.out.println();		
		
				
		int category = 0;
		int scoreValue = 0;
		String nameC = "";
		int cryptomValue = 0;
		int countNM = 0; //non multiples counter
		int countM = 0; //multiples counter
			
		for (category = 1; category <= 10; category++) //for loop that goes through each category number
		{
			switch(category) //assign a score value and name to each category number
			{
			case 1: 
				scoreValue = 19;
				nameC = "Science";
				break; 
			case 2:
				scoreValue = 18;
				nameC = "Literature";
				break; 
			case 3: 
				scoreValue = 19;
				nameC = "Sports";
				break;
			case 4: 
				scoreValue = 20;
				nameC = "Animals";
				break;
			case 5: 
				scoreValue = 19;
				nameC = "Television";
				break;
			case 6: 
				scoreValue = 18;
				nameC = "Music";
				break;
			case 7: 
				scoreValue = 19;
				nameC = "Business";
				break;
			case 8: 
				scoreValue = 19;
				nameC = "Geography";
				break;
			case 9: 
				scoreValue = 18;
				nameC = "Cities";
				break;
			case 10: 
				scoreValue = 19;
				nameC = "Opera";
				break;
			}
			
			System.out.println("In the score of " + nameC + ", the numbers that are not multiple of category " + category + " are:");
				
				for(int i=1; i <=scoreValue; i++) //inner for loop that goes through each category's score value from 1 to the score value
					{
					
					
					if(i%category==0) // multiple
						{
						countM = i;	
						
						}
					else if(i%category!=0)//if the number is a non multiple
						{
						countNM = i;
						cryptomValue += i; //sum of non multiples
						System.out.print(countNM + ","); //prints out non multiples one by one separated by a comma
						
						if (countNM==11)
							System.out.print("\n"); //when the number of non multiples exceeds 10, it goes to a new line and continues displaying the numbers
						}
					
					}
				
				if (countNM != 0)//if there are non multiples
				{
				System.out.println(" ==> The Crytom value " + cryptomValue + ".");
				System.out.println();
				}
			else if (countNM == 0) //if there are no non multiples
				{
				System.out.println("No numbers are found in this category!==> The Crytom value 0.");
				System.out.println();
				}
		}
		
		
		System.out.println("Thank you for using my bespoke the Simple Brilliant Mind Game Jackpot Program!");
		
		keyIn.close();
	}
	
	
		}

	


