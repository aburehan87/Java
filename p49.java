import java.util.Scanner;
 class Student
{
	String name;
	int roll;
	double per;

}

 class p49
{
	public static void main(String cp[])
	{
		Scanner sf=new Scanner(System.in);
		
		Student s=new Student();
		
		System.out.println("Enter Name:");
		s.name=sf.next();
		
		System.out.println("Enter roll:");
		s.roll=sf.nextInt();
		
		System.out.println("Enter per:");
		s.per=sf.nextDouble();
		
		String r;
		
		r=String.format("Name:%s\nRoll:%d\nPercentage:%.2f",s.name,s.roll,s.per);
		System.out.println(r);
	}
	
	
}
