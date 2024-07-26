import java.util.Scanner;
 class p41
{
	public static void main(String cp[])
	{
		Scanner sf=new Scanner(System.in);
		
		int ROWS=2,COLNS=2;
		
		int x[][]=new int[ROWS][COLNS];
		int y[][]=new int[ROWS][COLNS];
		
		System.out.println("Enter Elements:");
		
		for(int r=0;r<ROWS;r++)
		{
			for(int c=0;c<COLNS;c++)
			{
				x[r][c]=sf.nextInt();
				
			}
			
		}
		
		System.out.println("Square is:");
		
		for(int r=0;r<ROWS;r++)
		{
			for(int c=0;c<COLNS;c++)
			{
				y[r][c]=x[r][c]*x[r][c];
				System.out.print(y[r][c] + "\t");
			}
			System.out.println();
		}
		
		
	}
	
}

		