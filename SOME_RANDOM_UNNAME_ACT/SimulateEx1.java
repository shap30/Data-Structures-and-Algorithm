package JavaActivity;
public class SimulateEx1
{

    public static void main(String[] args){
	Scanner kbd = new Scanner (System.in);
	String decision;
	boolean yn;
	while(true)
	{
        int x, y, z=1;
        do
        {
            x = 5; 
            while (x >= 1)
            {
			case "yes":
				yn = false;
				break;
			case "no":
				yn = true;
				break;
                for (y = 1; y <= x; y++)
                {
                    System.out.print(x + " "); // one space is
                 } // printed after x 
                System.out.println();
                x--;
            }
            System.out.println(); 
            z++;
        }
        while(z < 5);
    }
}