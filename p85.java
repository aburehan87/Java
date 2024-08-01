import java.util.Scanner;
 class GeoFig
 {
	private double area;
	
	public void input()
	{
	}
	
	public void output()
	{
	}
	
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
 class Circle extends GeoFig
 {
	private int radius;
	
	public void input()
	{
		Scanner sf=new Scanner(System.in);
		System.out.println("enter radius:");
		radius=sf.nextInt();
		setArea(3.14*radius*radius);
	}
	
	public void output()
	{
		System.out.println("Radius:" + radius);
		System.out.println("Area:" + getArea());
	}
	
 }
 
 class p85
 {
	 public static void main(String cp[])
	 {
		Square s1=new Square();
		Circle c1=new Circle();
		GeoFig r[]={s1,c1};
		
		for(int i=0;i<r.length;i++)
		{
			r[i].input();
			r[i].output();
		}
	 }
	 
 }
 
		
	
	