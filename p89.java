//Interface is by default abstract//
 interface IntfOne
 {
	public void f1();//INTERFACE ABSTRACT METHODS DOES NOT HAVE BODY{} //
		
 }
 
 class DemoOne implements IntfOne
 {
	public void f1()//OVERIDED FUNCTION//	
	{
		System.out.println("In f1");
	}
	public void f2()
	{
		System.out.println("In f2");
	}
 }
 
 
 class p89
 {
	public static void main(String cp[])
	{
		DemoOne d1=new DemoOne();
		d1.f1();
		d1.f2();
	}
 }
 