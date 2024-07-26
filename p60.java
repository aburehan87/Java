import java.util.Scanner;
 class Demo
{
	void square(int x)
	{
		System.out.println("int:" + x*x);
	}
	
	void square(float y)
	{
		System.out.println("Float:" + y*y);
	}
	
	void square(double a,double b)
	{
		System.out.println("Double:" + a*b);
	}
	
}

 class p60
{
	public static void main(String cp[])
	{
		Demo d1=new Demo();
		
		d1.square(1.2,2.2);
		d1.square(10);
		d1.square(2.2f);
		
	}
	
}
