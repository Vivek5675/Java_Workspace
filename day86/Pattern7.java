/*  1
   21
  321
 4321
54321  */

package day86;

public class Pattern7 
{
	public static void main(String[] args) 
	{
		int row = 5;
		for (int i = 1; i <= row; i++)
		{
			for (int space = 1; space <= row-i; space++)
			{
				System.out.print(" ");
			}
				for	(int j = i; j >= 1; j--) 
			{
				System.out.print(j + "");
			}
			System.out.println("");
		}
	}
}
