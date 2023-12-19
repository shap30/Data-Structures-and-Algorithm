package JavaActivity; 
import java.util.Scanner;
import java.text.DecimalFormat;
public class MID_CONDITIONAL
{

		public static void main(String[]args)
		{
			Scanner input = new Scanner(System.in);
			DecimalFormat df=new DecimalFormat ("#,###,###.00");
			
			String product = "";
			double price = 0.0;
			double netPrice1 = 0.0, netPrice2 = 0.0, netPrice3 = 0.0, netPrice4 = 0.0, netPrice5 = 0.0;
			double discount1 = 0.0, discount2 = 0.0, discount3 = 0.0, discount4 = 0.0, discount5 = 0.0;
			
			System.out.print("Enter product: ");
			product = input.nextLine();
			
			System.out.print("Enter price: ");
			price = input.nextDouble();
			
			discount1 = price *0.0;
			discount2 = price *0.05;
			discount3 = price *0.1;
			discount4 = price *0.15;
			discount5 = price *0.20;
			netPrice1 = price = discount1;
			netPrice2 = price = discount2;
			netPrice3 = price = discount3;
			netPrice4 = price = discount4;
			netPrice5 = price = discount5;
			
			if(price <= 10000)
			{
				System.out.println("\nPrice of " + product + " is " + df.format(price));
				System.out.print("Discount is " + df.format(discount1));
				System.out.println("\nNet Price is " + df.format(netPrice1));
			}
			else if (price >= 10001 && price <= 20000)
			{
				System.out.println("\nPrice of " + product + " is " + df.format(price));
				System.out.print("Discount is " + df.format(discount2));
				System.out.println("\nNet Price is " + df.format(netPrice2));
			}
			else if (price >= 20001 && price <= 50000)
			{
				System.out.println("\nPrice of " + product + " is " + df.format(price));
				System.out.print("Discount is " + df.format(discount3));
				System.out.println("\nNet Price is " + df.format(netPrice3));
			}
			else if (price >= 50001 && price <= 100000)
			{
				System.out.println("\nPrice of " + product + " is " + df.format(price));
				System.out.print("Discount is " + df.format(discount4));
				System.out.println("\nNet Price is " + df.format(netPrice4));
			}
			else if (price > 100000)
			{
				System.out.println("\nPrice of " + product + " is " + df.format(price));
				System.out.print("Discount is " + df.format(discount5));
				System.out.println("\nNet Price is " + df.format(netPrice5));
			}
		 }
}		