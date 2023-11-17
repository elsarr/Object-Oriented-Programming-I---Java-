// -----------------------------------
// Assignment 2
// Written by: Elsa 
// For Object-Oriented Programming I - Fall 2023 
// -----------------------------------

/* Question 1: BMI (Body Mass Index) Calculator
   This program calculates a person's BMI based on their weight in kgs and height in meters.
 */


import java.util.Scanner;

public class BMIcalculator 
{

	public static void main(String[] args) 
	{
		System.out.println("_______****_______****_______****_______****_____****_____"); //welcome message
		System.out.println("Welcome to BMI Calculator");
		System.out.println("_______****_______****_______****_______****_____****_____");
		System.out.println();
		System.out.println();
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter weight (in kilograms): "); //prompt user for weight 
		double weight = in.nextDouble(); //set weight in a variable
		
		System.out.print("Enter height (in meters): "); //prompt user for height
		double height = in.nextDouble(); //set height in a variable
		
		double BMI = weight/(Math.pow(height, 2)); //calculate BMI
		System.out.print("BMI: ");
		System.out.printf("%.2f",BMI); //print BMI in %.2f format
		System.out.println();
		
		String category = ""; //initialize string for if statements
		
		if (BMI < 18.5) //create if and if-else statements to determine category of weight 
			category = "Underweight";
		else if (BMI >= 18.5 && BMI <= 24.9)
			category = "Normal weight";
		else if (BMI >= 25 && BMI <= 29.9)
			category = "Overweight";
		else if (BMI > 30)
			category = "Obesity";
		
		System.out.println("Category: " + category); //print category
		
		System.out.println("do you some tips according to your BMI?"); //prompt user 
		String tips = in.next(); //store content in string 
		String msg = ""; //initialize string for nested if loop 
		
		if(tips.equals("yes")||tips.toLowerCase().equals("y")) //see if string tips corresponds to correct output
		{
			if (BMI < 18.5) //create if and if-else statements to determine message based on BMI 
				msg = "Please eat well and do more excises.";
			else if (BMI >= 18.5 && BMI <= 24.9)
				msg = "Congratulations, you are doing fairly well. Keep on going.";
			else if (BMI >= 25 && BMI <= 29.9)
				msg = "Please watch out what you eat and do more excises!";
			else if (BMI >30)
				msg = "Please contact our experts for professional help.";
			System.out.println(msg);
		}
		else 
			System.out.print("Nice to meet you too. Bye!"); //if person enters anything else
		


		in.close(); //close scanner
		
	}

}
