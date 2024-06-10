/*1
  4 4
  9 9 9
  16 16 16 16
  25 25 25 25 25   */

package day86;

public class Pattern11 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 5; i++) 
		{
			for (int space = 1; space <= 5-i; space++) 
			{
				System.out.print("");
			}
			for (int j = 1; j <= i; j++)
			{
				System.out.print(i * i + " ");
			}
			System.out.println("");
		}
	}
}
