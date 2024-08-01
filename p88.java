import java.util.Scanner;
//if a class is derived from an abstract base class and if the the derived  class does not overide and function of the abstract base class then hence the derived clas also becomes
//an absrtract class and hence derived class cannor be instatiated using new operator//
 abstract class GeoFig
{
	private double area;
	
	abstract public void input();
	abstract public void output();
	
	public void setArea(double a)
	{
		area=a;
	}
	
	public double getArea()
	{
		return area;
	}
}

 class Circle extends GeoFig
 {
	private double radius,area;
	
	public void input()
	{
		Scanner sf=new Scanner(System.in);
		System.out.println("Enter radius:");
		radius=sf.nextDouble();
		setArea(3.14*radius*radius);
	}
	/*public void output()
	{
		System.out.println("RADIUS:" + radius);
		System.out.println("Area:" + getArea());
	}
	*//*HERE CLASS GEOFIG IS AN ABSTRACT CLASS AS FUNCTION OUTPUT HAS NOT BEEN COMPLETED*/
 }
 class p88
 {
	public static void main(String cp[])
	{
		GeoFig r;
		r=new Circle();
		r.input();
		r.output();
	}
 } 


