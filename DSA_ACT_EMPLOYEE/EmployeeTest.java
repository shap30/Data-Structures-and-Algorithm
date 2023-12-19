package JavaActivity;
import java.util.Scanner;
public class EmployeeTest
{
    public static void main (String[] args)
    {
        Scanner input=new Scanner (System.in);
        int test1score=0, test2score=0;
        System.out.println("Enter test 1 score: ");//input number 85
        test1score =input.nextInt();
        System.out.println("Enter test 2 score: ");//input number 81
        test2score =input.nextInt();

        if((test1score>90)&&(test2score>90))
        {
            System.out.println("Make employee manager");
        }

        else if((test1score>90)||(test2score>90))
        {
            System.out.println("Make employee supervisor");
        }

        else if(!(test1score>90))
        {
        System.out.println("Make employee agent");
        }
    }
}
