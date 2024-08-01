//ABSTRACT AND NON ABSTRACT CLASS//	
 class GeoFig
{
	private double area;
	
	 abstract public void input();
	abstract public void output();
	
	public void setArea(double a);
	{
		area=a;
	}
	public double getArea()
	{
		return area;
	}
	
}
 class p86
{
	public static void main(String cp[])
	{
		GeoFig ob=new GeoFig();
		GeoFig r;		
		r.input();
		r.output();
	}
}
//HENCE THIS IS AN ABSTRACT CLASS //


