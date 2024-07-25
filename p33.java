import java.util.Scanner;
 class p33
{
	public static void main(String cp[])
    {
		Scanner sf=new Scanner(System.in);
		
		int a[]=new int[3];
		
		System.out.print("Enter elements:");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sf.nextInt();
		}
		
		for (int s:a)
		{
				System.out.println("Elements are:"+ s);
		}
		
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.print("summation :"+ sum);
		
	}

}

		
		
		