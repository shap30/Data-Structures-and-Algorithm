package Linked_Package;

import java.util.Scanner;

public class DSA_LINKEDLIST_SINGLY_PILAPIL_2BSIT2 {
	
	public static void main(String[] args) 
	{
	
		Scanner UserInput = new Scanner (System.in);
		
		// THE VARIABLES IN THAT WE USE:
		
		int MainInput = 0;
		int NumInput = 0;
		
		DSA_LINKEDLIST_SINGLY_PILAPIL_2BSIT2 Linklist = new
				
		DSA_LINKEDLIST_SINGLY_PILAPIL_2BSIT2();
		
		// MAIN MENU PRINT FIRST WE START THE PROGRAM:
		
		System.out.println("----- MAIN MENU: ----- ");
		System.out.print("\n1. insert at the beginning: ");
		System.out.print("\n2. insert at the end: ");
		System.out.print("\n3. display: ");
		System.out.print("\n4. Exit: ");
		
		
		// LOOP FOR MAIN MENU:
		
		for (int n = 1; n < 5; n = MainInput) 
			
		{
			System.out.println("\n\nEnter Choices to [1-4]: ");
			MainInput = UserInput.nextInt();
			
			switch(MainInput)
			{
			
			// THIS CASE: SERVE TO ENTER WANT VALUE INPUT FOR BEGINNING:
			
			case 1:
				
				System.out.print("\nEnter of Data, want to insert on beginning: ");
				NumInput = UserInput.nextInt();
				
				System.out.print("\n THE DATA FOR BIGINNING INSERTED..... ");
				
				Linklist.beginning(NumInput);
				
				break;
			
			// THIS CASE: SERVE FOR ENTER WANT END VALUES:
				
			case 2:
				
				System.out.print("\nEnter of Data, want to the end: ");
				NumInput = UserInput.nextInt();
				
				System.out.print("\n THE DATA FOR END INSERTED..... ");
				
				Linklist.end(NumInput);

				break;
			
			// THIS CASE SERVE FOR DISPLAY WHAT YOU INPUT OR ENTER IN CASE 1 & 2:
				
			case 3:
				
				System.out.print("\nDsiplaying for the value inserted on the linked list: ");
				System.out.print("\nTHE STATUS OF DATA YOUR INSERTED (DISPLAY): ");
				Linklist.display(NumInput);
				
				break;
				
			case 4:
				
				System.out.print("\n Exit: Programmed by: Miguel V. Pilapil - 2BSIT2! ");
				NumInput = UserInput.nextInt();
				
				break;
				
			default:
				
				System.out.print("\n Invalid Input: Please Try again choices 1 to 4! ");
			}
		}
		UserInput.close();
	}
	
	// CREATE NEW CLASS FOR METHOD AND CLASS FOR NDOE:
	
	class Node
	{
		int NumInput;
		Node Next;
		
		public Node(int NumInput)
		{
			this.NumInput = NumInput;
			this.Next = null;
		}
	}
	
	Node Head = null;
	Node End = null;
	
	void beginning(int NumInput) 
	
	{
		Node newData = new Node(NumInput);
		
		// THIS LINE SERVE FOR SINGLY IF FOR NOTHING VALUES THERE, AND EMPTY:
		
		
		if (Head == End)
		{
			Head = newData;
			End = newData;
		}
	else
	{
		Node pointHead = Head;
		Head = newData;
		Head.Next = pointHead;
	
	}
}


	void end(int NumInput)
	{
		Node newData = new Node(NumInput);
		
		if(Head == null)
		{
			
			Head = newData;
			End = newData;
			
		}
		else 
		{
			End.Next = newData;
			End = newData;
		}

	}
	
	void display(int NumInput)
	{
	
		Node StacknewData = Head;
		
		if (Head == null)
		{
			System.out.print("\n LINKLEDLIST EMPTY:");
			return;
		}
		while
			(StacknewData != null)
		{
			System.out.print(StacknewData.NumInput + " ");
			StacknewData = StacknewData.Next;
		}
	}
}
	
	
	




