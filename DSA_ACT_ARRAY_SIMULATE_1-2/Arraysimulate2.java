public class Array_simulate2
{
	public static void main(String[] args)
	{
		int[] number = {1,3,5,7};
		int[] numero = {8,6,4,2};
		int x, y, value = 0, sum = 0;
		for (x = 0; x < number.length; x++)
		{
			for (y = 3; y > -1; y --)
			{
				value = number[x] * numero[y];
				sum += value;
				System.out.print(value + "\t");
			}
			System.out.println();
		}
		System.out.println("\nSum is " + sum);
	}
}