package JavaActivity;
import java.util.Scanner;
import java.text.DecimalFormat;
public class SwitchCase
{

		public static void main(String[] args)
		{
			Scanner input = new Scanner(System.in);
			DecimalFormat df = new DecimalFormat("#,###,###.00");
			
			
			double fare = 0.0;
			String custcode = "";
			String businessClass = "";
			String customer = "";
			double discRate = 0.0;
			double discount = 0.0;
			double NewFare = 0.0;
			double Additional  = 0.0;
			
			System.out.print("Enter Fare: ");
			fare = input.nextDouble();
			
			System.out.print("Passenger Type [0:Ordinary, S:Student; C:Senior Citizen]: ");
			custcode = input.next();
			
			System.out.print("Travelling in business class?[Y/N]: ");
			businessClass = input.next();
	
			
			custcode = custcode.toUpperCase();
			char custcode1 = custcode.charAt(0);
			switch(custcode1)
			{
			case 'O' : customer = "Ordinary";
						discRate = 0.0;
			char businessClass1 = businessClass.charAt(0);
			switch(businessClass1) {
			
				case 'Y' : businessClass = "Y";
						Additional = 1000;
						break;
				case 'N' : businessClass = "N";
						break;
			}
			break;
			
			case 'S' : customer = "Student";
						discRate = 0.5;
			char businessClass2 = businessClass.charAt(0);
			switch(businessClass2){
				case 'Y' : businessClass = "Y";
							Additional = 700;
							break;
				case 'N' : businessClass = "N";
							break;
			}
			break;
			case 'C' : customer = "Senior Citizen";
						discRate = 0.1;
			char businessClass3 = businessClass.charAt(0);
			switch (businessClass3) {
			case 'Y' : businessClass = "Y";
						Additional = 500;
						break;
			case 'N' : businessClass = "N";
						break;
							
			}
			}
			discount = fare * discRate;
			NewFare = fare - discount;
			System.out.println("\nDiscount:" + df.format(fare * discRate));
			System.out.println("Business class charge:" + df.format(Additional));
			System.out.println("NewFare:" + df.format(fare - discount + Additional));
		}
}

