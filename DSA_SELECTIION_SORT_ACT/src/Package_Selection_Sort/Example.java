package Package_Selection_Sort;

import java.util.Scanner;

public class Example {
	
		static int MainInput;
		
		static Scanner Input = new Scanner(System.in); 

	    public void selectionsort(int arr[])
	    {
    
	        for (int i = 0; i < arr.length - 1; i++)
	        {

	            
	            int min = i;
	            for (int j = i+1; j < arr.length; j++)
	                if (arr[j] < arr[min])
	                    min = j;

	            
	            int temp = arr[min];
	            arr[min] = arr[i];
	            arr[i] = temp;
	                
	            System.out.println();
	           
	            
		        for (int A=0; A<arr.length; ++A) {
		            System.out.print(arr[A]+" ");
		        }
	        }
	    }

	    public void printArray(int arr[])
	    {

	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	        
	        
	        System.out.print(arr[i]+" ");
	        System.out.println();
	    }
	    
	    public static void main(String args[])
	    {
	    	int temp[]= { 4, 2, 7, 3, 1};
	    	int arr[]=temp;
	    	
	    	System.out.print("\n ----- SELECTION SORTING ---- \n");
	    	
	    	System.out.print("\n ENTER THE SIZE OF  ARRAY: \n");
	    	MainInput = Input.nextInt();
	    	
	    	System.out.print("\n ENTER 5 VALUES: \n");
	    	MainInput = Input.nextInt();
	    	
	    	Example ob = new Example();
	         
	        System.out.print("\n ----- SELECTION UNSORTED ARRAY ----- \n\n");
	        
	        for( int i = 0; i <arr.length; i++ )
	            System.out.print(arr[i] + " ");
	        
	        System.out.println();
	        ob.selectionsort(arr);
	        
	        System.out.println();
	        System.out.println();
	        
	        System.out.println("\n----- SELECTION SORTED ARRAY ----- \n");
	        ob.printArray(arr);
	        
	    }
}