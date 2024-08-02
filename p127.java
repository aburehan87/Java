import java.util.*;
//EXCEPTION HANDLING
//ERRORS TYPE 2:a)SYNTATIC
//		  b)EXCEPTION

/*try
{
	...
	...
}
catch(Exception1 ob1)
{
	...
	...
}
*/

class p127
{
	public static void main(String cp[])
	{
		try
		{
			Scanner sf=new Scanner(System.in);
			
			System.out.println("ENTER TWO NUMBERS:");
			int x=sf.nextInt(),y=sf.nextInt(),z;
			z=x/y;
			System.out.println("QUOTIENT:" + z);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division with 0 is not allowed");
		}
	}
}

		