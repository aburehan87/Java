 interface IntfOne
 {
	int x=10;
 }
 class DemoOne implements IntfOne
 {
	public void display()
	{
		System.out.println("x:" + x);
	}
 }
 interface India
 {
	String height="5 feet";
 }
 interface Africa
 {
	 String height="6 feet";
 }
 class DemoTwo implements India,Africa
 {
	public void show()
	{
		
		System.out.println("INDIA:" + India.height);
		System.out.println("AFRICA:" + Africa.height);
	}
 }
 class p92
 {
	public static void main(String cp[])
	{
		DemoOne d1=new DemoOne();
		d1.display();
		
		DemoTwo d2=new DemoTwo();
		d2.show();
	}
 }
 
 
 