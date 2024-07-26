import java.util.Scanner;
 class Demo
{
	void display()
	{
		System.out.println("0 paras:");
	}
	
	void display(int x)
	{
		System.out.println("1 paras:" + x);
	}
	
	void display(double a,double b )
	{
		System.out.println("2 paras:" + a+ "\t" + b);
	}
	
		
}

 class p59
{
	public static void main(String cp[])
	{
		Demo d1=new Demo();
		d1.display(10);
		d1.display();
		d1.display(20.99,30.89);
	}
			
}

	
	