package PACKAGE_QUEUES;

import java.util.Scanner;
import java.util.InputMismatchException;

public class LAB_ACT_QUEUES_2BSIT2_PILAPIL {

	     
	     static Integer Array[];
	     static Integer Size; 
	     static Integer Front;
	     static Integer Rear;
	     
	     static Integer MainInput;
	     static Integer NumInput;
	        
	     static boolean Yes = true;
	     static boolean No = true;
	     
	     static Scanner Input = new Scanner(System.in); 
	
	     public static void main(String[] args) {
	 		
			 MainMenu();
			 
		   }
		
		    static void MainMenuInput() {
		    	
			do {
				
			try {
				
			System.out.print("\n\nENTER THE CHOICES [1-3]: ");
			MainInput = Input.nextInt();
					
			Yes = false;
			
			}
			
				catch(InputMismatchException e){
					System.out.println("\nERROR! INVALID INPUTED, PLEASE TRY AGAIN!\n");
					
			}
			
			} while (Yes);
			 
		    }
		
		    static void MainMenu() {
		    	
			System.out.print("\n----- MAIN MENU ----- ");
			System.out.print("\n\n1. ARRAY IMPLEMENTATION");
			System.out.print("\n2. LINKED LIST IMPLEMENTATION:");
			System.out.print("\n3. EXIT: ");
			
			MainMenuInput();
			
			switch(MainInput) {
			case 1:
				ArraySize();
				
				while(No) {
					ArrayMainMenu();
					
				}
				
			break;
			
		    case 2:
		    	LinkedListInt();
			
			while(No) {
			LinkedListQueueMainInput();
			
			}
			
			break;
			
		    case 3:
		    	
			System.out.println("\nPROGRAMMED/CODED BY: PILAPIL, MIGUEL V.");
			
			break;
			
		    default:
			System.out.println("\nERROR!");
			
		  }
		
	      }
	

	    static void ArraySize() {
		   
		do {
			
		try {
		System.out.print("\nENTER THE SIZE OF WANT TOO INSERTED IN QUEUE: ");
		Size = Input.nextInt();
				
		Array = new Integer[Size];
		Front = Rear = -1;
				
		Yes=false;
		
		} 
		
		catch(InputMismatchException e) {
		System.out.println("\nERROR! INVALID INPUTED, PLEASE TRY AGAIN!\n");
				
		}
		
		} while(Yes);
		
	    }
	
	    static void ArrayMainMenuInput() {
	    	
		do {
			
		try {
		System.out.println("\n\nENTER THE CHOICE TOO [1-4]:  ");
		MainInput = Input.nextInt();
				
		Yes = false;
		
		}
		
		catch(InputMismatchException e){
		System.out.println("\nERROR! INVALID INPUTED, PLEASE TRY AGAIN!\n");
		
		}
		
		} while (Yes);
		
	    }
	
	  static void EnqueueMainInput() {
		  
	  do {
		  
	  try {
		  
	 System.out.println("\nENTER THE VALUES/DATA WANT TO BE INSERTED: ");
	 NumInput = Input.nextInt();
				
	 Yes=false;
	 
		}
	  
		catch(InputMismatchException e) {
		System.out.println("\nERROR! INVALID INPUTED, PLEASE TRY AGAIN!\n");
		
		}
	  
		} while(Yes);
	  
	    }
	
	static void ArrayEnqueueInput(int data) {
		if(Rear == Size-1) {
			System.out.println("\nQUEUE OVER-FLOW!");
			return;
			
		}
		
		else {
			
			Rear += 1;
			Array[Rear] = data;
			
		}
		
		System.out.println("\nENQUEUEING OF THE ( " + data + " ) SUCCESSFULL INSERTED! ");
		
		ArrayDisplay();
		
		return;
	}
	
	static void ArrayDequeueInput() {
		if(Front == Rear) {
			System.out.println("\nQUEUE UNDER-FLOW!");
			return;
			
		}
		
		else {
			Front += 1;
			Array[Front] = null;
			
		}
		
		System.out.println("\nDEQUEUEING SUCCESSFULL INSERTED!");
		
		ArrayDisplay();
		
		return;
	}
	
	static void ArrayDisplay() {
		if(Front == Rear) {
			Front = -1;
			Rear = -1;
		}
		
		if(Front == -1 && Rear == -1) {
			System.out.println("\n----- QUEUE (ARRAY QUEUE) ----- \n");
			return;
		}
		
		System.out.print("\n----- QUEUE (ARRAY QUEUE) ----- \n");
		
		for(int i=0; i < Size; i++) {
			System.out.print(Array[i] + " ");
		}
		
		System.out.println("\nFRONT: " + (Front+1)
						 + "\nREAR: " + Rear);
	}
	
