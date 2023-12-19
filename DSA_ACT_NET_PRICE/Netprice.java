import java.util.Scanner;
public class NetPrice
{
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            // Initialize our variables that will handle our inputs
            String product = ""; // null value is assigned
            double unitPrice = 0.0; // zero is the initial value
            double quantity = 0.0;
            // Initialize variable we used for computation
            double totalPrice = 0.0;
            double discount = 0.0, netPrice = 0.0;
            System.out.print("Enter Your Product: ");
            product = input.nextLine();
            System.out.print("Enter Your Desired Price: ");
            unitPrice = input.nextDouble();
            System.out.print("Enter Amount: ");
            quantity = input.nextDouble();
            totalPrice = quantity * unitPrice;
            discount = totalPrice * 0.0;
            netPrice = totalPrice - discount;
            System.out.println("\nThe product is" + product);
            System.out.println("Total price is " + totalPrice + " Peso");
            System.out.println("Discount is " + discount + " Peso");
            System.out.println("\nNet price is " + netPrice + " Peso");
        }
}