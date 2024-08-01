 //Inheritance of Interface//
 interface IntfOne
 {
	public void f1();
 }
 interface IntfTwo extends IntfOne
 {
	public void f2();
 }
 class DemoTwo implements IntfOne,IntfTwo
 {
	public void f1()
	{
		System.out.println("In interface f1");
	}
	public void f2()
	{
		System.out.println("In interface f2");
	}
	public void f3()
	{
		System.out.println("In Demotwo");
	}
 }
 
 class p91
 {
	public static void main(String cp[])
	{
		DemoTwo d1=new DemoTwo();
		d1.f1();
		d1.f2();
		d1.f3();
	}
 }
 

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 