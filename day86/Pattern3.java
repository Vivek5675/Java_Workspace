/*A
  AB
  ABC
  ABCD
  ABCDE*/

package day86;

public class Pattern3
{
	public static void main(String[] args) 
	{
		int alfa = 64;
		for (int i = 1; i <= 5; i++) 
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print((char) (alfa + j) + " ");
			}
			System.out.println();
		}
	}
}
