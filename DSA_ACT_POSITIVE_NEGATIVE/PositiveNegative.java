package JavaActivity;
import java.util.Scanner;
public class PositiveNegative
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner (System.in);
		int number=0;
		System.out.print ("Enter Number: ");
		number=input.nextInt();
		if(number>0)
		{
			System.out.println(number +"is a positive Number");
		}
		else
		{
			System.out.println(number +"is a negative Number");
		}
	}
}


