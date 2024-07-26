import java.util.Scanner;
 class Student
{
	String name;
	String div;
	int roll;
	int marks[]=new int[3];
	double per;
}

 class p50
{
	public static void main(String cp[])
	{
		Student s=new Student();
		Scanner sf=new Scanner(System.in);
		
		System.out.print("Enter name:");
		s.name=sf.next();
		
		System.out.print("Enter division:");
		s.div=sf.next();
		
		System.out.print("enter roll:");
		s.roll=sf.nextInt();
		
		
		
		System.out.print("Enter marks:");
		int sum=0;
		for(int i=0;i<s.marks.length;i++)
		{
			s.marks[i]=sf.nextInt();
			sum=sum+s.marks[i];
			
		}
		
		s.per=sum/3.0;
		
		System.out.print("percentage:" + s.per);
		
	}
	
}

		
		
		