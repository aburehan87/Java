import java.util.Scanner;
 class p40
{
	public static void main(String cp[])
	{
		Scanner sf=new Scanner(System.in);
		
		int x[][]=new int[2][2];
		System.out.println("enter elements:");
				
		for(int r=0;r<x.length;r++)
		{
			for(int c=0;c<x[r].length;c++)
			{
				x[r][c]=sf.nextInt();
			}
			
		}
		
		int sum=0;
		
		for(int r=0;r<x.length;r++)
		{
			for(int c=0;c<x[r].length;c++)
			{
				sum=sum+x[r][c];
				
			}
			
		}
			
		System.out.println("summation is " + sum);
		
		
		
		for(int row[]:x)
		{
			for(int v:row)
			{
				sum=sum+v;
				
			}
			
		}
		
		System.out.println("summation of row :" + sum);
		
		
	}
	
}
	
	
		