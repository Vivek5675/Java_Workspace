package day56;

public class NestedIfEx
{
	public static void main(String[] args)
	{
int age = 45;
		
		if(age>=18)
		{
			System.out.println("Eligible for vote");
			
			if(age>=60)
			{
				System.out.println("you are in Senior citizen");
			}
			else
			{
				System.out.println("you are in Young Age group");
			}
			
		}
		else
		{
			System.out.println("Not Eligible for vote");
		}
	}
}
