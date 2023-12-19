import java.text.*;
import java.util.*;

public class Account {
	public static float[] acc = {150,(float)500.53};	
	public static float[] wdAmount = {0,0};
	public static float[] wd = {0,0};
	
	public static void debit() {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("$###,###,##0.00");
		
		System.out.println("account1 balance: " + df.format(acc[0]));
		System.out.println("account2 balance: " + df.format(acc[1]));
		
		for(int accArray=0;accArray<2;accArray++) {
			System.out.print("\nEnter withdrawal amount for account" + (accArray + 1) + ": ");
			wd[accArray] = sc.nextFloat();
			wdAmount[accArray] = wd[accArray];
			System.out.println("\nsubtracting " + wd[accArray] + " account" + (accArray + 1) + " balance");
			if(wd[accArray]<=acc[accArray]) {
				acc[accArray] = acc[accArray]-wdAmount[accArray];
			}
			else if(wd[accArray]>acc[accArray]) {
				System.out.println("Debit amount exceeded account balance.");
			}
			System.out.println("account1 balance: " + df.format(acc[0]));
			System.out.println("account2 balance: " + df.format(acc[1]));
		}
	}
}