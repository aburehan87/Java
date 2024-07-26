import java.util.Scanner;
 class Demo
{
	private int x,y;
	
	public void input()
	{
		Scanner sf=new Scanner(System.in);
		System.out.println("enter 2 numbers:");
		x=sf.nextInt();
		y=sf.nextInt();
		
	}
	public void output()
	{
		System.out.println("x:" + x + "\t" + "y:" + y);
	}
	public void swap()
	{
		int t=x;
		x=y;
		y=t;
	}
	
}
 class p67
{
	public static void main(String cp[])
	{
		Demo d1=new  Demo();
		d1.input();
		d1.output();
		d1.swap();
		d1.output();
	}
	
}

