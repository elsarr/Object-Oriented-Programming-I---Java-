// -----------------------------------
// Assignment 1
// Written by: Elsa 
// For Object-Oriented Programming I - Fall 2023 
// -----------------------------------

/* Algorithm 1: Simple Cipher Program
   The Simple Cipher Program of Project-S solves a 6-piece puzzle which displays
   6 outputs z from 6 respective inputs x and y with respect to the special operator @. 
   This Program is used for multi-factor authentication procedures.
 */

public class SimpleCipherProgram {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Simple Cipher Program!"); //welcome message 
		System.out.println();
		
		int x1 = 7; //define each 6 respective x and y
		int y1 = 5;
		int x2 = 8;
		int y2 = 3;
		int x3 = 4;
		int y3 = 2;
		int x4 = 20;
		int y4 = 14;
		int x5 = 9;
		int y5 = 3;
		int x6 = 45;
		int y6 = 20;
		
		int z1 = x1/y1 + x1%y1; //the output is the integer division number (quotient) + the remainder 
		int z2 = x2/y2 + x2%y2;
		int z3 = x3/y3 + x3%y3;
		int z4 = x4/y4 + x4%y4;
		int z5 = x5/y5 + x5%y5;
		int z6 = x6/y6 + x6%y6;
				
		
		System.out.println("Project-S Access System: 6-Piece Puzzle Authentication Challenge:");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(x1+" @ "+y1+"   "+x2+" @ "+y2+"   "+x3+" @ "+y3+"   "+x4+" @ "+y4+"   "+x5+" @ "+y5+"   "+x6+" @ "+y6); // x @ y gives z
		System.out.println("  |       |       |        |        |        |   "); // @ is the addition of the quotient and remainder
		System.out.println("  "+z1+"       "+z2+"       "+z3+"        "+z4+"        "+z5+"        "+z6);
		System.out.println("At Project-S, we employ multi-factor authentication because one password is never enough."); //complimentary-close message
		
 
	}

}
