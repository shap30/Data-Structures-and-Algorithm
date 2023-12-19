package DSAPACKAGE;

import java.io.*;
import java.util.Scanner;

public class GradeBook {
	
	public static void main(String[] args) throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		Scanner YesNo = new Scanner(System.in);
	
		System.out.println("Do you like to update student record: ");
		String yesno = YesNo.next();
		
		if(yesno.equals("yes")) {
			
		System.out.println("Student #:");
		String input = br.readLine();
		System.out.println("Record not found");
		
		System.out.println("Do you like to update student record: ");
		String yesno1 = YesNo.next();
		}
		
		else if(yesno.equals("no")){
		
		}
		
		{
        System.out.println("Student #1");
		
		String input = new String();
		System.out.println("Quiz " + input);
		System.out.print("Quiz 1:");
		input = br.readLine();
		System.out.println("Quiz " + input);
		input = br.readLine();
		
		System.out.print("Quiz 2:");
		input = br.readLine();
		input = br.readLine();
		
		System.out.print("Average: 70");
		input = br.readLine();
		
		System.out.print("Remarks Failed");
		input = br.readLine();
		
		System.out.print("Number of student's passed 1");
		input = br.readLine();
		
		System.out.print("Number of student's failed 1");
		input = br.readLine();
		
		System.out.println("Update Student #2");
		System.out.print("Quiz 1 60");
		input = br.readLine();
		System.out.print("Quiz 2 60");
		input = br.readLine();
		System.out.print("Quiz 3 60");
		input = br.readLine();
		System.out.print("Average 60.00");
		input = br.readLine();
		System.out.print("Remarks Failed");
		input = br.readLine();
		}
		
	

	}

}
