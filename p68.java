 class Demo 
{
	private int x;
	
	public void set(int t)
	{
		x=t;
	}
	public int get()
	{
		return x;
	}
	public void output()
	{
		System.out.println("x:" + x);
	}
	
}
 class p68
{
	public static void main(String cp[])
	{
		Demo d1=new Demo();
		
		d1.set(10);
		d1.output();
		
		int s=d1.get();
		System.out.println("s:" + s);
		d1.set(d1.get()*d1.get());
		d1.output();

	}
	
}
