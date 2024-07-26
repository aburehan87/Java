import java.util.Scanner;
 class Demo
{
	void add(int a,int b)
	{
		System.out.println("Addition is :" + (a+b));
	}
	
	void multiply(double c,double d)
	{
		System.out.println("Multiplication is :" + (c*d));
	}
	
}

 class p55
{
	public static void main(String cp[])
	{
		Scanner sf=new Scanner(System.in);
		
		Demo s=new Demo();
		System.out.println("enter two numbers:");
		
		int x=sf.nextInt();
		int y=sf.nextInt();
		s.add(x,y);		
		s.multiply(x,y);
		
	}
	
}

		
		

