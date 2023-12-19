import java.util.Scanner;
import java.text.DecimalFormat;

public class JavaTuition
{
		public static void main(String[] args)
		{
			Scanner input = new Scanner (System.in);
			String student = "";
			DecimalFormat df = new DecimalFormat("#,###,###.00");
			
			double enrolled = 0.0;
			double unitPrice = 0.0;
			double totalPrice = 0.0;
			double discount = 0.0, netPrice = 0.0, penalty1 = 0.0, penalty12 = 0.0, discount2 = 0.0;
			
			System.out.print("Enter Name of the Student: ");
			student = input.nextLine();
			System.out.print("Enter Number of Units Enrolled: ");
			enrolled = input.nextDouble();
			System.out.print("Enter Price per Unit: ");
			unitPrice = input.nextDouble();
			
			totalPrice = enrolled * unitPrice;
			discount = totalPrice * 0.1;
			discount2 = totalPrice * 0.05;
			netPrice = totalPrice - discount;
			penalty1 = totalPrice + discount;
			penalty12 = totalPrice + discount2;
			
			System.out.println("\nComputed Tuition fee: " + df.format(totalPrice) + " dollars");
			System.out.println( student + ". \tyou could avail the following payment mode: ");
			System.out.println("\nPAyment Mode:");
			System.out.println("Cash Payment: " + df.format(netPrice) + " dollars");
			System.out.println("2-installment: " + df.format(penalty12) + " dollars");
			System.out.println("3=installment: " + df.format(penalty1) + " dollars");
			
		}
}			