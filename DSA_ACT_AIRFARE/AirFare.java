package JavaActivity;
import java.util.Scanner;
import java.text.DecimalFormat;
public class AirFare
{
        public static void main (String[] args)
        {
            Scanner input = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("###,###.00");


            double fare=0.0;
            int custCode=0;
            String customer="";
            double discRate=0.0;
            double netFare=0.0, discount=0.0;


            System.out.print("Enter the Fare Amount: ");
            fare=input.nextDouble();
            System.out.print("Enter customer" + "code [0=Ordinary, 1=Student, 2=Senior]:    ");
            custCode=input.nextInt();

            switch(custCode)
            {
                case 1: customer= "Ordinary";
                            discRate=0.0;
                            break;
                case 2: customer= "Student";
                            discRate=0.1;
                            break;
                case 3: customer= "Senior Citizen";
                            discRate=0.2;
                            break;
                default:
                            customer="Invalid Code";
            }


            discount=fare*discRate;
            netFare=fare-discount;
            System.out.println("\nCustomer is: "+ customer); 
            System.out.println("Discount is: "+ df.format(discount) + "pesos"); 
            System.out.println("nNetfare is: " + df.format(netFare) + "pesos");
        }

        }
		
		