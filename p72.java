import java.util.Scanner;
 class Square
{
	private int side,area;
	
	public Square()
	{
		side=area=0;
	}
	public void input()
	{
		Scanner sf=new Scanner(System.in);
		
		System.out.println("Enter side:");
		side=sf.nextInt();
		area=side*side;
	}
	public void output()
	{
		System.out.println("Side:" + side);
		System.out.println("Area:" + area);
	}
	
	
	
}
 class p72
{
	public static void main(String cp[])
	{
		Square s[]=new Square[2];
		
		for(int i=0;i<s.length;i++)
		{
			s[i]=new Square();
		}
		
		for(int i=0;i<s.length;i++)
		{
			s[i].input();
		}
		
		for(Square x:s)
		{
			x.output();
		}
									
	}
	
}
