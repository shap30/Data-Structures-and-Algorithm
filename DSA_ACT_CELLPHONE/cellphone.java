package JavaActivity;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Cellphone {
	
	public static void main (String [] args) {
		
	
	Scanner input = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("#,###,###.00");

	
	  char option;
	  char rate;
	  double phonetype1 = 75000, phonetype2 = 76000, phonetype3 = 35000;
	  double paymentdiscount = 0.0, rateThird = 0.0, rateSixth = 0.0, rateTwelfth  = 0.0, totalpayment = 0.0, monthlypayment = 0.0;
	 
	
	  System.out.print("Main Menu" + "\n");
	  System.out.println("Press I/i: Iphone 13" + "\t\t\t$" +  df.format(phonetype1));
	  System.out.println("Press S/s: Samsung Note 20" + "\t\t$" +  df.format(phonetype2));
	  System.out.println("Press X/x: Xiamo Black Shark" + "\t\t$" +  df.format(phonetype3));
	  
	  
	 
	  System.out.print("\nEnter Item: " + "\t");
	  option=input.next().charAt(0);
      option=Character.toUpperCase(option);
      switch(option)
      {
      		case 'I' : System.out.print("Your Item is Iphone 13");
      				   System.out.println("\n" + "Price: " + "\t\t$" + df.format(phonetype1));
      				   	System.out.println();
	      				System.out.print("Select Mode of Payment" + "\n");
	      				System.out.println("Press 1: Cash" + "\t\t\t10% Discount" );
	      				System.out.println("Press 2: 3 Months Installment" + "\t5% rate");
	      				System.out.println("Press 3: 6 Months Installment" + "\t10% rate");
	      				System.out.println("Press 4: 12 Months Installment" + "\t20% rate");
      				   System.out.print("\nEnter Mode of Payment: " + "\t");
      				  rate=input.next().charAt(0);
      			      rate=Character.toUpperCase(rate);
      			      switch(rate)
      			    {
      		      	case '1' :  System.out.print("Mode of Payment: " + "\tCash" + "\n");
      		      				System.out.println("Item:" + "\t\t\t" + "Iphone 13");
      		      				paymentdiscount = phonetype1 * 0.10;
      		      				totalpayment = phonetype1 - paymentdiscount;
      		      				System.out.println("Price:" + "\t\t\t$" + df.format(phonetype1));
      		      				System.out.println("Discount/rate:" + "\t$" + df.format(paymentdiscount));
      		      				System.out.println("Total Amount:" + "\t\t$" + df.format(totalpayment));
      		      				break;
      		      	case '2' :  System.out.print("Mode of Payment: " + "\t3 Months Installment" + "\n");
      		      				System.out.println("Item:" + "\t\t\t" + "Iphone 13");
      		      				rateThird = phonetype1 * 0.05;
      		      				totalpayment = rateThird + phonetype1;
      		      				monthlypayment = totalpayment / 3;
      		      				System.out.println("Price:" + "\t\t\t$" + df.format(phonetype1));
      		      				System.out.println("Discount/rate:" + "\t$" + df.format(rateThird));
      		      				System.out.println("Total Amount:" + "\t\t$" + df.format(totalpayment));
      		      				System.out.println("Monthly Amorization:" + "\t$" + df.format(monthlypayment));
      		      				break;
      		      	case '3' : System.out.print("Mode of Payment: " + "\t6 Months Installment" + "\n");
	      					   System.out.println("Item:" + "\t\t\t" + "Iphone 13");
	      					   rateSixth = phonetype1 * 0.10;
	      					   totalpayment =  rateSixth + phonetype1;
	      					   monthlypayment = totalpayment / 6;
	      					   System.out.println("Price:" + "\t\t\t$" + df.format(phonetype1));
	      					   System.out.println("Discount/rate:" + "\t$" + df.format(rateSixth));
	      					   System.out.println("Total Amount:" + "\t\t$" + df.format(totalpayment));
	      					   System.out.println("Monthly Amorization:" + "\t$" + df.format(monthlypayment));
	      					   break;
      		      	case '4' : System.out.print("Mode of Payment: " + "\t12 Months Installment" + "\n");
	      					   System.out.println("Item:" + "\t\t\t" + "Iphone 13");
	      					   rateTwelfth = phonetype1 * 0.20;
	      					   totalpayment = rateTwelfth + phonetype1;
	      					   monthlypayment = totalpayment / 12;
	      					   System.out.println("Price:" + "\t\t\t$" + df.format(phonetype1));
	      					   System.out.println("Discount/rate:" + "\t$" + df.format(rateTwelfth));
	      					   System.out.println("Total Amount:" + "\t\t$" + df.format(totalpayment));
	      					   System.out.println("Monthly Amorization:" + "\t$" + df.format(monthlypayment));
	      					   break;
      		      	default: System.out.println("Not in the option, Thank you");
      			    }
      			    break;  
      		case 'S' : System.out.print("Your Item is Samsung Note 20");
			   		   System.out.println("\n" + "Price: " + "\t\t$" + df.format(phonetype2));
			   		   System.out.println();
			   		   System.out.print("Select Mode of Payment" + "\n");
			   		   System.out.println("Press 1: Cash" + "\t\t\t10% Discount" );
			   		   System.out.println("Press 2: 3 Months Installment" + "\t5% rate");
			   		   System.out.println("Press 3: 6 Months Installment" + "\t10% rate");
			   		   System.out.println("Press 4: 12 Months Installment" + "\t20% rate");
			   		   System.out.print("\nEnter Mode of Payment: " + "\t");
			   		   rate=input.next().charAt(0);
			   		   rate=Character.toUpperCase(rate);
			   		   switch(rate)
  			    {
  		      	case '1' :  System.out.print("Mode of Payment: " + "\tCash" + "\n");
  		      				System.out.println("Item:" + "\t\t\t" + "Samsung Note 20");
  		      				paymentdiscount = phonetype2 * 0.10;
  		      				totalpayment = phonetype2 - paymentdiscount;
  		      				System.out.println("Price:" + "\t\t\t$" + df.format(phonetype2));
  		      				System.out.println("Discount/rate:" + "\t$" + df.format(paymentdiscount));
  		      				System.out.println("Total Amount:" + "\t\t$" + df.format(totalpayment));
  		      				break;
  		      	case '2' :  System.out.print("Mode of Payment: " + "\t3 Months Installment" + "\n");
  		      				System.out.println("Item:" + "\t\t\t" + "Samsung Note 20");
  		      				rateThird = phonetype2 * 0.05;
  		      				totalpayment = rateThird + phonetype2;
  		      				monthlypayment = totalpayment / 3;
  		      				System.out.println("Price:" + "\t\t\t$" + df.format(phonetype2));
  		      				System.out.println("Discount/rate:" + "\t$" + df.format(rateThird));
  		      				System.out.println("Total Amount:" + "\t\t$" + df.format(totalpayment));
  		      				System.out.println("Monthly Amorization:" + "\t$" + df.format(monthlypayment));
  		      				break;
  		      	case '3' : System.out.print("Mode of Payment: " + "\t6 Months Installment" + "\n");
      					   System.out.println("Item:" + "\t\t\t" + "Samsung Note 20");
      					   rateSixth = phonetype2 * 0.10;
      					   totalpayment = rateSixth + phonetype2;
      					   monthlypayment = totalpayment / 6;
      					   System.out.println("Price:" + "\t\t\t$" + df.format(phonetype2));
      					   System.out.println("Discount/rate:" + "\t$" + df.format(rateSixth));
      					   System.out.println("Total Amount:" + "\t\t$" + df.format(totalpayment));
      					   System.out.println("Monthly Amorization:" + "\t$" + df.format(monthlypayment));
      					   break;
  		      	case '4' : System.out.print("Mode of Payment: " + "\t12 Months Installment" + "\n");
      					   System.out.println("Item:" + "\t\t\t" + "Samsung Note 20");
      					   rateTwelfth = phonetype2 * 0.20;
      					   totalpayment = rateTwelfth + phonetype2;
      					   monthlypayment = totalpayment / 12;
      					   System.out.println("Price:" + "\t\t\t$" + df.format(phonetype2));
      					   System.out.println("Discount/rate:" + "\t$" + df.format(rateTwelfth));
      					   System.out.println("Total Amount:" + "\t\t$" + df.format(totalpayment));
      					   System.out.println("Monthly Amorization:" + "\t$" + df.format(monthlypayment));
      					   break;
  		      	default: System.out.println("Not in the option, Thank you");
  			    }
			   	break;
      		case 'X' : System.out.print("Your Item is Xiami Back Shark");
			           System.out.println("\n" + "Price: " + "\t\t$" + df.format(phonetype3));
					   System.out.println();
			   		   System.out.print("Select Mode of Payment" + "\n");
			   		   System.out.println("Press 1: Cash" + "\t\t\t10% Discount" );
			   		   System.out.println("Press 2: 3 Months Installment" + "\t5% rate");
			   		   System.out.println("Press 3: 6 Months Installment" + "\t10% rate");
			   		   System.out.println("Press 4: 12 Months Installment" + "\t20% rate");
			   		   System.out.print("\nEnter Mode of Payment: " + "\t");
			   		   rate=input.next().charAt(0);
			   		   rate=Character.toUpperCase(rate);
			   		   switch(rate)
					   {
  		      	case '1' :  System.out.print("Mode of Payment: " + "\tCash" + "\n");
  		      				System.out.println("Item:" + "\t\t\t" + "Xiamo Black Shark");
  		      				paymentdiscount = phonetype3 * 0.10;
  		      				totalpayment = phonetype3 - paymentdiscount;
  		      				System.out.println("Price:" + "\t\t\t$" + df.format(phonetype3));
  		      				System.out.println("Discount/rate:" + "\t$" + df.format(paymentdiscount));
  		      				System.out.println("Total Amount:" + "\t\t$" + df.format(totalpayment));
  		      				break;
  		      	case '2' :  System.out.print("Mode of Payment: " + "\t3 Months Installment" + "\n");
  		      				System.out.println("Item:" + "\t\t\t" + "Xiamo Black Shark");
  		      				rateThird = phonetype3 * 0.05;
  		      				totalpayment = rateThird + phonetype3;
  		      				monthlypayment = totalpayment / 3;
  		      				System.out.println("Price:" + "\t\t\t$" + df.format(phonetype3));
  		      				System.out.println("Discount/rate:" + "\t$" + df.format(rateThird));
  		      				System.out.println("Total Amount:" + "\t\t$" + df.format(totalpayment));
  		      				System.out.println("Monthly Amorization:" + "\t$" + df.format(monthlypayment));
  		      				break;
  		      	case '3' : System.out.print("Mode of Payment: " + "\t6 Months Installment" + "\n");
      					   System.out.println("Item:" + "\t\t\t" + "Xiamo Black Shark");
      					   rateSixth = phonetype3 * 0.10;
      					   totalpayment = rateSixth + phonetype3;
      					   monthlypayment = totalpayment / 6;
      					   System.out.println("Price:" + "\t\t\t$" + df.format(phonetype3));
      					   System.out.println("Discount/rate:" + "\t$" + df.format(rateSixth));
      					   System.out.println("Total Amount:" + "\t\t$" + df.format(totalpayment));
      					   System.out.println("Monthly Amorization:" + "\t$" + df.format(monthlypayment));
      					   break;
  		      	case '4' : System.out.print("Mode of Payment: " + "\t12 Months Installment" + "\n");
      					   System.out.println("Item:" + "\t\t\t" + "Xiamo Black Shark");
      					   rateTwelfth = phonetype3 * 0.20;
      					   totalpayment = rateTwelfth + phonetype3;
      					   monthlypayment = totalpayment / 12;
      					   System.out.println("Price:" + "\t\t\t$" + df.format(phonetype3));
      					   System.out.println("Discount/rate:" + "\t$" + df.format(rateTwelfth));
      					   System.out.println("Total Amount:" + "\t\t$" + df.format(totalpayment));
      					   System.out.println("Monthly Amorization:" + "\t$" + df.format(monthlypayment));
      					   break;
  		      default: System.out.println("Not in the option, Thank you");
					   }	    
			   break;
      		default: System.out.println("Not in the option, Thank you");
					   }
 
     }
	}
	