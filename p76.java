 class Square
{
	private int side,area;
	
	public Square()
	{
		this.side=0;
		this.area=0;
	}
	public Square(int s)
	{
		this.side=s;
		this.side=s*s;
	}
	public void output()
	{
		System.out.println("Side:" + this.side + "\tArea:" + this.area);
	}
	public void setSide(int s)
	{
		this.side=s;
		this.area=s*s;
	}
	
}
 class p76
{
	public static void main(String cp[])
	{
		Square s1=new Square();
		s1.output();
		
		Square s2=new Square();
		s2.setSide(8);
		s2.output();
	}
	
}
