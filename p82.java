 class A 
{
	private int x;
	
	public A(int t)
	{
		x=t;
	}
	public void output()
	{
		System.out.println("x:"+ x);
	}
	
}
 class B extends A
{
	private int y;
	
	public B(int tx,int ty)
	{
		super(tx);
		y=ty;
	}
	public void output()
	{
		super.output();
		System.out.println("y:"+ y);
	}
		
}
 class C extends B
{
	private int z;
	
	public C(int tx,int ty,int tz)
	{
		super(tx,ty);
		z=tz;
	}
	
	public void output()
	{
		super.output();
		System.out.println("z:"+ z);
	}
	
}

 class p82
{
	public static void main(String cp[])
	{
		C c1=new C(20,40,60);
		c1.output();
	}
	
}

