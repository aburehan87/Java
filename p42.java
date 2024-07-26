import java.util.Scanner;
 class p42
{
	public static void main(String cp[])
	{
		Scanner sf=new Scanner(System.in);
		
		int x[][]=new int[3][];
		
		x[0]=new int[1];
		x[1]=new int[2];
		x[2]=new int[3];
		
		x[0][0]=10;
		x[1][0]=20;
		x[1][1]=30;
		x[2][0]=40;
		x[2][1]=50;
		x[2][2]=60;
		
		System.out.println("elements are:");
		
		for(int r=0;r<x.length;r++)
		{
			for(int c=0;c<x[r].length;c++)
			{
				System.out.print(x[r][c] + "\t");
				
			}
			
			System.out.println();
		}
		
	}
	
}

		