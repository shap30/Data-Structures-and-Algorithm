package JavaActivity;
import java.util.Scanner;
import java.text.DecimalFormat;
public class switch_metric

{
	public static void main (String[]args) {
		
	
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###,###.00");
		
		String name = "";
		char choices;
		String conversion;
		double value; 
		double valueConverted;
		
		System.out.print("Hi! What is your name? ");
		name = input.nextLine();
		
	
		System.out.println("====Metric Conversion====");
		System.out.println("Alright " + name + " Choose the letter for your conversion: ");
		System.out.println("[a] kg to pounds");
		System.out.println("[b] pounds to kg");
		System.out.println("[c] ounces to grams");
		System.out.println("[d] grams to ounces");
		
		 
		System.out.print("\nInput for Conversion: ");
		choices=input.next().charAt(0);
        		choices=Character.toUpperCase(choices);
		switch(choices)
         {
         	case 'A' : conversion = "You have chosen kg to pounds ";
         				System.out.println(conversion);
         				System.out.print("\nInput the value: ");
         				value = input.nextDouble();
         				valueConverted = value * 2.204622622;
         				System.out.println("The " + df.format(value) + " kg is " + df.format(valueConverted) + " in pounds");			
         				break;
         	case 'B' : conversion = "You have chosen pounds to kg";
         				System.out.println(conversion);
         				System.out.print("\nInput the value: ");
         				value = input.nextDouble();
         				valueConverted = value * 0.45359237;
         				System.out.println("The " + df.format(value) + " pound is " + df.format(valueConverted) + " in kg");
         				break;
        	case 'C' : conversion = "You have chosen ounces to grams";
        				System.out.println(conversion);
        				System.out.print("\nInput the value: ");
        				value = input.nextDouble();
        				valueConverted = value * 28.34952;
        				System.out.println("The " + df.format(value) + " ounces is " + df.format(valueConverted) + " in grams");
        				break;
        	case 'D' : conversion = "You have chosen grams to ounces";
        				System.out.println(conversion);
        				System.out.print("\nInput the value: ");
        				value = input.nextDouble();
        				valueConverted = value * 0.03527396195;
        				System.out.println("The " + df.format(value) + " grams is " + df.format(valueConverted) + " in ounces");
        				break;
        	default: conversion = "Not in the choices, Thank you";
        				System.out.println(conversion);
         }	
			//starting by the package in javapoint and the package name:
			//import java.util.scanner; to obtaining the input 
			//import java decimalFormat; using by provides control the numbers stored as String's 
			//and String name of the option of character.
			//the process and starting running the programm, the first you see is the system.out.print() inside of
			//question by what is your name?
			// and process next part of the system.out.println() by choices of the letter input in the system.out.println()
			//the part of the method of java.util used that to make equal the optional specifies optional.
			//and all the present statement and the inside of the present system.out.println will be executed of the specific choices.
			//also where what you select the process proceed to next part the result or commands.
			
			//COMMENT BY: MIGUEL PILAPIL
	}
}
