package DSAPACKAGE;

import java.io.*;
import java.util.Scanner;


public class Records {
	
	public static void main(String[] args) throws IOException {
		
		Scanner YesNo = new Scanner(System.in);
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
	
			System.out.println("Do you like to update student record: ");
			YesNo.next();
			
			if(YesNo.equals("yes")) {
				
				System.out.println("Student #:");
				br.readLine();
				
				System.out.println("Record not found");
				br.readLine();
				
				System.out.println("Do you like to update student record: ");
				YesNo.next();
			}
			else if(YesNo.equals("no")){
				
			}
			
			{
				System.out.println("Student #1");
				
				String input = "";
				System.out.print("Quiz 1:");
				input = br.readLine();
				System.out.println("Quiz " + input);
				input = br.readLine();
				
				System.out.print("Quiz 2:");
				input = br.readLine();
				System.out.println("Quiz " + input);
				input = br.readLine();
				
				System.out.print("Average: 70");
				input = br.readLine();
				
				System.out.print("Remarks Failed");
				System.out.print("Number of student's passed 1");
				System.out.print("Number of student's failed 1");
				
				
				System.out.println("Update Student #2");
				
				System.out.print("Student #1");
				
				System.out.print("Quiz 1 60");
				input = br.readLine();
				
				System.out.print("Quiz 2 60");
				input = br.readLine();
				
				System.out.print("Quiz 3 60");
				input = br.readLine();
				
				System.out.print("Average 60.00");
				System.out.print("Remarks Failed");
				
			}
		
	}

	
}
