import java.util.Scanner;
 class Demo
{
	int square(int x)
	{
		return x*x;
	}
	
	int cube(int y)
	{
		return y*y*y;
	}
	
}
 class p57
{
	public static void main(String cp[])
	{
		Scanner sf=new Scanner(System.in);
		{
			Demo d1=new Demo();
			
			int r1,r2;
			
			r1=d1.square(d1.cube(3));
			r2=d1.square(d1.cube(2)+d1.square(4));
			
			System.out.println(r1+ "\t"+ r2);
			
		}
		
	}
	
}
