import java.util.Scanner; 
public class NameAndAge 
{ 
    public static void main(String[] args) 
    { 
        Scanner input=new Scanner(System.in); 
        String name; 
        int age; 
        //accepting name 
        System.out.print("Enter Name:Miguel Pilapil "); 
        name=input.nextLine(); 
        //accepting age 
        System.out.print("Enter age:18 years old"); 
        age=input.nextInt();
        //Displaying 
        System.out.println(); 
        System.out.println("Your name is Miguel Pilapil"); 
        System.out.println("You are "+ 18 +" years old"); 
    } 
}