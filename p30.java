import java.util.Scanner;
 class p30
{
	public static void main(String cp[])
	{
		Scanner sf=new Scanner(System.in);
		
		System.out.print("enter char:");
		String s=sf.next();
		char ch1=s.charAt(0);
		char ch2=Character.toLowerCase(ch1);
		
		if(ch2=='a'||ch2=='e'||ch2=='i'||ch2=='o'||ch2=='u')
		{
			System.out.print(ch2 +" is a vowel");
		}
		else
		{
			System.out.print(ch2 +" is not a vowel");
		}
		
	}
	
}
