 class Square
{
	private int side,area;
	
	public Square()
	{
		side=area=0;
		
	}
	public Square(int s)
	{
		side=s;
		area=s*s;
	}
	public void output()
	{
		System.out.println("Side:" + side);
		System.out.println("Area:" + area);
	}
	public void setSide(int s)
	{
		side=s;
		area=s*s;
	}
	
}
 class p71
{
	public static void main(String cp[])
	{
		Square s1=new Square();
		s1.output();
		
		Square s2=new Square(10);
		s2.output();
		
		Square s3=new Square();
		s3.setSide(7);
		s3.output();
		
	}
	
}
