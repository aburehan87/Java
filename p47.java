import java.util.Scanner;
 class Student
{
	String name;
	int roll;
	double per;
}

 class p47
{
	public static void main(String cp[])
	{
		Scanner sf=new Scanner(System.in);

		
		Student s;
		s=new Student();
		
		s.name="Raj";
		s.roll=101;
		s.per=70.70;
		
		System.out.print("Student information:" +"\n" + s.name+ "\t"+ s.roll+ "\t"+ s.per);
		
	}
	
}
