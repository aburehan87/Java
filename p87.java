//NON ABSTRACT CLASS//
//IF A CLASS IS INHERITED FROM AN ABSTRACT BASE CLASS AND IF THE DERIVED CLASS HAS OVERIDED(IMPLEMENTED) ALL THE ABSTRACT FNS OF THE BASE CLASS THEN THE DERIVED CLASS IS NON ABSTRACT
//AND HENCE THE DERIVED CLASS CAN BE INSTANTIATED USING NEW OPERATOR//
import java.util.Scanner;	
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
 class Square extends GeoFig
{
	private int side;
	
	public void input()
	{
		Scanner sf=new Scanner(System.in);
		
		System.out.println("Enter side:");
		side=sf.nextInt();
		setArea(side*side);
	}
	public void output()
	{
		System.out.println("Side:" + side);
		System.out.println("Area:" + getArea());
	}
	
}
 class p87
{
	public static void main(String cp[])
	{	
		GeoFig r;	
		Square s1=new Square();
		s1.input();
		s1.output();
		//OR
		r=new Square();
		r.input();
		r.output();
		
	}
}

		
	
		
	