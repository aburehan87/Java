 class Square
{
	private int side,area;
	
	public Square(int s)
	{
		this.side=s;
		area=s*s;
	}
	public void output()
	{
		System.out.println("Side:" + side + "\t" + "Area:" + area);
	}	
	
}
 class p77
{
	public static void main(String cp[])
	{
		Square s1=new Square(7);
		s1.output();
		Square s2=new Square(10);
		s2.output();
		
	}
}
