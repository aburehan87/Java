//run time polymorphism//
 class Base
{
	public void display()
	{
		System.out.println("In display class Base");
	}
	
}
 class Derived extends Base
{
	public void output()
	{
		System.out.println("In display class Derived");
	}
	
}
 class p83
{
	public static void main(String cp[])
	{
		Base r;
		Base b1=new Base();
		r=b1;
		r.display();
		
		Derived d1=new Derived();
		r=d1;
		r.display();
		
	}
	
}
