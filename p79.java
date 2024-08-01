 class Base
{
	private int x;
	public Base(int t)
	{
		x=t;
	}
	
	public void outputX()
	{
		System.out.println(x);
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
	
	public void outputY()
	{
		System.out.println(y);
	}
	

}

 class p79
{
	public static void main(String cp[])
	{
		Derived d1=new Derived(10,20);
		d1.outputX();
		d1.outputY();
	}
	
}

	