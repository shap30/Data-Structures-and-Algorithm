package Package_Selection_Sort;

import java.util.Scanner;

public class Selection_Sort {
	
	static Scanner Input = new Scanner(System.in); 
	
	  static Integer MainInput;
	  static Integer NumInput;
	  
	  public static void main(String[] args)
	  
	  {
		
		 System.out.println("\nEnter the Size of An Array: ");
		 MainInput = Input.nextInt();
		 
		 System.out.println("\nEnter 5 Values: ");
		 MainInput = Input.nextInt();
		
		
		
		  
	  }
	  
	  public int[] selectionSort(int[] list)
	  {
		  int i, j, minValue, minIndex, temp = 0;
		  for(i = 0; i < list.length; i++)
		  {
			  minValue = list[i];
			  minIndex = i;
			  for(j = i; j < list.length;j++)
			  {
				  if(list[j] < minValue)
				  {
					  minValue = list[j];
					  minIndex = j;
				  }
			  }
			  
			  
		  }
		return list;
	  }
}
