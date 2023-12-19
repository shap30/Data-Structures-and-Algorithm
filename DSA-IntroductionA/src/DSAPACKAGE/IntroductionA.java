package DSAPACKAGE;
import java.util.Scanner;

public class IntroductionA {
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner (System.in);
		boolean RunProgram = true;
		
		// THIS LINE WE USE LOOPING FOR PROGRAM, AND EXCUTED THE CASE TO END:
		
		while(RunProgram == true)	
		{
			// INTEGER / VARIABLES FOR PROGRAM:
			
			int integerNumber;
			int option;
			int Add = 0;
			int Reverse = 0;
			
			//  THIS LINE SERVE BECOME OPTION OR CHOOSING ANY TYPE OPTION:
			
			System.out.print("\nInput integer value: ");
			integerNumber =  input.nextInt();
					
			System.out.print("\nOption 1: Sum of Digits ");
			System.out.print("\nOption 2: Reverse the Numbers ");
			System.out.print("\nOption 3: Display all the Prime Number from 2 to N ");
			System.out.print("\nOption 4: Palindrome Checking ");
			System.out.print("\nOption 5: Odd or Even Number ");
			System.out.print("\nOption 6: Terminate Program ");
			System.out.print("\n\nSelect Option: ");
			option =  input.nextInt();	
		
		
			switch (option)
		{
case 1:
	
		// THIS LINE SERVE FOR DIVIDED TO 2 INTO 10 OR 1000 OR MAYBE TOUSAND AND SUM TO USER WHAT INPUT:
	
		    while (integerNumber != 0) 
		    {
		    	Reverse = Reverse * 10 + integerNumber % 10;
		    	integerNumber = integerNumber / 10;
		    }
		    
		    System.out.print("\nThe Add of the following digits are: ");
		    while (Reverse > 0) 
		    {
		    		System.out.print((Reverse % 10));

		    		Add = Add + (Reverse % 10);
		        Reverse = Reverse / 10;
		        
		    if (Reverse > 0) 
		        {
		            System.out.print(" + ");
		        }
		    }
		   
		    System.out.println(" = " + Add);
		break;
		
		
case 2:
		// THIS LINE SERVE FOR REVERSE THE NUMBER TO THE INPUT:
	
			while (integerNumber != 0) 
			{

			      int digit = integerNumber % 10;
			      Reverse = Reverse * 10 + digit;

			      integerNumber /= 10;
			 }

			    System.out.println("\nReversed: " + Reverse );
		break;
			
		
		
case 3:
		// THIS LINE SERVE FOR VIEWING THE PRIME NUMBER TO 2 AND INPUT THE NUMBER:
	
			System.out.println("\nOut of Data Range of Line");
			
		break;
		
		
case 4:
	
	// THIS LINE SERVE FOR THE REVERSING THE NUMBER WHAT INPUTING THE VARIABLES:
	
			int RevFinal = integerNumber;		
			while (integerNumber != 0)
			{
			      
				  int digit = integerNumber % 10;
				  Reverse = Reverse * 10 + digit;
			      integerNumber /= 10;
			}
			
			if (Reverse == RevFinal)

				System.out.print("\n" + Reverse + " are Palindrome");

			else
				
				System.out.print("\n" + Reverse + " are not Palindrome");  
		break;
	
		
		      
case 5:
			{
	
				// THIS LINE SEVER FOR "IF" THE VALUE INSERTED BY DIVISIBLE TO 2 OR EQUAL AND ALSO EVEN NUMBER:
				
			if (integerNumber % 2 == 0 )		        
				System.out.println("\n" + integerNumber + " are even number");
		     
			
			// THIS lINE SERVE FOR: "ELSE" THE VALUE INSERTED BY DIVISIBLE 2 OR EQUAL TO 0, ALSO THE ODD NUMBER:
			
			else 
		    	 System.out.println("\n" + integerNumber + " are odd number");
			}
		break;

		
case 6:
			{
			
				// THIS LINE, DECRIBING THE WILL BE END FOR CODE AND PROGRAM:
				
				System.out.print("\nCoded by, Miguel V. Pilapil");
			RunProgram = false;
		break;
			}
		
default:
			// THIS LINE, SERVE FOR THE NUMBER NOT IN THE CHOICES:
	
				System.out.print("\nError, Please Try again tommorow.");
		break;
		
		}
		
	}
}

}
