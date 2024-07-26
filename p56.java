import java.util.Scanner;
 class Demo
{
	int square(int side)
	{
		int area;
		area=side*side;
		return area;
	}
	
}

 class p56
{
	public  static void main(String cp[])
  {
		Scanner sf=new Scanner(System.in);
	
		Demo d1=new Demo();
		int s,a;
		System.out.print("enter side:");
		s=sf.nextInt();
	
		a=d1.square(s);
		System.out.print("Area is :" + a);
		
  }

}
	

	
