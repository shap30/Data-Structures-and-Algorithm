package FileHandlingPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FIle {
	public static void main(String[] args) throws FileNotFoundException
	{
	try
	{
		File myfile = new File("../Java Activity/src/FileHandlingPackage/SampleText.txt");
		Scanner input = new Scanner(myfile);
		
	while (input.hasNextLine())
	{
	String data1 = input.nextLine();
	System.out.println(data1);
	}
	
	input.close();
}
catch(FileNotFoundException e)
{
	System.out.println("System error");
	
	e.printStackTrace();
}
}
}
