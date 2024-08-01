 interface IntfOne
 {
	public void f1();
 }
 
 interface IntfTwo
 {
	public void f2();
 }
 
 class DemoOne implements IntfOne,IntfTwo
 {
	public void f1()
	{
		System.out.println("In f1");
	}
	
	public void f2()
	{
		System.out.println("In f2");
	}
	
	public void f3()
	{
		System.out.println("In f3");
	}//HERE F1 F3 F2 ARE AL THREE OVERIDED FUNCTION//
 }
 class p90
 {
	public static void main(String cp[])
	{
		DemoOne d1=new DemoOne();
		d1.f1();
		d1.f2();
		d1.f3();
	}
 }
 
 
 