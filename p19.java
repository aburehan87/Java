import java.util.Scanner;
 class p19
{
	public static void main(String cp[])
	{
		Scanner sf=new Scanner(System.in);
		System.out.print("enter 2 numbers:");
		int x=sf.nextInt();
		int y=sf.nextInt();
		System.out.println("\n1:Addition\n2:Subtraction\n3:Multiplication\n4:Division\nchoice:");
		int choice=sf.nextInt();
		
		switch(choice)
		{
			case 1:System.out.print("Addition is :" + (x+y));break;
			case 2:System.out.print("Subtraction is:" + (x-y));break;
			case 3:System.out.print("Multiplication is:" + x*y);break;
			case 4:System.out.print("Division is:" + x/y);break;
			default :System.out.print("wrong choice:");
		}
		
	}
	
}

			
			