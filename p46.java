import java.util.Scanner;
 class p46
{
	public static void main(String cp[])
	{
		Scanner sf=new Scanner(System.in);
		
		System.out.println("Enter radius ");
		
		double r=sf.nextDouble();
		
		final double PI=3.14;
		
		double area=PI*r*r;
		
		System.out.println("Area of the circle is:" + area);
		
	}
	
}
