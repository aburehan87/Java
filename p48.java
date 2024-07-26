import java.util.Scanner;
 class Student
{
	String name;
	int roll;
	double per;
	
}

 class p48
{
	public static void main(String cp[])
	{
		Scanner sf=new Scanner(System.in);
		
		Student s=new Student();
		
		System.out.println("enter name:");
		s.name=sf.next();
		
		System.out.println("enter roll:");
		s.roll=sf.nextInt();
		
		System.out.println("enter percentage:");
		s.per=sf.nextDouble();
		
		System.out.println("Student information :" + "\n" + s.name+ "\t" + s.roll + "\t" + s.per);
		
	}
	
}

	

		