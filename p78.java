 class Base
 {
	private int x;
	 
	public Base()
	{
		 x=0;
	}
	 
	public void setX(int d)
	{
		 x=d;
	}
	
	public void outputX()
	{
		System.out.println("X:" + x);
	}
	
 }
 
 class Derived extends Base
 {
	private int y;
	 
	public Derived()
	{
		 super();
		 y=0;
	}
	
	public void setY(int f)
	{
		y=f;
	}
	
	public void outputY()
	{
		System.out.println("Y:"+ y);
	}
	
 }
 
 class p78
 {
	 public static void main(String cp[])
	{
		Derived s1=new Derived();
		s1.setX(20);
		s1.outputX();
		 
		Derived s2=new Derived();
		s2.setY(30);
		s2.outputY();
	}
 }

 
	
	