import java.util.Scanner;
 class Demo
{
	void area(int s)
	{
		System.out.println("Square:" + s*s);
	}
	
	void area(float x,float y)
	{
		System.out.println("Rectangle:" + x*y);
	}
	
	void area(double a)
	{
		System.out.println("Square:" + a*a);
	}
	
}
 class p61
{
	public static void main(String cp[])
	{
		Demo d1=new Demo();
		
		d1.area(2.2f,3.3f);
		d1.area(3.5);
		d1.area(8);
		
	}
	
}
