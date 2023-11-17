// -----------------------------------
// Assignment 2
// Written by: Elsa 
// For Object-Oriented Programming I - Fall 2023 
// -----------------------------------

/* Question 2: Grade Calculator
   This program gives back a student's letter grade based on their corresponding score out of 100.
 */

import java.util.Scanner; 

public class GradeCalculator 
{

	public static void main(String[] args) 
	{
		System.out.println("_______****_______****_______****_______****_____****_____"); //welcome message
		System.out.println("Welcome to Grade Calculator");
		System.out.println("_______****_______****_______****_______****_____****_____");
		System.out.println();
		System.out.println();
		
		Scanner in = new Scanner(System.in); //create scanner
		System.out.print("Enter the student's score (out of 100): ");
		double score1 = in.nextDouble();
		
		if (score1 < 0) //check if score is in the right range 
		{
		System.out.println("The score has to be zero or above. Please try again.");
		score1 = in.nextInt();
		if (score1 < 0 || score1 >100) //if score is again not correct then exit 
			{
			System.out.print("It is still an invalid input. Bye!");
			System.exit(1);
			}
		}
		if (score1 > 100)
		{
		System.out.println("The score has to be below 100. Please try again.");
		score1 = in.nextInt();
		if (score1 < 0 || score1 >100)
			{
			System.out.print("It is still an invalid input. Bye!");
			System.exit(1);
			}
		}
	
	
		int score = (int) Math.floor(score1/10.0) * 10; //type cast to int for switch statement and round to smallest 10
		
		
		String grade = ""; //initialize string for switch statement 
		
		switch(score) //switch statements to determine scores
		{
		case 100:
		case 90:
			grade = "A";
			break;
		case 80:
			grade = "B";
			break;
		case 70:
			grade = "C";
			break;
		case 60:
			grade = "D";
			break;
		default:
			grade="F";
		
		}
		
		System.out.print("The student's grade is: " + grade); //print grade 
		
		in.close(); //close scanner
	}

}
