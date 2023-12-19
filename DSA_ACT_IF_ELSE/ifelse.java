package JavaActivity;
import java.text.DecimalFormat;
import java.util.Scanner;
public class ifelse {
 public static void main (String [] args) {
     Scanner s = new Scanner (System.in);
     DecimalFormat df = new DecimalFormat("#,###,###.00");

     char input;
     double converted;
     double num;

     System.out.println("Hi! What is your name?");
     String name = s.nextLine();
     System.out.println("\n=====Metric Conversion=====");
     System.out.println("Alright " + name + ", Choose the letter for your conversion: ");
     System.out.print("[a]kg to pounds\n[b]pounds to kg\n[c]ounces to grams\n[d]grams to ounces\n");

     System.out.print("\nInput for Conversion: ");
     //choice = s.next().charAt(0);
     input = s.next().charAt(0);
     if (input == 'a' || input == 'A') {
         System.out.println("You have chosen kg to pounds");
     }
     else if (input == 'b' || input == 'B'){
         System.out.println("You have chosen pounds to kg");
     }
     else if (input == 'c' || input == 'C'){
         System.out.println("You have chosen ounces to grams");
     }
     else if (input == 'd' || input ==  'D'){
         System.out.println("You have grams to ounces");
     }
    else {
         System.out.println("Not in the choices, Thank you");
     }

     System.out.print("\nInput the value: ");
     num = s.nextInt();
     if(input == 'a' || input ==  'A') {
         converted = num * 2.205;
         System.out.println("The " + num +  " kg is " + converted + " in pounds");
     }
     else if (input == 'b' || input ==  'B') {
         converted = num * 0.454;
         System.out.println("The " + num + " pounds is " + converted + " in kg");
     }
     else if (input == 'c' || input ==  'C') {
         converted = num * 28.35;
         System.out.println("The " + num + " ounces is " + converted + " in grams");
     }
     else if (input == 'd' || input ==  'D') {
         converted = num * 0.03527;
         System.out.println("The " + num + " grams is " + converted + " in ounces");	 
     }
		//the package and the package of the name and the point.
		//import.java.text/ package for the text processing .
		//import.java.util/ import class of java.
		//public class/ part of all java code or program.
		//String name of option and char.
		//the Syttem.out.println() start by and print and input by give question what is your name, and inputing by name.
		//and after that, the programming by running that, the sytem.out.println excuted and printed the metric and conversion.
		//process the name and the what you choices the letter what input you code in the program.
		//after that the processing the method of java, 
		//and the present statement of the present inside of the system.out.println will be presented once the code is running.
		//the start of the following step and process the part and the inside system.out.println you can see, and the present statement will be the presented and once,
		else //the not inserted or in choices, the result or the else automatic code for you.
		{
			System.out.println("Not in the choices and, thank you!");
			//the part of that is when the wrong you type in the code the program answer not in the choices.
		}
			//COMMENT BY: MIGUEL V. PILAPIL
 }
}

