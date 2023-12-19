package FileHandlingPackage;

import java.io.*;
import java.util.Scanner;

public class OutputFile {
	
	static File MF;
	static FileReader MFR;
	static BufferedReader MFBBR; 
	static Scanner IF;
	static PrintWriter OF;
	static FileWriter ND;
	//THE VARIABLES
	
	static String L;
	static int WC;
	//THE VARIABLES REFER TO FILES 
	
	public static void main(String[] args) throws FileNotFoundException
	{
		OP();
		OF.println("length: " + MF.length() + " bytes");
		OF.println("path: " + MF.getAbsolutePath());
		OF.println("words: " + NOW());
		
		try 
		{
			ND.append("\nThis little light of mine, I’m gonna let it shine");
			ND.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		MFR = new FileReader(MF);  
		MFBBR = new BufferedReader(MFR); 
		//THE READER TO MAKE NOT RECOUNT 1ST SENTENCE, RATHER RECOUNT ALL SENTENCES
		
		WC = 0;
		
		OF.println();
		OF.println("length: " + MF.length() + " bytes");
		OF.println("path: " + MF.getAbsolutePath());
		OF.println("words: " + NOW());
		CF();
		//THE STATION OF 0 AVOID THE ADDING UP EARLIER WORD COUNTER
	}
	
	public static void OP() //OP or OPENER FILE
	{
		try  //THE TRY AND CATCH FOR THE IOEXCEPTION
		{
			
			MF = new File("../Act_FileHandling/src/FileHandlingPackage/SampleText.txt");
			MFR = new FileReader(MF);  
			MFBBR = new BufferedReader(MFR);  
			ND = new FileWriter(MF, true); 
		}
		catch(IOException e) 
		{
			System.out.println("File error.");
		}
		
		try //THE TRY AND CATCH FILENOTFOUNDEXCEPTION
		{
			IF = new Scanner(new FileReader(MF));
			OF = new PrintWriter("../Act_FileHandling/src/FileHandlingPackage/SampleOutputText.txt");
		}
		catch(FileNotFoundException e) 
		{
			System.out.println("File is not found.");
		}
	}
	
	//THE CLOSING or CF THE FILE
	public static void CF() 
	{
		IF.close();
		OF.close();
	}
	
	//THE COUNTERS NUMBER OF SENTENCES
	public static int NOW() 
	{
		try 
		{
			while((L = MFBBR.readLine()) != null) 
			{
				//THE BREAK OF WORDS WITH SPACES AND COUNTS THE SENTENCES
				String [] words = L.split(" ");
				
				 //THE CHECKER
				WC = WC + words.length;
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		return WC;
	}
}
