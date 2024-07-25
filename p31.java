import java.util.Scanner;
 class p31
{
	public static void main(String cp[])
	{
		Scanner sf=new Scanner(System.in);
		
		System.out.print("enter 2 numbers:");
		
		int x=sf.nextInt(), y=sf.nextInt();
		
		
		if(!(x>y))
		{
			System.out.print( y+" is greatest");
		}
		else
		{
			System.out.print(x +" is greatest");
		}
		
	}

}

		