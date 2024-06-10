/*1
  2 3
  4 5 6
  7 8 9 10
  11 12 13 14 15   */

package day86;

public class Pattern12 
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 5 ; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print((i - 1) * i / 2 + j + " ");
			}
			System.out.println("");
		}
	}
}
