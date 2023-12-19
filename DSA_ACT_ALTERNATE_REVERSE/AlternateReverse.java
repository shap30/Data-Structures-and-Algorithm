import java.util.Scanner;
class AlternateReverse
{
   public static void main(String args[])
    {
	  int ctr;
	  ctr = 9;
	  do
      int num=0;
      int reversenum =0;
	  {
	  }
      System.out.println("Input your number and press enter: ");
      Scanner in = new Scanner(System.in);
      num = in.nextInt();
      while( num != 0 )
        {
            for (int i=0; i < 5; i++) {
                System.out.print((9 - i) + " " + (i + 1) + " ");
				ctr --;
        }
		while (ctr >= 5);
    }
  }
}