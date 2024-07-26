import java.util.Scanner;
 class Data
{
	private int side,area;
	
	public void input()
	{
		int s,a;
		Scanner sf=new Scanner(System.in);
		System.out.println("Enter Side:");
		side=sf.nextInt();
		area=side*side;
	}
	public void output()
	{
		System.out.println("Side:" + side);
		System.out.println("Area:" + area);
	}
	public void set_side(int s)
	{
		side=s;
		area=side*side;
	}
	public void set_area(int a)
	{
		area=side*side;
	}
	public int get_side()
	{
		return side;
	}
	public int get_area()
	{
		return area;
	}
	
}
 class p69
{
	public static void main(String cp[])
	{
		Data d1=new Data();
		d1.input();
		d1.output();
		
		Data d2=new Data();
		d2.set_side(10);
		d2.output();
		
		Data d3=new Data();
		d3.input();
		d3.output();
		
		int ta;
		ta=d1.get_area()+d2.get_area()+d3.get_area();
		System.out.println("Total Area:" + ta);
		
	}
	
}

		