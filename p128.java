import java.util.*;

class p128
{
	public static void main(String cp[])
	{
		try
		{
			String name=cp[0];
			System.out.println(" HELLO " + name);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please specify name");
		}
		
	}
}

	