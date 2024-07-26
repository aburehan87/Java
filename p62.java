 class Demo
{
	int x;
}
 class p62
{
	public static void main(String cp[])
	{
		Demo d1=new Demo();
		d1.x=10;
		
		System.out.println(d1.x);
		
		Demo d2;
		d2=d1;
		d2.x=20;
		System.out.println(d1.x);
		
		d1.x=30;
		System.out.println(d2.x);
	
	}
	
}
