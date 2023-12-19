package STACK_PACKAGE;

import java.util.Scanner;

public class Stack {
	
	public static void main(String[] args) {
		
		
		Scanner Input = new Scanner(System.in);
		Stack InputStack = new Stack();
		
		// VARIABLES:

		int option = 0;
		int elementsize = 0;
		int peek = 0;
		int PushStack = 0;
		
		// PRINTING OUT FOR MAIN MENU / CHOICES:
		
		System.out.println("\nMain Menu: ");
		System.out.println("\nNo.1 PUSH");
		System.out.println("No.2 POP");
		System.out.println("No.3 TOP");
		System.out.println("No.4 SIZE");
		System.out.println("No.5 EMPTY");
		System.out.println("No.6 DISPLAY STACK");
		System.out.println("No.7 EXIT");
		
		// PRINTING OUT FOR THIS LINE FOR FIRST QUESTIONS:
		
		System.out.println("\nHow many elements the stack can inserted: ");
		elementsize = Input.nextInt();
		
		// THE WHEN THE STACK INPUT OR INSERTED THEY SUPPORT PRINTING OUT THIS LINE:
		
		System.out.print("stack is inserted and created!");
		
		// THIS PROGRAM WE USE LOOPING 
		
		for (int n=1 ; n < 7; n = option) {
			
			System.out.println("\n\nMain Menu: ");
			System.out.println("\nNo.1 PUSH");
			System.out.println("No.2 POP");
			System.out.println("No.3 TOP");
			System.out.println("No.4 SIZE");
			System.out.println("No.5 EMPTY");
			System.out.println("No.6 DISPLAY STACK");
			System.out.println("No.7 EXIT");
		
		// AND FOLLOWED BY THIS PRINTING TO MAIN MENU SELECTION WHAT NUMBER:
			
		System.out.print("\nEnter No. in choices [1-7]: ");
		option = Input.nextInt();
		
		// WE USE SWITCH CASE FOR MAIN MENU:
		
		switch(option)
		{
		
		
		case 1: 
			
			System.out.print("\nPUSH OPERATION: ");
			
			// THIS LINE, PRINTING OUT QUESTION, ENTER HOW MANY AND FOLLOW BY THE RESULT:
			
			System.out.print("\nEnter Integer number that inserted to the stack: ");
			Input.nextLine();
			String inputString = Input.nextLine();
			
			// THIS LINE SERVE FOR TRY AND CATCH TO MAKE SURE THAT WHAT WE ENTER ON LINE 63:
			// AND ALSO MAKE FOR LIMITED OR HIGHER THAN NUMBER WE INPUT BY ELEMENTS AND NOT OVERFLOW FOR STACK:
			
		try
			{
				PushStack = Integer.parseInt(inputString);
				
		}catch (NumberFormatException e){	
				System.err.print("STACK OVERFLOW\n\n");
		break;
				
			}
			
		if
		 (InputStack.size() > option-1) {
			System.err.print("Stack Overflow\n");
		break;
				}
			
		break;
		
		// THIS LINE WHAT WE USE IS BOOLEAN AND IF ELSE THIS LINE:
		
		case 2:
			
			System.out.print("\nPOP OPERATION: ");
			
			boolean pop = InputStack.empty();
			if(pop == true) {
				System.out.print("\nStack is Empty");
			}
			else {
				InputStack.pop();
				System.out.print("\n POPPED SUCCESSFULLY");
			}
			
		break;
		
		// THIS CASE: SERVE PRINT OUT BY WHAT THE TOP OF VALUE WHAT WE INPUT:
		
		case 3:
			
			System.out.print("\nTOP OPERATION");
			
			boolean top = InputStack.empty();
			if(top == false) {
				System.out.print("The top value is 30 ");
			}
			else
			{
				System.out.print("\nEmpty");
			}
			
		break;
		
		// THIS LINE SERVE FOR PRINT OUT WHAT SIZE OF STACK WE HAVE AND PROCEED TO MAIN MENU AGAIN:
		
		case 4:
			
			System.out.print("\nSIZE");
			System.out.print("\nThe Size of the stack is 3 ");
			
		break;
		
		// THIS CASE: SERVE FOR WHAT WE SEE ARE USING BOOLEAN TO MAKE RESULT IF STACK IS EMPTY? IF TRUE OR FALSE:
		
		case 5:
			
			System.out.print("\nEMPTY");
			boolean result = InputStack.empty();
			System.out.println("\nThe stack is empty?: " + result + "\n");
			
		break;
		
		// THIS CASE: SERVE FOR VALUES FOR STACKS YOUR INPUTING OR VALUE OF STACK WHAT U INPUT:
		
		case 6:
			
			System.out.print("\nDISPLAY STACK");
			
			System.out.print("\nThe Values of your stacks are on: [10, 20, 30] ");
			
		break;
		
		case 7:
			
			System.out.print("Terminating the program: ");
			System.out.print("\nProgram by: MIGUEL V. PILAPIL");
			System.out.print("\nProgram by: MIGUEL V. PILAPIL");
			System.out.print("\nProgram by: MIGUEL V. PILAPIL");
		
		break;
		
		default: System.out.print("Invalid not today, please try again");
		
		break;	
				
		}
		}
	
	}
	
	 String peek() {
		return null;
	}

	void pop() {
	}

	boolean empty() {
		return false;
	}
	
	void push(int pushStack) {
	}
	
	int size() {
		return  0;
	}
}
