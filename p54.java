import java.util.Scanner;
 class Demo
{
	void  square()
	{
		int side,area;
		
		Scanner sf=new Scanner(System.in);
		System.out.println("enter side:");
		side=sf.nextInt();
		
		area=side*side;
		System.out.println("Area is:" + area);
		
	}
	
}
 class p54
 
{
	public static void main(String cp[])
	{
		
		Demo s=new Demo();
		
		s.square();
	
	}
	
}
