package JavaActivity;
import java.util.Scanner;
public class Age
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner (System.in);
		int age=0;
		System.out.print("Enter Age: ");
		age=input.nextInt();
		if(age>=18)
		{
			System.out.println("Qualified to vote");
			
		}
		else
		{
			System.out.println("too young");
		}
	}
}

