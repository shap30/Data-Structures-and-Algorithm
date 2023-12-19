package JavaActivity;
import java.util.Scanner;
public class PositiveOrNegative
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner (System.in);
		int number=0;
		System.out.print ("Enter Number: ");
		number=input.nextInt();
		if(number>0)
		{
			System.out.println(number +" is a Positive Number");
		}
		else if(number<0)
		{
			System.out.println(number +" is a Negagtive Number");
		}
		else
		{
			System.out.println(number +" is origin");
		}
		System.out.println("The program terminates");
	}
}

