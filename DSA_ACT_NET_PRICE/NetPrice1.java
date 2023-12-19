package JavaActivity;
import java.util.Scanner;
public class NetPrice1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
          int lastNum = 0;
          int ctrNum = 0, Sum = 0;
          boolean oddNum = false;
          System.out.print("Enter last number:  ");
          lastNum = input.nextInt();
          System.out.println();
          for (ctrNum=lastNum; ctrNum >= 1; ctrNum-- )
          {
            oddNum= ctrNum % 2 == 1;
            if (oddNum)
            {
                System.out.print(ctrNum + " ");
                Sum += ctrNum;
            }
          }
          System.out.println("\nSum is " + Sum);
    }
}