	static void ArrayMainMenu() {
		System.out.print("\n----- ARRAY QUEUE MAIN MENU -----");
		System.out.print("\n\n1. ENQUEUE: ");
		System.out.print("\n2. DEQUEUE:");
		System.out.print("\n3. DISPLAY QUEUE: ");
		System.out.print("\n4. EXIT: ");
		
		ArrayMainMenuInput();
		
		switch(MainInput) {
		case 1:
			System.out.println("\n----- ENQUEUE (ARRAY ENQUEUE) ----- \n");
			
			EnqueueMainInput();
			ArrayEnqueueInput(NumInput);
			
			break;
		case 2:
			System.out.println("\n----- ENQUEUE (ARRAY ENQUEUE) ----- \n");
			
			ArrayDequeueInput();
			
			break;
		case 3:
			System.out.println("\n----- DISPLAY QUEUE -----");
			
			ArrayDisplay();
			
			break;
		case 4:
			System.out.println("\n----- PROGRAMMED/CODED BY: PILAPIL, MIGUEL V. -----");
			No=false;
			break;	
		default:
			System.out.println("\nERROR! INVALID INPUTED, PLEASE TRY AGAIN!\n");
			
		}
		
	    }
	
	static linkedListNode start = null, temp = null, hold = null; 
	
	static class linkedListNode {
		int data;
		linkedListNode next;
		
		linkedListNode(int data) {
			this.data = data;
			this.next = null;
			
		}
		
	    }
	
	static void LinkedListInt() {
		Front = Rear = -1;
		
	    }
	
	static void LinkedListEnqueueInt(int data) {
		linkedListNode newNode = new linkedListNode(data);
		
		linkedListNode temp = null;
		
		newNode.data = data;
		newNode.next = null;
		
		if(start == null) {
			start = newNode;
			
		}
		
		else {
			
		temp = start;
		while(temp.next != null) {
		temp = temp.next;
				
		}
			
		temp.next = newNode;
			
		}
		
		Rear += 1;
		System.out.println("\nENQUEUEING OF THE ( " + data + " ) SUCCESSFUL INSERTED!");
		
		LinkedListDisplay();
		
		return;
		
	    }
	
	static void LinkedListDequeueInput() {
		
		if(start == null) {
			System.out.println("\nQUEUE UNDER-FLOW!");
			return;
		}
		
		Front += 1;
		temp = start;
		start = start.next;
		temp = null;
		
		System.out.println("\nDEQUEUE");
		
		LinkedListDisplay();
		
		return;
		
	    }

	static void LinkedListDisplay() {
		if(start == null) {
			System.out.println("\n----- DISPLAY QUEUE -----");
			return;
			
		}
		
		temp = start;
		
		System.out.print("\nQUEUE (ARRAY QUEUE): ");
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
			
		}
		
		System.out.println("\nFRONT: " + Front+1 );
		System.out.println("\nREAR: " + Rear);
		
		return;
		
	    }
	
	static void LinkedListQueueMenuInput() {
		
	do {
		
	try {
		
		System.out.print("\nENTER CHOICE ON [1-4]: ");
		MainInput = Input.nextInt();
				
		Yes = false;
		
		}
	
			catch(InputMismatchException e){
				System.out.println("\nERROR! INVALID INPUTED, PLEASE TRY AGAIN!\n");
			
		}
	
			finally {
			if(Front == Rear) {
			Front = -1;
			Rear = -1;
			
		}
			
		}

		} while (Yes);
	
	    }
	
	static void LinkedListQueueMainInput() {
		System.gc(); 
		System.out.print("\n----- LINKED LIST QUEUE MAIN MENU ----- ");
		System.out.print("\n\n1. ENQUEUE: ");
		System.out.print("\n2. DEQUEUE: ");
		System.out.print("\n3. DISPLAY QUEUE: ");
		System.out.print("\n4. EXIT: ");
		
		LinkedListQueueMenuInput();
		
		switch(MainInput) {
		case 1:
			System.out.println("\n----- ENQUEUE (ARRAY ENQUEUE) ----- ");
			
			EnqueueMainInput();
			LinkedListEnqueueInt(NumInput);
			
			break;
		case 2:
			System.out.println("\n----- ENQUEUE (ARRAY ENQUEUE) ----- ");
			
			LinkedListDequeueInput();
			
			break;
		case 3:
			System.out.println("\n----- DISPLAY QUEUE -----");
			
			LinkedListDisplay();
			
			break;
		case 4:
			System.out.println("\nPROGRAMMED/CODED BY: PILAPIL, MIGUEL V.");
			No=false;
			break;
		default:
			System.out.println("\nERROR! INVALID INPUTED, PLEASE TRY AGAIN!");
			
		}
		
	}
	
}
