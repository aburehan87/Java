import java.util.*;
class Square
{
	public static void main(String cp[])
	{
		try
		{
			int x;
			x=Integer.parseInt(cp[0]);
			System.out.println("Square: " + x*x);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please specify number");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Invalid Number");
		}
	}
}

			