 class Square
{
	private int side,area;
	public void Square()
	{
		side=0;area=0;
	}
	
	public void setSide(int s)
	{
		side=s;
		area=s*s;
	}
	
	public int getSide()
	{
		return side;
	}
	public int getArea()
	{
		return area;
	}
	
		
	public void output()
	{
		System.out.println("Side :" + side);
		System.out.println("Area :" + area);
	}
	
}
 class Cube extends Square
{
	private int volume;
	
	public Cube()
	{                                                     
		super();
		volume=0;
	}

	public void setSide(int s)
	{
		super.setSide(s);
		volume=getArea()*getSide();
	}
	
	public int getVolume()
	{
		return volume;
	}
	
	public void output()
	{
		super.output();
		System.out.println("Volume:" + volume);
	}
	
	
}

 class p81
{
	public static void main(String cp[])
	{
		Cube c1=new Cube();
		c1.setSide(10);
		c1.output();
		
		
	}
	
}

	