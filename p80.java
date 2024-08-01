 class Base
{
	private int x;
	
	public Base(int t)
	{
		x=t;
	}
	
	public void output()
	{
		System.out.println("x:" + x);
	}
	
	
}
 class Derived extends Base
{
	private int y;
	
	public Derived(int tx,int ty)
	{
		super(tx);
		y=ty;
	}
	
	public void output()
	{
		super.output();
		System.out.println("y:" + y);
	}
}

 class p80
{
	 public static void main(String cp[])
	{
		Derived d1=new Derived(50,100);
		d1.output();
	}
}
 
	