//--------------------------------------
//Assignment 1 question 1
//Written by: Elsa R
//For Object-Oriented Programming I - Winter 2023
//--------------------------------------

//This program determines the change to be given back in crypto coins of the forthcoming millennium 

import java.util.Scanner;

public class CryptoCoins 
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome to the Crypto Program:");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Scanner myKeyboard = new Scanner(System.in);
		System.out.print("Enter the price of the ticket in Cryptom (at most 7500):");
		int cryptom = myKeyboard.nextInt(); //the value entered by the user is the value of the integer cryptom
		System.out.println();
		
		final int pesico = 7500; //1 pesico is 7500 cryptom
		int coinsBack = pesico - cryptom; //number of coins to give back in cryptom
		int bitom = coinsBack/500; //1 bitom is 500 cryptom 
		int restBitom = coinsBack%500;//remaining coins in ditom
		int ditom = restBitom/200; //number of ditoms, 1 ditom is 200 cryptom
		int restDitom = restBitom%200;//remaining coins in zitom
		int zitom = restDitom/50; //number of zitoms, 1 zitom is 50 cryptom
		int restZitom = restDitom%50;//remaining coins in cryptom
		int newCryptom = restZitom; //remaining coins in cryptom renamed  
				
		
		System.out.println("You bought a ticket for " + cryptom + " Cryptom. and gave me a Pesico, so your change is");
		System.out.println(bitom + " Bitom,");
		System.out.println(ditom + " Ditom,");
		System.out.println(zitom + " Zitom, and");
		System.out.println(newCryptom + " Cryptom.");
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("Thank you for using my bespoke Crypto Change Program!");
		System.out.println();
		System.out.print("Enjoy the Game!");
		
		myKeyboard.close();//close scanner 
		

	}

}
