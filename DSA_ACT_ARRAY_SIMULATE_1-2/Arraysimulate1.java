public class Arraysimulate1
{
	public static void main(String[] args)
	{
		int[] mysteryNum = new int[25];
		int ctr = 0, 1, x;
		
		while(ctr < mysteryNum.length)
		{
			mysteryNum[ctr] = ctr+1;
			ctr++;
		}
		i=0;
		do
		{
			for(x = 1; x <= 5; x++)
			{
				System.out.print(mysteryNum[1] + "\t");
				i++;
			}
			System.out.println();
		}
		while (i < mysteryNum.length);
	}
}