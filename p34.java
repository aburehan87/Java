import java.util.Scanner;
 class p34
{
	public static void main(String cp[])
	{
		
		String s[]=new String[3];
		Scanner sf=new Scanner(System.in);
		System.out.print("Enter  names:");
		
		for(int i=0;i<s.length;i++)
		{
			s[i]=sf.next();
		}
		
		System.out.print("Names :");
		
		for(String x:s)
		{
			System.out.println(x.toUpperCase());
		}
	}
}
	